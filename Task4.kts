fun main() {
    nilaiSiswa(90)
    nilaiSiswa(82)
    nilaiSiswa(73)
    nilaiSiswa(31)
    nilaiSiswa(100)

}

fun nilaiSiswa(nilai: Int) {
    when (true) {
        (60 <= nilai && nilai <= 80) -> println("memuaskan")
        (81 <= nilai && nilai <= 90) -> println("sangat memuaskan")
        (91 <= nilai && nilai <= 100) -> println("terpuji")
        nilai < 60 -> println("tidak lulus")

    }
}