package com.aug21;


public class Book1 implements Comparable<Book1> {

		int book1Id;
		String author1, publisher1, name1;
		int quantity1;		
		Book1(int book1Id, String author1,String publisher1, String name1, int quantity1){
			this.book1Id=book1Id;
			this.author1=author1;
			this.publisher1=publisher1;
			this.name1=name1;
			this.quantity1=quantity1;

	}
		@Override
		public int compareTo(Book1 o) {
			if(book1Id>o.book1Id) {
				return 1;
			}else if(book1Id<o.book1Id) {
				return -1;
			}else {
				return 0;
			}
		}

}
