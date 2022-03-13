/**
 * <h1> Kasus 2 : RestaurantMain </h1>
 * Class RestaurantMain mengimplementasikan aplikasi untuk mendefinisikan
 * pembuatan objek-objek Restaurant dan menampilkan objek Restaurant yang
 * telah dibuat.
 * Class RestaurantMain merupakan Main Class
 * 
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-03-10
 */

public class RestaurantMain {
	public static void main(String[] args) {
		/* Instansiasi Objek */
		Restaurant menu = new Restaurant();
		
		/* Menambahkan menu makanan dengan method tambahMenuMakanan
		 * Serta menambah elemen array dengan method nextId
		 */
		System.out.println("====== MENU MAKANAN ======");
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Gehu", 1_000, 20);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Tahu", 1_000, 0);
		Restaurant.nextId();
		menu.tambahMenuMakanan("Molen", 1_000, 20);
		
		/* Menampilkan Menu Makanan*/
		menu.tampilMenuMakanan();
		
		/* Menampilkan pesanan dengan method pembelian */
		System.out.println("====== PESANAN ======");
		menu.pembelian("Bala-Bala", 15);
		menu.pembelian("Gehu", 20);
		menu.pembelian("Tahu", 2);
		menu.pembelian("Molen", 4);
		
		/* Menampilkan menu makanan dengan stok terbaru */
		System.out.println("====== MENU TERBARU ======");
		menu.tampilMenuMakanan();
		
	}
}
