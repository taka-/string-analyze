package vector

trait BitVector {
  def setBit(pos: Int, value: Int): Unit
  def getBit(pos: Int): Int
}

/**
 * 一番シンプルにListを使ったビット配列です。
 */
class ListBitVector(max: Int) extends BitVector {
  import scala.collection.mutable.ListBuffer
  // 0で初期化したListを作成
  private val array = ListBuffer.fill(max) { 0 }
  def setBit(pos: Int, value: Int): Unit = {
    array(pos) = value
  }

  def getBit(pos: Int): Int = {
    array(pos)
  }
}
