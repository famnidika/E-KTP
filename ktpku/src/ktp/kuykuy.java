/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class kuykuy {

	static String nik;
	static String nama;
	static String ttl;
	static String jeniskelamin;
	static String alamat;
	static String rt,rw;
	static String desa;
	static String kec;
	static String agama;
	static String status;
	static String kerja;
	static String warga;
	static String beraku;
	
	static boolean running;
	static String ktp[] = new String[200];
	static int pilih, jumlah;
	static String read, pilhan;
	
	public static void main(String[] args ) throws IOException{
		
	ArrayList<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
	HashMap<String, String> hash = new HashMap<String, String>();
	Scanner input = new Scanner(System.in);
	
	while (running){
		System.out.println("/n Menu");
		System.out.println("1. Input Data KTP");
		System.out.println("2. List Data KTP");
		System.out.println("3. Sorting Data KTP");
		System.out.println("4. Exit");
		System.out.println("Pilih");
		
		try{
			pilih = input.nextInt();
		}
		catch(java.util.InputMismatchException e){
			System.out.println("Maaf inputa tidak Valid"+ e);
			break;
		}
                
		{
			for(int i = 0; i < jumlah; i++){
				System.out.println("Data ke "+(i+1));
				System.out.println("NIK						:");
				nik = input.next();
				hash.put(nik, nik);
				
				System.out.println("Nama					:");
				nama = input.next();
				hash.put(nama, nama);
				
				System.out.println("Tempat / Tanggal Lahir	:");
				ttl = input.next();
				hash.put(ttl, ttl);
				
				System.out.println("Jenis Kelamin			:");
				jeniskelamin = input.next();
				hash.put(jeniskelamin, jeniskelamin);
				
				System.out.println("Alamat");
				alamat = input.next();
				hash.put(alamat, alamat);
				
				System.out.println("RT						:");
				rt = input.next();
				hash.put(rt, rt);
				
				System.out.println("RW						:");
				rt = input.next();
				hash.put(rw, rw);
				
				System.out.println("Desa					:");
				desa = input.next();
				hash.put(desa, desa);
				
				System.out.println("Kecamatan");
				kec = input.next();
				hash.put(kec, kec);
				
				System.out.println("Agama");
				agama = input.next();
				hash.put(agama, agama);
				
				System.out.println("Status");
				status = input.next();
				hash.put(status, status);
				
				System.out.println("Kerja");
				kerja = input.next();
				hash.put(kerja, kerja);
				
				System.out.println("Warga");
				warga = input.next();
				hash.put(warga, warga);
				
				System.out.println("Berlaku");
				beraku = input.next();
				hash.put(beraku, beraku);
				
				
			}
		}
		
		
		
	}
		
	}
	
}