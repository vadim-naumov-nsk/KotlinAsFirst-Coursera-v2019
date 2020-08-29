@file:Suppress("UNUSED_PARAMETER")

package lesson3.task1

import lesson1.task1.*
import kotlin.math.*
import kotlin.math.sqrt
import kotlin.math.pow

fun main() {
/*
    println("L3_Task1: fun digitNumber(0) 1 = " + digitNumber(0))
    println("L3_Task1: fun digitNumber(7) 1 = " + digitNumber(7))
    println("L3_Task1: fun digitNumber(10) 2 = " + digitNumber(10))
    println("L3_Task1: fun digitNumber(99) 2 = " + digitNumber(99))
    println("L3_Task1: fun digitNumber(123) 3 = " + digitNumber(123))
    println("L3_Task1: fun digitNumber(Int.MAX_VALUE) 10 = " + digitNumber(Int.MAX_VALUE))
    println("L3_Task1: fun fib(1) 1 = " + fib(1))
    println("L3_Task1: fun fib(2) 1 = " + fib(2))
    println("L3_Task1: fun fib(3) 2 = " + fib(3))
    println("L3_Task1: fun fib(5) 5 = " + fib(5))
    println("L3_Task1: fun fib(8) 21 = " + fib(8))
    println("L3_Task1: fun fib(40) 102334155 = " + fib(40))
    println("L3_Task1: fun fib(46) 1836311903 = " + fib(46))

    println("L3_Task1: fun minDivisor(2) 2 = " + minDivisor(2))
    println("L3_Task1: fun minDivisor(75) 3 = " + minDivisor(75))
    println("L3_Task1: fun minDivisor(75/3) 5 = " + minDivisor(75/3))
    println("L3_Task1: fun minDivisor(97) 97 = " + minDivisor(97))
    println("L3_Task1: fun minDivisor(49) 7 = " + minDivisor(49))
    println("L3_Task1: fun minDivisor(8653) 17 = " + minDivisor(8653))
    println("L3_Task1: fun minDivisor(2124679) 2124679 = " + minDivisor(2124679))
    println("L3_Task1: fun minDivisor(Int.MAX_VALUE) "+Int.MAX_VALUE +" = " + minDivisor(Int.MAX_VALUE))

    println("L3_Task1: fun lcm(13, 13) 13 = " + lcm(13, 13))
    println("L3_Task1: fun lcm(2, 8) 8 = " + lcm(2, 8))
    println("L3_Task1: fun lcm(6, 8) 24 = " + lcm(6, 8))
    println("L3_Task1: fun lcm(39, 75) 975 = " + lcm(39, 75))
    println("L3_Task1: fun lcm(1357, 9863) 13384091 = " + lcm(1357, 9863))
    println("L3_Task1: fun lcm(13579, 98631) 1339310349 = " + lcm(13579, 98631))
    println("L3_Task1: fun lcm(23579, 88631) 2089830349 = " + lcm(23579, 88631))
    println("L3_Task1: fun lcm(2, 1011111111) 2022222222 = " + lcm(2, 1011111111))
    println("L3_Task1: fun lcm(1011111111, 2) 2022222222 = " + lcm(1011111111, 2))

    println("L3_Task1: fun maxDivisor(17) 1 = " + maxDivisor(17))
    println("L3_Task1: fun maxDivisor(24) 12 = " + maxDivisor(24))
    println("L3_Task1: fun maxDivisor(177) 59 = " + maxDivisor(177))
    println("L3_Task1: fun maxDivisor(34) 17 = " + maxDivisor(34))
    println("L3_Task1: fun maxDivisor(49) 7 = " + maxDivisor(49))
    println("L3_Task1: fun maxDivisor(8653) 509 = " + maxDivisor(8653))
    println("L3_Task1: fun maxDivisor(2124679) 1 = " + maxDivisor(2124679))
    println("L3_Task1: fun maxDivisor(1073676287) 1 = " + maxDivisor(1073676287))
    println("L3_Task1: fun maxDivisor("+Int.MAX_VALUE+") 1 = " + maxDivisor(Int.MAX_VALUE))

    println("L3_Task1: fun isCoPrime(25, 49) true = " + isCoPrime(25, 49))
    println("L3_Task1: fun isCoPrime(6, 8) False = " + isCoPrime(6, 8))
    println("L3_Task1: fun isCoPrime(17, 97) true = " + isCoPrime(17, 97))
    println("L3_Task1: fun isCoPrime(37, 111) False = " + isCoPrime(37, 111))
    println("L3_Task1: fun isCoPrime(1234567890, 908765431) true = " + isCoPrime(1234567890, 908765431))
    println("L3_Task1: fun isCoPrime(659259258, 329629629) False = " + isCoPrime(549382715, 329629629))
    println("L3_Task1: fun isCoPrime(2109876543, 1234567891) true = " + isCoPrime(2109876543, 1234567891))

    println("L3_Task1: fun squareBetweenExists(1, 1) true = " + squareBetweenExists(1, 1))
    println("L3_Task1: fun squareBetweenExists(21, 28) true = " + squareBetweenExists(21, 28))
    println("L3_Task1: fun squareBetweenExists(36, 48) true = " + squareBetweenExists(36, 48))
    println("L3_Task1: fun squareBetweenExists(50, 64) true = " + squareBetweenExists(50, 64))
    println("L3_Task1: fun squareBetweenExists(51, 61) false = " + squareBetweenExists(51, 61))
    println("L3_Task1: fun squareBetweenExists(999, 1001) false = " + squareBetweenExists(999, 1001))
    println("L3_Task1: fun squareBetweenExists(152374337, 152423715) true = " + squareBetweenExists(152374337, 152423715))
    println("L3_Task1: fun squareBetweenExists(2147395601, Int.MAX_VALUE) false = " + squareBetweenExists(2147395601, Int.MAX_VALUE))

    println("L3_Task1: fun collatzSteps(1) 0 = " + collatzSteps(1))
    println("L3_Task1: fun collatzSteps(2) 1 = " + collatzSteps(2))
    println("L3_Task1: fun collatzSteps(3) 7 = " + collatzSteps(3))
    println("L3_Task1: fun collatzSteps(5) 5 = " + collatzSteps(5))
    println("L3_Task1: fun collatzSteps(10) 6 = " + collatzSteps(10))
    println("L3_Task1: fun collatzSteps(100) 25 = " + collatzSteps(100))
    println("L3_Task1: fun collatzSteps(128) 7 = " + collatzSteps(128))
    println("L3_Task1: fun collatzSteps(1000) 111 = " + collatzSteps(1000))
    println("L3_Task1: fun collatzSteps(100000) 128 = " + collatzSteps(100000))

    println("L3_Task1: fun sin(0.0, 1e-5) 0.0 = " + sin(0.0, 1e-5))
    println("L3_Task1: fun sin(PI / 2.0, 1e-5) 1.0 = " + sin(PI / 2.0, 1e-5))
    println("L3_Task1: fun sin(PI / 4.0, 1e-8) "+sin(PI / 4.0)+" = " + sin(PI / 4.0, 1e-8))
    println("L3_Task1: fun sin(-PI / 4.0, 1e-8) "+sin(-PI / 4.0)+" = " + sin(-PI / 4.0, 1e-8))
    println("L3_Task1: fun sin(3*PI / 2.0, 1e-8) -1.0 = " + sin(3*PI / 2.0, 1e-8))
    println("L3_Task1: fun sin(6*PI+PI / 4.0, 1e-8) "+sin(6*PI+PI / 4.0)+" = " + sin(6*PI+PI / 4.0, 1e-8))
    println("L3_Task1: fun sin(100 * PI, 1e-8) "+sin(100*PI)+" = " + sin(100 * PI, 1e-8))

    println("L3_Task1: fun cos(0.0, 1e-5) "+cos(0.0)+" = " + cos(0.0, 1e-5))
    println("L3_Task1: fun cos(PI / 2.0, 1e-5) "+cos(PI / 2.0)+" = " + cos(PI / 2.0, 1e-5))
    println("L3_Task1: fun cos(3*PI / 2.0, 1e-8) "+cos(3*PI / 2.0)+" = " +  cos(3*PI / 2.0, 1e-8))
    println("L3_Task1: fun cos(6*PI+PI / 4.0, 1e-8) "+cos(6*PI+PI / 4.0)+" = " + cos(6*PI+PI / 4.0, 1e-8))

    println("L3_Task1: fun revert(3) 3= " + revert(3))

    println("L3_Task1: fun isPalindrome(24688642) true = " + isPalindrome(24688642))

    println("L3_Task1: fun (hasDifferentDigits(323) true = " + hasDifferentDigits(323))
    println("L3_Task1: fun (hasDifferentDigits(54) true = " + hasDifferentDigits(54))
    println("L3_Task1: fun (hasDifferentDigits(222266666) true = " + hasDifferentDigits(222266666))
    println("L3_Task1: fun (hasDifferentDigits(0) false = " + hasDifferentDigits(0))
    println("L3_Task1: fun (hasDifferentDigits(777) false = " + hasDifferentDigits(777))
    println("L3_Task1: fun (hasDifferentDigits(31122) true = " + hasDifferentDigits(31122))

    println("L3_Task1: fun squareSequenceDigit(2) 4 = " + squareSequenceDigit(2))
    println("L3_Task1: fun squareSequenceDigit(7) 5 = " + squareSequenceDigit(7))
    println("L3_Task1: fun squareSequenceDigit(17) 0 = " + squareSequenceDigit(17))
    println("L3_Task1: fun squareSequenceDigit(27) 9 = " + squareSequenceDigit(27))

 */

//    println("L3_Task1: fun fibSequenceDigit(4) 3 = " + fibSequenceDigit(4))
//    println("L3_Task1: fun fibSequenceDigit(9) 2 = " + fibSequenceDigit(9))
//    println("L3_Task1: fun fibSequenceDigit(14) 5 = " + fibSequenceDigit(14))


}


/**
 * Пример
 *
 * Вычисление факториала
 */
fun factorial(n: Int): Double {
    var result = 1.0
    for (i in 1..n) {
        result = result * i // Please do not fix in master
    }
    return result
}

/**
 * Пример
 *
 * Проверка числа на простоту -- результат true, если число простое
 */
fun isPrime(n: Int): Boolean {
    if (n < 2) return false
    if (n == 2) return true
    if (n % 2 == 0) return false
    for (m in 3..sqrt(n.toDouble()).toInt() step 2) {
        if (n % m == 0) return false
    }
    return true
}

/**
 * Пример
 *
 * Проверка числа на совершенность -- результат true, если число совершенное
 */
fun isPerfect(n: Int): Boolean {
    var sum = 1
    for (m in 2..n / 2) {
        if (n % m > 0) continue
        sum += m
        if (sum > n) break
    }
    return sum == n
}

/**
 * Пример
 *
 * Найти число вхождений цифры m в число n
 */
fun digitCountInNumber(n: Int, m: Int): Int =
    when {
        n == m -> 1
        n < 10 -> 0
        else -> digitCountInNumber(n / 10, m) + digitCountInNumber(n % 10, m)
    }

/**
 * Простая
 *
 * Найти количество цифр в заданном числе n.
 * Например, число 1 содержит 1 цифру, 456 -- 3 цифры, 65536 -- 5 цифр.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun digitNumber(n: Int): Int {
    var k: Int = 0     //количество разрядов в числе
    var nom: Int = n   //копируем n -> nom
//    println("digitNumber nom=$nom")
    do {
        nom /= 10
        k += 1
    } while (nom > 0)    //пока результат деления на 10 >0

    return k
}

/**
 * Простая
 *
 * Найти число Фибоначчи из ряда 1, 1, 2, 3, 5, 8, 13, 21, ... с номером n.
 * Ряд Фибоначчи определён следующим образом: fib(1) = 1, fib(2) = 1, fib(n+2) = fib(n) + fib(n+1)
 */
fun fib(n: Int): Int {
    var Fib0 = 1
    var Fib1 = 1
    var result = 1

    if (n < 3) return result

    for (i in 3..n) {
        result = Fib0 + Fib1 // Please do not fix in master
        Fib0 = Fib1
        Fib1 = result
//        println("i $i  Fib(i-1) $Fib0  Fib("+i+") $Fib1")
    }

    return result
}

/**
 * Простая
 *
 * Для заданных чисел m и n найти наименьшее общее кратное, то есть,
 * минимальное число k, которое делится и на m и на n без остатка
 */
fun lcm(m: Int, n: Int): Int {
    var i: Int = 0
    val k = kotlin.math.max(m, n)

    for (i in k..m * n) {   // первое число с остатком от деления = 0
////        println("i="+i+" n=$n "+n % i)
        if ((i % n == 0) && (i % m == 0)) {
            return i
        }
    }

    return 0
}

/**
 * Простая
 *
 * Для заданного числа n > 1 найти минимальный делитель, превышающий 1
 */
fun minDivisor(n: Int): Int {
    var i: Int = 0
    for (i in 2..n) {   // первое число с остатком от деления = 0
//        println("i="+i+" n=$n "+n % i)
        if (n % i == 0) {
            return i
        }
    }
    return i
}

/**
 * Простая
 *
 * Для заданного числа n > 1 найти максимальный делитель, меньший n
 */
fun maxDivisor(n: Int): Int {
    var i: Int = 0
    for (i in n - 1 downTo 1) {   // ближайшее число к n с остатком от деления = 0
//        println("i="+i+" n=$n "+n % i)
        if (n % i == 0) {
            return i
        }
    }
    return i

}

/**
 * Простая
 *
 * Определить, являются ли два заданных числа m и n взаимно простыми.
 * Взаимно простые числа не имеют общих делителей, кроме 1.
 * Например, 25 и 49 взаимно простые, а 6 и 8 -- нет.
 */
fun isCoPrime(m: Int, n: Int): Boolean {
    var i: Int = 0
    val k = kotlin.math.min(m, n)

//    println("m=$m n=$n k=$k")

//проверяем делители от 2 до k включительно
    for (i in 2..k) {
        if ((n % i == 0) && (m % i == 0)) {
//            println("i="+i+" n/"+i+" = "+n % i+" m/"+i+" = "+m % i)
            return false
        }
    }
    return true
}

/**
 * Простая
 *
 * Для заданных чисел m и n, m <= n, определить, имеется ли хотя бы один точный квадрат между m и n,
 * то есть, существует ли такое целое k, что m <= k*k <= n.
 * Например, для интервала 21..28 21 <= 5*5 <= 28, а для интервала 51..61 квадрата не существует.
 */
fun squareBetweenExists(m: Int, n: Int): Boolean {
    var s = 0
    for (i in m..n) {
        s = kotlin.math.sqrt(i.toDouble()).toInt()    //вычисляем корень из i
        s = s * s       //возводим его в квадрат
        if ((s >= m) && (s <= n)) {
//            println("i="+i+" s=$s ")
            return true
        }
    }
    return false

}

/**
 * Средняя
 *
 * Гипотеза Коллатца. Рекуррентная последовательность чисел задана следующим образом:
 *
 *   ЕСЛИ (X четное)
 *     Xслед = X /2
 *   ИНАЧЕ
 *     Xслед = 3 * X + 1+
 *
 * например
 *   15 46 23 70 35 106 53 160 80 40 20 10 5 16 8 4 2 1 4 2 1 4 2 1 ...
 * Данная последовательность рано или поздно встречает X == 1.
 * Написать функцию, которая находит, сколько шагов требуется для
 * этого для какого-либо начального X > 0.
 */
fun collatzSteps(x: Int): Int {
    var n = 0
    var i = x
    while (i != 1) {
        n = n + 1
        if (i % 2 == 0)
            i = i / 2
        else
            i = 3 * i + 1
//        println("n=$n  i=$i")
    }
    return n
}


/**
 * Средняя
 *
 * Для заданного x рассчитать с заданной точностью eps
 * sin(x) = x - x^3 / 3! + x^5 / 5! - x^7 / 7! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю.
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.sin и другие стандартные реализации функции синуса в этой задаче запрещается.
 */
fun sin(x: Double, eps: Double): Double {
    var sinX = 0.0
    var addX = 1.0
    var i = -1
    var sig = -1
    var alf = x

    while (alf >= 2 * PI) {   //убираем период 2PI для x>=2PI
        alf = alf - 2 * PI
    }

    while (alf <= -2 * PI) {   //убираем период 2PI для x<=-2PI
        alf = alf + 2 * PI
    }


//    println("x=$x  alf=$alf")
    while ((addX > eps) || (-addX > eps)) {     //addX может быть < 0
        i = i + 2     //шаг инкремента = 2
        sig = -sig    //меняем знак

        addX = sig * alf.pow(i) / factorial(i)
//        println("i=$i  addX=$addX")
        sinX = sinX + addX
    }
//  println("sinX=$sinX")
    //округляем с точностью до eps
    return eps * kotlin.math.round(sinX / eps)
}

/**
 * Средняя
 *
 * Для заданного x рассчитать с заданной точностью eps
 * cos(x) = 1 - x^2 / 2! + x^4 / 4! - x^6 / 6! + ...
 * Нужную точность считать достигнутой, если очередной член ряда меньше eps по модулю
 * Подумайте, как добиться более быстрой сходимости ряда при больших значениях x.
 * Использовать kotlin.math.cos и другие стандартные реализации функции косинуса в этой задаче запрещается.
 */
fun cos(x: Double, eps: Double): Double {
    var cosX = 0.0
    var addX = 1.0
    var i = -2
    var sig = -1
    var alf = x

    while (alf >= 2 * PI) {   //убираем период 2PI для x>=2PI
        alf = alf - 2 * PI
    }

    while (alf <= -2 * PI) {   //убираем период 2PI для x<=-2PI
        alf = alf + 2 * PI
    }


//    println("x=$x  alf=$alf")
    while ((addX > eps) || (-addX > eps)) {     //addX может быть < 0
        i = i + 2     //шаг инкремента = 2
        sig = -sig    //меняем знак

        addX = sig * alf.pow(i) / factorial(i)
        //       println("i=$i  addX=$addX")
        cosX = cosX + addX
    }
//    println("cosX=$cosX")
    //округляем с точностью до eps
    return eps * kotlin.math.round(cosX / eps)

}

/**
 * Средняя
 *
 * Поменять порядок цифр заданного числа n на обратный: 13478 -> 87431.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun revert(n: Int): Int {
    var numbRazr = 0
    var nCp = n   //в функцию передается val. Чтобы менять создаем var nCp=n
    var nRev = 0

//все делаем на копии - nCp
    if (nCp < 10) {     //если только разряд единиц, то вернуть исходное число
        return nCp
    }

    while (nCp / 10 > 0) {
        numbRazr = nCp % 10       //находим число младшего разряда
        nRev = 10 * nRev + numbRazr   //сдвигаем nRev на разряд влево и добавляем numbRazr
//        println("nCp=$nCp  numbRazr=$numbRazr  nRev=$nRev nCp/10="+nCp/10)
        nCp = nCp / 10              //сдвигаем nCp на разряд вправо

        if (nCp < 10) {     //если это разряд единиц, то больше циклов не будет. Добавляем последнее
            nRev = 10 * nRev + nCp
        }
    }
    return nRev
}

/**
 * Средняя
 *
 * Проверить, является ли заданное число n палиндромом:
 * первая цифра равна последней, вторая -- предпоследней и так далее.
 * 15751 -- палиндром, 3653 -- нет.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun isPalindrome(n: Int): Boolean {
    var razr = 0
    var kMult=0
    var k = n   //в функцию передается val. Чтобы менять создаем var k=n

//определяем разрядность числа n
    while (k / 10 > 0) {
        razr += 1
        k = k / 10
    }
//если один разряд, то вернуть true
    if (razr==0) return true
    kMult=10.0.pow(razr).toInt()
//    println("n = $n  razr=$razr  kMult=$kMult n/kMult="+n/kMult+" (razr+1)/2 = "+(razr+1)/2)

var numbF=0
var numbL=0

    k = n
    while (razr>=0) {
        numbF=k % 10    //число младшего разрядя
        numbL=k/kMult   //число старшего разряда
        if (numbF != numbL) return false    //если числа старшего и младшего разрядов разные, вернуть false

//       println("m=$m  k=$k  numbF = $numbF  numbL=$numbL")

//модифицируем kMult и k
        k=k % kMult     //убираем старший разряд у k
        k=k/10          //убираем младший разряд у k
        kMult=kMult/100 //уменьшаем делитель старшего разряда kMult в 100 раз (на 2 разряда)

        razr=razr-2     //уменьшаем разрядность k на 2, чтобы во-время завершить цикл
    }
    return true
}

/**
 * Средняя
 *
 * Для заданного числа n определить, содержит ли оно различающиеся цифры.
 * Например, 54 и 323 состоят из разных цифр, а 111 и 0 из одинаковых.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun hasDifferentDigits(n: Int): Boolean {
    var numbL= n % 10   //запоминаем цифру младшего разряда
    var nVar=n          //создаем переменную, равную n
    var numbF=0
    var razr = 0

    if (n<10) return false   //если один разряд, то вернуть true

//определяем разрядность числа n
    while (nVar / 10 > 0) {
        razr += 1
        nVar = nVar / 10
    }

    nVar=n

    while (razr>0) {
        nVar=nVar/10    //выполняем сдвиг на один разряд вправо
        razr=razr-1     //уменьшаем разрядность для правильного завершения цикла
        numbF=nVar % 10

//        println("n = $n  nVar=$nVar  numbF = $numbF  numbL=$numbL")
        if (numbF != numbL) return true //если число младшего разряда не совпадает с numbL, вернуть true
    }

    return false
}

/**
 * Сложная
 *
 * Найти n-ю цифру последовательности из квадратов целых чисел:
 * 149162536496481100121144...
 * Например, 2-я цифра равна 4, 7-я 5, 12-я 6.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun squareSequenceDigit(n: Int): Int {
    var sqrN=0
    var k=1
    var sumRazr=0
    var retVal=0

    while (sumRazr<=n) {
        sqrN=k*k
//определяем разрядность числа sqrN
        var razr = 0
        while (sqrN>0) {
            razr=razr+1
            sqrN=sqrN/10
        }

        sqrN=k*k    //восстанавливаем sqrN=k*k
        var kMult=0
        kMult=10.0.pow(razr-1).toInt()  //вычисляем делитель, позволяющий получить цифру в старшем разряде числа sqrN

//вычисляем цифру разряда razr, начиная со старшего и вычисляем sumRazr - позицию этой цифры , пока она не достигнет n
        while (razr>=1) {
            retVal=sqrN / kMult     //берем цифпу старшего разряда делением на kMult
            sumRazr=sumRazr+1
//          println("k= $k  sqrN=$sqrN  sumRazr = $sumRazr  n=$n  retVal = $retVal")
            if (sumRazr==n) {
//                println("       retVal = $retVal")
                return retVal
            }
            sqrN=sqrN % kMult     // убираем чтарший (крайний слева) разряд (остаток от деления на kMult)
            kMult=kMult/10  // уменьшаем делитель старшего разряда в 10 раз, для выделения цифры нового старшего разряда
            razr=razr-1     //уменьшаем razr для вычисления контроля завершения цикла
        }
        k=k+1   //вычисляем квадрат следующего числа
    }
  return 0
}

/**
 * Сложная
 *
 * Найти n-ю цифру последовательности из чисел Фибоначчи (см. функцию fib выше):
 * 1123581321345589144...
 * Например, 2-я цифра равна 1, 9-я 2, 14-я 5.
 *
 * Использовать операции со строками в этой задаче запрещается.
 */
fun fibSequenceDigit(n: Int): Int {
//для вычисления чисел Фибоначчи будем использовать функцию fib(n)
//это медленно, так как каждый раз вычисление ведется с 1. Для ускорения
//можно использовать внешний цикл вычисления очередного числа Фибоначчи
//В остальном процедура повторяет функцию squareSequenceDigit

    var sqrN=0
    var k=1   //числа фибоначчи вычисляем начиная с n=3
    var sumRazr=0   //сумма разрядов первых двух числе Фибоначчи (1,1)= 2
    var retVal=0
    var kMult=0


    while (sumRazr<=n) {    //запускаем цикл, ограниченный условием задачи
        val fibVal=fib(k)   //запоминаем число Фибоначчи = fib(k)
        sqrN=fibVal         //сохраняем его в переменной sqrN


//если sqrN<10, то увеличить sumRazr на 1. Если sumRazr==n, то вернуть sqrN
        if (sqrN<10) {
            sumRazr=sumRazr+1
//            println("(sqrN<10):  k= $k  sqrN=$sqrN  n = $n  sumRazr= $sumRazr")
            if (sumRazr==n) {
//                println("       sqrN = $sqrN")
                    return sqrN
                 }
            }
        else {      //sqr >= 10
            //определяем разрядность числа sqrN
            var razr = 0
            while (sqrN > 0) {
                razr = razr + 1
                sqrN = sqrN / 10
            }

            sqrN = fibVal    //восстанавливаем sqrN=fibVal

//            println("k= $k  sqrN=$sqrN  razr = $razr")

            //если sqrN<10, то увеличить sumRazr на 1. Если sumRazr==n, то вернуть sqrN
            kMult = 10.0.pow(razr - 1).toInt()  //вычисляем делитель, позволяющий получить цифру в старшем разряде числа sqrN

            while (razr > 0) {
//                println("sqrN=$sqrN  razr = $razr  kMult=$kMult")
                if (sqrN < 10) {
                    sumRazr = sumRazr + 1
//                    println("(fibVal= $fibVal sqrN<10):  k= $k  sqrN=$sqrN  n = $n  sumRazr= $sumRazr")
                    if (sumRazr == n) {
//                        println("       sqrN = $sqrN")
                        return sqrN
                        }
                   }
                else {
                        retVal = sqrN / kMult
                        sumRazr = sumRazr + 1
//                        println("(fibVal= $fibVal):  k= $k  retVal= $retVal  sqrN=$sqrN  n = $n  sumRazr= $sumRazr")
                        if (sumRazr == n) {
//                                println("       retVal = $retVal")
                                return retVal
                            }
                        sqrN = sqrN % kMult     // убираем чтарший (крайний слева) разряд (остаток от деления на kMult)
                        kMult = kMult / 10  // уменьшаем делитель старшего разряда в 10 раз, для выделения цифры нового старшего разряда
                    }
                razr = razr - 1     //уменьшаем razr для вычисления контроля завершения цикла
            }
        }
        k=k+1   //вычисляем следующее число Фибоначчи
     }
    return 0

}
