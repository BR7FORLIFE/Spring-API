package com.trabajo.ApiUsuarios.classes;

public class Usuarios {
    //atributos
    private int id;
    private String name;
    private int age;
    private String occupation;
    
    //constructor
    public Usuarios(int id, String name, int age, String occupation){
        this.id = id;
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
    //getters
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getOccupation() {
        return occupation;
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
