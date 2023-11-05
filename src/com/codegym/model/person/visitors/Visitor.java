package com.codegym.model.person.visitors;

import com.codegym.model.person.Person;
import com.codegym.model.person.enumerations.AgeCategory;
import com.codegym.model.person.enumerations.GenderPerson;

public class Visitor extends Person {
    private AgeCategory ageCategory;

    public Visitor(String name, String streetAddress, String city, String country, GenderPerson gender, int age, AgeCategory ageCategory) {
        super(name, streetAddress, city, country, gender, age);
        this.ageCategory = ageCategory;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "name='" + getName() + '\'' +
                ", streetAddress='" + getStreetAddress() + '\'' +
                ", city='" + getCity() + '\'' +
                ", country='" + getCountry() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", ageCategory=" + ageCategory ;
    }
}
