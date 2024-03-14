package lambdas

fun main(args: Array <String>){
    println("Digite o primeiro número: ")
    val x = readLine()!!.toInt()

    println("Digite o segundo número: ")
    val y = readLine()!!.toInt()

    val resultado = multiplica(x,y)

    println("O resultado da multiplicação é = $resultado")
}
fun multiplica(x: Int, y:Int): Int{
    return x * y
}