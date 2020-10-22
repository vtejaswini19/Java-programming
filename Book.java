import java.io.*;

public class Book {
	private String bookname;
	private String ISBNnumber;
	private String authorName;
	private String publisher;
	public Book() {}
	public Book(String bookname,String ISBNnumber,String authorName,String publisher) {
		this.bookname=bookname;
		this.ISBNnumber=ISBNnumber;
		this.authorName=authorName;
		this.publisher=publisher;
	}
	public void setBookname(String bookname) {
		this.bookname=bookname;
	}
	public void setISBNnumber(String ISBNnumber ) {
		this.ISBNnumber=ISBNnumber;
	}
	public void setAuthorName(String AuthorName) {
		this.authorName=authorName;
	}
	public void setPublisher(String publisher) {
		this.publisher=publisher;
	}
	
	public String getBookname() {
		return bookname;
	}
	public String getISBNnumber() {
		return ISBNnumber;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getPublisher() {
		return publisher;
	}
    public void changebookName(String bookname){
        this.bookname=bookname;
    }
    public void changeisbnNumber(String ISBNnumber){
        this.ISBNnumber=ISBNnumber;
    }
    public void changeauthorName(String authorName){
        this.authorName=authorName;
    }
    public void changepublisher(String publisher){
        this.publisher=publisher;
    }
    
    public String getBookInfo(){
        String val="Book Name is "+this.bookname+","+"ISBN nunber is "+this.ISBNnumber+","+"Author Name is "+this.authorName+","+"Publisher is "+this.publisher+".";
        return val;   
    }
    

	public static void main(String[] args) {
		  Book BookTest[] = new Book[30];
          BookTest[0]= new Book("Java","1585jgyh","5k9","VVIT");
          BookTest[0].changeauthorName("vvit");
          System.out.println(BookTest[0].getBookInfo());
		

	}

}
