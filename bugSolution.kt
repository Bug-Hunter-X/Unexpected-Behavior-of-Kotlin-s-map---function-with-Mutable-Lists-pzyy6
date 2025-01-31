fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 } // This will work fine
    println(result) // [2, 4, 6, 8, 10]

    val mutableList = mutableListOf(1,2,3,4,5)
    mutableList.map{it * 2} //This will also work fine
    println(mutableList) //[1,2,3,4,5] 
    //The values in mutableList will not be changed

    mutableList.mapTo(mutableListOf()){it * 2} //This will change the values in mutableList, but it will return a new list
    println(mutableList) //[1,2,3,4,5]
    
    mutableList.mapInPlace{it * 2} //This will change the value in mutableList
    println(mutableList) //[2,4,6,8,10]
} 