/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo241822010082.latihan26;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Caca
 * Nama : Adjeng Rara Rengganis
 * NIM  : 41822010079
 * Nama : Vanisha Putri Kania 
 * NIM  : 41822010082
 */
public class PBO241822010082Latihan26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("FORMAT TUGAS PBO");
        
        Date date = new Date();

        // Mengatur format waktu
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        // Mengonversi waktu ke string dengan format yang diinginkan
        String formattedDate = sdf.format(date);

        // Mendapatkan hari
        Calendar calendar = Calendar.getInstance();
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        // Array untuk menyimpan nama hari
        String[] daysOfWeek = {"Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat", "Sabtu"};

        // Menampilkan waktu dan hari
        
        System.out.println("Hari ini adalah hari : " + daysOfWeek [dayOfWeek - 1] + formattedDate);     // TODO code application logic here
    }
    
}
