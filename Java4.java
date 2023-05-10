/*Gruber Healthcare has different types of forms for their customer, one of which is a know your customer form ( KYC ) which has to be filled annually. Each form has a date which signifies the date the form was filled called the form date.

Due to government regulations the KYC form can only be filled within + or - 30 days of the signup anniversary of a customer. When filling it up, you have to provide the form date. If you are past the +-30 day anniversary then you can back-date it so that it falls in the +-30-day window. When filling it up you cannot use a future date for the form date.

For Example, assuming today is 4 Apr 2017 and I had signed up on 1st Mar 2014, my window for KYC submission this year would be 30 Jan 2017 to 31 Mar 2017. Since it is already 4th Apr - I would have to back-date the KYC to a date in this range.

Note: The KYC form can be filled only for the closest anniversary in the past or within 30 days range in future.
Anniversary refers to same day and month every year. If your birthday is 01-02-1992 -then your first anniversary will be 01-02-1993, the 2nd will be 01-02-1994 and so on. 01-02-1992 is not an anniversary.

Given the signup date and the current date, provide the allowable date range for the form date.
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // consume the newline character

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        for (int i = 0; i < n; i++) {
            String[] dates = scanner.nextLine().split(" ");
            LocalDate signupDate = LocalDate.parse(dates[0], formatter);
            LocalDate currentDate = LocalDate.parse(dates[1], formatter);

            LocalDate anniversaryDateThisYear = signupDate.withYear(currentDate.getYear());
            if (anniversaryDateThisYear.isAfter(currentDate)) {
                // customer's signup anniversary has not occurred this year
                anniversaryDateThisYear = anniversaryDateThisYear.minusYears(1);
            }

            LocalDate rangeStartDate = anniversaryDateThisYear.minusDays(30);
            LocalDate rangeEndDate = anniversaryDateThisYear.plusDays(30);

            if (rangeStartDate.isAfter(currentDate) || rangeEndDate.isBefore(signupDate)) {
                // there is no allowable range for KYC form submission
                System.out.println("No range");
            } else {
                // output the allowable range for KYC form submission
                rangeStartDate = rangeStartDate.isBefore(signupDate) ? signupDate : rangeStartDate;
                rangeEndDate = rangeEndDate.isAfter(currentDate) ? currentDate : rangeEndDate;
                System.out.println(rangeStartDate.format(formatter) + " " + rangeEndDate.format(formatter));
            }
        }
        scanner.close();
    }
}
/*
C:\Zemoso Work\Java assignments>javac Java4.java

C:\Zemoso Work\Java assignments>java Java4
5
16-07-1998 27-06-2017
16-06-2016 15-08-2016
04-02-2016 04-04-2017
05-01-2017 06-03-2017
04-05-2017 04-04-2017
No range
04-04-2015 04-04-2016
05-03-2016 04-04-2016
04-04-2015 15-03-2016
04-04-2015 04-05-2015
*/
