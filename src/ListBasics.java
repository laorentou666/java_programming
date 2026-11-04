import java.util.ArrayList;
import java.util.List;

public class ListBasics {
    public static void main(String[] args){
        List<String> songs= new ArrayList<>();
        songs.add("cyber inductance");
        songs.add("life garden");
        songs.add("sendan life");
        System.out.println(songs);
        songs.set(1,"joker");
        songs.remove(2); //下标2
        System.out.println("是否包含joker：" + songs.contains("joker"));
        for(int i = 0;i < songs.size();i++){
            System.out.println(songs.get(i));
        }
        for(String s:songs){
            System.out.println(s);
        }
        System.out.println("arraylist长度" + songs.size());
    }
}
