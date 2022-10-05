package Exercicios;

/* 2. Faça um programa que leia 10 números inteiros e exiba na tela a mensagem ‘Par’
se ele for um número par, ou ‘Ímpar’ se ele for um número ímpar. (Comando if). */

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
      var contador = 0;
      while (contador <10) {
          Scanner leitor = new Scanner(System.in);
          System.out.println("digite um valor:");
          var numero = leitor.nextInt();
          contador++;
          if (numero % 2 == 0) {
              System.out.println("este numero é par!");
          } else {
              System.out.println("Este número é impar!");
          }
      }
    }
}
