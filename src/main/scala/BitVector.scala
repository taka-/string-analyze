package vector

trait Bit {
  val value: Int
}
object ON extends Bit {
  val value = 1
}

object OFF extends Bit {
  val value = 0
}

trait BitVector {
  def setBit(pos: Int, value: Bit): Unit
  def getBit(pos: Int): Bit
}

/**
 * 一番シンプルにListを使ったビット配列です。
 */
class ListBitVector(max: Int) extends BitVector {
  import scala.collection.mutable.ListBuffer
  // 0で初期化したListを作成
  private val array:ListBuffer[Bit] = ListBuffer.fill(max) { OFF }
  def setBit(pos: Int, value: Bit): Unit = {
    array(pos) = value
  }

  def getBit(pos: Int): Bit = {
    array(pos)
  }

  override def toString: String = {
    array.map { _.value }.mkString("")
  }
}
