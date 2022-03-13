/**
 * <h1> Kasus 3 : NarutoAnime </h1>
 * Class NarutoAnime merupakan main class
 * 
 * @author Nayara Saffa
 * @version 1.0
 * @since 2022-13-03
 */

public class NarutoAnime {
	public static void main(String[] args) {
		Sasuke s = new Sasuke();	// Instansiasi Objek
		s.printDojutsu();			// Panggil method printDojutsu dari Class Sasuke
		
		Itachi i = new Sasuke();	// Instansiasi Objek
		i.printKekkeiGenkai();		// Panggil method printKekkeiGenkai dari Class Itachi
	}
}
