package analyze

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class AnalyzeStringSuite extends FunSuite {
  test("suffixArray") {
    val array = AnalyzeString("abracadabra").suffixArray
    array.map {_.index}.zip(List(11, 10, 7, 0, 3, 5, 8, 1, 4, 6, 9, 2))
      .foreach { case (x, y) =>
        assert(x == y)
    }
    assert(array(0).value == "$")
    assert(array(1).value == "a$")
    assert(array(2).value == "abra$")
    assert(array(3).value == "abracadabra$")
    assert(array(11).value == "racadabra$")
  }
}
