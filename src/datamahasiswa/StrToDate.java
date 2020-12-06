/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datamahasiswa;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
/**
 *
 * @author azmig
 */
public class StrToDate {
    Date tglConv = null;
    String input;
    SimpleDateFormat tanggal =  new SimpleDateFormat("dd/MM/yyyy");
    
    
    Date tgl(String input){
        this.input = input;
        try{
            tglConv = tanggal.parse(input);
        } catch (ParseException e){
            e.printStackTrace();
        }
        return tglConv;
    }
}