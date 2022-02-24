package com.OOAD;

public class Manual implements TuneStrategy {
	public Manual()
	{
	}


	@Override
	public void tune()
	{
		out.("Tuned");
	}
}