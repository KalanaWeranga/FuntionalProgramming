object q3 extends App{
    val x=new Account("200026400177",30006784,200000.00)
    val y=new Account("99230094V",30006785,200000.00)
    println("Before Transfering:")
    println("NIC NO:"+x.Nic)
    println("ACC No:"+x.accountNumber)
    println("Balance:"+x.balance)
    println()
    println("NIC NO:"+y.Nic)
    println("ACC No:"+y.accountNumber)
    println("Balance:"+y.balance)
    println()
    x.transfer(y,200.00)
    println("After Transfering:")
    println("NIC NO:"+x.Nic)
    println("ACC No:"+x.accountNumber)
    println("Balance:"+x.balance)
    println()
    println("NIC NO:"+y.Nic)
    println("ACC No:"+y.accountNumber)
    println("Balance:"+y.balance)



}

class Account(id:String,n:Int,b:Double){

    val Nic:String=id
    val accountNumber=n
    var balance:Double=b

    def transfer(a:Account,c:Double)={
        this.balance=this.balance-c
        a.balance=a.balance+c
    }
}