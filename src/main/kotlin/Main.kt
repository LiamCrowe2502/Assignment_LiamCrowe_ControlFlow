//TODO INSTRUCTIONS:
//  1. Now that you have the code in IntelliJ on your computer, use VCS to "Share this project to your GitHub repo
//     that is attached to your student email.  MAKE SURE YOU HAVE THIS REPO SET TO PRIVATE.
//  2. Run the app and familiarise yourself with the output and where each part of the output came from in the code.
//  3. There are multiple TO DO comments - follow this workflow when addressing EACH one:
//       a. Locate a single TO DO item that you want to work on
//       b. Add the required code to address it.
//       c. Commit the change to your local repository, making sure your commit message explains (briefly) what you did.
//       d. Push the change to your remote repository
//  4. REMEMBER TO USE THIS GITHUB WORKFLOW FOR EACH CHANGE - failure to use GitHub in this way will result in
//     a lower grade for the assignment as it is a software development tooling module.
// Hint: the week 2 syntax labs are a good support for completing this project

fun main(args: Array<String>) {
    minimumOf(5,7)
    rangeOf(4)
    inferredTypeOf(0.0F)
    stringContains("wordle")
}

fun minimumOf(number1: Long, number2: Long){
    //This function takes in two numbers and:
    //If number1 is less than number2, then print a message informing the user of that.

    if(number1 < number2) {
        println("${number1} is less than ${number2}" + "\n")
    }

    //  if number1 is greater than or equal to number2, print a message letting the user know that.
    if(number1 >= number2) {
        println("${number1} is greater than or equal t0 ${number2}" + "\n")
    }
}

fun rangeOf(number: Int){
    //This function takes in a number and prints out the range that the number falls in.
    // The ranges are: (0 or below) (1 to 5), (6 to 10), (11 to 20), (21+)

    when(number) {
        0 -> println("${number} is zero or below" + "\n")
        in 1..5 -> println("${number} is between 1 and 5" + "\n")
        in 6..10 -> println("${number} is between 6 to 10" + "\n")
        in 11..20 -> println("${number} is between 11 to 20" + "\n")
        21 -> println("${number} is zero or below" + "\n")
    }

    //If the number is 4, print out a message saying that the number 4 falls into the range 1 to 5.
    if (number == 4) {
        when(number) {
            in 1..5 -> println("${number} falls between 1 to 5" + "\n")
        }
    }
}

fun inferredTypeOf(variable: Any){
    //This function examines the inferred type of the variable passed as a parameter.
    //When the type is Int, print out that the data type of the variable is Int.
    //Adopt the same approach for the following types: Long, Double, Float or Boolean.
    //When the data type is not Int, Long, Double, Float or Boolean, print that the data type is something else.
    //https://kotlinlang.org/docs/typecasts.html

    if (variable is Int) {
        println("${variable} is an Int" + "\n")
    }
    else if(variable is Long) {
        println("${variable} is a Long" + "\n")
    }
    else if(variable is Double) {
        println("${variable} is a Double" + "\n")
    }
    else if(variable is Float) {
        println("${variable} is a Float" + "\n")
    }
    else if(variable is Boolean) {
        println("${variable} is a Boolean" + "\n")
    }
    else {
        println("The data type is something else" + "\n")
    }
}

fun stringContains(str : String){
    //Contains the letter A, print the string and say it contains A.
    if (str.contains("A".lowercase())) {
        println("${str} contains the letter A" + "\n")
    }

    //Contains the letter B, print the string and say it contains B.
    else if (str.contains("B".lowercase())) {
        println("${str} contains the letter B" + "\n")
    }

    //Contains the letter C, print the string and say it contains C.
    else if (str.contains("C".lowercase())) {
        println("${str} contains the letter C" + "\n")
    }

    //Is empty, inform the user that it is empty.
    else if (str.isEmpty()) {
        println("The string is empty" + "\n")
    }

    //Otherwise print the string and say it doesn't contain A, B or C.
    else {
        println("${str} doesn't contain A, B, or C" + "\n")
    }
}
