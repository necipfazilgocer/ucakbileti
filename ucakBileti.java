package ucakBileti;
import java.util.Scanner;
public class ucakBileti {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int yas,tip,km;
		double yasindirimi,yasindirimorani,tipindirimi,tipindirimorani,sonfiyat,hamfiyat;
		
		tipindirimorani=1;
		yasindirimorani=1;
		
		System.out.println("Yolculuk yapacağınız mesafeyi km cinsinden giriniz.");
		km=scanner.nextInt();
		hamfiyat=km*(0.1);
		System.out.println("Yapmak istediğiniz yolculuk;");
		System.out.println("-Tek yön ise 1:");
		System.out.println("-Çift yön ise 2:");
		tip=scanner.nextInt();
		System.out.println("Yaşınızı giriniz.");
		yas=scanner.nextInt();
		yasindirimi=hamfiyat-(hamfiyat*yasindirimorani);
		sonfiyat=yasindirimi-(yasindirimi*tipindirimorani);
		
		if((km>0&&yas>0)&&(tip==1||tip==2)) {
			
			if(yas<12)
			{
				yasindirimorani=0.5;
				yasindirimi=hamfiyat-(hamfiyat*yasindirimorani);
			}
			else if(yas<25 && yas>=12)
			{
				yasindirimorani=0.1;
				yasindirimi=hamfiyat-(hamfiyat*yasindirimorani);
			}
			
			else if (yas>65)
			{
				yasindirimorani=0.3;
				yasindirimi=hamfiyat-(hamfiyat*yasindirimorani);
			}
			else {
				yasindirimorani=1;
				yasindirimi=hamfiyat;
			}
			
			if(tip==2)
			{
				tipindirimorani=0.2;
				sonfiyat=(yasindirimi-(yasindirimi*tipindirimorani))*2;
			
			}
			
			else if(tip==1)
			{
				tipindirimorani=1;
				sonfiyat=yasindirimi;
			}
			
			
			
		}
		
	
		else
			
		{
			System.out.println("Hatalı giriş");
		}
		System.out.println("Sayın müşterimiz "+km+" km mesafeli uçuşunuz için toplam "+sonfiyat+" tl ödemeniz bulunmaktadır.");

			
	}
}
