package control_statements;

public class switchStatement {
    public static void main(String[] args) {
        int day = 4;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }

        System.out.println("The day is: " + dayName);

        //without break statement - fall through next case automatically
        int month = 2;
        String monthName;

        switch (month) {
            case 1:
                monthName = "January";
                // No break statement - falls through to case 2
            case 2:
                monthName = "February";
                // No break statement - falls through to case 3
            case 3:
                monthName = "March";
                break;
            default:
                monthName = "Invalid month";
        }

        System.out.println("The month is: " + monthName);
        //output will be "The month is: March" because of fall through behavior when break statements are not used.
    }
}
