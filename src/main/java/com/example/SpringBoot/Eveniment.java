package com.example.SpringBoot;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "evenimente")
public class Eveniment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String denumirea;
    private String locatia;
    private LocalDate data;
    private int timpul;
    private float pretul;

    public Eveniment() {}

    public Eveniment(int id, String denumirea, String locatia, LocalDate data, int timpul, float pretul) {
        this.id = id;
        this.denumirea = denumirea;
        this.locatia = locatia;
        this.data = data;
        this.timpul = timpul;
        this.pretul = pretul;
    }

    public int getId() {
        return id;
    }

    public String getDenumirea() {
        return denumirea;
    }

    public String getLocatia() {
        return locatia;
    }

    public LocalDate getData() {
        return data;
    }

    public int getTimpul() {
        return timpul;
    }

    public float getPretul() {
        return pretul;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDenumirea(String denumirea) {
        this.denumirea = denumirea;
    }

    public void setLocatia(String locatia) {
        this.locatia = locatia;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setTimpul(int timpul) {
        this.timpul = timpul;
    }

    public void setPretul(float pretul) {
        this.pretul = pretul;
    }

    @Override
    public String toString() {
        return "Eveniment{" +
                "id=" + id +
                ", denumirea='" + denumirea + '\'' +
                ", locatia='" + locatia + '\'' +
                ", data=" + data +
                ", timpul=" + timpul +
                ", pretul=" + pretul +
                '}';
    }
}
