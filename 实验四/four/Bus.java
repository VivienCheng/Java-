package four;

public class Bus {
    private String road;
    private String from;
    private String to;

    public Bus(String road, String from, String to) {
        this.road = road;
        this.from = from;
        this.to = to;
    }

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
    
}