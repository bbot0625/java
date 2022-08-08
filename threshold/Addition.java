package day05;
//随机加法运算器
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("算吧(输入-1提前结束)");
        int score=0;
        for(int i=1; i<=10; i++){
            int a=(int)(Math.random()*100+1);//1）出题
            int b=(int)(Math.random()*100+1);
            int result=a+b;
            System.out.println("("+i+")"+a+"+"+b);
            int answer=scan.nextInt();//2）答题
            if(answer==-1){
                break;
            }
            if(answer==result){//3）判题
                System.out.println("算对了");
                score+=10;
            }else{
                System.out.println("答错了");
            }
        }
        System.out.println("总分为："+score);
    }
}
