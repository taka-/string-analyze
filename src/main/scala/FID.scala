package analyze

trait FID {
  def access(pos: Int): Int
  def rank(value: Int)(pos: Int): Int
  def select(value: Int)(pos: Int): Int
  // カリー化のメリットを初めて感じた（笑）
  val rank0: Int => Int = rank(0)(_)
  val rank1: Int => Int = rank(1)(_)
  val select0: Int => Int = select(0)(_)
  val select1: Int => Int = select(1)(_)

}

class StringFID(value: String) extends FID {
  lazy val array = value.map { _.toString.toInt }

  def access(pos: Int): Int = {
    array(pos).toInt
  }
  def rank(v: Int)(pos: Int): Int = {
    array.take(pos).filter { _ == v }.size
  }
  def select(v: Int)(pos: Int): Int = {
    array.zipWithIndex.filter { _._1 == v }(pos)._2
  }
}

object FID {
  def simpleFID(value: String): FID = new StringFID(value)
}
