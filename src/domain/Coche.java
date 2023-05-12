
package domain;


public class Coche {
    private String marca ,modelo ;   
    private double velocidad ;  

    public Coche() {
    }

    public Coche(String marca, String modelo, double velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }
    
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    
    public String acelerar (){
        return "Acelerando coche..."; 
    }
    
    public String frenar (){
        return "Frenando Coche...";
    }
    
}
