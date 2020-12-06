/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author azmig
 */
public class ClassInput {
    String nim;
    String nama;
    String tgl;
    Date tglLahir;
    int gender; /*0: Laki-laki, 1: Perempuan*/
    int menu;
    int lain;
    
    StrToDate toDate = new StrToDate();
    DataMahasiswa dataMhs = new DataMahasiswa();
    

    
    void addData(){
        lain = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("**Masukkan Data Mahasiswa**");
        System.out.print("NIM: ");
        nim = input.nextLine();
        System.out.print("Nama: ");
        nama = input.nextLine();
        System.out.print("Tanggal Lahir (DD/MM/YYYY): ");
        tgl = input.nextLine();
        tglLahir = toDate.tgl(tgl);
        System.out.print("Jenis Kelamin (0 = Laki-Laki, 1 = Perempuan): ");
        gender = input.nextInt();
        dataMhs.tambahData(new Mahasiswa(nim,nama,tglLahir,gender));
        System.out.print("Data Berhasil Ditambahkan!");
        System.out.println("********************");
        System.out.println("Ingin Menjalankan Fungsi Lain?");
        System.out.println("1. Ya\n2. Tidak");
        System.out.print("Pilihan: ");
        lain = input.nextInt();
        if (lain == 1){
            mulai();
        } else if (lain == 2){
            System.exit(0);
        }
    }
    
    void delData(){
        lain = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan NIM Mahasiswa:");
        nim = input.nextLine();
        dataMhs.hapusData(nim);
        System.out.println("Data Berhasil Dihapus!");
        System.out.println("********************");
        System.out.println("Ingin Menjalankan Fungsi Lain?");
        System.out.println("1. Ya\n2. Tidak");
        System.out.print("Pilihan: ");
        lain = input.nextInt();
        if (lain == 1){
            mulai();
        } else if (lain == 2){
            System.exit(0);
        }
    }
    
    void findData(){
        lain = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Kriteria Pencarian: \n1. Berdasarkan Jenis Kelamin (0 = Laki-Laki, 1 = Perempuan) \n2. Berdasarkan NIM");
        System.out.print("Pilihan: ");
        int pilih = input.nextInt();
        if (pilih == 1) {
            System.out.print("Masukkan Jenis Kelamin (0 = Laki-Laki, 1 = Perempuan): ");
            int cariGender = input.nextInt();
            dataMhs.cariDataGender(cariGender);
        } else if (pilih == 2){
            System.out.print("Masukkan NIM: ");
            String cariNim = input.nextLine();
            dataMhs.cariDataNim(cariNim);
        }
    }
    
    void mulai(){
        Scanner input = new Scanner(System.in);
        int lain = 0;
        System.out.println("********************\nSistem Data Mahasiswa\n********************");
        System.out.println("1. Tambah Data");
        System.out.println("2. Hapus Data");
        System.out.println("3. Cari Data");
        System.out.println("4. Tampilkan Seluruh Data");
        System.out.print("Pilih Menu: ");
        menu = input.nextInt();
        if (menu == 1){
            addData();
        }
        else if (menu == 2){
            delData();
        }
        else if (menu == 3){
            findData();
        }
        else if (menu == 4){
            dataMhs.printData();
        }
    }
}
