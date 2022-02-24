package com.OOAD;

public class TuneContext{
	private TuneStrategy strategy;

	public TuneContext(TuneStrategy strategy){
		this.strategy = strategy;
	}

	public double gettune() {
		return strategy.tune();
	}

}
