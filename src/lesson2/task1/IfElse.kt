@file:Suppress("UNUSED_PARAMETER")

package lesson2.task1

import lesson1.task1.*
import kotlin.math.PI
import kotlin.math.max
import kotlin.math.sqrt

//проверка выполнения функций
fun main() {
/*
    println("L2_Task1: fun quadraticRootNumber(1.0,2.0,1.0); 1 == "+ quadraticRootNumber(1.0, 2.0, 1.0))
    println("L2_Task1: fun quadraticRootNumber(1.0, 3.0, 2.0); 2 == "+ quadraticRootNumber(1.0, 3.0, 2.0))
    println("L2_Task1: fun quadraticRootNumber(1.0, 4.0, 10.0); 0 == "+ quadraticRootNumber(1.0, 4.0, 10.0))

    println("L2_Task1: fun gradeNotation(5); отлично == "+ gradeNotation(5))
    println("L2_Task1: fun gradeNotation(3); удовлетворительно == "+ gradeNotation(3))


    println("L2_Task1: fun minBiRoot(0.0, 0.0, 1.0); Double.NaN == "+ minBiRoot(0.0, 0.0, 1.0))
    println("L2_Task1: fun minBiRoot(0.0, 1.0, 2.0); Double.NaN == "+ minBiRoot(0.0, 1.0, 2.0))
    println("L2_Task1: fun minBiRoot(0.0, 1.0, -4.0); -2.0 == "+ minBiRoot(0.0, 1.0, -4.0))
    println("L2_Task1: fun minBiRoot(1.0, -3.0, 2.0); -1.41 == "+ minBiRoot(1.0, -3.0, 2.0))

    println("L2_Task1: fun ageDescription(12); 12 лет == "+ ageDescription(12))
    println("L2_Task1: fun ageDescription(112); 112 лет == "+ ageDescription(112))
    println("L2_Task1: fun ageDescription(31); 31 год == "+ ageDescription(31))
    println("L2_Task1: fun ageDescription(131); 131 год == "+ ageDescription(131))
    println("L2_Task1: fun ageDescription(33); 33 года == "+ ageDescription(33))
    println("L2_Task1: fun ageDescription(133); 133 года == "+ ageDescription(133))
    println("L2_Task1: fun ageDescription(31); 35 лет == "+ ageDescription(35))
    println("L2_Task1: fun ageDescription(131); 135 лет == "+ ageDescription(135))

    println("L2_Task1: fun timeForHalfWay(1.0, 5.0, 2.0, 4.0, 3.0, 3.0); 2.5 == "+ timeForHalfWay(1.0, 5.0, 2.0, 4.0, 3.0, 3.0))
    println("L2_Task1: fun timeForHalfWay(4.0, 3.0, 1.0, 4.0, 1.0, 6.0); 3.67 == "+ timeForHalfWay(4.0, 3.0, 1.0, 4.0, 1.0, 6.0))
    println("L2_Task1: fun timeForHalfWay(3.0, 0.0, 1.0, 6.0, 2.0, 5.0); 4.4 == "+ timeForHalfWay(3.0, 0.0, 1.0, 6.0, 2.0, 5.0))

    println("L2_Task1: fun whichRookThreatens(1, 2, 3, 4, 5, 6); 0 == "+ whichRookThreatens(1, 2, 3, 4, 5, 6))
    println("L2_Task1: fun whichRookThreatens(5, 3, 7, 3, 4, 8); 1 == "+ whichRookThreatens(5, 3, 7, 3, 4, 8))
    println("L2_Task1: fun whichRookThreatens(6, 8, 8, 6, 6, 3); 2 == "+ whichRookThreatens(6, 8, 8, 6, 6, 3))
    println("L2_Task1: fun whichRookThreatens(3, 7, 8, 7, 3, 5); 3 == "+ whichRookThreatens(3, 7, 8, 7, 3, 5))

    println("L2_Task1: fun rookOrBishopThreatens(4, 5, 5, 7, 8, 8); 0 == "+ rookOrBishopThreatens(4, 5, 5, 7, 8, 8))
    println("L2_Task1: fun rookOrBishopThreatens(2, 8, 6, 8, 1, 6); 1 == "+ rookOrBishopThreatens(2, 8, 6, 8, 1, 6))
    println("L2_Task1: fun rookOrBishopThreatens(5, 4, 3, 7, 1, 8); 2 == "+ rookOrBishopThreatens(5, 4, 3, 7, 1, 8))
    println("L2_Task1: fun rookOrBishopThreatens(1, 6, 7, 6, 3, 8); 3 == "+ rookOrBishopThreatens(1, 6, 7, 6, 3, 8))

    println("L2_Task1: fun triangleKind(3.0, 7.5, 4.0); -1 == "+ triangleKind(3.0, 7.5, 4.0))
    println("L2_Task1: fun triangleKind(5.0, 3.0, 4.0); 1 == "+ triangleKind(5.0, 3.0, 4.0))
    println("L2_Task1: fun triangleKind(4.0, 6.0, 8.0); 2 == "+ triangleKind(4.0, 6.0, 8.0))
    println("L2_Task1: fun triangleKind(1.0, 1.5, 1.5); 0 == "+ triangleKind(1.0, 1.5, 1.5))
*/

    println("L2_Task1: fun segmentLength(1, 2, 3, 4); -1 == "+ segmentLength(1, 2, 3, 4))
    println("L2_Task1: fun segmentLength(5, 7, 1, 3); -1 == "+ segmentLength(5, 7, 1, 3))
    println("L2_Task1: fun segmentLength(1, 2, 2, 4); 0 == "+ segmentLength(1, 2, 2, 4))
    println("L2_Task1: fun segmentLength(3, 6, 0, 9); 3 == "+ segmentLength(3, 6, 0, 9))
    println("L2_Task1: fun segmentLength(2, 5, 3, 9); 2 == "+ segmentLength(2, 5, 3, 9))
    println("L2_Task1: fun segmentLength(3, 6, 1, 4); 1 == "+ segmentLength(3, 6, 1, 4))
    println("L2_Task1: fun segmentLength(1, 15, 10, 14); 4 == "+ segmentLength(1, 15, 10, 14))

}

/**
 * Пример
 *
 * Найти число корней квадратного уравнения ax^2 + bx + c = 0
 */
fun quadraticRootNumber(a: Double, b: Double, c: Double): Int {
    val discriminant = discriminant(a, b, c)
    return when {
        discriminant > 0.0 -> 2
        discriminant == 0.0 -> 1
        else -> 0
    }
}

/**
 * Пример
 *
 * Получить строковую нотацию для оценки по пятибалльной системе
 */
fun gradeNotation(grade: Int): String = when (grade) {
    5 -> "отлично"
    4 -> "хорошо"
    3 -> "удовлетворительно"
    2 -> "неудовлетворительно"
    else -> "несуществующая оценка $grade"
}

/**
 * Пример
 *
 * Найти наименьший корень биквадратного уравнения ax^4 + bx^2 + c = 0
 */
fun minBiRoot(a: Double, b: Double, c: Double): Double {
    // 1: в главной ветке if выполняется НЕСКОЛЬКО операторов
    if (a == 0.0) {
        if (b == 0.0) return Double.NaN // ... и ничего больше не делать
        val bc = -c / b
        if (bc < 0.0) return Double.NaN // ... и ничего больше не делать
        return -sqrt(bc)
        // Дальше функция при a == 0.0 не идёт
    }
    val d = discriminant(a, b, c)   // 2
    if (d < 0.0) return Double.NaN  // 3
    // 4
    val y1 = (-b + sqrt(d)) / (2 * a)
    val y2 = (-b - sqrt(d)) / (2 * a)
    val y3 = max(y1, y2)       // 5
    if (y3 < 0.0) return Double.NaN // 6
    return -sqrt(y3)           // 7
}

/**
 * Простая
 *
 * Мой возраст. Для заданного 0 < n < 200, рассматриваемого как возраст человека,
 * вернуть строку вида: «21 год», «32 года», «12 лет».
 */
fun ageDescription(age: Int): String {
//если age<=10 или age>=20 то
//      если в разряде единиц age стоит 1 то "год"
//      2,3,4 то "года"
//      0,5,6,7,8,9 то "лет"
//иначе "лет"
    val Sage=age.toString()
// вычисляем остаток  от целочисленного деления age на 100 (разряды десятков и единиц возрвств)
//c 10 до 20; 110..120 - всегда "лет".
     when (age%100) {
        in 10..20 -> return Sage+" лет"
     }
//вычисляем остаток от целочисленного деления age на 10 (разряд единиц возрвств)
    when (age%10) {
        1 -> return Sage+" год"     // 1 год,41 год,101 год
        2,3,4 -> return Sage+" года"    // 4 года,44 года,144 года
        else -> return Sage+" лет"      // 5 лет,45 лет,145 лет
    }
}

/**
 * Простая
 *
 * Путник двигался t1 часов со скоростью v1 км/час, затем t2 часов — со скоростью v2 км/час
 * и t3 часов — со скоростью v3 км/час.
 * Определить, за какое время он одолел первую половину пути?
 */
fun timeForHalfWay(
    t1: Double, v1: Double,
    t2: Double, v2: Double,
    t3: Double, v3: Double
): Double {
// сначала находим полный путь S=v1*t1+v2*t2+v3*t3
// если 0.5*S<=v1*t1, то вернуть 0.5*S/v1
// иначе, если 0.5*S<=v1*t1+v2*t2 то вернуть t1+(0.5*S-v1*t1)/v2
// иначе вернуть t1+t2+ (0.5*S-v1*t1-v2*t2)/v3


// сначала находим половину пути 0.5*(v1*t1+v2*t2+v3*t3)
    val SHalf=0.5*(v1*t1+v2*t2+v3*t3)   //длина половины пути

    val thalf:Double=               //время на половину пути
        if (SHalf <= v1 * t1)       // если thalf<=v1*t1, то вернуть thalf/v1
            SHalf / v1
        else if (SHalf <= v1*t1 + v2*t2)    //если SHalf<=v1*t1+v2*t2 то вернуть t1+(SHalf-v1*t1)/v2
            t1+(SHalf-v1*t1)/v2
        else                        // иначе вернуть t1+t2+ (SHalf-v1*t1-v2*t2)/v3
            t1 + t2 + (SHalf-v1*t1-v2*t2)/v3
//возвращаем thalf
    return thalf
    }

/**
 * Простая
 *
 * Нa шахматной доске стоят черный король и две белые ладьи (ладья бьет по горизонтали и вертикали).
 * Определить, не находится ли король под боем, а если есть угроза, то от кого именно.
 * Вернуть 0, если угрозы нет, 1, если угроза только от первой ладьи, 2, если только от второй ладьи,
 * и 3, если угроза от обеих ладей.
 * Считать, что ладьи не могут загораживать друг друга
 */
fun whichRookThreatens(
    kingX: Int, kingY: Int,
    rookX1: Int, rookY1: Int,
    rookX2: Int, rookY2: Int
): Int {
    val H1=(kingX == rookX1)    //шах 1 ладьей по горизонтали
    val H2=(kingX == rookX2)    //шах 2 ладьей по горизонтали
    val Y1=(kingY == rookY1)    //шах 1 ладьей по вертикали
    val Y2=(kingY == rookY2)    //шах 2 ладьей по вертикали

//если обе ладьи дают шах по горизонтали или вертикали вернуть 3
        if (H1 && H2 || Y1 && Y2 || H1 && Y2 || H2 && Y1)
            return  3
//одна ладья 1 бьет по горизонтали или по вертикали
        else if (H1 || Y1)
            return  1
//ладья 2 бьет по горизонтали или (||) по вертикали
        else if (H2 || Y2)
            return  2
        else
            return  0
}


/**
 * Простая
 *
 * На шахматной доске стоят черный король и белые ладья и слон
 * (ладья бьет по горизонтали и вертикали, слон — по диагоналям).
 * Проверить, есть ли угроза королю и если есть, то от кого именно.
 * Вернуть 0, если угрозы нет, 1, если угроза только от ладьи, 2, если только от слона,
 * и 3, если угроза есть и от ладьи и от слона.
 * Считать, что ладья и слон не могут загораживать друг друга.
 */
fun rookOrBishopThreatens(
    kingX: Int, kingY: Int,
    rookX: Int, rookY: Int,
    bishopX: Int, bishopY: Int
): Int {
    val Shah_rook=(kingX == rookX) || (kingY == rookY)   //шах ладьей по горизонтали или по вертикали

//определим, есть ли шах слоном. Вычислим DX=kingY-bishopY и DY=kingX-bishopX
//если DX=0 или DY=0, то шах от слона невозможен (король и слон на одной горизонтали или вертикали)
//если  DY=DX (DY=-DX), то это шах (так как диагональ в шахматах = 45". Катеты равны)
    val DY=kingY-bishopY
    val DX=kingX-bishopX
    var Shah_bishop=false   //шах слоном невозможен

    if ((DX==0) || (DY==0)) {}      //король и слон на одной горизонтали или вертикали. Шах невозможен
    else if (DX==DY || DX==-DY) {   //король и слон на одной диагонали. Шах слоном
        Shah_bishop=true
     }

 //   println("Shah_rook= = $Shah_rook ; Shah_bishop = $Shah_bishop")

    if (Shah_rook && !Shah_bishop)      //шах только ладьей
        return 1
    if (!Shah_rook && Shah_bishop)      //шах только слоном
        return 2
    if (Shah_rook && Shah_bishop)       //оба шаха
        return 3
    else
        return  0
}


/**
 * Простая
 *
 * Треугольник задан длинами своих сторон a, b, c.
 * Проверить, является ли данный треугольник остроугольным (вернуть 0),
 * прямоугольным (вернуть 1) или тупоугольным (вернуть 2).
 * Если такой треугольник не существует, вернуть -1.
 */
fun triangleKind(a: Double, b: Double, c: Double): Int {
//по теореме косинусов а^2=b^2+c^2-2*b*c*cos(alfa), где alfa - угол между b и c
//соответственно cos(alfa)=-(а^2-b^2-c^2)/2*b*c
    val a2=a*a
    val b2=b*b
    val c2=c*c

    val cosA=-0.5*(a2-b2-c2)/(b*c)
    val cosB=-(b2-a2-c2)/(2*a*c)
    val cosC=-(c2-a2-b2)/(2*a*b)
//println("a=$a b=$b c=$c   cosA=$cosA   cosB=$cosB   cosC=$cosC")
//если косинус любого угла >=1 то такой треугольник невозможен. Вернуть -1
//    if (kotlin.math.acos(cosA).isNaN())

    if (kotlin.math.abs(cosA)>=1 || kotlin.math.abs(cosB)>=1 || kotlin.math.abs(cosC)>=1)
        return -1
    else {
//вычисляем угол в градусах 360*Arccos(cos)/(2*Pi)
        val alfa = 180 * kotlin.math.acos(cosA) / PI
        val beta = 180 * kotlin.math.acos(cosB) / PI
        val gamma = 180 * kotlin.math.acos(cosC) / PI
 //println("alfa=$alfa   beta=$beta   gamma=$gamma")

        if (alfa < 90 && beta < 90 && gamma < 90)
            return 0        //остроугольный
        else if (alfa > 90 || beta > 90 || gamma > 90)
            return 2        //тупоугольный
        else
            return 1        //прямоугольный
    }
}


/**
 * Средняя
 *
 * Даны четыре точки на одной прямой: A, B, C и D.
 * Координаты точек a, b, c, d соответственно, b >= a, d >= c.
 * Найти длину пересечения отрезков AB и CD.
 * Если пересечения нет, вернуть -1.
 */
fun segmentLength(a: Int, b: Int, c: Int, d: Int): Int {
    if (a < c) {           //если a<с
        if (b<c)           //если b<c то пересечения нет (a-b-c-d)
            return -1
        else if (b==c)    //если b==c то вернуть 9 (a-bc-d)
            return 0
        else if (b<=d)    //если b<=d то вернуть b-c (a-c-b-d)
            return b-c
        else
            return d-c      //вернуть d-c (отрезок a-c-d-b)
    }
    else if (a > c) {                //если a>с
        if (d<a)           //если d<=a то пересечения нет (c-d-a-b)
            return -1
        else if (d==a)      //если a=d то вернуть 0 (c-da-b)
            return 0
        else if (b<=d)      //если a<=d то вернуть b-a (c-a-b-d)
            return b-a
        else
            return d-a      //вернуть d-a (c-a-d-b)
    }
    else if (a == c) {
        return kotlin.math.abs(b - d)
    }

   return -1    //вернуть пересечения нет
}