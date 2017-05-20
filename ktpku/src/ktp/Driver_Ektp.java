
package ktp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


public class Driver_Ektp {

	static String Nik;
	static String Nama;
	static String TTL;
	static String Jekel;
	static String Alamat;
	static String RtRw;
	static String Desa;
	static String Kec;
	static String Agama;
	static String Status;
	static String Pekerjaan;
	static String Berlaku;
	
	static boolean running;
	static String ktp[] =  new String[200];
	static int pilih, jumlah;
	static String read,pilihan;

	public static void main(String[] args) throws IOException {
		ArrayList<HashMap<String, String>> data = new ArrayList<HashMap<String, String>>();
		HashMap<String, String> hash = new HashMap<String,String>();
		Scanner input = new Scanner(System.in);
	//	Penduduk ektps[] = new Penduduk[200];
		
//		for(int x = 0; x<=100; x++){
	//		ektps[x] = new Penduduk();
		//}
	//	ektps[0] = new Penduduk();
		running = true;
			
	while (running){
		System.out.println("\nMenu :");
		System.out.println("1. Iputan Data eKTP ");
		System.out.println("2. List Data eKTP ");
		System.out.println("3. Sorting Data eKTP ");
		System.out.println("4. exit ");
		System.out.println("Pilih :");
		try{
			pilih = input.nextInt();	
		}
		catch(java.util.InputMismatchException a){
			System.out.println("Maaf inputan tidak valid " +a);
			break;
		}
		switch(pilih){
		case 1:
			System.out.println("===Iputkan Data eKTP===");
			System.out.println("Jumlah Inputan Data eKTP :");
			try{
				jumlah = input.nextInt();
			}
			catch(java.util.InputMismatchException e){
				System.out.println("Maaf inputan tidak valid " +e);
				break;
			}	
			try{
				for (int i = 0; i < jumlah;i++){
					System.out.println("Data ke-"+(i+1));
					System.out.println("NIK :");
					Nik = input.next();
					hash.put(Nik, Nik);
					
					System.out.println("Nama :");
					Nama = input.next();				
					hash.put(Nama,Nama);
					
					System.out.println("Tempat/Tgl Lahir :");
					TTL = input.next();
					hash.put(TTL, TTL);
					
					System.out.println("Jenis Kelamin :");
					Jekel = input.next();
					hash.put(Jekel, Jekel);
					
					System.out.println("Alamat :"); 
					Alamat = input.next();
					hash.put(Alamat, Alamat);
					
					System.out.println("RT:");
                                    String Rt = input.next();
					hash.put(Rt, Rt);
					
					System.out.println("RW:");
                                    String Rw = input.next();
					hash.put(Rw, Rw);
					
					System.out.println("Desa :");
					Desa = input.next();
					hash.put(Desa, Desa);
					
					System.out.println("Kecamatan :");
					Kec = input.next();
					hash.put(Kec, Kec);
					
					System.out.println("Agama :");
					Agama = input.next();
					hash.put(Agama, Agama);
					
					System.out.println("Status Perkawinan :");
					Status = input.next();
					hash.put(Status, Status);
					
					System.out.println("Pekerjaan :");
					Pekerjaan = input.next();
					hash.put(Pekerjaan, Pekerjaan);
					
					System.out.println("Masa Berlaku :");
					Berlaku = input.next();
					hash.put(Berlaku, Berlaku);
					
					data.add(hash);
					
					ktp[i] = (i+1) + 
							"\n NIK			 =" +data.get(i).get(Nik) +
							"\n Nama			 =" +data.get(i).get(Nama)  +
							"\n Tempat/Tgl Lahir	 =" +data.get(i).get(TTL)+
							"\n Alamat			 =" +data.get(i).get(Alamat)+
							"\n RT/RW			 =" +data.get(i).get(Rt)+"/"+data.get(i).get(Rw)+
							"\n Desa			 =" +data.get(i).get(Desa)+
							"\n Kecamatan		 =" +data.get(i).get(Kec)+
							"\n Agama			 =" +data.get(i).get(Agama)+
							"\n Status Perkawinan	 =" +data.get(i).get(Status)+
							"\n Pekerjaan		 =" +data.get(i).get(Pekerjaan)+
							"\n Masa Berlaku		 =" +data.get(i).get(Berlaku)+ "\n";
			//	data.stream().forEach(System.out::println);
				//	Collections.sort(data.add(hash));
					
				}
			}
			catch(java.util.InputMismatchException a){
				System.out.println("Maaf inputan tidak valid ");
			}
			catch(ArrayIndexOutOfBoundsException a){
				System.out.println("Maaf inputan data ektp sudah penuh");
				System.out.println("Ingin mencoba kembali ? Y/N :");
				try{
					pilihan = input.next();
				}
				catch(Exception e){
					System.out.println("Maaf data tidak valid");
				}
				if(pilihan=="n" || pilihan=="N"){
					break;
				}
			}
			break;
			case 2:
				System.out.println("\n===List Data eKTP===");
				
				if(ktp[0] != null){
					try{
						for (int i = 0; i < jumlah ; i++){
							System.out.println(ktp[i]);
						}
					}
					catch(ArrayIndexOutOfBoundsException e){
						System.out.println("Maaf data yang di inputkan salah");
					}
					
				}
				else{
					System.out.println("Data kosong\n");
				}
				System.out.println("Menu :");
				System.out.println("1. Back ");
				System.out.println("2. Exit ");
				try{
					pilih = input.nextInt();	
				}
				catch(java.util.InputMismatchException a){
					System.out.println("Maaf inputan tidak valid " +a);
					break;   
				}
				if(pilih==1){
					running = true;

				}else{
					System.exit(0);
					}
				break;
			
			case 3:
				int i = 1;
				System.out.println("===Cari Data eKTP===\n");
				System.out.println("Masukkan Data Yang Ingin Dicari :");
				read = input.nextLine();
				
				
				
			
				
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Maaf, menu yang anda pilih tidak ada");
		
		
			}
		}

	}

}
