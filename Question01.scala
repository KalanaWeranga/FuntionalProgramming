object q1 extends App{

    def calculateInterest(x:Int)=x match{
        case x if(x>=20000) => x*0.02
        case x if(x>=200000)=> x*0.04
        case x if(x>=2000000) =>x*0.035
        case _ => x*0.065
    }

    println(calculateInterest(1000));
    println(calculateInterest(10000));
    println(calculateInterest(100000));
    println(calculateInterest(1000000));
}