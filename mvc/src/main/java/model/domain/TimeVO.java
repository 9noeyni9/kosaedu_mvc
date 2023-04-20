package model.domain;

public class TimeVO {//getter만 있는 거 VO , getter와 setter 다 있는 거 DTO
	
	private int hour;
	private int minute;
	
	public TimeVO(int hour, int minute) {
		super();
		this.hour = hour;
		this.minute = minute;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	
	
	
}
