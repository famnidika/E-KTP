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

        private String Nik;
	private String Nama;
	private String TTL;
	private String Jekel;
	private String Alamat;
	private String RtRw;
	private String Desa;
	private String Kec;
	private String Agama;
	private String Status;
	private String Pekerjaan;
	private String Berlaku;
	
   public Ktp(String Nik,String Nama, String TTL, String Jekel, String Alamat,String RtRw, String Desa, String Kec, String Agama, String Status, String Pekerjaan, String Berlaku) {
    this.Nik = Nik;
    this.Nama = Nama;
    this.TTL = TTL;
    this.Jekel = Jekel;
    this.Alamat = Alamat;
    this.RtRw = RtRw;
    this.Desa = Desa;
    this.Kec = Kec;
    this.Agama = Agama;
    this.Status = Status;
    this.Pekerjaan = Pekerjaan;
    this.Berlaku = Berlaku;
    }
   public String getNik(){
       return Nik;
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
   public String getAlamat(){
       return Alamat;
   }
   public String getRtRw(){
       return RtRw;
   }
   public String getDesa(){
       return Desa;
   }
   public String getKec(){
       return Kec;
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
   public String getBerlaku(){
       return Berlaku;
   }
    
}
