/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica2;

/**
 *
 * @author Fernanda
 */
import java.util.Scanner;
public class Pratica2 {
    static Scanner input=new Scanner(System.in);
    public static void main(String args[]){
       
        System.out.println("soma(int a , int b): retorna a soma de a com b");
        int a=input.nextInt(); 
        int b=input.nextInt();
        System.out.println(Exe2.Soma(a, b));
        
        System.out.println("subtracao(int a, int b): retorna a diferença entre a e b");
        int num1=input.nextInt(); 
        int num2=input.nextInt();
        System.out.println(Exe2.Sub(num1, num2));
        
        System.out.println("multiplicacao(int a, int b): retorna a multiplicação de a por b");
        int mult1=input.nextInt(); 
        int mult2=input.nextInt();
        System.out.println(Exe2.Mult(mult1, mult2));
        
        System.out.println("potencia(int a, int b): retorna o valor de a elevado a b");
        int potencia1=input.nextInt(); 
        int potencia2=input.nextInt();
        System.out.println(Exe2.Potencia(potencia1, potencia2));
        
    }
}
