package com.oax.hello

object Hello {
  def sayHello(): String =
    "Hello, world."

  def main(args: Array[String]): Unit =
    println(sayHello())
}
