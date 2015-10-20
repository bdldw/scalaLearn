import org.scalatest._
import learn.oneapm.CountChange.countChange

/**
 * Created by liudawei on 15/10/20.
 */
class CountChangeTest extends FunSuite {
  test("sorted CHF") {
    assert(countChange(300, List(5, 10, 20, 50, 100, 200, 500)) === 1022)
  }

  test("no pennies") {
    assert(countChange(301, List(5, 10, 20, 50, 100, 200, 500)) === 0)
  }

  test("unsorted CHF") {
    assert(countChange(300, List(500, 5, 50, 100, 20, 200, 10)) === 1022)
  }

  test("zero money") {
    assert(countChange(0, List(1, 2, 5)) === 1)
  }

  test("little than zero money") {
    assert(countChange(-1, List(1, 2, 5)) === 0)
  }

  test("empty list") {
    assert(countChange(300, List()) === 0)
  }

  test("null pointer list") {
    assert(countChange(300, null) === 0)
  }

}
