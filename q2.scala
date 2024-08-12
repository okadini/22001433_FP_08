import scala.io.StdIn.readInt

object q2 {
    def main(args:Array[String]) = {
        
        print("Enter a positive integer : ")
        val num = readInt()

        if(num > 0) {
            val result = num match {
                case num if (num % 3 == 0) && (num % 5 == 0) => "Multiple of Both Three and Five"
                case num if  (num % 3 == 0) => "Multiple of Three"
                case num if (num % 5 == 0) => "Multiple of Five"
                case _ => "Not a multiple of Three or Five"
            }

            println(result)
        }
        
        else {
            println("Not a positive integer")
        }
        
    }
}