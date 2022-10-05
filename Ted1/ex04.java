package Exercicios;

import java.util.Scanner;

/* Um motorista parou no posto de gasolina, comprou dois refrigerantes e abasteceu o
seu carro com gasolina. Leia a quantidade de litros de gasolina foram necessários
para abastecer o veículo e informe o valor total da conta desse cliente, sabendo-se
que cada refrigerante custou R$3,00 e o litro de gasolina está custando R$2,50.
(Estrutura Sequencial). */
public class ex04 {
    public static void main(String[] args) {
        int litrosGasolina = 0;

        Scanner leitor = new Scanner(System.in);
        System.out.println("quantos litros você colocou?" );
        litrosGasolina = leitor.nextInt();

        var valorGasolina = litrosGasolina * 2.5;
        var valorRefri = 6;

        var valorTotal = valorGasolina + valorRefri  ;

        System.out.println("O total a pagar é: R$" + valorTotal );
        
    }
}
