import scala.util.Random
object Main {
  def double = (x : Int) => x*x
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3)
    val doubledList = list.map(x => double(x))
    println(doubledList)
  }
}
/* Higher Order Functions*/
/*
CLASSIC EXAMPLE = "Map Function"
Takes another function as a parameter and returns a function as a result.
 */
