package com.fdmgroup.bookstore.data;

public interface Removable extends UserRepository {

	public <T> void delete(T t);
	
}
