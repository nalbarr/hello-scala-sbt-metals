organization := "com.oax"

name := "hello-scala-sbt-metals"

version := "0.0.1"

// scalaVersion := "3.2.2"
scalaVersion := "2.12.17"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.4.1"
