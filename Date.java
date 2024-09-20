public class Date {
    private int[] day;
    private int[] month;
    private int[] year;

    // Constructor with arrays
    public Date(int[] day, int[] month, int[] year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter for day array
    public int[] getDay() {
        return day;
    }

    // Getter for month array
    public int[] getMonth() {
        return month;
    }

    // Getter for year array
    public int[] getYear() {
        return year;
    }

    // Setter for day array
    public void setDay(int[] day) {
        this.day = day;
    }

    // Setter for month array
    public void setMonth(int[] month) {
        this.month = month;
    }

    // Setter for year array
    public void setYear(int[] year) {
        this.year = year;
    }

    // Method to set Date
    public void setDate(int[] day, int[] month, int[] year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String printAllDates() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < day.length; i++) {
            result.append(String.format("Date[%d]: Day: %02d, Month: %02d, Year: %04d%n", i + 1, day[i], month[i], year[i]));
        }
        return result.toString();
    }

    

    public String toString() {
        return printAllDates();
    }
}
