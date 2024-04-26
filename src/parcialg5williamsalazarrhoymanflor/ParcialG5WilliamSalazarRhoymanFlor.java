/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialg5williamsalazarrhoymanflor;
import javax.swing.JOptionPane;

public class ParcialG5WilliamSalazarRhoymanFlor {

    
     public static void main(String[] args) { 
         
        int opcion;
        do {
           
            String opcionStr = JOptionPane.showInputDialog(
                "Menú:\n" +
                "1. Registrar automóviles\n" +
                "2. Registrar motos\n" +
                "3. Vendedor\n" +
                "4. Salir"
            );

            opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:
                    registrarAutomoviles();
                    break;
                case 2:
                    registrarMotos();
                    break;
                case 3:
                    mostrarVendedor();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida. Inténtalo de nuevo.");
            }
        } while (opcion != 4);
    }


  private static void registrarAutomoviles() {
        
        String placa = JOptionPane.showInputDialog("Ingrese la placa del automóvil:");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo del automóvil:"));
        Double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del automóvil:"));
        Automovil  miAuto= new Automovil(placa, modelo, precio);
        
       
        
        JOptionPane.showMessageDialog(null,"la placa del vehiculo es :"+placa+
                "\n el modelo del vehiculo es :"+modelo+
                "\n el precio del vehiculo es :"+precio);
        
        
        
  } 
  

   private static void registrarMotos() {
        
        String placa = JOptionPane.showInputDialog("Ingrese la placa de la moto:");
        int modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el modelo de la moto:"));
        int cilindraje = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el cilindraje de la moto:"));
        
         
        JOptionPane.showMessageDialog(null,"la placa de la moto es :"+placa+
                "\n el modelo de la moto es :"+modelo+
                "\n el cilindrage de la moto es  :"+cilindraje);
   
        
   }

    private static void mostrarVendedor() {
    String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
    String apellido = JOptionPane.showInputDialog("Ingrese su apellido:");

   
    JOptionPane.showMessageDialog(null, "Vendedor: " + nombre + " " + apellido);
    
              
                        }
     }



   
    
    
