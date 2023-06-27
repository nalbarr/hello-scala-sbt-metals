package com.oax.hello

import java.time.LocalDateTime
import java.util.concurrent.Executors
import scala.concurrent.duration._
import scala.concurrent.Await
import scala.concurrent.Future
import scala.concurrent.ExecutionContext
import concurrent.ExecutionContext.Implicits.global

object ProgramB {

  val executorService = Executors.newFixedThreadPool(1)
  implicit val ec = ExecutionContext.fromExecutor(executorService)

  def main(args: Array[String]): Unit = {
    printWithThreadName("Application has been started.")

    // executing both computation in parallel
    val f1 = executeComputeIntensiveTaskA()
    val f2 = executeComputeIntensiveTaskB()
    val result = for {
      _ <- f1
      _ <- f2
    } yield ()

    Await.result(result, 5.seconds)
    executorService.shutdown()
  }

  def executeComputeIntensiveTaskA(): Future[Unit] = {
    Future {
      printWithThreadName("Task-A has been started.")
      // mimic computation time
      Thread.sleep(1000)
    }
  }

  def executeComputeIntensiveTaskB(): Future[Unit] = {
    Future {
      printWithThreadName("Task-B has been started.")
      // mimic computation time
      Thread.sleep(1000)
    }
  }

  private def printWithThreadName(message: String): Unit = {
    val threadName = Thread.currentThread.getName
    println(s"${LocalDateTime.now} - [$threadName] - $message")
  }
}
