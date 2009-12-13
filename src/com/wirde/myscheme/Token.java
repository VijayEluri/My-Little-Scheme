package com.wirde.myscheme;

enum TokenType {
	LPAREN,
	RPAREN,
	INT,
	IDENT,
	TRUET,
	FALSET,
	STRING,
	QUOTE,
	DOT
}

//TODO: member variables --> private?


class Token {
	final TokenType type;
	
	public Token(TokenType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		return type.toString();
	}
}

class StrToken extends Token {
	final String strVal;
	
	public StrToken(String strVal) {
		super(TokenType.STRING);
		this.strVal = strVal;
	}
	
	@Override
	public String toString() {
		return strVal;
	}	
}

class IntToken extends Token {
	final int intVal;
	
	public IntToken(int intVal) {
		super(TokenType.INT);
		this.intVal = intVal;
	}
	
	@Override
	public String toString() {
		return Integer.toString(intVal);
	}	
}

class IdentToken extends Token {
	final String name;
	
	public IdentToken(String name) {
		super(TokenType.IDENT);
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}	
}