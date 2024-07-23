import java.util.Scanner;

public class Eneagrama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resposta1, resposta2, resposta3, resposta4, resposta5, resposta6;

        System.out.println("***** ENEAGRAMA ***** \n");
        System.out.println("Solucionador de Problemas\n");
        System.out.println("A Bagaça Funciona?");
        resposta1 = sc.nextLine();

        if (resposta1.equalsIgnoreCase("sim")) { // Condição SIM para a primeira pergunta
            System.out.println("Nem rele nisso...");
            System.out.println("***** SEM PROBLEMAS *****");
            System.out.println("Fim do programa...");
        } else { // Condição NÃO para a Primeira pergunta
            System.out.println("Você quem fudeu com o treco?");
            resposta2 = sc.nextLine();

            if (resposta2.equalsIgnoreCase("sim")) { // Condição SIM para a segunda pergunta
                System.out.println("Seu imbecil...");
                System.out.println("Alguém sabe que foi você?");
                resposta3 = sc.nextLine();

                if (resposta3.equalsIgnoreCase("sim")) { // Condição SIM para a terceira pergunta
                    System.out.println("Se fudeu...");
                    System.out.println("Dá pra jogar a culpa em alguém?");
                    resposta4 = sc.nextLine();

                    if (resposta4.equalsIgnoreCase("sim")) { // Condição SIM para a quarta pergunta
                        System.out.println("***** SEM PROBLEMAS *****");
                    } else {
                        System.out.println("Se fudeu...");
                    }
                } else { // Condição NÃO para a terceira pergunta
                    System.out.println("Esconda \n***** SEM PROBLEMAS *****");
                }
            } else { // Condição NÃO para a segunda pergunta
                System.out.println("Alguém pode te culpar?");
                resposta5 = sc.nextLine();

                if (resposta5.equalsIgnoreCase("nao")) { // Condição NÃO para a quinta pergunta
                    System.out.println("Então foda-se");
                    System.out.println("***** SEM PROBLEMAS *****");
                } else { // Condição SIM para a quinta pergunta
                    System.out.println("Se fudeu...");
                    System.out.println("Dá pra jogar a culpa em alguém?");
                    resposta6 = sc.nextLine();

                    if (resposta6.equalsIgnoreCase("sim")) { // Condição SIM para a sexta pergunta
                        System.out.println("***** SEM PROBLEMAS *****");
                    } else {
                        System.out.println("Se fudeu...");
                    }
                }
            }
        }
        sc.close();
    }
}
