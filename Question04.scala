object q4 extends App{

    def totalCoverPrice(a:Int):Double=a*24.95*0.60

    def shipFee(y:Int):Double= y match{
    case y if(y<=50) => 3*y
    case _ =>3*50+(0.75*(y-50))
    }

    def totalCost(x:Int):Double=totalCoverPrice(x)+shipFee(x)

    println(totalCost(60))
}