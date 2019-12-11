import scala.util.Random
object Main {

  def addition(f: (Int, Int) => Int,a: Int, b:Int): Int = f(a,b)

  val squareSum = (x: Int, y: Int) => (x*x + y*y)
  val cubeSum = (x: Int, y: Int) => (x*x*x + y*y*y)
  val intSum = (x: Int, y: Int) => (x + y)

  def main(args: Array[String]): Unit = {

    val squaredSum = addition(squareSum, 1, 2)
    val cubedSum = addition(cubeSum, 1, 2)
    val normalSum = addition(intSum, 1, 2)
    println(squaredSum)
    println(cubedSum)
    println(normalSum)
  }
}
/* Higher Order Functions*/
/*
CLASSIC EXAMPLE = "Map Function"
Takes another function as a parameter and returns a function as a result.
 */
