import scala.compiletime.ops.double
object q4 extends App{
    var acc1=new Account("111001v",100010,-1000.00);
    var acc2=new Account("111002v",100011,1478.56);
    var acc3=new Account("111003v",100012,-145.23);
    var acc4=new Account("111004v",100013,74582.12);
    var acc5=new Account("111005v",100014,-1500.00);

    var bankacc:List[Account] = List(acc1,acc2,acc3,acc4,acc5)

    println("Negative balance account numbers : ");
    val overdraft = (b:List[Account]) => b.filter(x=>x.balance < 0)
    var overdraft_list = overdraft(bankacc)
    overdraft_list.foreach(x=>println("["+x.accnumber+":"+x.balance+"]"))

    val sum = (b:List[Account]) => b.reduce((x,y)=>new Account("null",111111,x.balance+y.balance))
    var sum_of_balance = sum(bankacc)
    println( "Sum of accounts balance : "+sum_of_balance.balance)

    println("Account balances with interest : ")
    val interest = (b:List[Account]) => b.map(x=>new Account(x.nic,x.accnumber,(if(x.balance>=0) x.balance*1.05d else x.balance*1.10d)))
    var interest_list = interest(bankacc)
    interest_list.foreach(x=>println("["+x.accnumber+":"+x.balance+"]"))


}

class Account(s:String,n:Int,d:Double){

    val nic=s
    val accnumber=n
    var balance=d

    def withdraw(x:Double)={this.balance=this.balance-x}

    def deposit(x:Double)={this.balance=this.balance+x}

    def transfer(r:Account,x:Double)={
        this.withdraw(x)
        r.deposit(x)
    }
    override def toString = "["+nic+":"+accnumber+":"+balance+"]"
}