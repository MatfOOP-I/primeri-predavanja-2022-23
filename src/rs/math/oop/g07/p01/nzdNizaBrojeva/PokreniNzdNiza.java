package rs.math.oop.g07.p01.nzdNizaBrojeva;

public class PokreniNzdNiza {
	public static void main(String[] argumenti) {
		// низ чији се НЗД тражи
		int niz[] = { 24, 48, 96, 192, 36, 72, 144 };
		// приказ низа
		System.out.print("Низ: ");
		for (int i=0; i<niz.length; i++)
			System.out.print(niz[i] + " ");
		System.out.println();
		// одређивање НЗД-а
		int nzd = niz[0];
		for (int i=1; i<niz.length; i++) {
			int element = niz[i];
			nzd = rs.math.oop.g03.p02.strukturnaParadigma.StrukturnoNzd.nzd2(
					nzd, element);
		}
		// приказ резултата
		System.out.print("НЗД низа: " + nzd);
	}
}