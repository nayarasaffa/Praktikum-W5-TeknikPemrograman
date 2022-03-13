/**
 * <h1> Kasus 2 : Menu </h1>
 * Class Menu mengimplementasikan aplikasi untuk mendefinisikan
 * struktur data yang diperlukan oleh Objek Restaurant
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-03-10
 */
public class Menu {
	/* Semua variabel diberikan access private agar sesuai dengan konsep OOP*/
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	/* Penggunaan Method Getter dan Setter*/
	public String getNama_makanan() {
		return nama_makanan;
	}
	public void setNama_makanan(String nama_makanan) {
		this.nama_makanan = nama_makanan;
	}
	public double getHarga_makanan() {
		return harga_makanan;
	}
	public void setHarga_makanan(double harga_makanan) {
		this.harga_makanan = harga_makanan;
	}
	public int getStok() {
		return stok;
	}
	public void setStok(int stok) {
		this.stok = stok;
	}
}
