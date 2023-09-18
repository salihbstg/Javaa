package gokhanSoru;

public class Main {

	public static void main(String[] args) {
		
		EYT salih=new EYT(1990,"isci","Erkek");
		salih.emeklilikSorgula(5500, "4A");
		salih.setMaas(8000, 5500);
	}
	
}
class EYT{
	private String ucretRolu,EmeklilikRolu,Yas;
	private int SGK_GirisYil;
	EYT(int SGK_GirisYil,String ucretRolu,String EmeklilikRolu){
		this.SGK_GirisYil=SGK_GirisYil;
		this.EmeklilikRolu=EmeklilikRolu;
		this.ucretRolu=ucretRolu;
	}
	EYT(String ucretRolu,String EmeklilikRolu,String Yas,int SGK_GirisYil){
		this.ucretRolu=ucretRolu;
		this.EmeklilikRolu=EmeklilikRolu;
		this.Yas=Yas;
		this.SGK_GirisYil=SGK_GirisYil;
	}
	public void emeklilikSorgula(int CalismaSuresi,String meslek) {
		if(EmeklilikRolu=="Kadin") {	
			if(2023-this.SGK_GirisYil>20) {				
				if(meslek=="4A") {
					CalismaSuresi*=1.15;		
				}
				if(CalismaSuresi>5000) {
					System.out.println("Emekli olabilirsiniz");
				}
				else
					System.out.println("Emekli olamazsiniz");
			}
		}
		if(EmeklilikRolu=="Erkek") {
			if(2023-this.SGK_GirisYil>25) {
				if(meslek=="4A") {
					CalismaSuresi*=1.20;
				}
				if(meslek=="4B" || meslek=="4C") {
					CalismaSuresi*=1.07;
				}
				if(CalismaSuresi>5500) {
					System.out.println("Emekli olabilirsiniz");
				}
				else
					System.out.println("Emekli olamazsiniz");
			}	
		}
	}	
	public void setMaas(int primGunu,int primTL) {
		if(ucretRolu=="isci") {
			if(primGunu>5000*1.11 && primGunu<5000*1.2) {
				System.out.println("Maasiniz:"+(5500+(primTL*0.11)));
			}
			if(primGunu>5000*1.21 && primGunu>5000*1.5) {
				System.out.println("Maasiniz:"+(6750+(primTL*0.13)));
			}
		}
		if(ucretRolu=="memur") {
			if(primGunu>5200*1.11 && primGunu<5200*1.2) {
				System.out.println("Maasiniz:"+(7500+(primTL*0.03)));
			}
			if(primGunu>5200*1.21 && primGunu<5200*1.5) {
				System.out.println("Maasiniz:"+(7500+(primTL*0.06)));
			}
		}
	}
}
