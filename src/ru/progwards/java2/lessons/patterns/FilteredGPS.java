package ru.progwards.java2.lessons.patterns;

// паттерн Proxy
public class FilteredGPS {
    private GPS point;

    public FilteredGPS(GPS point) {
        this.point = FilterByVelocity.INSTANCE.filterPoint(point);
    }

    public GPS getPoint() {
        return point;
    }
}
