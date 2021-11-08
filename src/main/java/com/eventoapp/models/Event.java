package com.eventoapp.models;

public class Event {

    private String name;
    private String local;
    private String date;
    private String hour;

    public Event(){
    }

    public Event(String name, String local, String date, String hour) {
        this.name = name;
        this.local = local;
        this.date = date;
        this.hour = hour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
}
