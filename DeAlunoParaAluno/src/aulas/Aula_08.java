package aulas;

import java.util.Scanner;


public class Aula_08 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double base, altura, areaRetangulo;
        
        System.out.println("Informe o valor da base: ");
        base = input.nextDouble();
        
        System.out.println("Informe o valor da altura: ");
        altura = input.nextDouble();
        
        areaRetangulo = base * altura;
        
        System.out.println("A area de um retangulo de base "+ base +" e altura "+ altura +" é "+ areaRetangulo);
    }
    
}
