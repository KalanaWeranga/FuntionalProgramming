object q4 extends App{
    
    def normalFee(hours:Int)=hours*250

    def Ot(hours:Int)=hours*85

    def income(x:Int,y:Int)=normalFee(x)+Ot(y)

    def tax(a:Int)=a*0.12

    def takeHome(h1:Int,h2:Int)=income(h1,h2)-tax(income(h1,h2))

    println(takeHome(40,30));
    
        
    
}