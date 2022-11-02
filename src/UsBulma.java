import java.util.Scanner;
public class UsBulma {

    public static void main(String[] args) {
        int sayi;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        sayi = inp.nextInt();

        for (int i = 0;i < sayi; i++) {
            System.out.println("Dordun karesi "+ Math.pow(4,i));
        }
        for (int i = 0;i < sayi; i++) {
            System.out.println("Besin karesi "+ Math.pow(5,i));
        }

    }
}