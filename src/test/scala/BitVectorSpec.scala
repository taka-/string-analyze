package vector

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class ListBitVectorSpec extends FunSuite {
  test("set and get") {
    val vec = new ListBitVector(10)
    assert(vec.getBit(0) == OFF)
    assert(vec.toString == "0000000000")
    vec.setBit(0, ON)
    assert(vec.getBit(0) == ON)
    assert(vec.toString == "1000000000")
  }
}

