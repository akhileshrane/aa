package Akhilesh;
import java.sql.Time;

public class Bus extends BusStation {

	private String busName;
	private Time arrivalTime; 
	private int waitStatus;
	
	
	
	Bus() {
		super();
	}



	Bus(String busName, Time arrivalTime, int waitStatus) {
		super();
		this.busName = busName;
		this.arrivalTime = arrivalTime;
		this.waitStatus = waitStatus;
	}


	public String getBusName() {
		return busName;
	}


	public void setBusName(String busName) {
		this.busName = busName;
	}


	public Time getArrivalTime() {
		return arrivalTime;
	}


	public void setArrivalTime(Time arrivalTime2) {
		this.arrivalTime = arrivalTime2;
	}



	public int getWaitStatus() {
		return waitStatus;
	}


	public void setWaitStatus(int waitStatus) {
		this.waitStatus = waitStatus;
	}

	@Override
	public String toString() {
		return "Bus [busName=" + busName + ", arrivalTime=" + arrivalTime + ", waitStatus=" + waitStatus + "]";
	}



	public static void main(String[] args) {
	}

}
