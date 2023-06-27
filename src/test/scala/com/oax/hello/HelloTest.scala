package com.oax.hello

import org.scalatest.funsuite.AnyFunSuite

class HelloTest extends AnyFunSuite {
  test("The sayHello() method should return \"Hello, world.\"") {
    val returned = Hello.sayHello()
    val expected = "Hello, world."

    assert(returned == expected)
  }
}
