package com.OOAD;

//a strategy

public class Manual implements TuneStrategy {
	@Override
	public double tune()
	{
		return 0.5;
	}
}