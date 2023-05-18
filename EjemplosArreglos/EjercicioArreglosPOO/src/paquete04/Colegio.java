package paquete04;

//@author JosephMatheo

public class Colegio {
    
    private String nombre;
    private String ciudad;
    
    public Colegio(String n, String c){
    
        nombre = n;
        ciudad = c;
    
    }
    
    public void establecerNombre(String x){
    
        nombre = x;
    
    }
    
    public void establecerCiudad(String x){
    
        ciudad = x;
    
    }
    
    public String obtenerNombre(){
    
        return nombre;
            
    }
    
    public String obtenerCiudad(){
    
        return ciudad;
            
    }
    
}
