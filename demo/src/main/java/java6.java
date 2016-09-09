/**
 * Created by santca on 2016/9/8.
 */
public class java6 {
    public  static void main(String[] args){
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 1;
        int sum4 = 1;
        for(int num = 2;num <= 10000;num++){
            for(int k = 1;k <= num;k++){
                if((num%k==0)&&(num!=k)){
                    sum1 = sum1 + num;
                    sum3 = sum3 * num;
                }
                else{
                    sum2 = sum2 + num;
                    sum4 = sum4 * num;
                }
            }
        }
        System.out.println("质数之和sum1="+sum1);
        System.out.println("合数之和sum2="+sum2);
        System.out.println("质数之积sum3="+sum3);
        System.out.println("合数之积sum4="+sum4);
    }
}
