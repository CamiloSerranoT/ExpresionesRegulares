/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.regex.*;
import javax.swing.JOptionPane;

/**
 *
 * @author CAMILO
 */
public class Modelo {

    private String entero;
    private String real;
    private String notCien;
    private String binario;
    private String email;
    private int lugarArreglo;
    static String funEntero = "(\\+|-)?[0-9]+";
    static String funReal = "(((\\+|-)?[0-9]+|e+|pi)|(((\\+|-)?[0-9]+|e+|pi)(/|.))((\\+|-)?[0-9]+|e+|pi))";
    static String funEmail = "(\\d|[a-zA-Z])+@(\\d|[a-zA-Z])+.(com|co)";
    static int tamaño = 5;
    private int invalidos;

    public String getEntero() {
        return entero;
    }

    public void setEntero(String entero) {
        this.entero = entero;
    }

    public String getReal() {
        return real;
    }

    public void setReal(String real) {
        this.real = real;
    }

    public String getNotCien() {
        return notCien;
    }

    public void setNotCien(String notCien) {
        this.notCien = notCien;
    }

    public String getBinario() {
        return binario;
    }

    public void setBinario(String binario) {
        this.binario = binario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getLugarArreglo() {
        return lugarArreglo;
    }

    public void setLugarArreglo(int lugarArreglo) {
        this.lugarArreglo = lugarArreglo;
    }

    //Metodo contructor
    public Modelo() {
        this.entero = "";
        this.real = "";
        this.notCien = "";
        this.binario = "";
        this.email = "";
        this.lugarArreglo = 0;
        this.invalidos = 0;
    }

    //Metodo principal, que valida y hace las diferentes acciones
    public void analizador() {
        boolean[] cont = new boolean[tamaño];
        String[] imp = new String[tamaño];

        cont[lugarArreglo] = busPalabra(funEntero, entero);
        cont[lugarArreglo] = busPalabra(funReal, real);
        cont[lugarArreglo] = busPalabra(funReal + "E" + funEntero, notCien);
        cont[lugarArreglo] = busPalabra("[0-1]+", binario);
        cont[lugarArreglo] = busPalabra(funEmail, email);

        if (invalidos == 0) {
            imp = impresion(cont, imp);
            JOptionPane.showMessageDialog(null, "Los datos incorrectos son:\n"
                    + imp[0] + imp[1] + imp[2] + imp[3] + imp[4]);
        } else {
            JOptionPane.showMessageDialog(null, "Uno o varios de los campos "
                    + "estan vacios\n     Llenarlos antes de volver a intentar");
        }

    }

    //Busca en el frase, los diferentes caracteres requeridos o pedidos
    private Matcher fraseCompleta(String buscar, String frase) {
        Pattern busqueda = Pattern.compile(buscar);
        Matcher palabra = busqueda.matcher(frase);
        return palabra;
    }

    //Valida si el campo de texto esta vacio, o no
    private boolean busPalabra(String patron, String cadena) {
        boolean comprobar = false;
        if (fraseCompleta(patron, cadena).matches()) {
            comprobar = true;
        } else {
            comprobar = false;
        }
        if (fraseCompleta("", cadena).matches()) {
            invalidos++;
        }
        setLugarArreglo(lugarArreglo + 1);
        return comprobar;
    }

    //Parte donde especifica cuales son los invalidos, para imprimirlos
    private String[] impresion(boolean[] cont, String[] imp) {
        for (int i = 0; i < tamaño; i++) {
            if (cont[i] == false) {
                switch (i) {
                    case 0:
                        imp[i] = " * Entero\n";
                        break;
                    case 1:
                        imp[i] = " * Real\n";
                        break;
                    case 2:
                        imp[i] = " * Notacion Cientifica\n";
                        break;
                    case 3:
                        imp[i] = " * Binario\n";
                        break;
                    case 4:
                        imp[i] = " * E-mail";
                        break;
                }
            } else {
                imp[i] = "";
            }
        }
        return imp;
    }
}
