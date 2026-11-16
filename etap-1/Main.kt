fun obliczGodziny(godzinyTygodniowo: Int, liczbaTygodni: Int): Int {
    return godzinyTygodniowo * liczbaTygodni
}

fun main() {

    // Dane ucznia
    val imie = "Jan"
    var klasa = "3"
    val kierunek = "Technik informatyk"

    println("===== MOJA WIZYTOWKA =====")
    println("Imie: $imie")
    println("Klasa: $klasa")
    println("Kierunek: $kierunek")

    // Obliczanie godzin zajec
    val wynik1 = obliczGodziny(8, 4)
    val wynik2 = obliczGodziny(10, 6)

    println()
    println("===== GODZINY ZAJEC =====")
    println("8 godzin tygodniowo przez 4 tygodnie: $wynik1 godzin")
    println("10 godzin tygodniowo przez 6 tygodni: $wynik2 godzin")
}
