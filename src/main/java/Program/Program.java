/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

import java.time.LocalDate;

/**
 *
 * @author paolo.berlanda
 */
public class Program {
    
    public static void main(String[] args) {
        
        Studente paolo = new Studente("Paolo", "Berlanda");
        System.out.println(paolo.toString());

        Studente franco = new Studente("Franco", "Tiratore", LocalDate.of(1976, 12, 17), "", "");
        System.out.println(franco.toString());
    }
}
