package com.prestige;

import java.util.Set;

public class Book {

   private int bookid;
   private String bookname;
   private Set<Author> ibook;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public Set<Author> getIbook() {
	return ibook;
}
public void setIbook(Set<Author> ibook) {
	this.ibook = ibook;
}
    
}