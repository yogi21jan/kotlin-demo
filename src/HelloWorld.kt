import jdk.nashorn.internal.objects.NativeArray
import java.util.*

data class Employee(val name:String, val empNumber: UUID, var salary:Int=5000,var job:String="Employee")

fun Employee.isManager():String {
    if(this.job.equals("Manager"))
        return "Yes"
    else
        return "No"
}



fun main(args:Array<String>){

    println("Welcome to Kotlin Programming!")

    var emp1 = Employee("Yogi",UUID.randomUUID(),4000)
    var emp2 = emp1.copy(name="Arvind",empNumber = UUID.randomUUID())
    var emp3 = Employee("Amit",UUID.randomUUID())
    var emp4 = Employee(name="Yogi2",empNumber = UUID.randomUUID(),job="Manager")


    println("Details of emp1--> ${emp1.toString()}")
    println("Details of emp2--> ${emp2.toString()}")
    println("Details of emp2--> ${emp3.toString()}")
    println("Is emp1 is manager: ${emp1.isManager()}")
    println("Is emp4 is manager: ${emp4.isManager()}")

  /*  for (i in 1..10)  println("1counter: $i")
    for (i in 1 until 10) println("2counter: $i")
    for (i in 10 downTo 1)  println("3counter: $i")
    for (i in 1..10 step 2)  println("4counter: $i")
    for (i in 10 downTo 1 step 2)  println("5counter: $i")*/

    val employees = listOf<Employee>(emp1,emp2,emp3,emp4)

    employees
            .filter { it.job== "Employee" }
            .sortedBy { it.name }
            .map { it.empNumber }
            .forEach { println("ID: $it") }

    val html = """<div class=”text”>${emp1.name}</div>"""
    println("HTML: $html")

    /*val items = listOf(1, 2, 3, 4)
    println("${items.first() == 1}")
    println("${items.last() == 4}")
    println("${items.filter { it % 2 == 0 }}")

    val rwList = mutableListOf(1, 2, 3)
    println("${rwList.requireNoNulls()}")
    if (rwList.none { it > 6 }) println("No items above 6")  // prints "No items above 6"
    val item = rwList.firstOrNull()
    println("$item")*/
}