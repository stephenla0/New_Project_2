package com.OOAD;

public class TuneContext{
	private TuneStrategy strategy;

	public TuneContext(TuneStrategy strategy){
		this.strategy = strategy;
	}

	public void tune() {
		this.strategy.tune();
	}

}
