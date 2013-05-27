package analyze

class AnalyzeString private (value: String) {
  lazy val suffixArray:List[String] = {
    value.foldLeft(List.empty: List[String]) {
      (xs, x) => 
        xs.headOption.map { _ + x.toString }.getOrElse(x.toString) :: xs 
    }.reverse
  }
}

object AnalyzeString {
  def apply(value: String): AnalyzeString = {
    new AnalyzeString(value)
  }
}
