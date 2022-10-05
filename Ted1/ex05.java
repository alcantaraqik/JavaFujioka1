package Exercicios;

/* A prefeitura de João Pessoa abriu uma linha de crédito para os funcionários
municipais. O valor máximo da prestação não poderá ultrapassar 30% do salário
bruto. Fazer um algoritmo que permita entrar com o salário bruto e o valor da
prestação e informar se o empréstimo pode ou não ser concedido. (comando if) */

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        var salarioBruto= 0;
        var valorPrestacao = 0;
        var valorMaxPrest = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        salarioBruto = leitor.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Quanto você quer pagar por prestação? ");
        valorPrestacao = leitor2.nextInt();

        valorMaxPrest = (30 * salarioBruto) / 100;

        if (valorPrestacao < valorMaxPrest ){
            System.out.println("Emprestimo Aprovado!");
        } else {
            System.out.println("Emprestimo não Aprovado! ");
        }
    }
}
