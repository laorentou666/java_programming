//查找list中连续1的最大值，类比歌曲最大连击数
import java.util.List;

public class MaxCombo {
    public static int combo(List<Integer> hits){
        int max_combo = 0;
        int current_combo = 0;
        for(int i:hits){
            if(i == 1){
                current_combo++;
                if(current_combo >max_combo){
                    max_combo = current_combo;
                }
            }else{
                current_combo = 0;
            }

        }
        return max_combo;
    }
    public static void main(String[] args){
        System.out.println(combo(List.of(1,1,1,1)));
        System.out.println(combo(List.of()));
        System.out.println(combo(List.of(0,0,0,0)));
        System.out.println(combo(List.of(1,0,1,1)));
    }
}
