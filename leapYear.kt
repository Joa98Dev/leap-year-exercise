fun leapYear(year: Int) {

    if (year % 4 == 0 && year % 400 == 0) {
        println("$year is a leap year!")
    } else if (year % 4 == 0 && year % 100 != 0){
        println("$year is a leap year")
    } else if (year % 100 == 0 && year % 400 == 0){
        println("$year is a leap year")
    } else {
        println("$year is not a leap year")
    }
}

fun main() {

    println(leapYear(2020))
}