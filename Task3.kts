fun main(){
    val kelas = Umur()

    kelas.panggil1(39,"80",30.5)
}

class Umur {
    fun panggil1(a:Int, b:String, c:Double):Int{
        val result = a + b.toInt() + c.toInt()

        println("Result yang dihasilkan: $result")
        return result
    }
}