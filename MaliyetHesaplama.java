package MaliyetHesaplama;
import java.util.Scanner;

public class MaliyetHesaplama {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("İşçi sayınızı giriniz:\t");
		int isciSayisi = scanner.nextInt();
		System.out.print("İşçilerinizin kaç gün çalıştığını giriniz:\t");
		double isciCalisma = scanner.nextDouble();
		System.out.print("Resmi açıklanan yövmiye ücretini TL cinsinden giriniz:\t");
		double günlük = scanner.nextDouble();
		
		System.out.print("Su giderinizi giriniz(1 litre fiyatı):\t");
		double su = scanner.nextDouble();	
		System.out.print("Su kullanım miktarını mililitre cinsinden giriniz(1 litre = 1000 mililitre olduğunu unutmayınız):\t");
		double suKullanimi = scanner.nextDouble();
		
		System.out.print("Sebze-meyve giderini giriniz(1 kilo fiyatı):\t");
		double meyveSebze = scanner.nextDouble();		
		System.out.print("Sebze-meyve miktarını gram cinsinden giriniz(1000 gram = 1 kilogram olduğunu unutmayınız):\t");
		double meyveSebzeMiktari = scanner.nextDouble();
		
		System.out.print("Un bir kilogram fiyatını giriniz:\t");
		double unFiyat = scanner.nextDouble();
		System.out.print("Kaç kilogram un kullandığınızı gram cinsinden giriniz(1 kilogram = 1000 gram):\t");
		double unMiktari = scanner.nextDouble();
		
		System.out.print("1 kilogram şeker fiyatını yazınız:");
		double sekerFiyat = scanner.nextDouble();
		System.out.print("Kaç kilogram şeker kullandığınızı gram cinsinden yazınız(1 kilogram = 1000 gram):\t");
		double sekerKullanim = scanner.nextDouble();
		
		System.out.print("Kaç adet yumurta kullandığınızı giriniz:\t");
		double yumurtaAdeti = scanner.nextDouble();
		System.out.print("Yumurta adet fiyatını giriniz:\t");
		double yumurtaFiyati = scanner.nextDouble();
		
		
		System.out.print("Doğalgaz giderini giriniz:\t");
		double dogalgaz = scanner.nextDouble();		
		
		System.out.print("Elektrik giderini giriniz:\t");
		double elektrik = scanner.nextDouble();		
		
		double maliyet = (sekerFiyat*sekerKullanim/1000) + yumurtaAdeti*yumurtaFiyati + (unFiyat*unMiktari/1000) + (isciSayisi*isciCalisma*günlük) + (su*suKullanimi/1000) + (meyveSebze*meyveSebzeMiktari/1000) + dogalgaz + elektrik;
		System.out.println("Aylık gideriniz:\t" + maliyet);
		
	}
}
