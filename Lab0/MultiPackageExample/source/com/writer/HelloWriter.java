package com.writer;

public class HelloWriter {
	private String hello;

	public HelloWriter(String hello) {
		this.hello = hello;
	}

	public HelloWriter() {
		hello = "Yo";
	}

	public String sayHello(String name) {
		return hello + ", " + name;
	}
}
