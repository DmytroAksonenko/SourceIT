package test.java.com.aksonenko.sourceit;

import org.junit.Assert;
import org.junit.Test;

import com.aksonenko.oop.Book;

public class BooksTest {
	String[] authorDanAbnett = {"Dan Abnett"};
	String[] authorHelgeKautz = {"Helge Kautz"};
//	Book first = new Book(9781844164981L, "Horus Rising", authorDanAbnett, "Black Library",
//			2006, 320, 7.97f, "hardcover" );
//	Book second = new Book(9781844167760L, "Prospero Burns", authorDanAbnett, "Black Library",
//			2011, 416, 11.58f, "softcover" );	
//	Book third = new Book(9785998507564L, "Yoshiko - Abyss of the Stars", authorHelgeKautz, "EGOSOFT GmbH",
//			2006, 284, 6.59f, "softcover" );
//	Book forth = new Book(9783833210419L, "Nopileos", authorHelgeKautz, "EGOSOFT GmbH",
//			2004, 387, 4.99f, "softcover" );
//	Book[] books = {first, second, third, forth};
	
	@Test
    public void testSortByPublisher()
    {
		Book first = new Book(9781844164981L, "Horus Rising", authorDanAbnett, "Black Library",
		2006, 320, 7.97f, "hardcover" );
		Book forth = new Book(9783833210419L, "Nopileos", authorHelgeKautz, "EGOSOFT GmbH",
		2004, 387, 4.99f, "softcover" );
		Book[] books = {first, forth};
		Book[] expectedBooks = {forth};
		Assert.assertEquals(Book.booksByPublisher("EGOSOFT GmbH", books), Book.booksByPublisher("EGOSOFT GmbH", expectedBooks));
    }
	
	@Test
    public void testSortByAuthor()
    {
		Book first = new Book(9781844164981L, "Horus Rising", authorDanAbnett, "Black Library",
		2006, 320, 7.97f, "hardcover" );
		Book second = new Book(9781844167760L, "Prospero Burns", authorDanAbnett, "Black Library",
		2011, 416, 11.58f, "softcover" );	
		Book third = new Book(9785998507564L, "Yoshiko - Abyss of the Stars", authorHelgeKautz, "EGOSOFT GmbH",
		2006, 284, 6.59f, "softcover" );
		Book forth = new Book(9783833210419L, "Nopileos", authorHelgeKautz, "EGOSOFT GmbH",
		2004, 387, 4.99f, "softcover" );
		Book[] books = {first, second, third, forth};
		Book[] expectedBooks = {first, second,};
		Assert.assertEquals(Book.booksByAuthor("Dan Abnett", books), Book.booksByAuthor("Dan Abnett", expectedBooks));
    }

}
