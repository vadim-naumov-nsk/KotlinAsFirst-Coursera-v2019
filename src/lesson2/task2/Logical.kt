@file:Suppress("UNUSED_PARAMETER")

package lesson2.task2

import lesson1.task1.sqr

fun main() {
/*
    println("L2_Task2: fun isNumberHappy(1533); True == "+ isNumberHappy(1533))
    println("L2_Task2: fun isNumberHappy(9009); True == "+ isNumberHappy(9009))
    println("L2_Task2: fun isNumberHappy(3644); False == "+ isNumberHappy(3644))

    println("L2_Task2: fun queenThreatens(3, 6, 7, 6); True == "+ queenThreatens(3, 6, 7, 6))
    println("L2_Task2: fun queenThreatens(8, 1, 1, 8); True == "+ queenThreatens(8, 1, 1, 8))
    println("L2_Task2: fun queenThreatens(7, 6, 5, 7); False == "+ queenThreatens(7, 6, 5, 7))

     println("L2_Task2: fun daysInMonth(1, 1990); 31 == "+ daysInMonth(1, 1990))
    println("L2_Task2: fun daysInMonth(2, 1990); 28 == "+ daysInMonth(2, 1990))
    println("L2_Task2: fun daysInMonth(3, 1990); 31 == "+ daysInMonth(3, 1990))
    println("L2_Task2: fun daysInMonth(4, 1990); 30 == "+ daysInMonth(4, 1990))
    println("L2_Task2: fun daysInMonth(5, 1990); 31 == "+ daysInMonth(5, 1990))
    println("L2_Task2: fun daysInMonth(6, 1990); 30 == "+ daysInMonth(6, 1990))
    println("L2_Task2: fun daysInMonth(7, 1990); 31 == "+ daysInMonth(7, 1990))
    println("L2_Task2: fun daysInMonth(8, 1990); 31 == "+ daysInMonth(8, 1990))
    println("L2_Task2: fun daysInMonth(2, 1992); 29 == "+ daysInMonth(2, 1992))
    println("L2_Task2: fun daysInMonth(2, 1996); 29 == "+ daysInMonth(2, 1996))
    println("L2_Task2: fun daysInMonth(2, 1900); 28 == "+ daysInMonth(2, 1900))
    println("L2_Task2: fun daysInMonth(2, 2000); 29 == "+ daysInMonth(2, 2000))

    println("L2_Task2: fun circleInside(0.0, 0.0, 6.0, 0.0, 0.0, 5.0); False == "+ circleInside(0.0, 0.0, 6.0, 0.0, 0.0, 5.0))
    println("L2_Task2: fun circleInside(0.0, 0.0, 1.0, 10.0, 10.0, 9.0); False == "+ circleInside(0.0, 0.0, 1.0, 10.0, 10.0, 9.0))
    println("L2_Task2: fun circleInside(-2.0, 3.0, 2.0, -2.0, 0.0, 5.0); True == "+ circleInside(-2.0, 3.0, 2.0, -2.0, 0.0, 5.0))
    println("L2_Task2: fun circleInside(1.0, 2.0, 3.0, 4.0, 5.0, 6.0); false == "+ circleInside(1.0, 2.0, 3.0, 4.0, 5.0, 6.0))
    println("L2_Task2: fun circleInside(5.0, 8.0, 1.0, 10.0, 10.0, 9.0); true == "+ circleInside(5.0, 8.0, 1.0, 10.0, 10.0, 9.0))

    println("L2_Task2: fun brickPasses(2, 10, 5, 6, 3); true == "+ brickPasses(2, 10, 5, 6, 3))
    println("L2_Task2: fun brickPasses(4, 4, 4, 4, 4); true == "+ brickPasses(4, 4, 4, 4, 4))
    println("L2_Task2: fun brickPasses(6, 5, 4, 3, 6); False == "+ brickPasses(6, 5, 4, 3, 6))
    println("L2_Task2: fun brickPasses(3, 2, 1, 1, 2); true == "+ brickPasses(3, 2, 1, 1, 2))
*/
}

/**
 * Пример
 *
 * Лежит ли точка (x, y) внутри окружности с центром в (x0, y0) и радиусом r?
 */
fun pointInsideCircle(x: Double, y: Double, x0: Double, y0: Double, r: Double) =
    sqr(x - x0) + sqr(y - y0) <= sqr(r)

/**
 * Простая
 *
 * Четырехзначное число назовем счастливым, если сумма первых двух ее цифр равна сумме двух последних.
 * Определить, счастливое ли заданное число, вернуть true, если это так.
 */
fun isNumberHappy(number: Int): Boolean {
//вариант 1. Превращаем число в строку. Берем символ каждого разряда, превращаем в строку, а потом в число
/*
    val st4=number.toString()
    println("$st4 "+ st4[0]+" "+st4[1]+" " +st4[2]+" " +st4[3])
    val c4:Int  = st4[3].toString().toInt()
    val c3:Int  = st4[2].toString().toInt()
    val c2:Int  = st4[1].toString().toInt()
    val c1:Int  = st4[0].toString().toInt()
*/
// вариант 2. Выделяем каждый разряд number вычислением
    val c1:Int  = number % 10   //разряд единиц - остаток от целочисленного деления number на 10
    val c2:Int  = (0.1*number).toInt() % 10    //разряд десятков - остаток от целочисленного деления 0.1*number на 10
    val c3:Int  = (0.01*number).toInt() % 10    //разряд сотен - остаток от целочисленного деления 0.01*number на 10
    val c4:Int  = (0.001*number).toInt() % 10    //разряд тысяч - остаток от целочисленного деления 0.001*number на 10
//    println("$c4 $c3 $c2 $c1")
    return (c4+c3)==(c2+c1)
}

/**
 * Простая
 *
 * На шахматной доске стоят два ферзя (ферзь бьет по вертикали, горизонтали и диагоналям).
 * Определить, угрожают ли они друг другу. Вернуть true, если угрожают.
 * Считать, что ферзи не могут загораживать друг друга.
 */
fun queenThreatens(x1: Int, y1: Int, x2: Int, y2: Int): Boolean {
    if ((x1==x2) || (y1==y2))       //бьют по горизонтали или вертикали
        return true
    else {      //проверяем диагонали. DH=y2-y1 DL=x2-x1 если DH=+-DL, то на одной диагонали (катеты равны)
        val DH=y2-y1
        val DL=x2-x1
        if ((DH==DL) || (DH==-DL))
            return true
        else
            return false
        }
    return false
}


/**
 * Простая
 *
 * Дан номер месяца (от 1 до 12 включительно) и год (положительный).
 * Вернуть число дней в этом месяце этого года по григорианскому календарю.
 */
fun daysInMonth(month: Int, year: Int): Int {
/*
    григорианский календарь:
    год, номер которого кратен 400, — високосный 29 дней в феврале;
    другие годы, номер которых кратен 100, — невисокосные 28 дней в феврале;
    другие годы, номер которых кратен 4, — високосные;
    остальные годы — невисокосные.
 */

val M2days:Int   //число дней в феврале невисокосного года
if (year % 400==0) M2days=29     //год високосный
else if (year % 100==0)  M2days=28   //год невисокосный
else if (year % 4==0)  M2days=29     //год високосный
else M2days=28                       //год невисокосный

return when (month){
    1,3,5,7,8,10,12 -> 31
    4,6,9,11 -> 30
    else -> M2days
    }
}


/**
 * Средняя
 *
 * Проверить, лежит ли окружность с центром в (x1, y1) и радиусом r1 целиком внутри
 * окружности с центром в (x2, y2) и радиусом r2.
 * Вернуть true, если утверждение верно
 */
fun circleInside(
    x1: Double, y1: Double, r1: Double,
    x2: Double, y2: Double, r2: Double
): Boolean {
//если окружность (x1, y1) полностью внутри (x2, y2), то межцентровое расстояние + r1 < r2
val dx=x1-x2
val dy=y1-y2
val RC=kotlin.math.sqrt(dx*dx+dy*dy)   //вычисляем расстояние между центрами окружностей
//println("r2 = $r2   r1 = $r1  RC = $RC")
if (RC+r1<=r2)   //малая окружность не пересекает большую
    return true
else
    return false
}

/**
 * Средняя
 *
 * Определить, пройдет ли кирпич со сторонами а, b, c сквозь прямоугольное отверстие в стене со сторонами r и s.
 * Стороны отверстия должны быть параллельны граням кирпича.
 * Считать, что совпадения длин сторон достаточно для прохождения кирпича, т.е., например,
 * кирпич 4 х 4 х 4 пройдёт через отверстие 4 х 4.
 * Вернуть true, если кирпич пройдёт
 */
fun brickPasses(a: Int, b: Int, c: Int, r: Int, s: Int): Boolean {
//для прохождения достаточно, чтобы r и s были не меньше двух минимальных значений из a,b,c

//находим mrs наименьшее число из r,s
 var m1:Int=-1
 var m2:Int=-1

 var l1:Int=-1
 var l2:Int=-1

 //определяем порядок возрастания размеров отверстия в стенке
 l1=kotlin.math.min(r,s)
 if (l1==r)
    l2=s    //r<s
 else {     //r>s
    l1=s
    l2=r
 }


//находим самую короткую из (a,b,c)
 m1=kotlin.math.min(kotlin.math.min(a,b),c)
 if (m1==a) {    //самая короткая a. Определить что короче, b или c b и записать в m2
//     println("m1=$m1  a=$a  m1==a")
     if (b<=c)
         m2=b
     else
         m2=c
    }
  else if (m1==b) {
//     println("m1=$m1  b=$b  m1==b")
     if (a<=c)
         m2=a
     else
         m2=c
    }
 else if (m1==c) {
//     println("m1=$m1  c=$c  m1==c")
     if (a<=b)
         m2=a
     else
         m2=b
 }

//println("l1=$l1 l2=$l2   m1=$m1  m2=$m2")
// если меньший габарит в стене >= меньшей стороны кирпича (m1) и
// больший меньший габарит в стене >= следующей по размеру стороны кирпича (m2)
// то вернуть true
    if ((l1>=m1) and (l2>=m2)) return true

//иначе вернуть false
    return false
}
