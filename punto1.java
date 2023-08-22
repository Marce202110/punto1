import java.util.Scanner;
public class punto1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[2];

        System.out.print("Ingrese la primera posicion de la serie: ");
        valores[0] = scanner.nextInt();
        System.out.print("Ingrese la segunda posicion de la serie: ");
        valores[1] = scanner.nextInt();
        
        int[] arrayvalores = valores;
        int n =  Math.max(valores[0],valores[1]); 
        System.out.println(" " + arrayvalores[0]);
        System.out.println(" " + arrayvalores[1]);
        
        for (int i = 3; i <= n; i++) {
            if (i % 2 == 1) { // Posiciones impares
                valores[0] += 1;
        
                System.out.println(" " + valores[0]);
            } else { // Posiciones pares
                valores[1] -= 2;
                System.out.println(" " + valores[1]);
            }
        }
        
         }
       
}

