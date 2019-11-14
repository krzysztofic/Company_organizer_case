package com.company;

import java.io.Serializable;

public class Employee implements Serializable {

    private String name, surname;
    private char sex;
    private int department_nr, age, kids;
    private float salary;
    private boolean marital_status;


    public Employee(String name, String surname, char sex) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
    }

    public void overallView(){
        System.out.println("Imie: " +name+"\nNazwisko: " + surname+"\nPłeć: "+sex+"\nNumer działu:" +
               +department_nr+"\nWiek: "+age+"\nLiczba dzieci: "+kids+"\nPłaca: "+salary+"\nStan Cywilny: "+marital_status);

    }

    public void primaryView(){
        System.out.println("Imie: " +name+"\nNazwisko: " + surname+"\nPłaca: "+salary+ " zł");
    }

    public void specialView(){
        System.out.println("Imie: " +name.toUpperCase()+"\nNazwisko: " + surname.toUpperCase());
    }


    boolean isSalaryHigher(float SalaryToCompare){
        return salary > SalaryToCompare;
    }

    public float salary_increse(float percentage_increase){
        percentage_increase /= 100;
        salary += (salary * percentage_increase);

        if(kids > 0){
            salary += (kids * (salary * 0.02));   //2% increase if have kids
        }
        if(marital_status = true){
            salary += salary * 0.03;  //3% increse if married
        }
        return salary;
    }

///  Other methods  to access

    //get values


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public char getSex() {
        return sex;
    }

    public int getDepartment_nr() {
        return department_nr;
    }

    public int getAge() {
        return age;
    }

    public int getKids() {
        return kids;
    }

    public float getSalary() {
        return salary;
    }

    public boolean isMarital_status() {
        return marital_status;
    }

    // set values


    public void setDepartment_nr(int department_nr) {
        this.department_nr = department_nr;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setKids(int kids) {
        this.kids = kids;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public void setMarital_status(boolean marital_status) {
        this.marital_status = marital_status;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", department_nr=" + department_nr +
                ", age=" + age +
                ", kids=" + kids +
                ", salary=" + salary +
                ", marital_status=" + marital_status +
                '}';
    }
}




