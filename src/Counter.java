public class Counter {
    private int count = 0;
    private int limit; //private通过getter查询，构造方法赋值
    Counter(int limit){
        this.limit = limit;
    }
    public int getLimit() {
        return limit;
    }
    public void increment(){ //要在Main类调用得public
        if(count < limit){
            count++;
        }else{
            System.out.println("到达上限");
        }

    }

    public int getCount() {
        return count;
    }
}
