package com.OOAD;

//class for strategy

public class TuneContext{
	private TuneStrategy strategy;

	public TuneContext(TuneStrategy strategy){
		this.strategy = strategy;
	}

	public double gettune() {
		return strategy.tune();
	}

}
