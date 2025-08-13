/* public class Main {
    public static void main(String[] args) {
        System.out.println("Olá, mundo Java no Linux!");
    }
} */

import java.util.Scanner;
// O import é usado para o compilador localizar uma classe.

public class Principal{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.print(“Digite um numero: ”);
        num = input.nextInt();
        System.out.println(“Numero digitado: ” + num); 
        input.close();
    }
} 

/* Escreva um programa em Java que leia dois números
digitados pelo usuário. Em seguida, imprima os
números em ordem crescente */

public class Principal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2;

        System.out.print(“Digite um numero: ”);
        num1 = teclado.nextInt();
        System.out.print(“Digite outro numero: ”);
        num2 = teclado.nextInt();

        if (num1 < num2) {
            System.out.println(num1 + “ ” + num2);
        } else{
            System.out.println(num2 + “ ” + num1);
        }
        teclado.close();
    }
}

/* Escreva um programa em Java que imprima a tabuada
de multiplicação de um número inteiro no intervalo
[1,10]. */

public class Principal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num, cont, mult;

        System.out.print(“Digite um numero: ”);
        num = teclado.nextInt();

        cont = 1;
        while (cont <= 10){
            mult = num * cont;
            System.out.println(num+ “*”+cont+“=”+mult);
            cont++;
        }
        teclado.close();
    } 
}

/*Construa um programa em Java que leia um número
inteiro e diga se ele é par ou ímpar.

Faça um programa em Java que leia números inteiros
enquanto não for digitado o número -1, e calcule e
imprima a soma destes números

Faça um programa em Java que calcule e imprima a
soma dos 10 primeiros múltiplos de 3.*/