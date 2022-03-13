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
	/* Variabel diberikan access private agar sesuai dengan konsep OOP*/
	private static byte id=0;
	
	/* Instansiasi Objek */
	private Menu[] menu = new Menu[10];
	
	/* Constructor */
	public Restaurant() {
		for(int i=0; i<10; i++) {
			menu[i] = new Menu();
		}
	}
	
	/* Method tambahMenuMakanan untuk menambah menu makanan, harga, dan stok*/
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.menu[id].setNama_makanan(nama);
		this.menu[id].setHarga_makanan(harga);
		this.menu[id].setStok(stok);
	}
	
	/* Method ampilMenuMakanan untuk menampilkan nama makanan, harga, dan stok*/
	public void tampilMenuMakanan() {
		for(int i=0; i<=id; i++) {
			if(! isOutOfStock(i)) {
				System.out.println(menu[i].getNama_makanan()+"["+menu[i].getStok()+"]"+"\tRp. "+menu[i].getHarga_makanan());
			}
		}
	}
	
	/* Method pembelian sebagai fitur pemesanan dan mengurangi setiap stok yang ada */
	public void pembelian(String nama, int jml) {
		int stok = 0;
		for(int i=0; i<=id; i++) {
			if(menu[i].getNama_makanan().equalsIgnoreCase(nama)) {
				if(! isOutOfStock(i) && jml <= menu[i].getStok()) {	// Pemesanan dilakukan ketika pesanan tidak melebihi stok yang ada
					stok = menu[i].getStok() - jml;
					menu[i].setStok(stok);
					System.out.println(menu[i].getNama_makanan()+"(x"+jml+")\tHarga: "+menu[i].getHarga_makanan()*jml);	// Menampilkan pesanan
				}else {
					System.out.println(menu[i].getNama_makanan()+" Out of stock");	// Menampilkan peringatan bahwa pesanan habis
				}
			}
		}
	}
	
	/* Method isOutOfStock untuk mengecek ketersediaan stok */
	public boolean isOutOfStock(int id) {
		if(menu[id].getStok() == 0) {
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
