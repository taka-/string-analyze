package bwt

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class BWTSpec extends FunSuite {
  test("bwt decode") {
    val src = "ard$rcaaaabb"
    assert(src == BWT.decode(src))
  }
}
