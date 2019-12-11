import scala.util.Random
object Main {
  def main(args: Array[String]): Unit = {
    val x: Int = Random.nextInt(10)

    x match {
      case 0 => print("zero")
      case 1 => print("one")
      case 2 => print("two")
      case _ => print("other")
    }
  }
}
/* Pattern Matching */
/*
- Mechanism for Checking a Value against a pattern
- More powerful version of a Java Switch
- Can be used for a series of if/else statements
- A match expression has a value, the match keyword, and at least one case clause.
 */
