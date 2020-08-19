package com.example.api.tarjeta;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

public class TarjetaDC {

    @NotBlank
    @Size(min=16, max = 16)
    private String numero;

    @NotBlank
    private String CVV;

    @NotBlank
    private String nombre;

    @NotBlank
    private String fecha;

 public void setNumero(String numero){
    this.numero = numero;
}
 public String getNumero(){
    return numero;
}
 public void setCVV(String cvv){
    this.CVV = cvv;
}
 public String getCVV(){
    return CVV;
}
 public void setNombre(String nombre){
    this.nombre = nombre;

}
 public String getNombre(){
    return nombre;
}
 public void setFecha(String fecha){
    this.fecha = fecha;
}
 public String getFecha(){
    return fecha;
}
}
