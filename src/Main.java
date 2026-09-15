import java.util.Scanner;

public class Main {
    public static void showMenu(){
        System.out.println("1.添加图书");
        System.out.println("2.删除图书");
        System.out.println("3.查询图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出");
        System.out.print("请输入\n");
    }
    public static void main(String[] args) {
        while(true){
            showMenu();
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt(); //这里相当于scanf
            switch (input){
                case 1:
                    System.out.println("添加图书有关代码");
                    break;
                case 2:
                    System.out.println("删除图书有关代码");
                    break;
                case 3:
                    System.out.println("查询图书有关代码");
                    break;
                case 4:
                    System.out.println("所有图书");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    sc.close();
                    return;
            }
        }

    }
}