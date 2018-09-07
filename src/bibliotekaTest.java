import java.util.Scanner;

public class bibliotekaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		metode knjiga=new metode();
		
		System.out.println("Dobrodosli u biblioteku!Koju opciju zelite?");
		System.out.println("1.Kreiranje racuna!");
		System.out.println("2.Kreiranje knjige!");
		System.out.println("3.Podizanje knjige!");
		System.out.println("4.Ispisivanje detalja postojecih racuna!");
		System.out.println("5.Ispisivanje detalje o knjizi!");
		int opcija=input.nextInt();
		do{
		try{
				opcija=input.nextInt();
				if(opcija<1 || opcija>5)
					System.out.print("Pogresan unos, pokusajte ponovo.");
			}catch(Exception e){
			System.out.println("Pogresan unos,pokusajte ponovo.");
		}
	}while(opcija<1 || opcija>5);
		
		if(opcija==1){
			System.out.println("Izabrali ste kreiranje racuna!");
			System.out.println("Unesite novi broj racuna!");
			int broj=input.nextInt();
			System.out.println("Unesite ime korisnika!");
			String korisnik=input.nextLine();
			knjiga.createAccount(broj,korisnik);
		
		}
		
		else if(opcija==2){
			System.out.println("Izabrali ste kreiranje knjige!");
			System.out.println("Unesite broj knjige!");
			int broj1=input.nextInt();
			System.out.println("Unesite ime knjige!");
			String ime=input.nextLine();
			knjiga.createBook(broj1,ime);
		}
		else if(opcija==3){
			System.out.println("Izabrali ste podizanje knjige!");
			System.out.println("Unesite broj racuna!");
			int broj2=input.nextInt();
			System.out.println("Unesite broj knjige!");
			int brojKnjige=input.nextInt();
			System.out.println("Unesite datum uzimanja knjige!");
			java.util.Date datumUzimanja=new java.util.Date();
			knjiga.podizanjeKnjige(broj2,brojKnjige,datumUzimanja);
		}
		else if(opcija==4){
			System.out.println("Izabrali ste detalje o racunu!");
			knjiga.informationOfAccount();
		}
		else if(opcija==5){
			System.out.println("Izabrali ste detalje o knjizi!");
			knjiga.informationOfBook();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
		}
	
	
	






	}


