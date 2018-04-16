object Bonus extends App {

  def payRoll(salary: Int, bonus : Boolean = false) : String = {
    if (bonus) {
    val bonusAmount = salary * 0.2
      s"£${(salary+bonusAmount).toInt}"

    }else{

      salary.toString
      s"£$salary"
    }
  }
  payRoll(15000,true)
}
