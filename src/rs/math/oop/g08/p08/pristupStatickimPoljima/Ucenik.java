package rs.math.oop.g08.p08.pristupStatickimPoljima;

public class Ucenik {
	String imePrezime;
	int razred;
	static int brojKreiranihUcenika = 0;

	public static void main(String[] args) {
		Ucenik prvi = new Ucenik();
        prvi.imePrezime="Петар Перић";
        prvi.razred=3;
        prvi.brojKreiranihUcenika++; // може се приступити преко инстанце
        Ucenik drugi = new Ucenik();
        drugi.imePrezime="Милан Микић";
        drugi.razred=6;
        Ucenik.brojKreiranihUcenika++; // али је преко назива класе природније
        System.out.println(drugi.brojKreiranihUcenika);
	}
}
