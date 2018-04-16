import org.scalatest.{MustMatchers, WordSpec}

class BonusSpec extends WordSpec with MustMatchers {

  "kata" when {
    "payRoll is called " should {
      "return salary" in {
        Bonus.payRoll(15000) mustBe "£15000"
      }
    }

    "payRoll is called " should {
      "return salary + bonus" in {
        Bonus.payRoll(15000, true) mustBe "£18000"
      }
    }
  }
}