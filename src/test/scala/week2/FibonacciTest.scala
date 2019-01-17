package week2

import org.scalatest.{FlatSpec, Matchers}

class FibonacciTest extends FlatSpec with Matchers {
  "Fibonacci" should "calculate fibonacci for 0" in {
    Fibonacci.fib(0) should be (0)
  }

  it should "calculate fibonacci for 1" in {
    Fibonacci.fib(1) should be (1)
  }

  it should "calculate fibonacci for numbers bigger than 2" in {
    Fibonacci.fib(2) should be (1)
    Fibonacci.fib(3) should be (2)
    Fibonacci.fib(8) should be (21)
    Fibonacci.fib(10) should be (55)
    //Fibonacci.fib(45) should be (1134903170)
  }

  "Fibonacci with TailRecursion" should "calculate fibonacci for 0" in {
    Fibonacci.fibTail(0) should be (0)
  }

  it should "calculate fibonacci for 1" in {
    Fibonacci.fibTail(1) should be (1)
  }

  it should "calculate fibonacci for numbers bigger than 2" in {
    Fibonacci.fibTail(1) should be (1)
    Fibonacci.fibTail(3) should be (2)
    Fibonacci.fibTail(8) should be (21)
    Fibonacci.fibTail(10) should be (55)
    Fibonacci.fibTail(45) should be (1134903170)
  }

  "Last Fibonacci Digits" should "be accordingly with the examples" in {
    Fibonacci.lastFibDigit(3) should be (2)
    Fibonacci.lastFibDigit(331) should be (9)
    Fibonacci.lastFibDigit(327305) should be (5)
  }
}
