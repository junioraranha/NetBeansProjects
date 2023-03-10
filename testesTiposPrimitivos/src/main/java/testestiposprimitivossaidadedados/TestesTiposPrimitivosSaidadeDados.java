/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package testestiposprimitivossaidadedados;

import java.util.Scanner;

/**
 *
 * @author Junior
 */
public class TestesTiposPrimitivosSaidadeDados {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner input = new Scanner(System.in);
        int x = 55;
        int y = (int) 555;
        Integer z = new Integer (5555);
        float sal1 = 2560.56f;
        float sal2 = (float) 2560.56;
        Double sal3 = new Double(0);
        char letra1 = 'J';
        char letra2 = (char) 'J';
        Character letra3 = new Character ('J');
        boolean teste1 = true;
        boolean teste2 = (boolean) true;
        Boolean teste3 = new Boolean (true);
        
        
        System.out.println(letra1 + x);
        System.out.println(y);
        System.out.println(z);
        
        System.out.printf("o salario é %.2f \n", sal2);
        sal3 = input.nextDouble();
        System.out.format("o salario é %.6f \n", sal3);
        System.out.println(z);
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
