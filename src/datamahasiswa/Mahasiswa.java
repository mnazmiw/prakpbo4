/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.util.Date;

/**
 *
 * @author azmig
 */
public class Mahasiswa {
    /*Atribut*/
    String nim;
    String nama;
    Date tglLahir;
    int gender; /*0: Laki-laki, 1: Perempuan*/
    
    /*Konstruktor*/
    Mahasiswa(String nim, String nama, Date tglLahir, int gender){
        this.nim = nim;
        this.nama = nama;
        this.tglLahir = tglLahir;
        this.gender = gender;
        
    }
    
    /*Untuk menampilkan data mahasiswa*/
    void cetak(){
        System.out.println("NIM: " + this.nim);
        System.out.println("Nama: " + this.nama);
        System.out.println("Tanggal Lahir: " + this.tglLahir);
        System.out.println("Jenis Kelamin: " + this.gender);
    }
}


