import scala.util.Random
object Main {
  def finalPriceCurried(vat: Double)
                       (serviceCharge: Double)
                       (productPrice: Double): Double =
    productPrice + productPrice*serviceCharge/100 + productPrice*vat/100

  def main(args: Array[String]): Unit = {
    val vatApplied = finalPriceCurried(20)_
    val serviceChargeApplied = vatApplied(12.5)
    val finalProductPrice = serviceChargeApplied(120)
    println(finalProductPrice)
  }
}
/* Currying in Scala */
/*
Technique of translating thye evaluation of a function that takes in multiple arguments
into evaluating a sequence of functions ,with each single argument.
 */
