fun main() {
    val dataNumber = 1..100
    val arrayList = dataNumber.toList().toTypedArray()

    for (i in arrayList){
        if (i % 2 == 0) println("Nilai $i adalah bilangan Genap" )
    }
}