fun main(){
    print("Введите уровень персонажа: ")
    val lvl = readln().toInt()
    val nums = 1..50
    if (lvl in nums) {
        println("Можно войти в данж")
    } else {
        println("Нельзя войти в данж")
    }
    val sym = 'z'..'a'
    println(sym)
    val d = 5 until 11
    println(d)
    val d1 = 10..50 step 3
    println(d1)

}