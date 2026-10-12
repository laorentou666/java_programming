class Main{
    public static void main(String[] args){
        Counter counter = new Counter();
        for(int i = 0;i<11;i++){
            counter.increment();
        }
        System.out.printf("当前Limit：%d",counter.getLimit());
    }
}