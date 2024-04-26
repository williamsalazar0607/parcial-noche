/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialg5williamsalazarrhoymanflor;

/**
 *
 * @author willi
 */
public class Sedan extends Automovil {
    
    public double motor;
    public boolean frenos;

    public Sedan(double motor, boolean frenos, String placa, int modelo, double precio) {
        super(placa, modelo, precio);
        this.motor = motor;
        this.frenos = frenos;
    }

    public double getMotor() {
        return motor;
    }

    public boolean isFrenos() {
        return frenos;
    }
    
   public void frenosABS() {
        if (frenos) {
            System.out.println("El automóvil tiene frenos ABS");
        } else {
            System.out.println("El automóvil no tiene frenos ABS");
        }
        
   }

    public Sedan(String placa, int modelo, double precio) {
        super(placa, modelo, precio);
    }
}