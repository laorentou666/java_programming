public class Stage7b {
    interface Chargeable{
        void charge();
    }
    static void chargeAll(Chargeable[] list){
        for(Chargeable l:list){
            l.charge();
        }
    }
    public static void main(String[] args){
        Chargeable[] list = {new Phone(),new ElectricCar()};
        chargeAll(list);
    }
}
class Phone implements Stage7b.Chargeable {
    @Override
    public void charge(){ //实现接口的方法必须public
        System.out.println("手机充电完成");
    }
}

class ElectricCar implements Stage7b.Chargeable {
    @Override
    public void charge(){
        System.out.println("电车充电完成");
    }
}