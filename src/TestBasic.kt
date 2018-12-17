/**
 * 基本语法的练习
 */


fun main(args: Array<String>) {
    //1.hello world
    helloWord()

    //2.方法定义
    printSum()

    //3.字符串模版
    strTemplate()
}

fun helloWord(){
    println("Hello World")
}

//带有两个 Int 参数、返回 Int 的函数：
fun sum(a:Int,b:Int):Int{
    return a+b
}
//表达式作为函数体 返回值类型自动推断
fun sum1(a:Int,b: Int) = a+b

//没有返回值的方法定义 Unit可忽略
fun printSum() :Unit{
    //var variable 可变变量定义
    //val value 不可变常量定义
    var a:Int
    var b:Int
    a = 1
    b = 2
    val sum = sum1(a,b)
    println(sum)
}

//字符串模版 $ 相当于java的%1$s %1$d %1$f
/*
1.字符串可以包含模板表达式 ，即一些小段代码，会求值并把结果合并到字符串中。 模板表达式以美元符（$）开头，由一个简单的名字构成:
2.用花括号括起来的任意表达式:
3.原始字符串与转义字符串内部都支持模板。 如果你需要在原始字符串中表示字面值 $ 字符（它不支持反斜杠转义），你可以用下列语法：
val price = """
${'$'}9.99
 */

fun strTemplate(){
    var java:String
    java = "java"
    val kotlin= "kotlin"
    val s1 = "I use $java"
    val content ="${s1.replace("use","used")},but not I use $kotlin"
    println(content)
}
