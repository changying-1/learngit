package Test2;

import java.util.Scanner;

public class Test_2 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("请输入数组长度：");
        int n = in.nextInt();
        int test1[] = new int[n];
        System.out.println("请依次输入该数组：");
        for(int i = 0; i < n;i++){
            test1[i]=in.nextInt();
        }
        MSA msa = new MSA();
        msa.Calc(test1,n);
        System.out.println("该数组的最大子数组信息如下：");
        System.out.println("起点位置为："+msa.getStart());
        System.out.println("结束位置为："+msa.getEnd());
        System.out.println("最大和为："+msa.getSum());

    }


}
