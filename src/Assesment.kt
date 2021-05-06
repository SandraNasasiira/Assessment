fun main() {
    introduction("sandra",20)
    Machine(3)
    Machine(6)
    Machine(17)
    println(arrayNames(arrayOf("sara","Tati","Sandra","holly","John")))
    var Paul=Human("Tatianah Miles",20,65.3)
    Paul.eat(56)
    println(Paul.weight)

    Paul.speak("Iam eating 121.3kg of food")
    Paul.birthday()
}
fun introduction(name:String,age:Int):String{
    return ("My name is $name and I am $age years old")
}
fun Machine(age:Int) {
    if (age < 6) {
        println("glass of milk")
    }
    else if(age>6 && age<15){
        println("fanta orange")
    }
    else{
        println("coca cola")
    }
}
fun arrayNames(arraynames:Array<String>):Int{
    var count=0;
    for (name in arraynames){
        if (name.length>4){
            count++;
        }
    }
    return count

}
class Human(var name: String,var age:Int,var weight: Double){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight+=foodWeight
    }
    fun speak(speech:String){
        println("$speech")
    }
    fun birthday(){
        age+=1
        println(age)
    }
}
