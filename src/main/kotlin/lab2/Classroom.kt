package lab2

open class Classroom<T : Student>(vararg sts : T) : Iterable<T> {
    val students : MutableList<T> = mutableListOf()
    init {
        for (s in sts) students.add(s)
    }

    override fun iterator(): Iterator<T> {
        return students.iterator()
    }
}