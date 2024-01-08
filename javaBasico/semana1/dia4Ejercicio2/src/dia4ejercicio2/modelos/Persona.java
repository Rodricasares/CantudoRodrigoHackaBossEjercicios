/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dia4ejercicio2.modelos;

/**
 *
 * @author Rodrigo Cantudo
 */
public class Persona {

    private int id;
    private String nombre;
    private int edad;
    private String direccion;
    private int tlf;

    public Persona() {

    }

    public Persona(int id, String nombre, int edad, String direccion, int tlf) {

        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.tlf = tlf;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTlf() {
        return tlf;
    }

    public void setTlf(int tlf) {
        this.tlf = tlf;
    }

    @Override
    public String toString() {
        return "Persona_" + "id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", direccion=" + direccion + ", tlf=" + tlf;
    }

   

    public String mostrar() {

        return nombre;
    }

    public void pay() {
        System.out.println("pagado!!!");
    }
    
    //    public void cambioUsuarios(String nombre) {
//
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ingrese el nuevo Nombre: ");
//        String nombre = sc.nextLine();
//        setNombre(this.nombre);
//        return nombre;
//    }
}