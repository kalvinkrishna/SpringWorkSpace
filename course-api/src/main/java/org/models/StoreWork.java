package org.models;

import java.sql.Time;

public class StoreWork {
	
	private Time open;
	private Time close;
	
	public StoreWork(Time open, Time close) {
		super();
		this.open = open;
		this.close = close;
	}

	public Time getOpen() {
		return open;
	}

	public void setOpen(Time open) {
		this.open = open;
	}

	public Time getClose() {
		return close;
	}

	public void setClose(Time close) {
		this.close = close;
	}
	
	
}
