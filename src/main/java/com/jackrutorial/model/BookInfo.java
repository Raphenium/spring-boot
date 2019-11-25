package com.jackrutorial.model;

public class BookInfo {
	 private String ISBN;
	 private String title;
	 
	 public BookInfo() {
	  super();
	 }
	 public BookInfo(String ISBN, String title) {
	  super();
	  this.ISBN = ISBN;
	  this.title = title;
	 }
	 
	 public String getISBN() {
	  return ISBN;
	 }
	 public void setISBN(String ISBN) {
	  this.ISBN = ISBN;
	 }
	 public String getTitle() {
	  return title;
	 }
	 public void setPassword(String title) {
	  this.title = title;
	 }
	}
