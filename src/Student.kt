class Student (val nId: String, val nName: String, val nCourse: String) {
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

    fun getGrade(): String {
        when (mark) {
            in 70.0 .. 100.0 -> return "First"
            in 60.0 .. 69.0 -> return "2/1"
            in 50.0 .. 59.0 -> return "2/2"
            in 40.0 .. 49.0 -> return "Third"
            else -> return "Fail"
        }
    }

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