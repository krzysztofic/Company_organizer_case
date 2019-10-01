package com.company;

public class EmployersList {

    private String imie, nazwisko;
    private char plec;
    private int nr_dzialu, wiek, dzieci;
    private float placa;
    private boolean stan_cywilny;



    public void overallView(){
        System.out.println("Imie: " +imie+"\n" +
                "Nazwisko: " + nazwisko);

    }

    public void primaryView(){

    }

    public void specialView(){

    }


    boolean isSalaryHigher(float SalaryToCompare){
        if (placa > SalaryToCompare) return true;
        else return false;
    }

}
