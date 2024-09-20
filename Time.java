public class Time {
    private int[] hour;
    private int[] minute;
    private int[] second;

    // Constructor that initializes arrays
    public Time(int[] hour, int[] minute, int[] second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // Getter for hour array
    public int[] getHour() {
        return hour;
    }

    // Getter for minute array
    public int[] getMinute() {
        return minute;
    }

    // Getter for second array
    public int[] getSecond() {
        return second;
    }

    // Method to set time arrays
    public void setTime(int[] hour, int[] minute, int[] second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void nextSecond() {
        for (int i = 0; i < second.length; i++) {
            second[i]++;
            if (second[i] == 60) {
                second[i] = 0;
                minute[i]++;
                if (minute[i] == 60) {
                    minute[i] = 0;
                    hour[i]++;
                    if (hour[i] == 24) {
                        hour[i] = 0; // Reset to 0 if it exceeds 23
                    }
                }
            }
        }
    }

    // Method to decrement the seconds
    public void previousSecond() {
        for (int i = 0; i < second.length; i++) {
            second[i]--;
            if (second[i] < 0) {
                second[i] = 59;
                minute[i]--;
                if (minute[i] < 0) {
                    minute[i] = 59;
                    hour[i]--;
                    if (hour[i] < 0) {
                        hour[i] = 23; // Reset to 23 if it goes below 0
                    }
                }
            }
        }
    }

    // Method to return time as a string for the first element of each array
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour[0], minute[0], second[0]);
    }

    // Method to print all time values from arrays as strings
    public String allTimesToString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < hour.length; i++) {
            result.append(String.format("%02d:%02d:%02d", hour[i], minute[i], second[i])).append("\n");
        }
        return result.toString();
    }
}
