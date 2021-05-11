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
public class PersegiPanjang implements MenghitungBidang {
public double panjang;
    public double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        return this.panjang * this.lebar;
    }

    @Override
    public double hitungKeliling() {
        return 2 * (this.panjang + this.lebar);
    }
}
