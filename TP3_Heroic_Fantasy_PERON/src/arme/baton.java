/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arme;

public class baton extends arme {
    private int age;

    public baton(String nom, int niveauAttaque, int age) {
        super(nom, niveauAttaque);
        this.age = Math.min(age, 100);
    }

    @Override
    public String toString() {
        return super.toString() + ", Âge: " + age;
    }

    public int getAge() {
        return age;
    }
}
