import bank.BankAccount;
import bank.SavingsAccount;
import counter.Counter;

class Main{
    public static void main(String[] args){
        Counter counter = new Counter(10);
        for(int i = 0;i<11;i++){
            counter.increment();
        }
        System.out.printf("当前计数：%d\n",counter.getCount());
        System.out.printf("当前Limit：%d\n",counter.getLimit());

        BankAccount a = new BankAccount("a",10);
        BankAccount b = new BankAccount("b",20);
        // BankAccount c = new BankAccount("c",-1);
        System.out.printf("%s余额：%.2f,%s余额：%.2f\n",a.getOwner(),a.getBalance(),b.getOwner(),b.getBalance());
        a.transfer(b,5);
        a.transfer(b,-999);
        System.out.printf("开户数量：%d\n", BankAccount.getCount());
        b.deposit(200);
        System.out.println("B余额" + b.getBalance());
        SavingsAccount s = new SavingsAccount("d",100,0.03);
        s.transfer(b,50);
        s.transfer(a,2000);
        s.addInterest();
        System.out.println(s.getBalance());
    }
}