/**
 * <h1> Kasus 2 : Restaurant </h1>
 * Class Restaurant mengimplementasikan aplikasi untuk mendefinisikan
 * struktur data yang diperlukan oleh Objek RestaurantMain
 * 
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-03-10
 */

public class Restaurant {
	/* Semua variabel diberikan access private agar sesuai dengan konsep OOP*/
	private String[] nama_makanan;
	private double[] harga_makanan;
	private int[] stok;
	private static byte id=0;
	
	/* Constructor */
	public Restaurant() {
		nama_makanan = new String[10];
		harga_makanan = new double[10];
		stok = new int[10];
	}
	
	/* Method tambahMenuMakanan untuk menambah menu makanan, harga, dan stok*/
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.nama_makanan[id] = nama;
		this.harga_makanan[id] = harga;
		this.stok[id] = stok;
	}
	
	/* Method ampilMenuMakanan untuk menampilkan nama makanan, harga, dan stok*/
	public void tampilMenuMakanan() {
		for(int i=0; i<=id; i++) {
			if(! isOutOfStock(i)) {
				System.out.println(nama_makanan[i] +"["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
			}
		}
	}
	
	/* Method pembelian sebagai fitur pemesanan dan mengurangi setiap stok yang ada */
	public void pembelian(String nama, int jml) {
		for(int i=0; i<=id; i++) {
			if(nama_makanan[i].equalsIgnoreCase(nama)) {
				if(! isOutOfStock(i) && jml <= stok[i]) {	// Pemesanan dilakukan ketika pesanan tidak melebihi stok yang ada
					stok[i] = stok[i] - jml;
					System.out.println(nama_makanan[i]+"(x"+jml+")\tHarga: "+harga_makanan[i]*jml);	// Menampilkan pesanan
				}else {
					System.out.println(nama_makanan[i]+" Out of stock");	// Menampilkan peringatan bahwa pesanan habis
				}
			}
		}
	}
	
	/* Method isOutOfStock untuk mengecek ketersediaan stok */
	public boolean isOutOfStock(int id) {
		if(stok[id] == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	/* Method nextId untuk menambah elemen array */
	public static void nextId() {
		id++;
	}
}
