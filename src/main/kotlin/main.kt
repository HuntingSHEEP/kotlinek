// =================================~~~~~~~~~~~~~===============================
// =======                               MAIN                           ========
// =================================~~~~~~~~~~~~~===============================
/*
 * Deklaracja funkcji zaczyna się od słowa kluczowego fun,
 * w kotlinie program zaczyna się od funkcji main(args : Array<String>).
 * Nie ma obowiązku tworzenia klas (tak jak w JAVIE) bo kompilator robi to za nas.
 */

// =================================~~~~~~~~~~~~~===============================
// =======                             ZMIENNE                          ========
// =================================~~~~~~~~~~~~~===============================
/*
 * KOTLIN JEST JĘZYKIEM STATYCZNIE TYPOWANYM.
 *
 * Deklaracja zmiennej zaczyna się od słowa kluczowego:
 * 1) var - variable czyli zmienna, można modyfikować jej wartość
 * 2) val - value czyli wartość, NIE MOŻNA modyfikować jej watości;
 * Przykład:
 *  var zmienna : Int = 32
 *  val stala : String = "lubie masło"
 *
 *  var innaWartosc : String
 *  innaWartosc = "ja Ci pokaze!"
 *
 * Można również deklarować niejawnie: (to się fachowo nazywa INFERECJA TYPÓW)
 *  var aWezSieDomyslSam = 41
 *
 * Typowanie jest statyczne, czyli raz utworzonej zmiennej nie można ponownie nadać typu
 *  aWezSieDomyslSam = "TO NIE PRZEJDZIE" //WYRZUCI BŁĄD!
 */

// =================================~~~~~~~~~~~~~===============================
// =======                         TYPY WBUDOWANE                       ========
// =================================~~~~~~~~~~~~~===============================
/*
 TYPY NUMERYCZNE
 ---------------

 * ) Byte: 8 bitowe (jeden bajt) ze znakiem czyli zakres [-128, 127]
 * ) Short: 16 bitowe ze znakiem: [-32768, 32767]
 * ) Int: 32 bitowe ze znakiem: [-2^31, 2^31 - 1]
 *  var zmiennaInt = 32
 *  - domyślnie jeśli bez deklaracji typu to INT

 * ) Long: 64 bitowe ze znakiem: [-2^63, 2^63 - 1]
 *  val dystans : Long = 100
 *  val dyst2 = 100L

 * ) Float: 32 bitowe float pojedynczej precycji
 *  val obwod: Float = 12.1
 *  val obw2 = 12.1F

 * ) Double: 64 bitowe float podwójnej precyzji


 * ) Number
 * Jeżeli nie wiemy, jaki dokładnie typ numeryczny chcemy, możemy użyć
 * typu Number.
 *
 * var aJaWiem: Number  = 12.2
 * aJaWiem = 12
 * aJaWiem = 120L

 Characters
 ----------

 * ) Char - w przeciwieństwie do Javy, Char nie może być traktowany jak numer
 *  val litera:Char = 'k'
 *  println("$litera")


 Boolean
 -------

 * ) Boolean
 * var flaga: Boolean = true
 * println("oto flaga: $flaga")

 Arrays
 ------

 Strings
 -------
 *) String
 * val jakisNapis: String = "a ja wiem"
 * val innyNapis = "cooo"

 */

// =================================~~~~~~~~~~~~~===============================
// =======                            OPERATORY                         ========
// =================================~~~~~~~~~~~~~===============================
/*
 * OPERATOR IN
 * -----------
 * val numbers = intArrayOf(1, 4, 42, -3)

    if (4 in numbers) {
        println("numbers array contains 4.")
    }
 *
 */


// =================================~~~~~~~~~~~~~===============================
// =======                    PRZEŁADOWANIE OPERATORÓW                  ========
// =================================~~~~~~~~~~~~~===============================
/*
https://www.programiz.com/kotlin-programming/operator-overloading

 */

// =================================~~~~~~~~~~~~~===============================
// =======                        RZUTOWANIE TYPÓW                      ========
// =================================~~~~~~~~~~~~~===============================
/*
 * val zmienna : Int = 52
 * val dluga : Long = zmienna.toLong()
 *
 * W przeciwieństwie do Javy, Kotlin nie zrobi automatycznego rzutowania z typu Int do Long. Tutaj trzeba
 * tego dokonać świadomie poprzez użycie metody .toLong()
 *
 * Dostępne rzutowania:
 * .toByte()
 * .toShort()
 * .toInt()
 * .toLong()
 * .toFloat()
 * .toDouble()
 * .toChar()
 *
 * Co ważne, rzutowania te działają w każdą stronę, czyli z większego na
 * mniejszy i na odwrót.
 */

// =================================~~~~~~~~~~~~~===============================
// =======                           PRINTOWANIE                        ========
// =================================~~~~~~~~~~~~~===============================
/*
 * Mamy dostępne dwie funkcje:
 *  print()
 *  println()
 * Obie odwołują się odpowiednio do System.out.print() oraz System.out.println().
 *
 * val pi: Float = 3.14F
 * println("PI " + pi)
 * println("PI $pi")
 * println("2*PI ${pi*2}")
 *
 */

// =================================~~~~~~~~~~~~~===============================
// =======                           KOTLIN INPUT                       ========
// =================================~~~~~~~~~~~~~===============================
/*
 * print("Enter text: ")
 * val stringInput = readLine()
 * println("You entered: $stringInput")
 *
 * SCANNER
 * -------
 *
 * import java.util.Scanner
 * // Creates an instance which takes input from standard input (keyboard)
    val reader = Scanner(System.`in`)
    print("Enter a number: ")

    // nextInt() reads the next integer from the keyboard
    var integer:Int = reader.nextInt()

    println("You entered: $integer")
 */

// =================================~~~~~~~~~~~~~===============================
// =======                              WHEN                            ========
// =================================~~~~~~~~~~~~~===============================
/*
 * Podobnie jak IF, WHEN może być używane do zwracania wartości (wyrażenie? - expression)
 *
 *val z = 1;

        val napis: String = when(z){
            3, 1 -> "to jest jedynka albo trojka"
            2 -> "to jest dwojka"
            in 4 .. 20 -> "z przedziału od 4 do 20"
            else -> "a ja wiem co to jest"
        }

        println("napis: $napis")
 */
// =================================~~~~~~~~~~~~~===============================
// =======                              PĘTLE                           ========
// =================================~~~~~~~~~~~~~===============================
/*
 * WHILE, DO WHILE - z grubsza to samo co w w JAVIE
 * FOR:
 *
 * for(i in 2..6){}
 * for(i in 2..6 step 1){}
 *
 * for(i in 6..2){}
 *
 * for(i in 6 downTo 2){}
 * for(i in 6 downTo 2 step 1){}
 *
 */

// =================================~~~~~~~~~~~~~===============================
// =======                             FUNKCJE                          ========
// =================================~~~~~~~~~~~~~===============================
/*
 * fun mojaFunkcja(){} >> funkcja bezargumentowa, nie zwraca nic, czyli domyślnie zwraca UNIT
 *
 * fun dzikiTrener(l : String, l2:String) : Int{
        return 0
    }

 * fun sgn(a:Double) : Int = if(a>0) 1 else if(a== 0.toDouble()) 0 else -1
 * fun pomnoz (a : Byte, b: Int) : Double = a*b.toDouble()
 *
 * INFIX
 * ------
 *
 * infix fun createPyramid(rows: Int) {
 * .... blah blah blah
 * }
 *
 * ARGUMENTY DOMYŚLNE
 * ------------------
 * fun funkcja(raz: Int = 1, dwa: Int = 2){}
 */

// =================================~~~~~~~~~~~~~===============================
// =======                               UNIT                           ========
// =================================~~~~~~~~~~~~~===============================
//The type with only one value: the Unit object. This type corresponds to the void type in Java.

// =================================~~~~~~~~~~~~~===============================
// =======                              KLASY                           ========
// =================================~~~~~~~~~~~~~===============================
/*
 * MODYFIKATORY DOSTĘPU
 * --------------------
 * ) PRIVATE
 * ) PROTECTED
 * ) PUBLIC
 * ) INTERNAL - any client inside the module can access them
 *
 * KONSTRUKTORY
 * ------------
 * ) PRIMARY CONSTRUCTOR
 *
 * class Owoc(var waga: Int, val nazwa: String){ << PRIMARY CONSTRUCTOR
    val kolor : String

    init{                                        << BLOK INIT NALEŻY DO KONSTRUKTORA GŁÓWNEGO (PIERWSZORZĘDNEGO)
        this.kolor = "ZOLTY"
        }
    }
 *
 * ) SECONDARY CONTRUCTOR
 *class Log {
    constructor(data: String) {
        // some code
    }
    constructor(data: String, numberOfData: Int) {
        // some code
        }
    }

    PRZYKŁAD WYWOŁYWANIA KONSTRUKTORA Z KLASY DZIEDZICZONEJ
    -------------------------------------------------------

    class Log {
        constructor(data: String) {
            // code
        }
        constructor(data: String, numberOfData: Int) {
            // code TRZY
        }
    }

    class AuthLog: Log {
        constructor(data: String): this(data, 10) {
            // code RAZ
        }
        constructor(data: String, numberOfData: Int): super(data, numberOfData) {
            // code DWA
        }
    }
 */

// =================================~~~~~~~~~~~~~===============================
// =======                      KLASY - DZIEDZICZENIE                   ========
// =================================~~~~~~~~~~~~~===============================
/*
    open class Person(age: Int) {
        fun wypisz(zmienna: String){
            println("$zmienna")
        }

    }

    class MathTeacher(age: Int): Person(age) {
        override fun wypisz(zmienna: String){                      << OVERRIDE
            println("oto jest zmienna $zmienna")
        }
    }

    OPEN - to ważne. Klasy domyślnie są FINAL, co nie pozwala na tworzenie
    podklas. Open pozwala dziedziczyć po danej klasie
    By móc nadpisywać metody/pola należy użyć modyfikatora OPEN.
 */

// =================================~~~~~~~~~~~~~===============================
// =======                       KLASY ABSTRAKCYJNE                     ========
// =================================~~~~~~~~~~~~~===============================
/*
 * Klasy abstrakcyjne (tak jak w Javie) nie pozwalają tworzyć z siebie instancji.
 * Domyślnie pola i metody klasy abstrakcyjnej nie są abstrakcyjne, i aby takimi się
 * stały, należy użyć słowa abstract. Pola i metody abstrakcyjne nie zawierają oczywiście
 * ciała a jedynie deklarację - bez definicji.
 *
 * Po klasie abstrakcyjnej można swobodnie dziedziczyć, ponieważ domyślnie jest OPEN.
 * By móc nadpisywać metody/pola należy użyć modyfikatora OPEN.
 *

abstract class Person {

    var age: Int = 40

    fun displaySSN(ssn: Int) {
        println("My SSN is $ssn.")
    }

    abstract fun displayJob(description: String)
}

 */

// =================================~~~~~~~~~~~~~===============================
// =======                            INTERFEJSY                        ========
// =================================~~~~~~~~~~~~~===============================
/*
 * interface MyInterface {

    val test: Int

    fun foo() : String

    fun hello() {
        println("Hello there, pal!")
    }
}

class InterfaceImp : MyInterface {

    override val test: Int = 25
    override fun foo() = "XD"

}
*
* ==========
*
* interface A {

    fun callMe() {
        println("From interface A")
    }
}

interface B  {
    fun callMe() {
        println("From interface B")
    }
}

class C: A, B {
    override fun callMe() {
        super<A>.callMe()
        super<B>.callMe()
    }
}
 */
// =================================~~~~~~~~~~~~~===============================
// =======                            DATA CLASS                        ========
// =================================~~~~~~~~~~~~~===============================
/*
  data class User(val name: String, val age: Int)
 * WYMOGI
 * ) Konstruktor pierwszorzędny musi mieć conajmniej jeden parametr
 * ) parametry kontruktora primary muszą być albo val albo var
 * ) clasa nie może być open, abstract, inner albo sealed
 * ) może implementować interfejsy


 * Domyślnie tworzone są metody:
 * ) .copy()
 * ) .equals()
 * ) .hashCode()
 * ) .toString()
 */

// =================================~~~~~~~~~~~~~===============================
// =======                          SEALED CLASS                        ========
// =================================~~~~~~~~~~~~~===============================
/*
 Sealed class restricts the possibility of creating subclasses
 */

sealed class Expr
class Const(val value: Int) : Expr()
class Sum(val left: Expr, val right: Expr) : Expr()
object NotANumber : Expr()


fun eval(e: Expr): Int =
    when (e) {
        is Const -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        NotANumber -> 0
    }

// =================================~~~~~~~~~~~~~===============================
// =======                        COMPANION OBJECT                      ========
// =================================~~~~~~~~~~~~~===============================
/*
        class Person {

            // name of the companion object is omitted
            companion object {
                fun callMe() = println("I'm called.")
            }
        }

        fun main(args: Array<String>) {
            Person.callMe()                  << companion pozwala na wywołanie metody, "bez tworzenia instancji klasy"
        }

 */

// =================================~~~~~~~~~~~~~===============================
// =======                       Extension Function                     ========
// =================================~~~~~~~~~~~~~===============================
/*
 * W wielkim skrócie: deklaracja i definicja metody poza ciałem klasy.
 */

fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)
//===========================================================================

class Owoc(var waga: Int, val nazwa: String){
    val kolor : String

    init{
        this.kolor = "ZOLTY"
    }
}

open class Person(age: Int) {
    open fun wypisz(zmienna: String){
        println("$zmienna")
    }

}

class MathTeacher(age: Int): Person(age) {
    override fun wypisz(zmienna: String){
        println("oto jest zmienna $zmienna")
    }
}

class Przyklady{

    fun definicjaWrazZIf(){
        val a = 12
        val b = 13
        val max: Int

        max = if (a > b) a else b
        println("$max")
    }

    fun operatorIN(){
        val lista = intArrayOf(1,2,3)
        val flaga: Boolean = if(1 in lista) true else false
        println("flaga $flaga")
    }

    fun whenExpression(){
        val z = 1;

        val napis: String = when(z){
            3, 1 -> "to jest jedynka albo trojka"
            2 -> "to jest dwojka"
            in 4 .. 20 -> "z przedziału od 4 do 20"
            else -> "a ja wiem co to jest"
        }

        println("napis: $napis")
    }

    fun dzikiTrener(l : String, l2:String) : Int{
        return 0
    }

    fun sgn(a:Double) : Int = if(a>0) 1 else if(a== 0.toDouble()) 0 else -1
    fun pomnoz (a : Byte, b: Int) : Double = a*b.toDouble()
}


fun main(args : Array<String>) {
    /*
    // Deklaracja z definicją
    var zmiennaA : String = "A JA LUBIE MASŁO"
    val zmiennaB : Int = 23

    //Redefinicja zmiennej - val jest stała i nie można jej nadpisać!
    zmiennaA = "A ja wiem"
    //zmiennaB = 32; wyrzuci błąd

    //Przykład deklaracji z niejawnym typowaniem, kopilator sam się domyśla typu na podstawie przypisanej wartości
    val domyslSie = 31

    //Nie można jednak zmienić typu raz utworzonej zmiennej - i chwała Bogu!
    //domyslSie = "NO JEDNAK NIE"

    val innaWartosc : String
    innaWartosc = "Ja Ci teraz pokażę!"

    var aJaWiem: Number  = 12.2
    aJaWiem = 12
    aJaWiem = 120L
    println("A JA WIEM: $aJaWiem")

    var flaga: Boolean = true
    println("Wartość flagi: $flaga")

    println("Hello World $zmiennaA $zmiennaB") // zamiast konkatenacji jest template, cokolwiek to znaczy

    val zmienna : Int = 52
    val dluga : Long = zmienna.toLong()

    val pi: Float = 3.14F
    println("PI " + pi)
    println("PI $pi")
    println("2*PI ${pi*2}")

    print("Enter text: ")
    val stringInput = readLine()
    println("You entered: $stringInput")


     */

    val p: Przyklady = Przyklady()
    p.whenExpression();


}

