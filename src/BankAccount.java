public class BankAccount {
    String owner;
    double balance;
    static int count;
    BankAccount(String owner,double balance){
        this.balance = balance;
        this.owner = owner;
        count++;
    }
    static boolean isValidAmount(double amount){
        if(amount > 0){
            return true;
        }else{
            return false;
        }
    }
    void transfer(BankAccount target,double amount) {
        if (this.balance >= amount) {
            if(isValidAmount(amount)){
                target.balance = target.balance + amount;
                this.balance = this.balance - amount;
                System.out.printf("转账成功，%s余额：%.2f,%s余额：%.2f\n",this.owner,this.balance,target.owner,target.balance);
            }else {
                System.out.println("金额无效");
            }

        }else{
            System.out.println("余额不足");
        }
    }
    //不用管接收方是谁，也不用管输入方是谁，
    // 方法内只要写通用框架，，main方法调用就行了，调用a.transfer就是a，参数内填b，target就是b
    // this指自己/点号前面，别的对象就指别人

    public static void main(String[] args){
        BankAccount a = new BankAccount("a",10);
        BankAccount b = new BankAccount("b",20);
        System.out.printf("%s余额：%.2f,%s余额：%.2f\n",a.owner,a.balance,b.owner,b.balance);
        a.transfer(b,5);
        a.transfer(b,-999);
        System.out.printf("开户数量：%d",count);
    }
}
