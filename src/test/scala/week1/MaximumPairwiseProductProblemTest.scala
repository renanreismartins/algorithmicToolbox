package week1

import org.scalatest.{FlatSpec, Matchers}

class MaximumPairwiseProductProblemTest extends FlatSpec with Matchers {
  "MaximumPairwiseProductProblem" should "calculate the maximum parwise product for: 1 2 3" in {
    MaximumPairwiseProductProblem.maxPairwiseProduct(List(1, 2, 3)) should be (Option(6))
  }

  it should "calculate the maximum parwise product for: 7 5 14 2 8 8 10 1 2 3" in {
    MaximumPairwiseProductProblem.maxPairwiseProduct(List(7, 5, 14, 2, 8, 8, 10, 1, 2, 3)) should be (Option(140))
  }

  it should "return None for a list with less than 2 elements " in {
    MaximumPairwiseProductProblem.maxPairwiseProduct(List(7)) should be (None)
  }
}

