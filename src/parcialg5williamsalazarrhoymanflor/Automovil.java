/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialg5williamsalazarrhoymanflor;
import javax.swing.JOptionPane;
/**
 *
 * @author willi
 */
public class Automovil {
  
    public String placa;
    public int modelo;
    public double precio;

    public Automovil(String placa, int modelo, double precio) {
        this.placa = placa;
        this.modelo = modelo;
        this.precio = precio;
    }

    public String getPlaca() {
        return placa;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }
    
    
    public void Sedan(){
        System.out.println("motor");
    }
}
   
     
     

