/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mensajes_app;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class Inicio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int opcion = 0;
            
        do {
            System.out.println("*********************");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear mensajes");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Editar mensajes");
            System.out.println("4. Eliminar mensajes");
            System.out.println("5. Salir");
            //Leemos la opción del usuario
            opcion = sc.nextInt();
            
            switch(opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensajes();
                    break;
                case 3:
                    mensajesService.editarMensaje();
                    break;
                case 4:
                    mensajesService.borrarMensaje();
                    break;
                default:
                    break;
            }
        }while(opcion != 5);
    }
}
