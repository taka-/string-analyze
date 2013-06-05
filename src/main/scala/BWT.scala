package analyze

object BWT {
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
