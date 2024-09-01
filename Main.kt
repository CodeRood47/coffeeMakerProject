package machine

class CoffeeMaker {
    var water = 400
    var milk = 540
    var coffee = 120
    var cups = 9
    var money = 550
    var cost = 0

    fun userAction(action: String) {
        when (action) {
            "buy" -> makeCoffee()
            "fill" -> fillMachine()
            "take" -> takeMoney()
            "remaining" -> checkInventory()
            "exit" -> {
                // back out of the loop in main
            }

            else -> println("Input not recognised")
        }
    }

    private fun makeCoffee() {
        print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > ")
        val coffeeVariant = readln()
        when (coffeeVariant) {
            "1" -> {
                val waterCost = 250
                val coffeeCost = 16
                val cost = 4
                if (this.water - waterCost < 0) {
                    println(failWater)
                } else if (this.coffee - coffee < 0) {
                    println(failCoffee)
                } else if (this.cups - 1 < 0) {
                    println(failCups)
                } else {
                    println(sucMessage)
                    this.water -= waterCost
                    this.coffee -= coffeeCost
                    this.money += cost
                    this.cups -= 1
                    println()
                }
            }

            "2" -> {
                val waterCost = 350
                val milkCost = 75
                val coffeeCost = 20
                cost = 7


                if (this.water - waterCost < 0) {
                    println(failWater)
                } else if (this.coffee - coffeeCost < 0) {
                    println(failCoffee)
                } else if (this.milk - milkCost < 0) {
                    println(failMilk)
                } else if (this.cups - 1 < 0) {
                    println(failCups)
                } else {
                    println(sucMessage)
                    this.water -= waterCost
                    this.coffee -= coffeeCost
                    this.milk -= milkCost
                    this.money += cost
                    this.cups -= 1
                    println()
                }


            }

            "3" -> {
                val waterCost = 200
                val milkCost = 100
                val coffeeCost = 12
                cost = 6

                if (this.water - waterCost < 0) {
                    println(failWater)
                } else if (this.coffee - coffeeCost < 0) {
                    println(failCoffee)
                } else if (this.milk - milkCost < 0) {
                    println(failMilk)
                } else if (this.cups - 1 < 0) {
                    println(failCups)
                } else {
                    println(sucMessage)
                    this.water -= waterCost
                    this.coffee -= coffeeCost
                    this.milk -= milkCost
                    this.money += cost
                    this.cups -= 1
                    println()
                }
            }

            "back" -> {

            }

        }
    }

    private fun fillMachine() {
        print("Write how many ml of water you want to add: > ")
        val addWater = readln().toInt()
        print("Write how many ml of milk you want to add: > ")
        val addMilk = readln().toInt()
        print("Write how many grams of coffee beans you want to add: > ")
        val addCoffee = readln().toInt()
        print("Write how many disposable cups you want to add > ")
        val addCups = readln().toInt()

        this.water += addWater
        this.milk += addMilk
        this.coffee += addCoffee
        this.cups += addCups

        println()

    }

    private fun takeMoney() {
        println("I gave you \$${this.money}")
        this.money -= this.money
        println()
    }

    private fun checkInventory() {
        println()
        println(
            "The coffee machine has:\n" +
                    "${this.water} ml of water\n" +
                    "${this.milk} ml of milk\n" +
                    "${this.coffee} g of coffee beans\n" +
                    "${this.cups} disposable cups\n" +
                    "\$${this.money} of money"
        )
        println()
    }

}


const val sucMessage = "I have enough resources, making you a coffee!"
const val failWater = "Sorry, not enough water!"
const val failMilk = "Sorry, not enough milk!"
const val failCoffee = "Sorry, not enough coffee!"
const val failCups = "Sorry, not enough cups!"

//var water = 400
//var milk = 540
//var coffee = 120
//var cups = 9
////var money = 550


fun main() {
    val coffeeMaker = CoffeeMaker()
    do {
        print("Write action (buy, fill, take remaining, exit): > ")
        val action = readln()
        coffeeMaker.userAction(action)
    } while (action != "exit")
}
