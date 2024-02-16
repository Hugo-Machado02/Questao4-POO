/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.questao4;

import java.util.Scanner;
/**
 *
 * @author Hugo
 */
public class Questao4 {

    public static void main(String[] args) {
        String numeros, num_formatado;
        int soma=0;
        String[] val_array;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o núemro do cartão - Ex:(#### #### #### ####): ");
        numeros = scan.nextLine();
        
        num_formatado = numeros.trim();
        num_formatado = num_formatado.replaceAll("\\s+", "");
        
        val_array = num_formatado.split("");
        
        int[] num_array = new int[val_array.length];
        
        for(int i=0; i < val_array.length; i++){
           num_array[i] = Integer.parseInt(val_array[i]);
        }
        
        for(int i=0; i < num_array.length; i+=2){
           num_array[i] *= 2;
           if(num_array[i] > 9){
               num_array[i] -= 9;
           }
        }
        for(int i : num_array){
            soma += i;
        }
        
        System.out.println();
        if (soma % 10 == 0) {
            System.out.println("O número ("+numeros+") é Válido!");
        } else {
            System.out.println("O número ("+numeros+") não é Válido!!");
        }
    }
}
