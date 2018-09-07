import java.util.ArrayList;
import java.util.Date;

public class metode {

	ArrayList<racun>ListOfAccounts=new ArrayList<>();
	ArrayList<knjiga>ListOfBooks=new ArrayList<>();
	
	public void createAccount(int numberOfAccount,String nameOfUser) {
		
		racun account=new racun(numberOfAccount,nameOfUser);
		boolean valid=true;
		for(racun e:ListOfAccounts){
			if(e.getNumberOfAccount()==numberOfAccount)
				valid=false;
				System.out.println("Racun sa brojem "+numberOfAccount+" vec postoji.");
		}
		if(numberOfAccount<0){
			valid=false;
			System.out.println("Broj racuna ne smije biti negativan.");
		}
		if(valid){
			ListOfAccounts.add(account);
			System.out.println("Uspjesno ste kreirali racun!");
		}
	}
		public void createBook(int numberOfBook,String nameOfBook){
			
			knjiga book=new knjiga(numberOfBook,nameOfBook);
			boolean valid=true;
			for(knjiga e:ListOfBooks){
				if(e.getNumberOfBook()==numberOfBook){
					valid=false;
					System.out.println("Broj knjige "+ numberOfBook + " vec postoji.");
				}
			}
				if(numberOfBook<0){
					valid=false;
					System.out.println("Broj knjige ne smije biti negativan.");
				}
				if(valid){
					ListOfBooks.add(book);
					System.out.println("Uspjesno ste kreirali knjigu.");
				}
		}	
		public void podizanjeKnjige(int numberOfAccount,int numberOfBook,Date dateOfUse){
		
			boolean isValidNumberOfAccount=false;
			boolean isValidNumberOfBook=false;
			boolean isValidPodizanje=false;
			
				for(knjiga k:ListOfBooks){
					if(k.getNumberOfBook()==numberOfBook){
						isValidPodizanje=true;
						if(k.isStatusOfBook()){
						isValidPodizanje=false;
						System.out.println("Izdata je ta knjiga,ne mozete je podici.");
					}
					
					for(racun r:ListOfAccounts){
						if(r.getNumberOfAccount()==numberOfAccount){
							if(r.getNumberOfBooks()==numberOfBook && r.getNumberOfBooks()<3){
						isValidNumberOfAccount=true;
						System.out.println("Broj racuna je vazeci!");
						}
							else{
						System.out.println("Broj racuna nije vazeci, ne mozete uzeti knjigu!");
							}
	
						for(knjiga book:ListOfBooks){
							if(book.getNumberOfBook()!=numberOfBook){
								isValidNumberOfBook=false;
								System.out.println("Ne postoji broj knjige u biblioteci!Ne mozete posuditi knjigu!");
							}
						}
						if(isValidNumberOfAccount && isValidNumberOfBook && isValidPodizanje){
							for(knjiga book:ListOfBooks){
								for(racun racun:ListOfAccounts){
									if(book.getNumberOfBook()==numberOfBook){
										if(racun.getNumberOfAccount()==numberOfAccount){
											book.setStatusOfBook(true);
											racun.setNumberOfBooks(racun.getNumberOfBooks()+1);
										}
										else{
											System.out.println("Knjiga je vracena!");
											book.setStatusOfBook(false);
											racun.getNumberOfBooks();
										}}
									}
								}
							}
						}
						}
					}
				}
		}					
						public void informationOfAccount(){
							for(racun a:ListOfAccounts){
							System.out.println("Broj racuna je korisnika je"+ a.getNumberOfAccount());
							System.out.println("Ime korisnika racuna je:"+a.getNameOfUser());
							System.out.println("Broj posudjenih knjiga je:"+a.getNumberOfBooks());
							}
						}
						public void informationOfBook(){
							for(knjiga k:ListOfBooks){
								System.out.println("Broj knjige je:"+k.getNumberOfBook());
								System.out.println("Ime knjige je:"+k.getNameOfBook());
								System.out.println("Status knjige je:"+k.isStatusOfBook());
								System.out.println("Knjiga je izdata dana:"+k.getDateOfUse());
							}
					








						}
				
			

}
						



