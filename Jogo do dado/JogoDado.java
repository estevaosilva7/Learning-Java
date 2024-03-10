import java.util.Scanner;

public class JogoDado {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] faceCount = new int[6]; 
    
        while (true) {
            System.out.print("Digite o número da face do dado (1-6): ");
            if (!scanner.hasNextInt()) {
                break;
            }

            int face = scanner.nextInt();

            if (face < 1 || face > 6) {
                System.out.println("Número inválido. Encerrando o programa.");
                break; 
            }

            faceCount[face - 1]++;

            for (int i = 0; i < 6; i++) {
                System.out.println("Face " + (i + 1) + ": " + faceCount[i]);
            }
        }

        scanner.close(); 
        System.out.println("Obrigado por jogar!");
    }
}
