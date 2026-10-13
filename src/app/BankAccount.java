package app;

public class BankAccount {
    private String owner;
    private double balance;
    private static int count;
    public BankAccount(String owner,double balance){
        if(isValidAmount(balance) || balance == 0){
            this.balance = balance;
            this.owner = owner;
            count++;
        }else{
            System.out.println("余额无效");
        }

    }
    private static boolean isValidAmount(double amount){
        if(amount > 0){
            return true;
        }else{
            return false;
        }
    }
    public void transfer(BankAccount target, double amount) {
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
    public String getOwner(){
        return this.owner;
    }
    public double getBalance(){
        return balance;
    }
    public static int getCount(){
        return count;
    }
    public void deposit(double amount){
        if(isValidAmount(amount)){
            this.balance = this.balance + amount;
            System.out.println("存款成功");
        }else{
            System.out.println("金额无效");
        }
    }
    //不用管接收方是谁，也不用管输入方是谁，
    // 方法内只要写通用框架，，main方法调用就行了，调用a.transfer就是a，参数内填b，target就是b
    // this指自己/点号前面，别的对象就指别人

}
