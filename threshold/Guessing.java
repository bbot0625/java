package day04;
//猜数字小游戏
import java.util.Scanner;
public class Guessing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("猜吧!");
        int num = (int) (Math.random() * 1000 + 1);
        int guess;
        do{
            guess= scan.nextInt();
            if (guess > num) {
                System.out.println("猜大了");
            } else if(guess<num) {
                System.out.println("猜小了");
            }else{
                System.out.println("恭喜你猜对了");
            }
        }while(guess!=num);








        /*
        int guess = scan.nextInt();
        if (guess == 0) {
            System.out.println("游戏结束");
        } else {
            while (guess != num) {
                if (guess > num) {
                    System.out.println("猜大了");
                } else {
                    System.out.println("猜小了");
                }
                guess = scan.nextInt();

            }
            System.out.println("恭喜你猜对了");
        }

         */

    }
}
