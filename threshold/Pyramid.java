package day06;

public class Pyramid {
    public static void main(String[] args) {
        //金字塔2.0
        for(int i=1; i<=6; i++){
            for(int j=6; j<=4+i; j++){
                System.out.print(" ");
            }
            for(int k=11; k>=2*i-1; k--){
                System.out.print("*");
            }
            System.out.println();
        }
        /*
        //金字塔
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

         */
    }
}
