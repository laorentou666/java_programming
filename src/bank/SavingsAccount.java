package bank;

public class SavingsAccount extends BankAccount {
    private double rate; //统一小数
    public SavingsAccount(String owner, double balance, double rate){
        super(owner,balance);
        this.rate = rate;
    }
    public void addInterest(){
        super.deposit(super.getBalance() * rate);
    }
    @Override
    public void transfer(BankAccount target, double amount){
        if(amount > 1000){
            System.out.println("单笔转账金额不得超过1k");
        }else{
            super.transfer(target,amount); //直接调用父类方法，不用重写
        }
    }
}

//子类相当于一个新东西，但继承了父类的方法等，子类只要写差异，父类的非private变量可以直接拿来用
