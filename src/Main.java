class Main{
    public static void main(String[] args){
        Counter counter = new Counter(10);
        for(int i = 0;i<11;i++){
            counter.increment();
        }
        System.out.printf("当前计数：%d\n",counter.getCount());
        System.out.printf("当前Limit：%d\n",counter.getLimit());
    }
}