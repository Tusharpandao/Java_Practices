package day22;


public class EnumMethods {
    public static void main(String[] args) {
    // 1. Using values() to get all enum constants
    Day [] daysOfWeek= Day.values();
    System.out.println("All days of the week:");
    for (Day day : daysOfWeek) {
    System.out.println(day);
    }
    // 2. Using ordinal() to get the position of the enum constants
    System.out.println("\nOrdinal values of enum constants:");
    for (Day day :daysOfWeek) {
    System.out.println(day + " is at position: " + day.ordinal());
    }
    // 3. Using name() to get the name of an enum constant
    Day today = Day.WEDNESDAY;
    System.out.println("\nToday's name using name() method:" + today.name());
    }
}