/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;
import java.util.*;
/**
 *Este programa sirve para sacar el factorial de un número
 * @author JorgeRicardo
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int num,fact;/*dos variables una es la que ingresa el usuario y
                   la otra para almacenar el factorial de ese número*/
    num=pedirNum();
    fact=operaFact(num);//metodo para sacar el factorial
    mostrarFact(num,fact);
    }
    
    public static int pedirNum() {
    int num;
    Scanner teclado=new Scanner(System.in); 
    System.out.println("Escribir numero al que se le quiere sacar el factorial: ");
    num=teclado.nextInt();
    return num;
    }
    
    public static int operaFact(int num){
    int f=1;//inicia en uno para que se pueda multiplicar 
    if (num!=0) {/*como el factorial de 0 es 0 pero no aplicaria en 
                  el while puse esta condición para atrapar esa excepción*/
    while(num>1){//cuando el numero llege a 1 se  tambien se puede poner 0
    f= num*f;//aqui cada vez que num se reste se multiplica y se va acumulando
    num--;}
    return f;//f es el factorial
    }
    return f=0;//factorial de 0 es 0
    }
    
            
    public static void mostrarFact(int num, int fact){
        //aqui se despliega el factorial
        System.out.println("El factorial de "+num+" es "+fact);   
    
    }
}
