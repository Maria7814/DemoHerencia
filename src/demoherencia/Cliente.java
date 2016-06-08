/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoherencia;

/**
 *
 * @author LUPITA
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ocupacion;
    private String telefono;
    private String email;
    
    Cliente(String nombre,String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getNombre (){
return nombre;
}
    public String getApellido(){
        return apellido;
    }
    public String getfechaDeNacimiento(){
        return fechaDeNacimiento;
    }
    public String getdireccion(){
        return direccion;
    }
    public String getocupacion(){
        return ocupacion;
    }
    public String gettelefono(){
        return telefono;
    }
    public String getemail(){
        return email;
       
    }
    public void setdireccion(String direccion){
        this.direccion = direccion;
    }
    public void setfechaDeNacimiento(String fechaDeNacimiento ){
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public void setocupacion(String ocupacion){
        this.ocupacion = ocupacion;
    }
    public void settelefono(String telefono){
        this.telefono = telefono;
    }
    public void setemail(String email){
        this.email = email;
    }
}


