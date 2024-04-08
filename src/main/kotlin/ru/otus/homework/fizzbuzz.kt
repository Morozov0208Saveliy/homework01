package ru.otus.homework


fun fizzbuzz(n: Int): Array<String> {
    val startNumber = 0
    val array = ArrayList<String>(n)
    for (i in startNumber..n - 1) {
        if (i % 3 == 0 && i % 5 == 0) {
            array.add("FizzBuzz")
        } else if (i % 5 == 0) {
            array.add("Buzz")
        } else if (i % 3 == 0) {
            array.add("Fizz")
        } else {
            array.add(i.toString())
        }
    }
    return array.toTypedArray()
}