package br.com;

import java.time.OffsetDateTime;
import java.util.Scanner;

public class teste { // Nomes de classes em Java seguem PascalCase
    public static void main(String[] args) { // Método main correto


        //----------- TRABALHANDO KEYWORDS ---------------

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Olá, informe o seu nome:");
//        String nome = scanner.next();
//
//        System.out.println("Informe sua idade:");
//        int idade = scanner.nextInt();
//
//        System.out.println("Olá " + nome + ", sua idade é " + idade + " anos.");

//        var scanner = new Scanner(System.in);
//        System.out.println("Quanto eh 2 + 2");
//        var result = scanner.nextInt();
//        var isRight = result == 4;
//        System.out.println("Voce acertou? "isRight);


        //------- TRABALHANDO OPERADORES DE ATRIBUIÇÃO ---------

//        var scanner = new Scanner(System.in);
//        System.out.println("Quantos anos voce tem?");
//        var age = scanner.nextInt();
//        System.out.println("Voce eh emancipada?");
//        var isEmancipated = scanner.nextBoolean();
//        var canDrive = age >= 18 || isEmancipated && age >=16;
//        System.out.printf("voce pode dirigir? (%s)", canDrive);

        //--------- TRABALHANDO OPERADORES ARITIMETICOS -------

//        var scanner = new Scanner(System.in);
//        System.out.println("Informe um numero");
//        var value1 = scanner.nextInt();
//        System.out.println("Informe o segundo numero:");
//        var value2 = scanner.nextInt();
//        System.out.printf("%s * %s = %s \n", value1, value2, value1 * value2);


//        var scanner = new Scanner(System.in);
//        System.out.println("Informe um numero:");
//        var value1 = scanner.nextInt();
//        System.out.printf("A raiz quadrada de %s eh %s\n", value1, Math.sqrt(value1));

        // -------- EXERCICIOS -----------

        // Receber o nome e o ano de nascimento de alguem e imprimir "ola *nome, voce tem x anos"

        Scanner scanner = new Scanner(System.in);
        var baseYear = OffsetDateTime.now().getYear();
        System.out.println("Olá, informe o seu nome:");
        String nome = scanner.next();
        System.out.println("Informe seu ano de nascimento:");
        var year = scanner.nextInt();
        var age = baseYear - year;

        System.out.printf("Ola %s, voce tem %s anos\n", nome, age);


    }

}


