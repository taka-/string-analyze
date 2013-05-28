package analyze

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class AnalyzeStringSuite extends FunSuite {
  test("suffixArray") {
    val array = AnalyzeString("abracadabra").suffixArray
    println(array)
    array.map {_.index}.zip(List(11, 10, 7, 0, 3, 5, 8, 1, 4, 6, 9, 2))
      .foreach { case (x, y) =>
        assert(x == y)
    }
    assert(array(0).xs == "$")
    assert(array(1).xs == "a$")
    assert(array(2).xs == "abra$")
    assert(array(3).xs == "abracadabra$")
    assert(array(11).xs == "racadabra$")
  }

  test("bwt") {
    val bwt = AnalyzeString("abracadabra").bwt
    assert(bwt == "ard$rcaaaabb")
  }
}
