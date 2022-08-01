object  q2 extends App{


    def PatternMatching(x:Int)=x match{
        case x if(x<0)=>println("Negative number")
        case x if(x==0)=>println("Zero")
        case x if(x%2==0)=>println("Even number")
        case _ => println("Odd number")
    }

    var y:Int=scala.io.StdIn.readInt();
    PatternMatching(y)
}