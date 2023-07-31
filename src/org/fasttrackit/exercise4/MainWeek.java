package org.fasttrackit.exercise4;

public class MainWeek {
    public static void main(String[] args) {

        ActivitiesForTheWeek monday = new ActivitiesForTheWeek(DaysOfTheWeek.Monday);
        monday.addActivity("activity 1");
        monday.addActivity("activity 2");
        monday.addActivity("activity 3");
        monday.addActivity("activity 4");
        System.out.println(monday);

        ActivitiesForTheWeek tuesday = new ActivitiesForTheWeek(DaysOfTheWeek.Tuesday);
        tuesday.addActivity("activity 1");
        tuesday.addActivity("activity 2");
        System.out.println(tuesday);

        ActivitiesForTheWeek wednesday = new ActivitiesForTheWeek(DaysOfTheWeek.Wednesday);
        wednesday.addActivity("activity 1");
        System.out.println(wednesday);

        //etc...
    }
}
