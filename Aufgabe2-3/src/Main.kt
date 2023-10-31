fun main() {
    //Schreibe hier den Code zu Aufgabe 3
    val tiere = listOf(Tier(), Hund(), Katze())
    for (tier in tiere) {
        tier.lautgeben()
    }
}