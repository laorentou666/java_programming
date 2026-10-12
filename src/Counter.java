public class Counter {
    private int count = 0;
    private int limit = 10; //private通过getter查询

    public int getLimit() {
        return limit;
    }
    public void increment(){ //要在Main类调用得public
        if(count < limit){
            count++;
            System.out.println(count);
        }else{
            System.out.println("到达上限");
        }

    }
}
