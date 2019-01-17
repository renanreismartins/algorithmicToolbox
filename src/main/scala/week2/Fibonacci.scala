package week2

import scala.annotation.tailrec

object Fibonacci {

  def fib(n: Int) : Int = {
    if (n <= 1) return n

    fib(n - 1) + fib(n - 2)
  }

  def fibTail(n: BigInt): BigInt = {
    fibTail_(n, 0, 1)
  }

  @tailrec
  private def fibTail_(n: BigInt, a: BigInt, b: BigInt): BigInt = {
    if (n == 0) return a
    if (n == 1) return b
    fibTail_(n - 1, b, a + b)
  }

  def lastFibDigit(n: BigInt): BigInt = {
    fibTail(n) % 10
  }
}
