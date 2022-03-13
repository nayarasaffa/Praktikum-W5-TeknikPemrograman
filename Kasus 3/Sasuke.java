/**
 * <h1> Kasus 3 : Sasuke </h1>
 * Class Sasuke merupakan Sub Class
 * dimana Class ini mewarisi sifat Itachi Class
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-13-03
 */

public class Sasuke extends Itachi{
	String Dojutsu = "Sharingan";			// Deklarasi String Dojutsu 
	
	void printDojutsu() {
		super.printDojutsu();				/* Panggil method printDojutsu yang ada pada Super Class (Itachi Class)
		 									 * dengan kata kunci super. 
		 									 * Hal ini dilakukan untuk menampilkan String Dojutsu di Super Class ke layar
		 									 */
		System.out.println(this.Dojutsu);	// Print isi dari Stirng Dojutsu ke layar
	}
}
