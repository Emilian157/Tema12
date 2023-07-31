package org.fasttrackit.exercise4;

import java.util.ArrayList;
import java.util.List;

public class ActivitiesForTheWeek {
    private DaysOfTheWeek day;
    private List<String> activities;

    public ActivitiesForTheWeek(DaysOfTheWeek day) {
        this.day = day;
        this.activities = new ArrayList<>();
    }

    public void addActivity(String activity) {
        activities.add(activity);
    }

    public String toString() {
        return "DaySchedule: " + day + ", activities - " + activities;
    }
}
