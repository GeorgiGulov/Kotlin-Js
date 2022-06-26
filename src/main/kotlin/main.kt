
import kotlinx.browser.document
import react.dom.h1
import react.dom.li
import react.dom.ol
import react.dom.render


fun main() {
    render(document.getElementById("root")!!) {
        h1 {
            +"Студенты"
        }
        ol {
            studentList.forEach {
                li {
                    val tmp = rstudent(it)
                }
            }
        }
    }

}