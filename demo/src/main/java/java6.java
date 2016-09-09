/**
 * Created by santca on 2016/9/8.
 */
public class java6 {
    public  static void main(String[] args){
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int product1 = 1;
        int product2 = 1;
        int product3 = 1;
        int product4 = 1;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        double avg1 = 0;
        double avg2 = 0;
        double avg3 = 0;
        double avg4 = 0;


        for(int num1 = 0;num1 <= 10000;num1++){
            if(num1%2 == 0){
                sum3 = sum3 + num1;
                product3 = product3 * num1;
                count3++;
            }
            else{
                sum4 = sum4 + num1;
                product4 = product4 * num1;
                count4++;
            }
        }
        for(int num = 2;num <= 10000;num++){
            for(int k = 1;k <= num;k++){
                if((num%k==0)&&(num!=k)){
                    sum1 = sum1 + num;
                    product1 = product1 * num;
                    count1++;
                }
                else{
                    sum2 = sum2 + num;
                    product2 = product2 * num;
                    count2++;
                }
            }

        }
        System.out.println("质数之和sum1="+sum1);
        System.out.println("合数之和sum2="+sum2);
        System.out.println("质数之积 product1="+ product1);
        System.out.println("合数之积 product2="+ product2);
        avg1 = avg1+sum1/count1;
        avg2 = avg1+sum2/count2;
        System.out.println("质数平均值avg1="+avg1);
        System.out.println("合数平均值avg2="+avg2);
        System.out.println("*********************");
        System.out.println("偶数之和sum3="+sum3);
        System.out.println("奇数之和sum4="+sum4);
        System.out.println("偶数之积 product3="+ product3);
        System.out.println("奇数之积 product4="+ product4);
        avg3 = avg3+sum3/count3;
        avg4 = avg4+sum4/count4;
        System.out.println("偶数平均值avg3="+avg3);
        System.out.println("奇数平均值avg4="+avg4);
    }
}
