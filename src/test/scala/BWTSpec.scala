package analyze

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class BWTSpec extends FunSuite {
  test("bwt decode") {
    assert("abracadabra$" == BWT.decode("ard$rcaaaabb"))
  }
}
