package com.example.demo.entity;

import javax.persistence.Entity;

@Entity
public class Test {
private int id;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}
}
