fun main() {
    isEven(2)
    isEven(7)
    isEven(9)
    var n=campus("kenyatta")
    println(n[0])
    println(n[2])
    println(n[3])
    println(n[4])
    var p=product("casava",60,300,"grocories")
    println(p.commondity("grocories"))
    var g=student(arrayOf("jana","fay","mercy","felix"))
    println(g)




}fun isEven(num:Int):Boolean{
    if (num%2==0){
        return true
    }
    else{
        return false
    }

}
fun campus(name:String):String {
    var n = name
    return n




    data class product(var name: String, val weight: Int, val price: Int, val category: String) {
        fun commondity(category: String) {
            when (category) {
                "grocories" -> println("I like  casava")
                "hygiene" -> println("I love tidy home")
                else -> println("Am praying")
            }


        }
    }
}
fun student(names:Array<String>):String{
    return names}
fun students(names:Array<String>):Int{
    var best=0
    for (students in names)
        if (students.length<=4){
            best+=1
        }
    return best
}







