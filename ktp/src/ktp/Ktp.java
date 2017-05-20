/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;

/**
 *
 * @author ACER
 */
public class Ktp {

   private String Nama;
   private String TTL;
   private String Jekel;
   private String Goldar;
   private String Alamat;
   private String Agama;
   private String Status;
   private String Pekerjaan;
   private String Kewarganegaraan;
   public Ktp(String Nama, String TTL, String Jekel, String Goldar, String Alamat, String Agama, String Status, String Pekerjaan, String Kewarganegaraan) {
    this.Nama = Nama;
    this.TTL = TTL;
    this.Jekel = Jekel;
    this.Goldar = Goldar;
    this.Alamat = Alamat;
    this.Agama = Agama;
    this.Status = Status;
    this.Pekerjaan = Pekerjaan;
    this.Kewarganegaraan = Kewarganegaraan;
    }
   public String getNama(){
       return Nama;
   }
   public String getTTL(){
       return TTL;
   }
   public String getJekel(){
       return Jekel;
   }
   public String getGoldar(){
       return Goldar;
   }
   public String getAlamat(){
       return Alamat;
   }
   public String getAgama(){
       return Agama;
   }
   public String getStatus(){
       return Status;
   }
   public String getPekerjaan(){
       return Pekerjaan;
   }
   public String getKewarganegaraan(){
       return Kewarganegaraan;
   }
    
}
