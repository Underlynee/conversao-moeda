package convertordemoedas;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static void main(String[] args) throws IOException {

            Conversao conversao = new Conversao();
            Scanner escolha = new Scanner(System.in);
            String continuar = "S";
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

                        while (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("Sim")) {

                            taxa = conversao.converterMoedas("USD","ARS");
                            System.out.println("Qual valor você deseja converter?");
                            valorParaConverter = escolha.nextDouble();
                            valorConvertido = (valorParaConverter * taxa);
                            System.out.println("Valor " + valorParaConverter + " [USD] corresponde ao valor de "
                                    + valorConvertido + " [ARS]");

                            System.out.println("Deseja fazer outra conversão de USD para ARS? (S/N)");
                            continuar = escolha.next();
                        }
                        break;

                    case 2:

                        while (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("Sim")) {

                            taxa = conversao.converterMoedas("ARS","USD");
                            System.out.println("Qual valor você deseja converter?");
                            valorParaConverter = escolha.nextDouble();
                            valorConvertido = (valorParaConverter * taxa);
                            System.out.println("Valor " + valorParaConverter + " [ARS] corresponde ao valor de "
                                    + valorConvertido + " [USD]");

                            System.out.println("Deseja fazer outra conversão nesta moeda? (S/N)");
                            continuar = escolha.next();
                        }
                        break;
                    case 3:
                        while (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("Sim")) {

                            taxa = conversao.converterMoedas("USD", "BRL");
                            System.out.println("Qual valor você deseja converter?");
                            valorParaConverter = escolha.nextDouble();
                            valorConvertido = (valorParaConverter * taxa);
                            System.out.println("Valor " + valorParaConverter + " [USD] corresponde ao valor de "
                                    + valorConvertido + " [BRL]");

                            System.out.println("Deseja fazer outra conversão nesta moeda? (S/N)");
                            continuar = escolha.next();
                        }

                        break;
                    case 4:
                        while (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("Sim")) {

                            taxa = conversao.converterMoedas("BRL", "USD");
                            System.out.println("Qual valor você deseja converter?");
                            valorParaConverter = escolha.nextDouble();
                            valorConvertido = (valorParaConverter * taxa);
                            System.out.println("Valor " + valorParaConverter + " [BRL] corresponde ao valor de "
                                    + valorConvertido + " [USD]");

                            System.out.println("Deseja fazer outra conversão nesta moeda? (S/N)");
                            continuar = escolha.next();

                        }
                        break;
                    case 5:

                        while (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("Sim")) {

                            taxa = conversao.converterMoedas("COP", "USD");
                            System.out.println("Qual valor você deseja converter?");
                            valorParaConverter = escolha.nextDouble();
                            valorConvertido = (valorParaConverter * taxa);
                            System.out.println("Valor " + valorParaConverter + " [COP] corresponde ao valor de "
                                    + valorConvertido + " [USD]");

                            System.out.println("Deseja fazer outra conversão nesta moeda? (S/N)");
                            continuar = escolha.next();
                        }
                        break;
                    case 6:

                        while (continuar.equalsIgnoreCase("S") || continuar.equalsIgnoreCase("Sim")) {


                            taxa = conversao.converterMoedas("USD","COP");
                            System.out.println("Qual valor você deseja converter?");
                            valorParaConverter = escolha.nextDouble();
                            valorConvertido = (valorParaConverter * taxa);
                            System.out.println("Valor " + valorParaConverter + " [USD] corresponde ao valor de "
                                    + valorConvertido + " [COP]");

                            System.out.println("Deseja fazer outra conversão nesta moeda? (S/N)");
                            continuar = escolha.next();
                        }
                            break;

                        case 7:
                            System.out.println("Aplicativo finalizado! Obrigado por nos apoiar.");
                        break;

                    default:
                        System.out.println(" Opção inválida! Tente novamente");
                        break;

                }

            } while (opcao != 7);
    }
}

