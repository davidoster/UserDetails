/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userdetails;

/**
 *
 * @author George.Pasparakis
 */
public class User {

    private String name;
    private String surname;
    private float age;
    private Color color;

    public User() {
        color = new Color();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "name=" + name + ", surname=" + surname + ", age=" + age + ", favourite color=" + color.getFavouriteColor();
    }

    //      public String toString() {
//        System.out.println("User's name: " + name);
//        System.out.println("User's surname: " + surname);
//        System.out.println("User's age : " + age);
//        System.out.println("User's favourite colour : " + color.getFavouriteColor());
//        return "";
//    }
}
