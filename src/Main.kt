
    fun main() {
        lengthof("I love Kotlin")
        println(lengthof("I love Kotlin"))
        upper("okeya")
        println(upper("okeya"))
        input("STAR")
        println(input("STAR"))
        getFirstCharacter("wanja")
        println(getFirstCharacter("wanja"))
        getLastCharacter("naomi")
        println(getLastCharacter("naomi"))
        var firstString = "Love"
        var secondString = "Akira"
        println(concantenateStrings("I love ", "nature"))
        var input = "Hello"
        var input2 ="Hello"
        var result = input==input2
        println(result)
findSubstringIndex("coding","is cool")
    }
    fun lengthof(x:String):Int{
        return x.length
    }
    //Write a function that takes a string as input and returns the string in uppercase letters.
    fun upper(y: String):String{
        return y.uppercase()
    }
    //Write a function that takes a string as input and returns the string in lowercase letters.
    fun input(x: String):String{
        return x.lowercase()
    }
    //Write a function that takes a string as input and returns the first character of the string.
    fun getFirstCharacter(input:String):Char{
        return input[0]
    }
    //Write a function that takes a string as input and returns the last character of the string
    fun getLastCharacter(word: String):Char{
        return word[4]
    }
//Write a function that takes two strings as input and concatenates them together.

    fun concantenateStrings(z:String,w:String):String{
        return z + w
    }
    //Write a function that takes two strings as input and checks if they are equal.
    fun areStringsEqual(strn1:String,strn2:String):Boolean{
        return strn1.equals(strn2)
    }
    //Write a function that takes two strings as input and returns the index of the first
// occurrence of the second string in the first string.
// If the second string does not occur in the first string, the function should return -1.
    fun findSubstringIndex(j:String,k:String):Int {
        var result = j.indexOf(k)
        println(result)
        return result
    }

