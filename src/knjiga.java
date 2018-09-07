import java.util.Date;

public class knjiga {
	
	private int numberOfBook;
	private String nameOfBook;
	private boolean statusOfBook;
	private Date dateOfUse;
	
	public knjiga(){
		
	}
	
	public knjiga(int numberOfBook,String nameOfBook){
		this.numberOfBook=numberOfBook;
		this.nameOfBook=nameOfBook;
	
	}
	
	public int getNumberOfBook() {
		return numberOfBook;
	}

	public void setNumberOfBook(int numberOfBook) {
		this.numberOfBook = numberOfBook;
	}

	public String getNameOfBook() {
		return nameOfBook;
	}

	public void setNameOfBook(String nameOfBook) {
		this.nameOfBook = nameOfBook;
	}

	public boolean isStatusOfBook() {
		return statusOfBook;
	}

	public void setStatusOfBook(boolean statusOfBook) {
		this.statusOfBook = statusOfBook;
	}

	public Date getDateOfUse() {
		return dateOfUse;
	}

	public void setDateOfUse(Date dateOfUse) {
		this.dateOfUse = dateOfUse;
	}

	
	
	
	
	
	

}






