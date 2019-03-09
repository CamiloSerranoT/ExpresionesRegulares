/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author CAMILO
 */
public class Controlador {
    
    public Controlador() {
        
    }

    //Metodo en donde establece los datos a manejar, y acciona el metodo de comprobacion
    public void validar(String entero,String real,String notCien,String binario, String email){
        Modelo modelo = new Modelo();
        modelo.setEntero(entero);
        modelo.setReal(real);
        modelo.setNotCien(notCien);
        modelo.setBinario(binario);
        modelo.setEmail(email);
        
        modelo.analizador();
    }
    
    //Cierre del Frame
    public void salir(){
        System.exit(0);
    }

}
