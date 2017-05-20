package ktp;

public class kuylah implements Comparable <kuylah> {
		private String nik;
		private String nama;
		private String ttl;
		private String jenisKelamin;
		private String alamat;
		private String rt,rw;
		private String desa;
		private String kec;
		private String agama;
		private String status;
		private String kerja;
		private String warga;
		private String berlaku;
		
		public int compareTo(kuylah b) {
			if(desa.compareTo(b.getDesa()) < 0 ) return -1; 
		      if (desa.compareTo(b.getDesa()) == 0) return 0;
		      if(rt.compareTo(b.getRt()) <0 ) return -1;
		      if(rt.compareTo(b.getRt()) ==0) return 0;
		      if(rw.compareTo(b.getRw()) <0 ) return -1;
		      if(rw.compareTo(b.getRw()) ==0) return 0;
		      
		    return 1; 
		}
		public String getNik() {
			return nik;
		}
		public void setNik(String nik) {
			this.nik = nik;
		}
		public String getNama() {
			return nama;
		}
		public void setNama(String nama) {
			this.nama = nama;
		}
		public String getTtl() {
			return ttl;
		}
		public void setTtl(String ttl) {
			this.ttl = ttl;
		}
		public String getJenisKelamin() {
			return jenisKelamin;
		}
		public void setJenisKelamin(String jenisKelamin) {
			this.jenisKelamin = jenisKelamin;
		}
		public String getAlamat() {
			return alamat;
		}
		public void setAlamat(String alamat) {
			this.alamat = alamat;
		}
		public String getRt() {
			return rt;
		}
		public void setRt(String rt) {
			this.rt = rt;
		}
		public String getRw() {
			return rw;
		}
		public void setRw(String rw) {
			this.rw = rw;
		}
		public String getDesa() {
			return desa;
		}
		public void setDesa(String desa) {
			this.desa = desa;
		}
		public String getKec() {
			return kec;
		}
		public void setKec(String kec) {
			this.kec = kec;
		}
		public String getAgama() {
			return agama;
		}
		public void setAgama(String agama) {
			this.agama = agama;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getKerja() {
			return kerja;
		}
		public void setKerja(String kerja) {
			this.kerja = kerja;
		}
		public String getWarga() {
			return warga;
		}
		public void setWarga(String warga) {
			this.warga = warga;
		}
		public String getBerlaku() {
			return berlaku;
		}
		public void setBerlaku(String berlaku) {
			this.berlaku = berlaku;
}
}

    

