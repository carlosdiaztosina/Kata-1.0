/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata1;

import java.time.LocalDate;

/**
 *
 * @author karlixuelo
 */
public class Person {
    private final String name;
    private final LocalDate cumple;

    public Person(String name, LocalDate cumple) {
        this.name = name;
        this.cumple = cumple;
    }

   
    public String getName() {
        return name;
    }

    public LocalDate getCumple() {
        return cumple;
    }
    
    public int getAge(){
        long  dias = LocalDate.now().toEpochDay() - cumple.toEpochDay();
        return toYears(dias);
    }

    private int toYears(long dias) {
        return (int) (dias/365.25);
    }

}
