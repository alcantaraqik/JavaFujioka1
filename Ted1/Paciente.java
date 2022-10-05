package Exercicios;
/* Leia uma relação de pacientes de uma clínica, cada um com o nome, o
sexo, o peso, a idade e a altura. Para sinalizar o fim da lista será fornecido
“fim” no nome do último paciente.
Exiba um relatório contendo:
• a quantidade de pacientes.
• a média de idade dos homens.
• a quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima
de 70kg.
• a quantidade de pessoas com idade entre 18 e 25.
• o nome do paciente mais velho.
• o nome da mulher mais baixa. */

import java.lang.reflect.Array;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Paciente{
    String nome;

    char sexo;

    int idade;

    double peso;
    double altura;

    public Paciente(String _nome, char _sexo, double _peso, int _idade, double _altura){
        nome = _nome;
        sexo = _sexo;
        peso = _peso;
        idade = _idade;
        altura = _altura;
    }

    public static int media_idade_homens(List<Paciente> pacientes){
        int media = 0;
        int quantidade = 0;

        for(Paciente homens : pacientes){
            if(homens.sexo == 'm'){
                quantidade++;
                media += homens.idade;
            }
        }
        return (media / quantidade);
    }

    public static int quantidade_mulheres_altura_peso(List<Paciente> pacientes){
        int quantidade = 0;

        for(Paciente mulheres : pacientes){
            if(mulheres.sexo == 'f'){
                if((mulheres.altura >= 1.60 && mulheres.altura <= 1.70) && mulheres.peso > 70){
                    quantidade++;
                }
            }
        }
        return quantidade;
    }

    public static int pessoas_idade_entre_18_25(List<Paciente> pacientes){
        int quantidade = 0;

        for(Paciente pessoa : pacientes){
            if(pessoa.idade >= 18 && pessoa.idade <= 25){
                quantidade++;
            }
        }
        return quantidade;
    }

    public static String paciente_mais_velho(List<Paciente> pacientes){
        Paciente anciao = new Paciente("", 'm', 0, 0, 0);


        for(Paciente pessoa : pacientes){
            if(anciao.idade < pessoa.idade){
                anciao = pessoa;
            }
        }
        return anciao.nome;
    }

    public static String mulher_mais_baixa(List<Paciente> pacientes){
        Paciente baixinha = new Paciente("", 'f', 0, 0, 2.00);

        for(Paciente pessoa : pacientes){
            if(pessoa.sexo == 'f'){
                if(pessoa.altura < baixinha.altura){
                    baixinha = pessoa;
                }
            }
        }
        return baixinha.nome;
    }


    public static void main(String[] args){
        /* Cria uma lista de pacientes */
        List<Paciente> pacientes = new ArrayList<Paciente>();

        /* adiciona pacientes na lista */
        /* NOME, SEXO, PESO, IDADE, ALTURA */
        pacientes.add( new Paciente("José Souza", 'm', 100.8, 45, 1.90) );
        pacientes.add( new Paciente("Maria Gomes", 'f', 80, 30, 1.65) );
        pacientes.add( new Paciente("Oswaldo Souza", 'm', 90, 30, 1.70) );
        pacientes.add( new Paciente("Joana Souza", 'f', 50, 20, 1.67) );
        pacientes.add( new Paciente("Beatriz Gomes", 'f', 60, 30, 1.55) );
        pacientes.add( new Paciente("Tarcizo Souza", 'm', 95, 59, 1.85) );

        /* Quantidade de pacientes */
        System.out.println("Quantidade de pacientes = " + pacientes.size());

        /* Media de idade dos homens */
        System.out.println("A media de idade dos homens = " + media_idade_homens(pacientes));

        /* Quantidade de mulheres com altura entre 1.60 e 1.70 e peso maior que 70Kg */
        System.out.println("A quantidade de mulheres com altura entre 1.60 e 1.70 e peso maior que 70Kg = " + quantidade_mulheres_altura_peso(pacientes));

        /* Quantidade de pessoas com idade entre 18 e 25 */
        System.out.println("A quantidade de pessoas com idade entre 18 e 25 = " + pessoas_idade_entre_18_25(pacientes));

        /* Nome do paciente mais velho */
        System.out.println("O nome do paciente mais velho = " + paciente_mais_velho(pacientes));

        /* Nome da mulher mais baixa */
        System.out.println("O nome da mulher mais baixa = " + mulher_mais_baixa(pacientes));

    }

}