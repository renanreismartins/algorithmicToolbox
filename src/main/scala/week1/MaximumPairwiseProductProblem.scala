package week1

object MaximumPairwiseProductProblem {

  def maxPairwiseProduct(l: List[Int]): Option[Int] = {
    if (l.size <= 1) return Option.empty

    val max = l.max
    val secondMax = l.filter(_ != max).max
    Option(max * secondMax)
  }

}
