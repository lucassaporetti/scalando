package demo
import scala.io.StdIn.{readLine, readFloat}

object calculator {
  def main(args: Array[String]): Unit = {
  println("--------- SCALA CALCULATOR ---------")

    def get_operation() {

      println("First Operand: ")
      val first_operand = {readFloat()}

      println("Operator [+ - * /]: ")
      val operator = {readLine()}

      println("Second Operand: ")
      val second_operand = {readFloat()}

      def sum(first_operand: Float, second_operand: Float): Float = {return first_operand + second_operand}

      def subtract(first_operand: Float, second_operand: Float): Float = first_operand - second_operand

      def multiply(first_operand: Float, second_operand: Float): Float = first_operand * second_operand

      def divide(first_operand: Float, second_operand: Float) = first_operand / second_operand

      val result = operator match {
        case "+" => sum(first_operand, second_operand)
        case "-" => subtract(first_operand, second_operand)
        case "*" => multiply(first_operand, second_operand)
        case "/" => divide(first_operand, second_operand)
        case _ => println("This is not a valid operator")}

      println(s"Result: $first_operand $operator $second_operand = $result")
    }

    var continue : String = "S"

    do {
      get_operation()
      continue = readLine("Do you want to continue? [Y/N]: ").strip().toUpperCase()
    } while(continue != "N")

    val name = readLine("What's your name? ")
    println(s"Good bye, $name!")
  }
}

//    for (x <- 1 to 5) {
//      println("x using to " + x)
//    }
//
//    for (y <- 1 until 6) {
//      println("y using until " + y)
//    }
//
//    for (z <- 1 to 5; w <- 1 until 6) {
//      println("z using to " + z + " w using until " + w)
//    }
//
//    val a_list = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
//
//    for {number <- a_list; if number == 10} yield {println("We catch 10!")}
//
//    val a_number = 18
//
//    a_number match{
//      case 12 => println("Cirão da massa!!!")
//      case 13 | 45 | 17 => println("Vagabonds!")
//      case _ => println("Default value!")}
