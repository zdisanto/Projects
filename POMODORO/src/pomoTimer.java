class pomoTimer{
	private int hour;
	private int minute;
	private int second;
	
	public pomoTimer() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
		// OR JUST:
		// setTime(0, 0, 0);
	}
	public pomoTimer(int hr, int min, int sec) {
		setTime(hr,min, sec);
	}
	public void setTime(int hr, int min, int sec) {
		hour = hr;
		minute = min;
		second = sec;
	}
	public void printTime() {
		System.out.println(hour + ":" + minute + ":" + second);
	}
	public void tick() {
		second++;
		if(second > 60) {
			minute++;
			second = 0;
		}
		if(minute > 60) {
			hour++;
			minute= 0;
		}
		if(hour > 24) {
			hour =0;
		}
	}
}