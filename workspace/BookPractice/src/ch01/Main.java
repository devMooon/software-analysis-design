package ch01;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf();
		
		bookShelf.appendBook(new Book("å1"));
		bookShelf.appendBook(new Book("å2"));
		bookShelf.appendBook(new Book("å3"));
		bookShelf.appendBook(new Book("å4"));
		bookShelf.appendBook(new Book("å5"));
		bookShelf.appendBook(new Book("å6"));
		bookShelf.appendBook(new Book("å7"));
		bookShelf.appendBook(new Book("å8"));
		bookShelf.appendBook(new Book("å9"));
		bookShelf.appendBook(new Book("å10"));
		
		Iterator itr = bookShelf.iterator();
		
		while(itr.hasNext()) {
			System.out.println(((Book)itr.next()).getName());
		}
	}

}
