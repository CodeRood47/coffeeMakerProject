package machine
// ingredients for coffee cups

var coffee = 0 // gram
var water = 0 // millilitre
var milk = 0 // millilitre
var cost = 0



var waterInmachine = 400
var milkInMachine = 540
var coffeeInmachine = 120
var cups = 9
var money = 550


fun main() {

    println("The coffee machine has:\n" +
            "$waterInmachine ml of water\n" +
            "$milkInMachine ml of milk\n" +
            "$coffeeInmachine g of coffee beans\n" +
            "$cups disposable cups\n" +
            "$money of money")
    println()
    print("Write action (buy, fill, take): > ")
    val action = readln()

    when (action) {
        "buy" -> {
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > ")
            val coffeeVariant = readln().toInt()
            when (coffeeVariant){
                1 -> {
                    water = 250
                    coffee = 16
                    cost = 4

                    waterInmachine -= water
                    coffeeInmachine -= coffee
                    money += cost
                    cups -= 1

                    println("The coffee machine has:\n" +
                            "$waterInmachine ml of water\n" +
                            "$milkInMachine ml of milk\n" +
                            "$coffeeInmachine g of coffee beans\n" +
                            "$cups disposable cups\n" +
                            "$money of money")

                }
                2 -> {
                    water = 350
                    milk = 75
                    coffee = 20
                    cost = 7

                    waterInmachine -= water
                    coffeeInmachine -= coffee
                    milkInMachine -= milk
                    money += cost
                    cups -= 1

                    println("The coffee machine has:\n" +
                            "$waterInmachine ml of water\n" +
                            "$milkInMachine ml of milk\n" +
                            "$coffeeInmachine g of coffee beans\n" +
                            "$cups disposable cups\n" +
                            "$money of money")
                }
                3 -> {
                    water = 200
                    milk = 100
                    coffee = 12
                    cost = 6

                    waterInmachine -= water
                    coffeeInmachine -= coffee
                    milkInMachine -= milk
                    money += cost
                    cups -= 1

                    println("The coffee machine has:\n" +
                            "$waterInmachine ml of water\n" +
                            "$milkInMachine ml of milk\n" +
                            "$coffeeInmachine g of coffee beans\n" +
                            "$cups disposable cups\n" +
                            "$money of money")
                }
            }





//

        }

        "fill" -> {
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
                println("The coffee machine has:\n" +
                        "$waterInmachine ml of water\n" +
                        "$milkInMachine ml of milk\n" +
                        "$coffeeInmachine g of coffee beans\n" +
                        "$cups disposable cups\n" +
                        "$money of money")


        }

        "take" -> {

                println("I gave you \$$money")
                money -= money
                println()
                println("The coffee machine has:\n" +
                    "$waterInmachine ml of water\n" +
                    "$milkInMachine ml of milk\n" +
                    "$coffeeInmachine g of coffee beans\n" +
                    "$cups disposable cups\n" +
                    "$money of money")
        }
    }
}




