package switchcase;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int pernas = teclado.nextInt();
        String tipo;
        switch (pernas){
            
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 4:
                tipo = "quadrúpede";
                break;
            case 8:
                tipo = "aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.println(tipo);
    }
}