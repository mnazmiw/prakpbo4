/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author azmig
 */
public class DataMahasiswa {
    String nim;
    String nama;
    String tgl;
    Date tglLahir;
    int gender; /*0: Laki-laki, 1: Perempuan*/
    int lain;
    
    Scanner input = new Scanner(System.in);
    StrToDate toDate = new StrToDate();
    ArrayList<Mahasiswa> dataMhs = new  ArrayList<Mahasiswa>();
    
    
    void tambahData(Mahasiswa data){
        this.dataMhs.add(data);
    }
    
    void hapusData(String nim){
        this.dataMhs.removeIf(item -> item.nim == nim);
    }
    
    void cariDataGender(int gen){
        ClassInput cinput = new ClassInput();
        
        lain = 0;
        boolean ada = false;
        int index = -1;
        for(int i = 0; i < this.dataMhs.size(); i++){
            if (this.dataMhs.get(i).gender == gender){
                index = i;
                ada = true;
            }
        }
        if (ada == true){
            this.dataMhs.get(index).cetak();
            System.out.println("*******************");
            System.out.println("Ingin Menjalankan Fungsi Lain?");
            System.out.println("1. Ya\n2. Tidak");
            System.out.print("Pilihan: ");
            lain = input.nextInt();
            if (lain == 1){
                cinput.mulai();
            } else if (lain == 2){
                System.exit(0);
            }
        } else {
            System.out.println("Data Mahasiswa Tidak Valid/Tidak Ditemukan!");
            System.out.println("*******************");
            System.out.println("Ingin Menjalankan Fungsi Lain?");
            System.out.println("1. Ya\n2. Tidak");
            System.out.print("Pilihan: ");
            lain = input.nextInt();
            if (lain == 1){
                cinput.mulai();
            } else if (lain == 2){
                System.exit(0);
            }
        }
    }
    
    void cariDataNim(String nimMhs){
        ClassInput cinput = new ClassInput();
        
        lain = 0;
        boolean ada = false;
        int index = -1;
        for(int i = 0; i < this.dataMhs.size(); i++){
            if (this.dataMhs.get(i).nim == nim){
                index = i;
                ada = true;
            }
        }
        if (ada == true){
            this.dataMhs.get(index).cetak();
            System.out.println("*******************");
            System.out.println("Ingin Menjalankan Fungsi Lain?");
            System.out.println("1. Ya\n2. Tidak");
            System.out.print("Pilihan: ");
            lain = input.nextInt();
            if (lain == 1){
                cinput.mulai();
            } else if (lain == 2){
                System.exit(0);
            }
        } else {
            System.out.println("Data Mahasiswa Tidak Valid/Tidak Ditemukan!");
            System.out.println("*******************");
            System.out.println("Ingin Menjalankan Fungsi Lain?");
            System.out.println("1. Ya\n2. Tidak");
            System.out.print("Pilihan: ");
            lain = input.nextInt();
            if (lain == 1){
                cinput.mulai();
            } else if (lain == 2){
                System.exit(0);
            }
        }
    }
    
    void printData(){
        ClassInput cinput = new ClassInput();
        
        lain = 0;        
        int i;
        System.out.println("********************");
        for(i = 0; i < this.dataMhs.size(); i++){
            this.dataMhs.get(i).cetak();
        }
        System.out.println("********************");
        System.out.println("Jumlah Mahasiswa Terdata: " + i + " Mahasiswa");
        System.out.println("*******************");
        System.out.println("Ingin Menjalankan Fungsi Lain?");
        System.out.println("1. Ya\n2. Tidak");
        System.out.print("Pilihan: ");
        lain = input.nextInt();
        if (lain == 1){
            cinput.mulai();
        } else if (lain == 2){
            System.exit(0);
        }
    }
    
}
