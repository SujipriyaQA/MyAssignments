package week1.day1;

public class Library {
	public static String addBook(String bookTitle)
	{
		System.out.println("Book added successfully");
		return  bookTitle;
	}
	
	public static void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Library objlib = new Library();
		 String book = objlib.addBook("Bible");
		 System.out.println(book);
		 objlib.issueBook();
	}

	
}
