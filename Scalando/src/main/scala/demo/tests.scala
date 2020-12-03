package demo
import scala.io.StdIn.{readLine, readInt}

object tests {
  def main(args: Array[String]): Unit = {

    var result = {
      println("First Operand: ")
      lazy val first_operand = readInt();
      println("Second Operand: ")
      lazy val second_operand = readInt();
      first_operand + second_operand
    }

    println(result)

    val name = readLine("What's your name? ")
    println(s"Hello, \n$name!")

    if (name == "Lucas") {
      println("Lucasiiiii!")
    }
    else {
      println("Não é o Lucasii!")
    }

  }
}
