data class Student (
    val firstname: String,
    val surname: String,
    val grade: Int
)

val studentList =
    arrayListOf(
        Student("Sheldon", "Cooper", 2),
        Student("Leonard", "Hofstadter", 3),
        Student("Howard", "Wolowitz", 5)
    )