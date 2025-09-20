fun main(){
    println("Начинаем ритуал защиты!")
    var index = 0
    repeat(5){
        println("Заклинание защиты активировано! (шаг ${index + 1})")
        index++
    }
    println("Замок защищен!")
    print("Введите номер месяца (1-12): ")
    val month = readln().toInt()
    val ml = listOf(31,30,31,30,31,30,31,30,31,30,31,28)
    println("В этом месяце ${ml[month]}")

}