object q4b extends App{

    def attendence(price:Int)=120+((15-price)/5)*20

    def cost(price:Int)=500+3*attendence(price)

    def income(price:Int)=price*attendence(price)

    def profit(price:Int)=income(price)-cost(price)

    println(profit(15))
   

}