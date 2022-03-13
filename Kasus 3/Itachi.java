/**
 * <h1> Kasus 3 : Itachi </h1>
 * Class Itachi merupakan Sub Class
 * dimana Class ini mewarisi sifat Rikudo Class
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-13-03
 */

public class Itachi extends Rikudo{
	/*
	 * String KekkeiGenkai dan Dojutsu di set sebagai private string 
	 * dan hanya bisa di akses di Itachi Class
	 */
	private String KekkeiGenkai = "Susanoo";
	private String Dojutsu = super.Dojutsu; 	/* String Dojutsu diisi dengan nilai yang diambil 
												   dari variabel Sojutsu yang ada pada super class (Class Rikudo) */ 
	
	void printKekkeiGenkai() {
		System.out.println(this.KekkeiGenkai);	// Print isi dari String KekkeiGenkai ke layar
	}
	
	void printDojutsu() {
		System.out.println(this.Dojutsu);		// Print isi dari Stirng Dojutsu ke layar
		setDojutsu();							// Panggil method setDojutsu untuk mengubah isi dari String Dojutsu
		System.out.println(this.Dojutsu);		// Print isi dari String Dojutsu yang telah diubah
	}
	
	private void setDojutsu() {
		this.Dojutsu = "Mangekyou Sharingan";	// Mengisi data baru ke dalam String Dojutsu
	}
}
