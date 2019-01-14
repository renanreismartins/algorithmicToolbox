package week1

import org.scalatest.{FlatSpec, Matchers}


class SumOfTwoDigitsTest extends FlatSpec with Matchers {
  "SumOfTwoDigits" should "sum two digits" in {
    SumOfTwoDigits.sumTwoDigits(9, 7) should be (16)
  }
}