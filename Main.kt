package machine
// ingredients for coffee cups


fun makeCoffee() {
    print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > ")
    val coffeeVariant = readln()
    when (coffeeVariant) {
        "1" -> {
            water = 250
            coffee = 16
            cost = 4
            if (waterInmachine - water < 0) {
                println(failWater)
            } else if (coffeeInmachine - coffee < 0) {
                println(failCoffee)
            } else if (cups - 1 < 0) {
                println(failCups)
            } else {
                println(sucMessage)
                waterInmachine -= water
                coffeeInmachine -= coffee
                money += cost
                cups -= 1
                println()
            }
        }

        "2" -> {
            water = 350
            milk = 75
            coffee = 20
            cost = 7


            if (waterInmachine - water < 0) {
                println(failWater)
            } else if (coffeeInmachine - coffee < 0) {
                println(failCoffee)
            } else if (milkInMachine - milk < 0) {
                println(failMilk)
            } else if (cups - 1 < 0) {
                println(failCups)
            } else {
                println(sucMessage)
                waterInmachine -= water
                coffeeInmachine -= coffee
                milkInMachine -= milk
                money += cost
                cups -= 1
                println()
            }


        }

        "3" -> {
            water = 200
            milk = 100
            coffee = 12
            cost = 6

            if (waterInmachine - water < 0) {
                println(failWater)
            } else if (coffeeInmachine - coffee < 0) {
                println(failCoffee)
            } else if (milkInMachine - milk < 0) {
                println(failMilk)
            } else if (cups - 1 < 0) {
                println(failCups)
            } else {
                println(sucMessage)
                waterInmachine -= water
                coffeeInmachine -= coffee
                milkInMachine -= milk
                money += cost
                cups -= 1
                println()
            }
        }

        "back" -> {

        }

    }
}

fun fillMachine(){
    print("Write how many ml of water you want to add: > ")
    val addWater = readln().toInt()
    print("Write how many ml of milk you want to add: > ")
    val addMilk = readln().toInt()
    print("Write how many grams of coffee beans you want to add: > ")
    val addCoffee = readln().toInt()
    print("Write how many disposable cups you want to add > ")
    val addCups = readln().toInt()

    waterInmachine += addWater
    milkInMachine += addMilk
    coffeeInmachine += addCoffee
    cups += addCups

    println()

}

fun takeMoney(){
    println("I gave you \$$money")
    money -= money
    println()
}

fun checkInventory(){
    println()
    println(
        "The coffee machine has:\n" +
                "$waterInmachine ml of water\n" +
                "$milkInMachine ml of milk\n" +
                "$coffeeInmachine g of coffee beans\n" +
                "$cups disposable cups\n" +
                "$money of money"
    )
    println()
}


    var coffee = 0 // gram
    var water = 0 // millilitre
    var milk = 0 // millilitre
    var cost = 0

    const val sucMessage = "I have enough resources, making you a coffee!"
    const val failWater = "Sorry, not enough water!"
    const val failMilk = "Sorry, not enough milk!"
    const val failCoffee = "Sorry, not enough coffee!"
    const val failCups = "Sorry, not enough cups!"

    var waterInmachine = 400
    var milkInMachine = 540
    var coffeeInmachine = 120
    var cups = 9
    var money = 550


    fun main() {
        do {
            print("Write action (buy, fill, take remaining, exit): > ")
            val action = readln()

            when (action) {
                "buy" -> {
                    makeCoffee()
                }


                "fill" -> {
                    fillMachine()
                }

                "take" -> {
                    takeMoney()

                }

                "remaining" -> {
                    checkInventory()
                }

            }
        } while (action != "exit")
    }
