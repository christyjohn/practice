package sec04.expressions_statements;

public class SecondsAndMinutes {
    public static final String INVALID_VALUE_MESSAGE = "Invalid vvalue";
    public static void main(String[] args) {
        System.out.println(getDurationString(122, 5));
        System.out.println(getDurationString((120 * 60) + 125));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59))
            return INVALID_VALUE_MESSAGE;
        else {
            int hours = 0;
            int secondsInMinutes = 60;
            int secondsinHour = secondsInMinutes * 60;

            int totalSeconds = (minutes * 60 + seconds);
            hours = totalSeconds / secondsinHour;
            minutes = (totalSeconds % secondsinHour) / secondsInMinutes;
            seconds = seconds % secondsInMinutes;

            String hoursString = hours +"h";
            if (hours < 10)
                hoursString = "0" + hoursString;

            String minuteString = minutes +"m";
            if (minutes < 10)
                minuteString = "0" + minuteString;

            String secondsString = seconds +"s";
            if (seconds < 10)
                secondsString = "0" + secondsString;


            return hoursString + " " + minuteString + " " + secondsString;
        }
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0)
            return INVALID_VALUE_MESSAGE;
        else {
            int secondsInMinutes = 60;
            int minutes = seconds / secondsInMinutes;
            seconds = seconds % secondsInMinutes;
            return getDurationString(minutes, seconds);
        }
    }
}
