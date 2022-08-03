package Tarea3;

public class Main {
    public static void main(String[] args) {
    Persona persona = new Persona();

        persona.setEdad(30);
  // Integer edad = persona.getEdad();
 //  System.out.println(edad); //  System.out.println("Edad:");
        System.out.println("Edad: "+ persona.getEdad());

        persona.setNombre("Juncito El Majo");
        System.out.println("Nombre: "+ persona.getNombre());

        persona.setTelefono(26845286);
        System.out.println("Tel: "+ persona.getTelefono());


    }
}

class Persona{
 private Integer edad;
  private String nombre;
 private Integer telefono;

  public void setEdad(Integer edad){
      this.edad = edad;
  }
  public void setNombre(String nombre){
      this.nombre = nombre;
  }

  public void setTelefono (Integer telefono){
      this.telefono =telefono;
  }


  public Integer getEdad(){
      return this.edad;
  }
  public String getNombre(){
      return  this.nombre;
  }
  public Integer getTelefono(){
      return this.telefono;
  }


}