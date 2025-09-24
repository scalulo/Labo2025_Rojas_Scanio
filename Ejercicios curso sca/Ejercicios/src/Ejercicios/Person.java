package Ejercicios;

import java.time.LocalDate;

public abstract class Person {
    private int dni;
    private int age;
    private String name;
    private LocalDate birthDate;

    public Person(int dni, int age, String name, LocalDate birthDate) {
        this.dni = dni;
        this.age = age;
        this.name = name;
        this.birthDate = birthDate;
    }

    public Person() {
        this.dni = 1991919;
        this.age = 19;
        this.name = "juan";
        this.birthDate = LocalDate.now();
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}