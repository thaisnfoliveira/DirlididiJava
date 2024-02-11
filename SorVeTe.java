/**
 * Laboratório de Programação 2
 *
 * Thais Nicole Freitas de Oliveira - 123110142
 */

import java.util.Scanner;

public class SorVeTe{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int posInicial1 = sc.nextInt();
        int velocidade1 = sc.nextInt();
        int posInicial2 = sc.nextInt();
        int velocidade2 = sc.nextInt();
        int tempo = sc.nextInt();

        int distFinal1 = posInicial1 + velocidade1*tempo;
        int distFinal2 = posInicial2 + velocidade2*tempo;

        int maior;
        int menor;

        if (distFinal1>distFinal2){
            maior = distFinal1;
            menor = distFinal2;
        } else{
            maior = distFinal2;
            menor = distFinal1;
        }
        System.out.println(maior - menor);
    }
}