/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

/**
 *
 * @author DuvHer
 */
public class Dog {
    private int size;
    private String breed;
    private String name;
    
    public Dog(int size, String breed, String name) {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }
    
    public void bark(){
        System.out.println("Ruff"+" "+this.breed);
    }

    public int getSize() {     
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void darDatos(){System.out.println("Nombre: "+this.name+" Raza: "+this.breed+" Edad: "+this.size);}
    
}
