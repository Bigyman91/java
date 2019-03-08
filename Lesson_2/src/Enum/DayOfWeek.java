package Enum;

public enum DayOfWeek {
    MONDAY(40),
    TUESDAY(32),
    WEDNESDAY(24),
    THURSDAY(16),
    FRIDAY(8),
    SATURDAY(0),
    SUNDAY(0);
    private int WorkingHours;

    DayOfWeek(int workingHours) {
        WorkingHours = workingHours;
    }

    public static void getWorkingHours(DayOfWeek val) {
        if (val.WorkingHours != 0) {
            System.out.println("До конца рабочей недели осталось " + val.WorkingHours);
        }else System.out.println("выходной день");
    }
}
