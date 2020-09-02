@file:Suppress("UNUSED_PARAMETER", "ConvertCallChainIntoSequence")

package lesson4.task1

import lesson1.task1.discriminant
import lesson1.task1.numberRevert
import kotlin.math.sqrt

fun main() {
/*
    println("L4 Task1: fun abs(listOf(3.0)) 3.0= "+ abs(listOf(3.0)))
    println("L4 Task1: fun abs(listOf(3.0, -4.0)) 5.0= "+ abs(listOf(3.0, -4.0)))
    println("L4 Task1: fun abs(listOf(4.0, -5.0, 6.0)) 8.774964= "+ abs(listOf(4.0, -5.0, 6.0)))

    println("L4 Task1: fun mean(listOf()) 0.0= "+ mean(listOf()))
    println("L4 Task1: fun mean(listOf(1.0)) 1.0= "+ mean(listOf(1.0)))
    println("L4 Task1: fun mean(listOf(3.0, 1.0, 2.0)) 2.0= "+ mean(listOf(3.0, 1.0, 2.0)))
    println("L4 Task1: fun mean(listOf(0.0, 2.0, 7.0, 8.0, -2.0)) 3.0= "+ mean(listOf(0.0, 2.0, 7.0, 8.0, -2.0)))
    println("L4 Task1: fun center(mutableListOf(0.0, 2.0, 7.0, 8.0, -2.0)) (-3.0, -1.0, 4.0, 5.0, -5.0) = "+ center(mutableListOf(0.0, 2.0, 7.0, 8.0, -2.0)))

    val mList = mutableListOf(0.0, 2.0, 7.0, 8.0, -2.0)
    val cList = center(mList)
    println("mList =" + mList)
    println("cList =" + cList)

    println("L4 Task1: fun  times(listOf(), listOf()) 0 = "+  times(listOf(), listOf()))
    println("L4 Task1: fun  times(listOf(1, -4), listOf(3, 2)) -5 = "+  times(listOf(1, -4), listOf(3, 2)))
    println("L4 Task1: fun  times(listOf(-1, 2, -3), listOf(3, -2, 4)) -19 = "+  times(listOf(-1, 2, -3), listOf(3, -2, 4)))

    println("L4 Task1: fun  polynom(listOf(), 1000) 0 = "+  polynom(listOf(), 1000))
    println("L4 Task1: fun  polynom(listOf(42), -1000) 42 = "+  polynom(listOf(42), -1000))
    println("L4 Task1: fun  polynom(listOf(3, 2), 5) 13 = "+  polynom(listOf(3, 2), 5))
    println("L4 Task1: fun  polynom(listOf(2, -3, 1), 1) 0 = "+  polynom(listOf(2, -3, 1), 1))
    println("L4 Task1: fun  polynom(listOf(-7, 6, 4, -4, 1), -2) 45 = "+  polynom(listOf(-7, 6, 4, -4, 1), -2))

    println("L4 Task1: fun  factorize(2) = "+factorize(2))
    println("L4 Task1: fun  factorize(7 * 7 * 11 * 11 * 19 * 19) = "+factorize(7 * 7 * 11 * 11 * 19 * 19))

    println("L4 Task1: fun  factorize(2) = "+factorize(2))
    println("L4 Task1: fun  factorize(2*2*7*7*31*151) = "+factorize(2*2*7*7*31*151))
    println("L4 Task1: fun  factorize(1073676287) = "+factorize(1073676287))

    println("L4 Task1: fun  convert(1000, 19) [2, 14, 12] = "+convert(1000, 19))

    println("L4 Task1: fun  decimal(listOf(1), 2) 1 = "+decimal(listOf(1), 2))
    println("L4 Task1: fun  decimal(listOf(1, 2, 1, 0), 4)) 100 = "+decimal(listOf(1, 2, 1, 0), 4))
    println("L4 Task1: fun  decimal(listOf(1, 3, 12), 14) 250 = "+decimal(listOf(1, 3, 12), 14))
    println("L4 Task1: fun  decimal(listOf(2, 14, 12), 19) 1000 = "+decimal(listOf(2, 14, 12), 19))

    println("L4 Task1: fun roman(1) I = "+roman(1))
    println("L4 Task1: fun roman(3000) MMM = "+roman(3000))
    println("L4 Task1: fun roman(1978) MCMLXXVIII = "+roman(1978))
    println("L4 Task1: fun roman(694) DCXCIV = "+roman(694))
    println("L4 Task1: fun roman(49) XLIX = "+roman(49))
*/

//    russian(1101)
//    russian(9209)
//    russian(10310)
//    russian(18418)
//    russian(20520)
//    russian(27627)
//    russian(40740)
//    russian(47847)
//    russian(97997)
//    russian(22000)

    println("L4 Task1: двадцать две тысячи девятьсот шестьдесят четыре", russian(22964))
//
//    assertEquals("двадцать две тысячи девятьсот шестьдесят четыре", russian(22964))
//    assertEquals("сто девятнадцать тысяч пятьсот восемь", russian(119508))
//    assertEquals("две тысячи три", russian(2003))
//    assertEquals("двести тысяч два", russian(200002))
//    assertEquals("девятьсот тысяч", russian(900000))
//    assertEquals("двенадцать", russian(12))

}


/**
 * Пример
 *
 * Найти все корни уравнения x^2 = y
 */
fun sqRoots(y: Double) =
    when {
        y < 0 -> listOf()
        y == 0.0 -> listOf(0.0)
        else -> {
            val root = sqrt(y)
            // Результат!
            listOf(-root, root)
        }
    }

/**
 * Пример
 *
 * Найти все корни биквадратного уравнения ax^4 + bx^2 + c = 0.
 * Вернуть список корней (пустой, если корней нет)
 */
fun biRoots(a: Double, b: Double, c: Double): List<Double> {
    if (a == 0.0) {
        return if (b == 0.0) listOf()
        else sqRoots(-c / b)
    }
    val d = discriminant(a, b, c)
    if (d < 0.0) return listOf()
    if (d == 0.0) return sqRoots(-b / (2 * a))
    val y1 = (-b + sqrt(d)) / (2 * a)
    val y2 = (-b - sqrt(d)) / (2 * a)
    return sqRoots(y1) + sqRoots(y2)
}

/**
 * Пример
 *
 * Выделить в список отрицательные элементы из заданного списка
 */
fun negativeList(list: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (element in list) {
        if (element < 0) {
            result.add(element)
        }
    }
    return result
}

/**
 * Пример
 *
 * Изменить знак для всех положительных элементов списка
 */
fun invertPositives(list: MutableList<Int>) {
    for (i in 0 until list.size) {
        val element = list[i]
        if (element > 0) {
            list[i] = -element
        }
    }
}

/**
 * Пример
 *
 * Из имеющегося списка целых чисел, сформировать список их квадратов
 */
fun squares(list: List<Int>) = list.map { it * it }

/**
 * Пример
 *
 * Из имеющихся целых чисел, заданного через vararg-параметр, сформировать массив их квадратов
 */
fun squares(vararg array: Int) = squares(array.toList()).toTypedArray()

/**
 * Пример
 *
 * По заданной строке str определить, является ли она палиндромом.
 * В палиндроме первый символ должен быть равен последнему, второй предпоследнему и т.д.
 * Одни и те же буквы в разном регистре следует считать равными с точки зрения данной задачи.
 * Пробелы не следует принимать во внимание при сравнении символов, например, строка
 * "А роза упала на лапу Азора" является палиндромом.
 */
fun isPalindrome(str: String): Boolean {
    val lowerCase = str.toLowerCase().filter { it != ' ' }
    for (i in 0..lowerCase.length / 2) {
        if (lowerCase[i] != lowerCase[lowerCase.length - i - 1]) return false
    }
    return true
}

/**
 * Пример
 *
 * По имеющемуся списку целых чисел, например [3, 6, 5, 4, 9], построить строку с примером их суммирования:
 * 3 + 6 + 5 + 4 + 9 = 27 в данном случае.
 */
fun buildSumExample(list: List<Int>) = list.joinToString(separator = " + ", postfix = " = ${list.sum()}")


/**
 * Простая
 *
 * Найти модуль заданного вектора, представленного в виде списка v,
 * по формуле abs = sqrt(a1^2 + a2^2 + ... + aN^2).
 * Модуль пустого вектора считать равным 0.0.
 */
fun abs(v: List<Double>): Double {
    var sqrList: List<Double>
//если список координат пустой, вернуть 0.0
    if (v.isEmpty()) return 0.0

//формируем список квадратов координат вектора
    sqrList = v.map { it * it }
//    println("v = "+v+" "+v.size)
//    println(" "+sqrList+" sum ="+sqrList.sum() +" mod = "+sqrt(sqrList.sum()))

//возвращаем корень квадратный ит суммы квадратов координат вектора
    return sqrt(sqrList.sum())
}

/**
 * Простая
 *
 * Рассчитать среднее арифметическое элементов списка list. Вернуть 0.0, если список пуст
 */
fun mean(list: List<Double>): Double {
//если список  пустой, вернуть 0.0
    if (list.isEmpty()) return 0.0
//сумму элементов списка делим на число этих элементов list.size
    return list.sum() / list.size
}

/**
 * Средняя
 *
 * Центрировать заданный список list, уменьшив каждый элемент на среднее арифметическое всех элементов.
 * Если список пуст, не делать ничего. Вернуть изменённый список.
 *
 * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
 */
fun center(list: MutableList<Double>): MutableList<Double> {
//если список  пустой, вернуть его без изменений
    if (list.isEmpty()) return list
//вычислить среднее значение для list
    val meanOfList: Double = list.sum() / list.size

//от каждого значения list[i] отнимаем значение meanOfList
//так как MutableList передается по ссылке, то изменеия в list будут сохраняться в вызывающей программе

    for (i in 0 until list.size) {
        list[i]=list[i] - meanOfList
    }

    return list
}

/**
 * Средняя
 *
 * Найти скалярное произведение двух векторов равной размерности,
 * представленные в виде списков a и b. Скалярное произведение считать по формуле:
 * C = a1b1 + a2b2 + ... + aNbN. Произведение пустых векторов считать равным 0.
 */
fun times(a: List<Int>, b: List<Int>): Int {
if (a.isEmpty()) return 0
var c=0

    for (i in 0 until a.size) {
            c = c+a[i]*b[i]
        }

   return c
}

/**
 * Средняя
 *
 * Рассчитать значение многочлена при заданном x:
 * p(x) = p0 + p1*x + p2*x^2 + p3*x^3 + ... + pN*x^N.
 * Коэффициенты многочлена заданы списком p: (p0, p1, p2, p3, ..., pN).
 * Значение пустого многочлена равно 0 при любом x.
 */
fun polynom(p: List<Int>, x: Int): Int {
    if (p.isEmpty()) return 0
    var c=p[0]
    var k=x
    for (i in 1 until p.size) {
        c = c + k*p[i]
        k=k*x
    }

    return c

}

/**
 * Средняя
 *
 * В заданном списке list каждый элемент, кроме первого, заменить
 * суммой данного элемента и всех предыдущих.
 * Например: 1, 2, 3, 4 -> 1, 3, 6, 10.
 * Пустой список не следует изменять. Вернуть изменённый список.
 *
 * Обратите внимание, что данная функция должна изменять содержание списка list, а не его копии.
 */
fun accumulate(list: MutableList<Int>): MutableList<Int> {
    if (list.isEmpty()) return list
    var c=list[0]       //присваиваем аккумулятору значение list[0]
//так как MutableList передается по ссылке, то изменеия в list будут сохраняться в вызывающей программе
    for (i in 1 until list.size) {
        c = c+list[i]   // начиная со второго элемента списка увеличиваем аккумулятор
        list[i]=c       //и заменяем элемент списка значением аккумулятора
    }
  return list
}

/**
 * Средняя
 *
 * Разложить заданное натуральное число n > 1 на простые множители.
 * Результат разложения вернуть в виде списка множителей, например 75 -> (3, 5, 5).
 * Множители в списке должны располагаться по возрастанию.
 */
fun factorize(n: Int): List<Int> {
// создаем изменяемый список для заполнения его простыми числами
// инициализируем его как пустой список
    val a = mutableListOf<Int>()
//добавляем в список элемент=n, чтобы проще было организовать исключение из рассмотрения чисел
//кратных уже проверенным простым
    a.add(n)
//
//    println("n = $n")
//создаем изменяемый список для записи простых множителей
// инициализируем его как пустой список
    val b = mutableListOf<Int>()

//создаем переменную k для перебора простых множителей, начиная с числа 2
    var k=2
    var n1=n
    var sost=false  //признак составного делителя
// по алгоритму решета Эрастофена находим простые множители в диапазоне от 2 до n/2+1 (иначе на работает при n=2 )
// и если число n делится нацело на k, то добавляем k в  b()
    while (k<=n/2+1) {
        //      if (k % 10000==0) println("k = $k  a = "+a)
        sost=false
//если k делится нацело нв любой элемент из a(), то это составной делитель. Не рассматривать
        for (element in a) {
//                println("element =" + element)
            if (k % element == 0) {
//                    println("составной делитель k = $k  element =" + element)
                sost=true
                break
            }
        }
//        println("sost = $sost")
        if (!sost || k==2) {
//проверяем, является ли k делителем для n, и если да, то добавляем в список b()
//делитель может быть повторяющимся (27=3*3*3), поэтому проверяем в цикле на копии n1=n
            if (n1 % k==0) {
//                println("Простое число k = $k ")
                a.add(k)    //добавляем простой делитель в a()
                n1=n
                while (n1 % k==0) {
                    b.add(k)
//                    println("Простй делитель k = $k  a ="+a)
                    n1=n1/k
                }
            }
        }
        k=k+1   //берем следующий возможный делитель
    }

//    println("a = "+a)
//    println("b = "+b)
    if (b.isEmpty()) {b.add(n)}
    return b.toList()
}



/**
 * Сложная
 *
 * Разложить заданное натуральное число n > 1 на простые множители.
 * Результат разложения вернуть в виде строки, например 75 -> 3*5*5
 * Множители в результирующей строке должны располагаться по возрастанию.
 */
fun factorizeToString(n: Int): String {
var st: String = ""
//создаем список для простых множителей и заполняем его с помощью функции factorize
val list = factorize(n)
//формируем строку st
    st=list.joinToString(separator = "*")
//    println(st)
    return st
}

/**
 * Средняя
 *
 * Перевести заданное целое число n >= 0 в систему счисления с основанием base > 1.
 * Результат перевода вернуть в виде списка цифр в base-ичной системе от старшей к младшей,
 * например: n = 100, base = 4 -> (1, 2, 1, 0) или n = 250, base = 14 -> (1, 3, 12)
 */
fun convert(n: Int, base: Int): List<Int> {
//создаем переменную для изменения n при делении на base
    var nRaz=n
// создаем переменную для получения остатка от деления nRaz на base
    var mRaz=0
//создаем изменяемый массив для записи разрядов числа n по основанию base
    val blist = mutableListOf<Int>()
    while (nRaz>0) {
        mRaz=nRaz % base    //вычисляем коэффициент младшего разряда
        blist.add(0, mRaz)  //вставляем его в массив blist в самое начало
        nRaz=nRaz / base        //переходим к следующему разряду
    }
//    println(blist)
  return blist.toList()     //преобразуем mutableList<Int> в List<Int>
}

/**
 * Сложная
 *
 * Перевести заданное целое число n >= 0 в систему счисления с основанием 1 < base < 37.
 * Результат перевода вернуть в виде строки, цифры более 9 представлять латинскими
 * строчными буквами: 10 -> a, 11 -> b, 12 -> c и так далее.
 * Например: n = 100, base = 4 -> 1210, n = 250, base = 14 -> 13c
 *
 * Использовать функции стандартной библиотеки, напрямую и полностью решающие данную задачу
 * (например, n.toString(base) и подобные), запрещается.
 */
fun convertToString(n: Int, base: Int): String {
//создаем неизменяемый массив для возврата результата из функции convert(n, base)
    val list = convert(n, base)
//создаем строку для перекодирования чисел из list в символы
    val codStr="0123456789abcdefjhijklmnopqrstuvwxyz"
    var sConv=""
    for (i in 0 until list.size) {
//преобразуем значение list[i] в символ из codStr в позиции list[i] и добавляем его в конец sConv
        sConv=sConv+codStr[list[i]]
    }
return sConv
}

/**
 * Средняя
 *
 * Перевести число, представленное списком цифр digits от старшей к младшей,
 * из системы счисления с основанием base в десятичную.
 * Например: digits = (1, 3, 12), base = 14 -> 250
 */
fun decimal(digits: List<Int>, base: Int): Int {
//создаем переменную для результата конвертации
var decVal=0
//создаем переменную реверсного выбора из digits
var revI=digits.size-1

var kfRaz=1

//вычисляем множитель старшего разряда digits (base^revI)
//kfRaz=base.toDouble().kotlin.math.pow(revI).toInt()

//чтобы не вызывать kotlin.math.pow, вычисляепм степень умножением в цикле
    var i=0

    for  (i in 1..revI) {
    kfRaz=kfRaz*base
}
//    println(digits+"  base=$base  kfRaz=$kfRaz  revI=$revI")

//в digits старшие разряды слева. Поэтому для каждого следующего разряда уменьшаем kfRaz в base раз
    i=0
    while (i<=revI) {
        decVal = digits[i] * kfRaz + decVal
        kfRaz=kfRaz/base
 //       println("i="+i+" digits[i]="+digits[i]+" kfRaz=$kfRaz  decVal=$decVal")
        i=i+1
    }
    return decVal
}

/**
 * Сложная
 *
 * Перевести число, представленное цифровой строкой str,
 * из системы счисления с основанием base в десятичную.
 * Цифры более 9 представляются латинскими строчными буквами:
 * 10 -> a, 11 -> b, 12 -> c и так далее.
 * Например: str = "13c", base = 14 -> 250
 *
 * Использовать функции стандартной библиотеки, напрямую и полностью решающие данную задачу
 * (например, str.toInt(base)), запрещается.
 */
fun decimalFromString(str: String, base: Int): Int {
//создаем строку для перекодирования чисел из list в символы
    val codStr="0123456789abcdefjhijklmnopqrstuvwxyz"
//создаем переменную, определяющую позицию очередного символа из str в codStr
    var n=0
//создаем изменяемый массив для записи разрядов числа n по основанию base
    val list = mutableListOf<Int>()
//заполним массив list коэффициентами разрядов, которые равны позиции символа str[k] в codStr
    for (i in 0 until str.length) {
        n=codStr.indexOf(str[i], 0)
        list.add(n)
    }
//для получения десятичного числа вызываем функцию decimal и передаем в нее list.toList() и base
    n=decimal(list.toList(), base)
//    println("str="+str+" list="+list+" n=$n")

return n
}

/**
 * Сложная
 *
 * Перевести натуральное число n > 0 в римскую систему.
 * Римские цифры: 1 = I, 4 = IV, 5 = V, 9 = IX, 10 = X, 40 = XL, 50 = L,
 * 90 = XC, 100 = C, 400 = CD, 500 = D, 900 = CM, 1000 = M.
 * Например: 23 = XXIII, 44 = XLIV, 100 = C
 */
fun roman(n: Int): String {
//создаем список арабчких чисел, которым соответствуют римские цифры
    val listA = listOf<Int>(1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000)
//создаем список римских цифр
    val listR = listOf<String>("I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M")
//переменная для вычисления римских чисел
    var aValue=n
//переменная для результирующей записи римского числа
    var strRom=""
//сканируем список listA от конца к началу выполняя деление n на listA[i]
    for (i in listA.size-1 downTo 0) {
//        println("i=$i listA="+listA[i]+" listR="+listR[i])
        while (aValue>=listA[i]) {
            aValue = aValue - listA[i]
            strRom=strRom+listR[i]
//            println("strRom=$strRom aValue=$aValue")
        }
      }

return strRom
}

/**
 * Очень сложная
 *
 * Записать заданное натуральное число 1..999999 прописью по-русски.
 * Например, 375 = "триста семьдесят пять",
 * 23964 = "двадцать три тысячи девятьсот шестьдесят четыре"
 */
fun russian(n: Int): String {
//создаем список слов для чисел от 0 до 9 (разрд 0)
    val list0 = listOf<String>("", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять")
//создаем список слов для чисел от 10 до 19 (разрд 1)
    val list1 = listOf<String>("десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятьнадцать",
        "шестнадцать", "семнадцать", "восемнадцать", "девятнадцать")
//создаем список слов для чисел от 20 до 90 (разрд 1)
    val list2 = listOf<String>("","","двадцать", "тридцать", "сорок", "пятьдесят","шестьдесят", "семьдесят", "восемьдесят", "девяносто")
//создаем список слов для чисел от 100 до 900 (разрд 2)
    val list3 = listOf<String>("","сто", "двести", "триста", "четыреста", "пятьсот","шестьсот", "семьсот", "восемьсот", "девятьсот")
//создаем список слов для чисел от 1000 до 9000 (разрд 3)
    val list4 = listOf<String>("тысяч","одна тысяча", "две тысячи", "три тысячи", "четыре тысячи", "пять тысяч",
        "шесть тысяч", "семь тысяч", "восемь тысяч", "девять тысяч")

    var strN="" //строка для единиц и десятков

    var r4=0    //число тысяч
    var r3=0    //число сотен
    var r2=0    //число десятков
    var r0=0    //число единиц
    r0=n % 10
    r2=(n/10) % 10
    r3=(n/100) % 10
    r4=n/1000

//    println("n=$n r4=$r4 r3=$r3 r2=$r2 r0=$r0")

    var n99=n % 100
//формируем подстроку десятков и единиц
    if (n99<10)
        strN=list0[r0]      //только единицы
    else if ((n99<20) && (r2==1))
        strN=list1[r0]      //10 ..19
    else if (n99>=20)
        strN=list2[r2]+" "+list0[r0]    //20-90


    if (r3>0) strN=list3[r3]+" "+strN       //формируем подстроку сотен
    strN=strN.trim()                        //удаляем крайние пробелы

    var strH="" //строка для сотен
    var strT="" //строка для тысяч
    var n1000 =0
    if (r4>=1) {
        n1000 = n / 1000
        r0 = n1000 % 10
        r2 = (n1000 / 10) % 10
        r3 = (n1000 / 100) % 10
//        println("n1000=$n1000 r3=$r3 r2=$r2 r0=$r0")
//формируем подстроку десятков и единиц тысяч
        if ((r0 > 0) && (r2 < 1))
            strT = list4[r0]      //только единицы
        else if (r2 == 1)
            strT = list1[r0] + " тысяч"     //10 ..19
        else if (r2 >= 2)
            strT = list2[r2] + " " + list4[r0]    //20-90

        strT = strT.trim()

        if (r3 > 0) {   //формируем подстроку сотен тысяч
            strH = list3[r3]

            if (strT != "")
                strT = strH + " " + strT
            else
                strT = strH + " тысяч"
        }
    }
    strH= strT+" "+strN
//     println("n=$n n99=$n99 n1000=$n1000 strH= $strH")
    return strH.trim()
}