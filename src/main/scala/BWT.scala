package analyze

object BWT {
  def encode(t: String): String = {
    t.reverse.foldLeft(List("$"))
      { (xs, x) => (x.toString + xs.head) :: xs }
      .zip("$" + t)
      .sortWith { _._1 < _._1 }
      .map { _._2 }
      .mkString
  }

  def decode(tb: String): String = {
    val pos = tb.indexOf('$')
    val tf = tb.zipWithIndex.sortWith { _._1 < _._1 }.map { _._2 }

    def _decode(pos: Int): String = {
      tb(tf(pos)) match {
        case '$' => "$"
        case ch => ch.toString + _decode(tf(pos))
      }
    }
    return _decode(pos)
  }
}
