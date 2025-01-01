fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList) // Output: [2, 4, 6, 8, 10]

    val filteredList = list.filter { it % 2 == 0 }
    println(filteredList) // Output: [2, 4]

    val sum = list.fold(0) { acc, i -> acc + i }
    println(sum) // Output: 15

    val average = list.average()
    println(average) // Output: 3.0

    //Example of handling potential exceptions
    val emptyList = emptyList<Int>()
    val averageOfEmptyList = try{
        emptyList.average()
    } catch (e: ArithmeticException){
        0.0
    }
    println(averageOfEmptyList) //Output: 0.0
} 