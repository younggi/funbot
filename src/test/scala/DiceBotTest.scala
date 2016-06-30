import org.scalatest.FunSuite

class DiceBotTest  extends FunSuite {
  test("roll with invalid string returns none.") {
    val expected = None
    val actual = DiceBot.roll("invalid string")
    assert(expected == actual)
  }
}
