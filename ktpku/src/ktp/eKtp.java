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

public class eKtp {
	
	static String Nik;
	static String Nama;
	static String TTL;
	static String Jekel;
	static String Alamat;
	static String Rt,Rw;
	static String Desa;
	static String Kec;
	static String Agama;
	static String Status;
	static String Pekerjaan;
	static String Berlaku;
	
	static boolean running;
	static String ktp[] = new String [200];
	static int pilih, jumlah;
	static String read, pilihan;
	
	public static void main (String[] args) throws IOException{
		
		ArrayList<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
		Scanner input = new Scanner (System.in);
		
		while (running){
			System.out.println("/n Menu");
			System.out.println("1. Input Data KTP");
			System.out.println("2. List Data KTP");
			System.out.println("3. Sortng Data KTP");
			System.out.println("4. Exit");
			System.out.println("Pilih");
			
			try{
				pilih = input.nextInt();
			}
			catch(java.util.InputMismatchException a){
				System.out.println("Maaf Inputan tidak valid" +a);
				break;
			}
			
		}
	}

}

