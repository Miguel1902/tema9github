/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4bootcamp;

/**
 *
 * @author migue
 */
public class ejerciciotema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
        cliente cliente1 = new cliente();
        cliente1.setEdad(39);
        System.out.println(cliente1.edad);
        cliente1.telefono=4555553;
        System.out.println(cliente1.telefono);
        cliente1.credito=2311;
        System.out.println(cliente1.credito);

        
        
        trabajador trabajador1 = new trabajador();
        trabajador1.setEdad(50);
        System.out.println(trabajador1.edad);
        trabajador1.telefono=54646;
        System.out.println(trabajador1.telefono);
        trabajador1.nombre="trabajador1";
        System.out.println(trabajador1.nombre);
        trabajador1.salario=1700;
        System.out.println(trabajador1.salario);
        
    }
    
}


class persona {
    int edad=89; 
    String nombre;
    int telefono=95;
    
    //creamos el set de edad 
    public void setEdad(int edad){
        this.edad= edad;
    }
    //creamos el get de edad 
    public int getEdad(){
        return this.edad;
    }
    //creamos el set del nombre
    public void setNombre(String nombre){
        this.nombre="antonio";
    }
    //creamos el get de nombre 
    public String getnombre(){
        return this.nombre;
    }
    //creamos el set del telefono 
    public void setTelefono(int telefono){
        this.telefono=telefono;
    }
    //creamos el get del telefono
    public int getTelefono(){
        return this.telefono;
    }
}
//hereda la clase cliente de persona
class cliente extends persona{
    
    int credito=1000;
  
}
//hereda la clase trabajador de persona 
class trabajador extends persona{

    int salario=1700;
  
}
