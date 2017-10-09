fun main(args:Array<String>)
{

    println("enter the 1st no")
var a = readLine()
println("enter the 2nd no")
var b =readLine()
println("enter the 3rd no")
var c = readLine()

if(a!! > b!!)
{if(a!!>c!!)
{println("the greatest no is $a")}
else
println("the greatest no is $c")}
    else
{if(b!!>c!!)
{println("the greatest no is $b")}
else
println("the greatest no is $c")}
}