fun main(){

    val name: String = "Joshua"
    val length = name.let {
        println("The length of the name is ${it.length}")
        it.length
    }

//    val person: String = ("Alice")
//    val age: Int = 30
//    val result = person.run{
//        println("Name: $person Age: $age")
//        age+5
//    }

    val person: String = ("Caleb")
    val age: Int = 35
    val result = person.run{
        println("Name: $person Age: $age")
        age+5
    }

}