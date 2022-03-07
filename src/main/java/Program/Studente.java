/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author paolo.berlanda
 */
public class Studente {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;
    private String indirizzo;
    private String matricola;
    
    DateTimeFormatter dtf;
    
    public Studente(String nome, String cognome, LocalDate dataDiNascita, String indirizzo, String matricola) {

        // imposta formato della data
        this.setDateFormatter();
                
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
        this.indirizzo = indirizzo;
        this.matricola = matricola;
        
        // non prendiamo attributi null
        checkAttributes();
    }

    // costruttore semplificato
    public Studente(String nome, String cognome) {
                
        // imposta formato della data
        this.setDateFormatter();

        this.nome = nome;
        this.cognome = cognome;

        // non prendiamo attributi null
        checkAttributes();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public String getStringDataDiNascita() {
        String str = "";
        
        if ((this.getDataDiNascita())==null) {
            return str;
        }
        
        str = this.getDataDiNascita().format(dtf);
        
        return str;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getMatricola() {
        return matricola;
    }

    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
    
    private void setDateFormatter() {
        this.dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    }
    
    @Override
    public String toString() {
        String str = "";
        
        str += "nome: " + this.getNome();
        str += "\n" + "cognome: " + this.getCognome();
        str += "\n" + "data di nascita: " + this.getStringDataDiNascita();
        str += "\n" + "indirizzo: " + this.getIndirizzo();
        str += "\n" + "matricola: " + this.getMatricola();
        
        return str;
    }
    
    private void checkAttributes() {

        if (("".equals(this.nome)) || (this.nome == null)) {
            this.setNome("");
        }
        
        if (("".equals(this.cognome)) || (this.cognome == null)) {
            this.setCognome("");
        }

        if (("".equals(this.indirizzo)) || (this.indirizzo == null)) {
            this.setIndirizzo("");
        }
        
        if (("".equals(this.matricola)) || (this.matricola == null)) {
            this.setMatricola("");
        }
        
    }
}   
