fun main() {
    //print("Введите первое число: ")
   // val num1 = readln().toInt()
    //print("Введите второе число: ")
    //val num2 = readln().toInt()
    //val max = if (num1 > num2) num1 else num2
   //println(max)
    //if (num1 > num2) {
    //    println("num 1 > num2")
    //} else {
        //println("num2 > num1")
    //}
    //val age = readln().toInt()
    //val status = if (age >= 18) "Сoвершенолетний" else "несовершенолетний"
    //println(status)
    print("Введите урон: ")
    val damage = readln().toInt()
    print("Щит активен? ")
    val active = readln()
    if (active == "Да"){
        println("Полученный урон ${damage / 2}")
    } else{
        println("Полученный урон ${damage}")
    }

}