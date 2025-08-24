import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//        String nsg ="Programando em: ";
//       System.out.println(nsg + args[0]);
//       System.out.println("Precisamos de uma: " + args[1]);
//    }


    public static void main(String[] args) {

        //---------- if Else e Else if -----------

//        var scanner = new Scanner(System.in);
//        System.out.println("Informe seu nome: ");
//        var name = scanner.next();
//        System.out.println("Informe sua idade:");
//        var age = scanner.nextInt();
//        System.out.println("voce e emancipado? (s/n");
//        var isEmancipated = scanner.next().equalsIgnoreCase("s");
//
//        if (age >= 18) {
//            System.out.printf("%s, voce tem %s e voce pode dirigir \n", name, age);
//
//        }else if(age >=16 && isEmancipated){
//            System.out.printf("%s, apesar de voce ter %s anos, voce eh emancipado e pode dirirgir\n", name, age);
//        }else{
//            System.out.printf("%s, voce nao pode dirigir \n", name);
//        }


        //--------- SWITCH CASE --------------

//        var scanner = new Scanner(System.in);
//        System.out.println("Informe um numero de 1 a 7: ");
//        var option = scanner.nextInt();
//        switch(option){
//            case 1:
//                System.out.println("Sabado");
//                break;
//            case 2:
//                System.out.println("Domingo");
//                break;
//            case 3:
//                System.out.println("Segunda");
//                break;
//            case 4:
//                System.out.println("Terça");
//                break;
//            case 5:
//                System.out.println("Quarta");
//                break;
//            case 6:
//                System.out.println("Quinta");
//                break;
//            case 7:
//                System.out.println("Sexta");
//                break;
//            default:
//                System.out.println("opçao invalida");
//        }


        //-------- LAÇO FOR ------------------

//        var scanner = new Scanner(System.in);
//        for (var i = 1; i <= 100; i++) {
//            System.out.println(i);
//
//
//
//        }

        // ------- while e do while----------

        var scanner = new Scanner(System.in);
        var name = "";
//        while(true){
//            System.out.println("Informe um nome: ");
//            System.out.println(name);
//
//            if (name.equalsIgnoreCase("exit"))break;
//        }

        do{
            System.out.println("Informe um nome: ");
            name = "";
            System.out.println(name);

           if (!name.equalsIgnoreCase("exit"))break;

        }while(true);
        }

    }




