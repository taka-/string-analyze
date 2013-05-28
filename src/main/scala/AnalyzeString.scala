package analyze

case class Suffix(x: Char, xs: String, index: Int)

class AnalyzeString private (value: String) {
  lazy val suffixArray: List[Suffix] = {
    value.reverse.foldLeft(List("$")) {
      (xs, x) => 
        (x.toString + xs.head) :: xs 
    }.zipWithIndex
    .map { case (xs, index) => index match {
      case 0 => Suffix('$', xs , index)
      case _ => Suffix(value(index - 1), xs , index) }
    }
    .sortWith { _.xs < _.xs }
  }

  lazy val bwt: String = suffixArray.map { _.x }.mkString
}

object AnalyzeString {
  def apply(value: String): AnalyzeString = {
    new AnalyzeString(value)
  }
}
