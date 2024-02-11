/**
 * Laboratório de Programação 2
 *
 * Thais Nicole Freitas de Oliveira - 123110142
 */

import java.util.Scanner;

public class RepresentacaoCores{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int pix1 = sc.nextInt();
        int pix2 = sc.nextInt();
        int pix3 = sc.nextInt();

        if (pix1<128 || pix2<128 || pix3<128){
            System.out.println("PRETO");
        } else if (pix1>= 128 && pix2>=128 && pix3>=128){
            System.out.println("BRANCO");
        }
    }
}