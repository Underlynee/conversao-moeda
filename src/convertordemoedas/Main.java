package convertordemoedas;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static void main(String[] args) throws IOException {

            Conversao conversao = new Conversao();
            Scanner escolha = new Scanner(System.in);
            int opcao = 0;
            double valorParaConverter = 0;
            double taxa = 0;
            double valorConvertido = 0;


            do {

            System.out.println("***********************************************");
            System.out.println("Olá! Qual a moeda que você deseja converter?");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar ==> Real Brasileiro");
            System.out.println("4) Real Brasileiro ==> Dólar");
            System.out.println("5) Peso Colombiano =>> Dólar");
            System.out.println("5) Dólar ==> Peso Colombiano");
            System.out.println("7) Sair");
            System.out.println("Escolha uma opção válida:");
            System.out.println("************************************************");

                opcao = escolha.nextInt();

                switch (opcao) {

                    case 1:
                        taxa = conversao.converterMoedas("USD","ARS");
                        System.out.println(taxa);
                        System.out.println("Qual valor você deseja converter?");
                        valorParaConverter = escolha.nextDouble();
                        valorConvertido = (valorParaConverter * conversao.converterMoedas("USD","ARS"));
                        System.out.println("Valor " + valorParaConverter + " [USD] corresponde ao valor de "
                                + valorConvertido + " [ARS]");
                        break;

                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:

                    default:
                        System.out.println(" Opção inválida! Tente novamente");
                        break;

                }

            } while (opcao != 7);
    }
}

