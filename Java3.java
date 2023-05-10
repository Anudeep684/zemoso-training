/*Write a java function that will ping any host ( given as input ) and computes the median of the time taken to ping.

Use the system ping utility, do not use any deprecated methods.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ping {
    public static double getPingTime(String host) throws Exception {
        Process process = Runtime.getRuntime().exec("ping -c 5 " + host);

        BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));

        String outputLine;
        double[] pingTimes = new double[5];
        int i = 0;

        while ((outputLine = inputStream.readLine()) != null) {
            if (outputLine.contains("time=")) {
                int startIndex = outputLine.indexOf("time=") + 5;
                int endIndex = outputLine.indexOf(" ms");
                String pingTimeString = outputLine.substring(startIndex, endIndex);
                double pingTime = Double.parseDouble(pingTimeString);
                pingTimes[i] = pingTime;
                i++;
            }
        }

        process.waitFor();

        double medianPingTime = getMedian(pingTimes);
        return medianPingTime;
    }

    private static double getMedian(double[] arr) {
        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n / 2] + arr[n / 2 - 1]) / 2.0;
        } else {
            return arr[n / 2];
        }
    }
}


public class Java3 {
    public static void main(String[] args) {
        try {
            double medianPingTime = Ping.getPingTime("www.google.com");
            System.out.println("Median ping time: " + medianPingTime + " ms");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
//write two classes Ping.java and Java3.java in two different files
/*
C:\Zemoso Work\Java assignments>javac Ping.java Java3.java

C:\Zemoso Work\Java assignments>java Java3
Median ping time: 0.0 ms
*/
