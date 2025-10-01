// student superclass
abstract class Student (val nId: String, val nName: String, val nCourse: String) {
    val id: String
    val name: String
    val course: String
    var mark = 0.0
        set (newMark) {
            if (newMark <= 100 && newMark >= 0) {
                field = newMark
            }
        }

    init {
        id = nId
        name = nName
        course = nCourse
    }

    abstract fun getGrade(): String

    fun didPass(): Boolean {
        if (mark >= 40) {
            return true
        }
        else {
            return false
        }
    }

    override fun toString(): String {
        val grade = getGrade()
        val pass = didPass()
        return "Id: $nId, Name: $nName, Course: $nCourse, Mark: $mark, Grade: $grade, Pass: $pass"
    }
}

class Undergraduate(nId: String, nName: String, nCourse: String) : Student(nId, nName, nCourse) {
    override fun getGrade(): String {
        when (mark) {
            in 70.0 .. 100.0 -> return "First"
            in 60.0 .. 69.0 -> return "2/1"
            in 50.0 .. 59.0 -> return "2/2"
            in 40.0 .. 49.0 -> return "Third"
            else -> return "Fail"
        }
    }
}

class Masters(nId: String, nName: String, nCourse: String) : Student(nId, nName, nCourse) {
    override fun getGrade(): String {
        when (mark) {
            in 70.0 .. 100.0 -> return "Distinction"
            in 60.0 .. 69.0 -> return "Merit"
            in 40.0 .. 59.0 -> return "Pass"
            else -> return "Fail"
        }
    }
}