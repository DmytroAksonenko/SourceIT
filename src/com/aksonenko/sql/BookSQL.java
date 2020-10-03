package com.aksonenko.sql;

public class BookSQL {
	/*
	-----------------------------------------------------------
	authors:
	author_id | first_name |  second_name  | day | month | year
		1			Dan		Abnett 			 12 	10	   1965
		2			Helge	Kautz			 14		2	   1967
		3			Graham	McNeill			 15		8	   1971
		4			Aaron	Dembski-Bowden	 3		8	   1980
	-----------------------------------------------------------
	books:
	book_id |		 		title	 			| year
		1	 Horus Rising 	  					  2006
		2	 Prospero Burns	  					  2011
		3 	 Yoshiko - Abyss of the Stars		  2006
		4	 Nopileos							  2004
		5	 Legion								  2008
		6	 Fulgrim							  2007
		7	 Eye of Terra						  2016
	-----------------------------------------------------------
	books_authors:
	book_id	|	author_id
		1			1
		2			1
		3			2
		4			2
		5			1
		6			3
		7			3
		7			4
	-----------------------------------------------------------
	*/
	
	//1 - авторы которые написали две и более книги (GROUP BY and HAVING)
	/*
 		SELECT COUNT(*) as books, a.first_name, a.second_name
		FROM authors a
		JOIN books_authors bas
		ON a.author_id = bas.author_id
		GROUP BY a.author_id
		HAVING COUNT(*) >=2;
	 */
	
	//2 - книги, написанные двумя и более авторами (GROUP BY and HAVING)
	/*
		SELECT COUNT(*) as authors, b.title
		FROM books b
		JOIN books_authors bas
		ON b.book_id = bas.book_id
		GROUP BY b.book_id
		HAVING COUNT(*) >=2;
	 */
	
	//3 - авторы рожденные в промежутке между 50 и 70 годами (WHERE)
	/*
	 	SELECT first_name, second_name
		FROM authors
		WHERE year > 1949 AND year < 1971;
	 */
	
	//4 - количество книг, написанных авторами, рожденных в промежутке между 50 и 70 годами
	/*
	 	SELECT COUNT(*) as books, a.first_name, a.second_name
		FROM authors a
		JOIN books_authors bas
		ON a.author_id = bas.author_id
		WHERE year > 1949 AND year < 1971
		GROUP BY a.author_id; 
	 */
}
