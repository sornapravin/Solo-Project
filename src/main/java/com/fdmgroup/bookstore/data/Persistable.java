package com.fdmgroup.bookstore.data;

public interface Persistable extends UserRepository {
	public <T> T save(T t);
}
