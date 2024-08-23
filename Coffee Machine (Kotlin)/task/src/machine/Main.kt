package machine
// ingredients for coffee cups
val coffee = 15 // gram
val water = 200 // millilitre
val milk = 50 // millilitre


fun main() {
    print("Write how many ml of water the coffee machine has: > ")
    val waterInmachine = readln().toInt()
    print("Write how many ml of milk the coffee machine has: > ")
    val milkInMachine = readln().toInt()
    print("Write how many grams of coffee beans the coffee machine has: > ")
    val coffeeInmachine = readln().toInt()
    print("Write how many cups of coffee you will need: > ")
    val input = readln().toInt()

    val cInCup = coffee * input
    val wInCup = water * input
    val mInCup = milk * input
    val totWater = waterInmachine /water
    val totMilk = milkInMachine / milk
    val totCoffee = coffeeInmachine / coffee
    var totalCups = 0

   if (totCoffee < totMilk && totCoffee < totWater){
       totalCups = totCoffee
   } else if (totWater < totMilk && totWater < totCoffee){
       totalCups = totWater
   } else{
       totalCups = totMilk
   }



    if (totalCups > input) {
        val N = totalCups - input
        println("Yes, I can make that amount of coffee (and even $N more than that)")
    } else if (totalCups == input){
        println("Yes, I can make that amount of coffee")
    }else{
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
