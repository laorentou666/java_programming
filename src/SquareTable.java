public class SquareTable {
    static int[] squares = new int[10];
    static{
        for(int i = 1;i<= 10;i++){
            squares[i-1] = i * i;
        }
    }
    static int get(int n){

        if(n > 10 || n < 1){
            return -1;
        }else{
            return squares[n-1];
        }

    }
    public static void main(String[] args){
        System.out.println(get(3));
        System.out.println(get(11));

    }
}
