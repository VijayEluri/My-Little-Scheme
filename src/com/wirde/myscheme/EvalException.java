package com.wirde.myscheme;

public class EvalException extends RuntimeException {

	private static final long serialVersionUID = 8417254090907978402L;

	public EvalException(String expression) {
		super(expression);
	}

}
