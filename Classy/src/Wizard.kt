class Wizard(name: String, age: String, gender: String, val mana: Int): Player(name, age, gender) {
    fun magic() {
        println("take this magic on your face!")
    }
}