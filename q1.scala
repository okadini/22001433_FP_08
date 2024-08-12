import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object q1 {
    def main(args:Array[String]) = {

        def caesarEncrypt(plaintext:String,shift:Int):String = {
            val alphabet = ('A' to 'Z').mkString
            plaintext.toUpperCase.map { c => 
                if(alphabet.contains(c)) {
                    alphabet((alphabet.indexOf(c) + shift) % alphabet.length)
                }
                else {
                    c
                }
            }
        }

        def caesarDecrypt(ciphertext:String,shift:Int):String = {
            val alphabet = ('A' to 'Z').mkString
            ciphertext.toUpperCase.map { c=> 
                if(alphabet.contains(c)) {
                    alphabet((alphabet.indexOf(c) - shift + alphabet.length) % alphabet.length)
                }
                else {
                    c
                }
            }
        }

        def cipher(text:String,shift:Int,encrypt:Boolean):String = {
            if(encrypt) {
                caesarEncrypt(text,shift)
            }
            else {
                caesarDecrypt(text,shift)
            }
        }

        var text = readLine("Enter the text : ")
        println("Do you want to encrypt or decrypt?")

        var x =""

        while(x != "e" && x != "d") {
            x = readLine("Enter e to encrypt and d to decrypt : ").toLowerCase()

            if(x != "e" && x != "d") {
                println("Invalid character")
            }
        }
        

        print("Enter the shift : ")
        var shift = readInt()

        if(x == "e") {
            println("Encrypted Text : " + cipher(text,shift,true))
        }
        else {
            println("Decrypted Text : " + cipher(text,shift,false))
        }
    }
}