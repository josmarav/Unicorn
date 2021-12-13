package backend;

import java.io.Serializable;


public class Persona implements Serializable {
    public String nombre;
    public String apellido;
    public String genero;
    public String ciudad;
    public int edad;
    
    public Persona (String nombre, String apellido, int edad, String genero, String ciudad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.ciudad = ciudad;
        this.edad = edad;    
    }

    public boolean empiezaPorN (String inicio){
        if(inicio.isEmpty() || inicio.length()>nombre.length())
            return false;
        for(int i=0; i<inicio.length(); ++i)
            if(inicio.charAt(i) != nombre.charAt(i))
                return false;
        return true;
    }
    
   public boolean empiezaPorA (String inicio){
        if(inicio.isEmpty() || inicio.length()>apellido.length())
            return false;
        for(int i=0; i<inicio.length(); ++i)
            if(inicio.charAt(i) != apellido.charAt(i))
                return false;
        return true;
    }
    
    @Override
    public String toString(){
        return "Nombre Completo: "+nombre+", "+apellido+",\n "+genero+", "+ciudad+", "+edad;
    
}
}
