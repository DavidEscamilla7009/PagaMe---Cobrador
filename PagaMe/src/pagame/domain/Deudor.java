/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pagame.domain;

/**
 *
 * @author Usuario
 */
public class Deudor {
    private int id;
    private String  nombre;   
    private String direccion; 
    private float saldo;

    public Deudor(int id, String nombre, String direccion, float saldo) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Deudor(int id, String nombre, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    
}
