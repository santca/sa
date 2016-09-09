/**
 * Created by santca on 2016/9/9.
 */
public class java10 {
    public static void main(String[] args) {
        for(int i=1,j=1;i<=9;){
            System.out.print(j+"*"+i+"="+i*j);
            if (j==i){
                i++;
                j=1;
                System.out.println();
            }else{
                j++;
                System.out.print("\t");
            }
        }
    }
}
