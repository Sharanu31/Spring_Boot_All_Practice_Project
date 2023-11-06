package com.petadaption.Pet.Adoption.Platform.exception;

public class DataNotFoundException extends RuntimeException {

	public DataNotFoundException() {
		super("Data Your Searching for is not availabel kindly select other data");
	}

	public DataNotFoundException(String msg) {
		super(msg);
	}
}
