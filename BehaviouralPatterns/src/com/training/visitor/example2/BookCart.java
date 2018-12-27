package com.training.visitor.example2;

public class BookCart implements MyVisitable{

	int bookList[] = {245,526,768,112,130};
	
	public int[] getBookList() {
		return bookList;
	}

	public void setBookList(int[] bookList) {
		this.bookList = bookList;
	}

	@Override
	public void accept(MyVisitor visitor) {
		visitor.visit(this);
		
	}

}
