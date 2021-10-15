package lab2

class SortedClassroom(vararg sts : Student) : Classroom<Student>(*sts)  {

    inner class StudentSorter<T>: Comparator<T> {

        override fun compare(o1: T, o2: T): Int {
            return 1
        }
    }

    fun addBetter() : Unit {

    }
}