package com.fdmgroup.bookstore.model;

enum BookGenre {
	ACTION("Action");
	
	private  String label;
	
	BookGenre(String label) {
		// TODO Auto-generated constructor stub
		this.label=label;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	
}
