/**
 * Created by santca on 2016/9/9.
 */
import java.util.Scanner;
public class java7 {
    public static void main(String[] args) {

        System.out.print("请输入一个值：");
        int num = new Scanner(System.in).nextInt();
        System.out.println("根据这个值可以得到以下加法表：");
        for(int i = 0;i <= num;i++){
            int j;
            j = num - i;
            System.out.println(i+"+"+j+"="+num);
        }

    }
}
