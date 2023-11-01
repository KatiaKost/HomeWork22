public class Time {

    public static void printTime() {
        for (int hour = 0; hour <= 6; hour++) {
            for (int minute = 0; minute < 60; minute++) {
                for (int second = 0; second < 60; second++) {
                    if (hour > 1 && minute % 10 == 0) {
                        return;
                    }
                    if (second * hour > minute) {
                        break;
                    }
                    System.out.println(hour + ":" + (minute < 10 ? "0" + minute : minute) + ":" + (second < 10 ? "0" + second : second));
                }
            }
        }
    }

    public static void main(String[] args) {
        printTime();
    }

}