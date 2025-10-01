fun main() {
    println("Enter the student's ID:")
    var id = readln()

    println("Enter the student's name:")
    var name = readln()

    println("Enter the student's course")
    var course = readln()

    println("Enter the student's mark:")
    var mark = readln().toDouble()

    var newStudent = Student(id, name, course)
    newStudent.mark = mark
    println(newStudent)
}