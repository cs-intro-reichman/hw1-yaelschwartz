// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		String time = args[0];
		int hours = Integer.parseInt("" + time.charAt(0) + time.charAt(1));
		int minutes = Integer.parseInt("" + time.charAt(3) + time.charAt(4));
        String suffix;
        if (hours < 12) {
            suffix = "AM";
        } else {
            suffix = "PM";
        }

        if (hours > 12) {
            hours = hours - 12;
        }

        if (hours == 0) {
            hours = 0;
        }
        System.out.print(hours + ":");

        if (minutes < 10) {
            System.out.print("0");
        }
        System.out.print(minutes + " ");
        System.out.println(suffix);
	}
}