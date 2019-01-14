package week1

import scala.io.StdIn

object SumOfTwoDigits {

  def sumTwoDigits(a: Int, b: Int) = a + b

  def main(args: Array[String]): Unit = {
    val a = StdIn.readInt()
    val b = StdIn.readInt()

    println(sumTwoDigits(a, b))
  }
}