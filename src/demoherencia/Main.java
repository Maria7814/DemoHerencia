/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

import java.util.Scanner;

/**
 *
 * @author LUPITA
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
           
        System.out.println("Proporcione el numero de la cuenta.");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Proporcione el nombre del cliente.");
        String nombre = entrada.next();
        System.out.println("proporcione el apellido el cliente");
        String apellido = entrada.next();
        System.out.println("proporcione fechaDeNacimiento del cliente");
        String fechaDeNacimiento = entrada.next();
        System.out.println("proporcione direccion del cliente");
        String direccion = entrada.next();
        System.out.println("proporcione ocupacion del cliente ");
        String ocupacion = entrada.next();
        System.out.println("proporcione telefono del cliente");
        String telefono = entrada.next();
        System.out.println("proporcione email del cliente");
        String email = entrada.next();
        Cliente cliente= new Cliente (nombre,apellido);
        
        CuentaBancaria nuevaCuenta = 
                new CuentaBancaria(numeroDeCuenta,cliente);
        
            
        System.out.println("el nombre del cliente es " + nombre );
        System.out.println(" el  apellido del cliente es " + apellido );
        System.out.println("la fecha de nacimiento del cliente es" + fechaDeNacimiento  );
        System.out.println("la direccion el cliente es" + direccion);
        System.out.println(" la ocupacion del cliente es " + ocupacion );
        System.out.println("el telefono del cliente es" + telefono);
        System.out.println("el email el cliente es "+ email);
    }
    
}
