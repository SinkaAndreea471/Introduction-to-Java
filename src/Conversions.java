public class Conversions {
    public float degreeconversion (int x){
        return 5/9f*(x-32);
    }
    public float metricconversion (float inches){
        return (inches*2.54f)/100;
    }
    public void speed (int meters, int hour, int minutes, int seconds) {
        System.out.println("meters per second:  " + meters / (hour * 3600f + minutes * 60f + seconds));
        System.out.println("km per hour:  " + meters/(1000f * (hour + minutes / 60f + seconds / 3600f)));
        System.out.println("miles per hour:  " + meters /(1609f * (hour + minutes / 60f + seconds / 3600f)));
    }
}
