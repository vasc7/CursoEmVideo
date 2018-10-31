/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author vasco
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        Random r = new Random();
        int vetor[] = new int[6];

        for (int j = 0; j < vetor.length; j++) {
            n = r.nextInt(60) + 1;

            for (int x = 0; x < vetor.length; x++) {
                if (n == vetor[x] && x != j) {
                    n = r.nextInt(60) + 1;
                } else {
                    vetor[j] = n;

                }
            }
        }
        for (int k = 0; k <= 5; k++) {
            System.out.println(vetor[k]);
        }
    }

}

//        char c = 'c';
//        int i = 10;
//        double d = 10;
//        long l = 1;
//        String s = "Hello";
//        
//        i+=l;
//        s+=i;
//        i+=s;
//        c = c+i;
//        c+=s;
//        
//        Scanner teclado = new Scanner(System.in);
//        double a;
//        double b;
//        double c;
//        double delta;
//        double x1;
//        double x2;
//        System.out.println("Valor de A: ");
//        a = teclado.nextDouble();
//        System.out.println("Valor de B: ");
//        b = teclado.nextDouble();
//        System.out.println("Valor de C: ");
//        c = teclado.nextDouble();
//        delta = Math.pow(b,2) - (4 * a * c);
//        Scanner teclado = new Scanner(System.in);
//        System.out.println("Digite o nome: ");
//        String nome = teclado.nextLine();
//        System.out.println("Digite a nota: ");
//        float nota = teclado.nextFloat();
//        System.out.format("A nota de %s é %.1f\n", nome, nota);
//int idade = 30;
//String conversao = Integer.toString(idade);
//String valor = "30";
//int idade = Integer.parseInt(valor);
//        System.out.println(idade);
//int num1 = 8;
//int num2 = 8 + num1++;
//        System.out.println(num2);
//        System.out.println(num1);
//    int x = 4;
//    x += 2; //x = x + 2
//        System.out.println(x);
//float v = 9.9f;
//int ar = (int) Math.round(v);
//        System.out.println(ar);
//double al = Math.random();
//        int n = (int) (1 + al * 60 - 1);
//        System.out.println(n);
//        int n1 = 2;
//        int n2 = 5;
//        
//        double resultado = (double) n2/n1;
//        System.out.println(resultado);
//    int n1 = 10;
//    int n2 =11;
//    int r = n1>n2? n1-2:n2/2;
//        System.out.println(r +"   "+ r%2);
//    String n1 = "Rafael";
//    String n2 = "Rafael";
//    String n3 = new String("Rafael");
//    String res = n1.equals(n3)?"sim":"nao";
//        System.out.println(res);
//int x = 4;
//int y = 6;
//int z = 12;
//boolean r;
//
//r = x>y ^ y<z?true:false;
//        System.out.println(r);
//        double n = Math.random();
//        double n1 = Math.random();
//        double n2 = Math.random();
//        double n3 = Math.random();
//        double n4 = Math.random();
//        double n5 = Math.random();
//        int al = (int) (2 + n * 60 - 1);
//        int al1 = (int) (2 + n1 * 60 - 1);
//        int al2 = (int) (2 + n2 * 60 - 1);
//        int al3 = (int) (2 + n3 * 60 - 1);
//        int al4 = (int) (2 + n4 * 60 - 1);
//        int al5 = (int) (2 + n5 * 60 - 1);
//        
//        for(int c=1;c<=1;c++){
//            if()
//            System.out.println(al);
//            System.out.println(al1);
//            System.out.println(al2);
//            System.out.println(al3);
//            System.out.println(al4);
//            System.out.println(al5);
//        }
//        System.out.println(al);
//        System.out.println(al1);
//        System.out.println(al2);
//        System.out.println(al3);
//        System.out.println(al4);
//        System.out.println(al5);
