package com.training.visitor.example2;

public class BookCart implements MyVisitable{

	Integer bookList[] = {245,526,768,112,130};
	
	public Integer[] getBookList() {
		return bookList;
	}

	public void setBookList(Integer[] bookList) {
		this.bookList = bookList;
	}

	@Override
	public void accept(MyVisitor visitor) {
		visitor.visit(this);
		
	}

}
