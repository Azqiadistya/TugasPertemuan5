/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.util.Scanner; 
/**
 *
 * @author USER
 */
public class Balok  extends PersegiPanjang implements MenghitungRuang{
    double tinggi;

public Balok(double panjang, double lebar, double tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    @Override
    public double hitungVolume() {
        return this.hitungLuas() * this.tinggi;
    }

    @Override
    public double hitungLuasPermukaan() {
        double p;
        p = this.panjang;
        double l;
        l = this.lebar;
        double t;
        t = this.tinggi;
        return 2 * ((p * l) + (p * t) + (l * t)) ;
    }
}

