package analyze

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class FIDSpec extends FunSuite {
  test("access") {
    assert(FID.simpleFID("01101100100").access(0) == 0)
    assert(FID.simpleFID("01101100100").access(1) == 1)
  }

  test("rank") {
    assert(FID.simpleFID("01101100100").rank(1)(6) == 4)
    assert(FID.simpleFID("01101100100").rank1(6) == 4)

    assert(FID.simpleFID("01101100100").rank(0)(6) == 2)
    assert(FID.simpleFID("01101100100").rank0(6) == 2)
  }

  test("select") {
    assert(FID.simpleFID("01101100100").select(0)(3) == 7)
    assert(FID.simpleFID("01101100100").select0(3) == 7)
    assert(FID.simpleFID("01101100100").select(1)(3) == 5)
    assert(FID.simpleFID("01101100100").select1(3) == 5)
  }
}
