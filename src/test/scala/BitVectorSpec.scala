package vector

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class ListBitVectorSpec extends FunSuite {
  test("set and get") {
    val vec = new ListBitVector(10)
    assert(vec.getBit(0) == 0)
    vec.setBit(0, 1)
    assert(vec.getBit(0) == 1)
  }
}

