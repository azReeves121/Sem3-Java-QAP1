


public class TestTime {
    public static void main(String[] args) {
        
        Time t1 = new Time(new int[]{0}, new int[]{0}, new int[]{0});
        Time t2 = new Time(new int[]{0}, new int[]{0}, new int[]{0});

        
        t1.setTime(new int[]{21}, new int[]{10}, new int[]{15});
        t2.setTime(new int[]{10}, new int[]{20}, new int[]{25});

        
        System.out.println("Original Time t1: " + t1.toString());
        System.out.println("Original Time t2: " + t2.toString());

        
        t1.nextSecond();
        t2.previousSecond();

        
        System.out.println("After nextSecond for t1: " + t1.toString());
        System.out.println("After previousSecond for t2: " + t2.toString());
    }
}

