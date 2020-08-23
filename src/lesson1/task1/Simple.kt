@file:Suppress("UNUSED_PARAMETER")

package lesson1.task1

import kotlin.math.*

/**
 * Пример
 *
 * Вычисление квадрата целого числа
 */
fun sqr(x: Int) = x * x

/**
 * Пример
 *
 * Вычисление квадрата вещественного числа
 */
fun sqr(x: Double) = x * x

/**
 * Пример
 *
 * Вычисление дискриминанта квадратного уравнения
 */
fun discriminant(a: Double, b: Double, c: Double) = sqr(b) - 4 * a * c

/**
 * Пример
 *
 * Поиск одного из корней квадратного уравнения
 */
fun quadraticEquationRoot(a: Double, b: Double, c: Double) =
    (-b + sqrt(discriminant(a, b, c))) / (2 * a)

/**
 * Пример
 *
 * Поиск произведения корней квадратного уравнения
 */
fun quadraticRootProduct(a: Double, b: Double, c: Double): Double {
    val sd = sqrt(discriminant(a, b, c))
    val x1 = (-b + sd) / (2 * a)
    val x2 = (-b - sd) / (2 * a)
    return x1 * x2 // Результат
}

/**
 * Пример главной функции
 */
fun main() {
//    val x1x2 = quadraticRootProduct(1.0, 13.0, 42.0)
//    println("Root product: $x1x2")
    println("Task1: fun seconds(8,20,35) "+seconds(8, 20, 35))

    println("Task1: fun lengthInMeters(8,2,11) "+lengthInMeters(8,2,11))
//    println("Task1: fun lengthInMeters(8,2,11) "+lengthInMeters(0,0,1))

    println("Task1: fun angleInRadian(36,14,35) "+angleInRadian(36,14,35))
    println("Task1: fun trackLength(3, 0,0, 4) "+trackLength(3.0, 0.0,0.0, 4.0))
    println("Task1: fun thirdDigit(3801) "+thirdDigit(3801))
    println("Task1: fun travelMinutes(9, 25,13, 1) "+travelMinutes(9, 25,13, 1))
    println("Task1: fun accountInThreeYears(100,10) "+accountInThreeYears(1,1))
//    println("Task1: fun accountInThreeYears(1,1) "+accountInThreeYears(1,1))
    println("Task1: fun numberRevert(874) "+numberRevert(874))
}

/**
 * Тривиальная
 *
 * Пользователь задает время в часах, минутах и секундах, например, 8:20:35.
 * Рассчитать время в секундах, прошедшее с начала суток (30035 в данном случае).
 */
fun seconds(hours: Int, minutes: Int, seconds: Int): Int {
    return 3600*hours+60*minutes+seconds
}

/**
 * Тривиальная
 *
 * Пользователь задает длину отрезка в саженях, аршинах и вершках (например, 8 саженей 2 аршина 11 вершков).
 * Определить длину того же отрезка в метрах (в данном случае 18.98).
 * 1 сажень = 3 аршина = 48 вершков, 1 вершок = 4.445 см.
 */
fun lengthInMeters(sagenes: Int, arshins: Int, vershoks: Int): Double {
//вычисляем длину в сантиметрах
    val totalvershoks=4.445*(48*sagenes+16*arshins+vershoks)
//округляем до целого и переводим в метры
    //return 0.01*totalvershoks.roundToLong()
    return 0.01*totalvershoks
}
/**
 * Тривиальная
 *
 * Пользователь задает угол в градусах, минутах и секундах (например, 36 градусов 14 минут 35 секунд).
 * Вывести значение того же угла в радианах (например, 0.63256).
 */
fun angleInRadian(deg: Int, min: Int, sec: Int): Double {
    val totaldeg=deg+min.toDouble()/60+sec.toDouble()/3600
    return 2*PI*totaldeg/360
}

/**
 * Тривиальная
 *
 * Найти длину отрезка, соединяющего точки на плоскости с координатами (x1, y1) и (x2, y2).
 * Например, расстояние между (3, 0) и (0, 4) равно 5
 */
fun trackLength(x1: Double, y1: Double, x2: Double, y2: Double): Double{
    val W=x1-x2
    val H=y1-y2
    return kotlin.math.sqrt(W*W+H*H)
}

/**
 * Простая
 *
 * Пользователь задает целое число, большее 100 (например, 3801).
 * Определить третью цифру справа в этом числе (в данном случае 8).
 */
fun thirdDigit(number: Int): Int {
    var third: Int
    third= number / 100
    third=third-10*(third/10)
    return third
}


/**
 * Простая
 *
 * Поезд вышел со станции отправления в h1 часов m1 минут (например в 9:25) и
 * прибыл на станцию назначения в h2 часов m2 минут того же дня (например в 13:01).
 * Определите время поезда в пути в минутах (в данном случае 216).
 */
fun travelMinutes(hoursDepart: Int, minutesDepart: Int, hoursArrive: Int, minutesArrive: Int):Int {
    val t1=hoursDepart*60+minutesDepart
    val t2=hoursArrive*60+minutesArrive
    return t2-t1
}


/**
 * Простая
 *
 * Человек положил в банк сумму в s рублей под p% годовых (проценты начисляются в конце года).
 * Сколько денег будет на счету через 3 года (с учётом сложных процентов)?
 * Например, 100 рублей под 10% годовых превратятся в 133.1 рубля
 */
fun accountInThreeYears(initial: Int, percent: Int): Double {
    val sum1:Double
    val sum2:Double
    val sum3:Double

    sum1=initial*(1+0.01*percent)   //суммма на конец первого года
    sum2=sum1*(1+0.01*percent)       //суммма на конец второго года
    sum3=sum2*(1+0.01*percent)     //суммма на конец третего года
//    return 0.01*(100*sum3).toLong() //приводим к 2 знакам после запятой
    return sum3   //приводим к 2 знакам после запятой

}


/**
 * Простая
 *
 * Пользователь задает целое трехзначное число (например, 478).
 * Необходимо вывести число, полученное из заданного перестановкой цифр в обратном порядке (например, 874).
 */
fun numberRevert(number: Int): Int {
    val SN:String
    val SNR:String
    SN=number.toString()    //конвертируем в строку
    SNR=SN.reversed()       //формируем инвертированную строку
    return SNR.toInt()      //превращаем строку в число
}
//that's all