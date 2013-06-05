package analyze

import org.scalatest.FunSuite
import scala.collection.mutable.Stack

class BWTSpec extends FunSuite {
  test("bwt decode") {
    assert("abracadabra$" == BWT.decode("ard$rcaaaabb"))
  }

  test("bwt encode") {
    println(BWT.encode("ard$rcaaaabb"))
    assert("ard$rcaaaabb" == BWT.encode("abracadabra"))
  }
}
