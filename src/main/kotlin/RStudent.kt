import react.*

external interface RStudentProps : Props {
    var student: Student
}

class RStudent : RComponent<RStudentProps, RState>() {
    override fun RBuilder.render() {
        +"${props.student.firstname} ${props.student.surname} ${props.student.grade}"
    }
}

fun RBuilder.rstudent(student: Student) =
    child(
        functionComponent<RStudentProps> {
            +"${it.student.firstname} ${it.student.surname} ${it.student.grade}"
        }
    ){
        attrs.student = student
    }