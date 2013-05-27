package analyze

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class AnalyzeStringSuite extends FunSuite {
  test("suffixArray") {
    val array = AnalyzeString("abcdefg").suffixArray
    assert(array.size == 7)
    assert(array(0) == "a")
    assert(array(1) == "ab")
  }
}
