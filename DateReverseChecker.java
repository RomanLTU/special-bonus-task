import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateReverseChecker {

    public static void main(String[] args) {
        printBonusDatesBetween(2010, 2015);
    }

    public static void printBonusDatesBetween(int fromYear, int toYear) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        for (int year = fromYear; year <= toYear; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= 31; day++) {
                    try {
                        LocalDate date = LocalDate.of(year, month, day);
                        String formattedDate = date.format(formatter);
                        String reversed = new StringBuilder(formattedDate).reverse().toString();
                        
                        if (formattedDate.equals(reversed)) {
                            System.out.println(formattedDate);
                        }
                    } catch (Exception e) {

                    }
                }
            }
        }
    }
}
