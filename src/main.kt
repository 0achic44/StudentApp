fun main() {
    println("Is this student an Undergraduate student or a Masters student")
    var type = readln().lowercase()

    println("Enter the student's ID:")
    var id = readln()

    println("Enter the student's name:")
    var name = readln()

    println("Enter the student's course")
    var course = readln()

    println("Enter the student's mark:")
    var mark = readln().toDouble()

    val student : Student

    if (type == "undergraduate") {
        student = Undergraduate(id, name, course)
        student.mark = mark
        println(student)
    }
    else if (type == "masters") {
        student = Masters(id, name, course)
        student.mark = mark
        println(student)
    }
}