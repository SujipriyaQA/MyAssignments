package week1.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library obj = new Library();
		
		String book = obj.addBook("Romans");
		 System.out.println(book);
		obj.issueBook();

	}

}
