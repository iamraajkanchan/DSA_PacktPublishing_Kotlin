class UpperCasedList : ArrayList<String>() {

    // Overriding add method to add a single element in ArrayList.
    override fun add(element: String): Boolean {
        return super.add(element.toUpperCase())
    }

    // Overriding add method to add a single element with index in ArrayList.
    override fun add(index: Int, element: String) {
        super.add(index, element.toUpperCase())
    }

    // Overriding addAll method to add a collection in ArrayList.
    override fun addAll(elements: Collection<String>): Boolean {
        return super.addAll(elements.map { it -> it.toUpperCase() })
    }

    // Overriding addAll method to add a collection with index in ArrayList.
    override fun addAll(index: Int, elements: Collection<String>): Boolean {
        return super.addAll(index, elements.map { it -> it.toUpperCase() })
    }

    override fun set(index: Int, element: String): String {
        return super.set(index, element.toUpperCase())
    }
}

class UpperCasedListImplementation {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val names = UpperCasedList()
            names.add("raj kanchan")
            names.add("taksh jaiswal")
            val namesInLowerCase = arrayOf("vikrant singh", "pruthviraj", "gaurav mundse")
            names.addAll(namesInLowerCase)
            println("Names in upper case : $names")
        }
    }
}

/**
 * Output
 *
 * */
