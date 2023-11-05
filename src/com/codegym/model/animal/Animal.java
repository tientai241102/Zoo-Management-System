package com.codegym.model.animal;

import com.codegym.model.animal.enumerations.HealAnimals;
import com.codegym.model.animal.enumerations.GenderAnimals;

public abstract class Animal {

    private int id;
    private String name;
    private String species;
    private double weight,size;
    private int age;
    private HealAnimals heal;
    private GenderAnimals gender;
    private boolean isHungry;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal(int id, String name, String species, double weight, double size, int age, HealAnimals heal, GenderAnimals gender) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.weight = weight;
        this.size = size;
        this.age = age;
        this.heal = heal;
        this.gender = gender;
        this.isHungry = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HealAnimals getHeal() {
        return heal;
    }

    public void setHeal(HealAnimals heal) {
        this.heal = heal;
    }
    public void heal() {
        this.heal = HealAnimals.GOOD;
    }
    public GenderAnimals getGender() {
        return gender;
    }

    public void setGender(GenderAnimals gender) {
        this.gender = gender;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean hungry) {
        isHungry = hungry;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                ", age=" + age +
                ", heal=" + heal +
                ", gender=" + gender +
                '}';
    }
}
