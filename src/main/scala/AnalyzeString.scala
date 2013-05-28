package analyze

case class Suffix(value: String, index: Int)

class AnalyzeString private (value: String) {
  lazy val suffixArray: List[Suffix] = {
    Suffix("$", value.length) :: value.reverse.foldLeft(List.empty: List[String]) {
      (xs, x) => 
        (x.toString + xs.headOption.getOrElse("")) :: xs 
    }.zipWithIndex
    .map { case (xs, index) => Suffix(xs + "$", index) }
    .sortWith { _.value < _.value }
  }
}

object AnalyzeString {
  def apply(value: String): AnalyzeString = {
    new AnalyzeString(value)
  }
}
