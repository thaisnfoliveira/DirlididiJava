/**
 * Laboratório de Programação 2 - Lab 1
 *
 * Thais Nicole Freitas de Oliveira - 123110142
 */

import java.util.Scanner;

public class MaioreMenor{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String p1 = sc.nextLine();
        String p2 = sc.nextLine();

        String maior;
        String menor;

        if (p1.length() == p2.length()) {
            maior = menor = p1;
        } else {
            if (p1.length() > p2.length()) {
                maior = p1;
                menor = p2;
            } else {
                menor = p1;
                maior = p2;
            }
        }
        System.out.println(menor);
        System.out.println(maior);
    }
}