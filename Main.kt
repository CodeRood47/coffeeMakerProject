package machine
// ingredients for coffee cups
var coffee = 15 // gram
var water = 200 // millilitre
var milk = 50 // millilitre


fun main() {

    val action = readln()

    when (action) {
        "buy" -> {
            print("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: > ")
            val coffeeVariant = readln().toInt()
            when (coffeeVariant){
                1 -> {

                }
                2 -> {

                }
                3 -> {

                }
            }



            print("Write how many ml of water the coffee machine has: > ")
            val waterInmachine = readln().toInt()
            print("Write how many ml of milk the coffee machine has: > ")
            val milkInMachine = readln().toInt()
            print("Write how many grams of coffee beans the coffee machine has: > ")
            val coffeeInmachine = readln().toInt()
            print("Write how many cups of coffee you will need: > ")
            val input = readln().toInt()

//            val cInCup = coffee * input
//            val wInCup = water * input
//            val mInCup = milk * input
            val totWater = waterInmachine / water
            val totMilk = milkInMachine / milk
            val totCoffee = coffeeInmachine / coffee


            val totalCups = if (totCoffee < totMilk && totCoffee < totWater) {
                totCoffee
            } else if (totWater < totMilk && totWater < totCoffee) {
                totWater
            } else {
                totMilk
            }



            if (totalCups > input) {
                val N = totalCups - input
                println("Yes, I can make that amount of coffee (and even $N more than that)")
            } else if (totalCups == input) {
                println("Yes, I can make that amount of coffee")
            } else {
                println("No, I can make only $totalCups cups of coffee")
            }


            /*println("For $input cups of coffee you will need:\n" +
                    "$wInCup ml of water\n" +
                    "$mInCup ml of milk\n" +
                    "$cInCup g of coffee beans")




            println("""Starting to make a coffee
        Grinding coffee beans
        Boiling water
        Mixing boiled water with crushed coffee beans
        Pouring coffee into the cup
        Pouring some milk into the cup
        Coffee is ready!""")*/

        }

        "fill" -> {


        }

        "take" -> {

        }
    }
}




