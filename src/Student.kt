class Student (val nId: String, val nName: String, val nCourse: String, val nMark: Double) {
    val id: String
    val name: String
    val course: String
    val mark: Double

    init {
        id = nId
        name = nName
        course = nCourse
        mark = nMark
    }

    override fun toString(): String {
        return "Id: $nId, Name: $nName, Course: $nCourse, Mark: $mark"
    }
}