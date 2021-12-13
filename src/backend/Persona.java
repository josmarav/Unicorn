package backend;

import java.io.Serializable;


public class Persona implements Serializable {
    public String nombre;
    public String apellido;
    public String genero;
    public String ciudad;
    public int edad;
    public String amigo;
    
    public Persona (String nombre, String apellido, int edad, String genero, String ciudad, String amigo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.ciudad = ciudad;
        this.edad = edad;  
        this.amigo = amigo;
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
    
   public boolean empiezaPorC (String inicio){
        if(inicio.isEmpty() || inicio.length()>ciudad.length())
            return false;
        for(int i=0; i<inicio.length(); ++i)
            if(inicio.charAt(i) != ciudad.charAt(i))
                return false;
        return true;
    }
   
   public boolean empiezaPorG (String inicio){
        if(inicio.isEmpty() || inicio.length()>genero.length())
            return false;
        for(int i=0; i<inicio.length(); ++i)
            if(inicio.charAt(i) != genero.charAt(i))
                return false;
        return true;
    }
   public boolean  empiezaCON (String inicio){
        if(inicio.isEmpty() || inicio.length()>amigo.length())
            return false;
        for(int z=0; z<inicio.length(); ++z)
            if(inicio.charAt(z) != amigo.charAt(z))
                return false;
        return true;
    }
   

   
    @Override
    public String toString(){
        return ""+apellido+", "+nombre+", "+genero+", "+ciudad+", "+edad;
   
    
}
     public String toString2(){
        return apellido+" "+nombre+", ES SU AMIGO";
}
}
