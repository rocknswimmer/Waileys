package Waileys.models;

public class Leg {
    private int legId;
    private int runnerId;
    private float distance;
    private boolean complete;
    private String differance;
    private String start_time;
    private String end_time;
    private String mountain_start;
    private String mountain_end;
    private String pacific_start;
    private String pacific_end;

    //constructor?

    public int getLegId() {
        return legId;
    }

    public void setLegId(int legId) {
        this.legId = legId;
    }

    public int getRunnerId() {
        return runnerId;
    }

    public void setRunnerId(int runnerId) {
        this.runnerId = runnerId;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public String getDifferance() {
        return differance;
    }

    public void setDifferance(String differance) {
        this.differance = differance;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getMountain_end() {
        return mountain_end;
    }

    public void setMountain_end(String mountain_end) {
        this.mountain_end = mountain_end;
    }

    public String getMountain_start() {
        return mountain_start;
    }

    public void setMountain_start(String mountain_start) {
        this.mountain_start = mountain_start;
    }

    public String getPacific_start() {
        return pacific_start;
    }

    public void setPacific_start(String pacific_start) {
        this.pacific_start = pacific_start;
    }

    public String getPacific_end() {
        return pacific_end;
    }

    public void setPacific_end(String pacific_end) {
        this.pacific_end = pacific_end;
    }
}