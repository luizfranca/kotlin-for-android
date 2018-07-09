class Warrior(name: String, age: String, gender: String, val strength: Int): Player(name, age, gender) {
    fun superAttack() {
        println("Super attack on your way!")
    }
}