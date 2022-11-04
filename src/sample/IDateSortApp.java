package sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class IDateSortApp {
    public static void main(String[] args) {
        // data for example testing
        List<LocalDate> localDates = new ArrayList<>();
        LocalDate localDate1 = LocalDate.of(2005, 07, 01);
        LocalDate localDate2 = LocalDate.of(2005, 01, 02);
        LocalDate localDate3 = LocalDate.of(2005, 01, 01);
        LocalDate localDate4 = LocalDate.of(2005, 05, 03);
        localDates.add(localDate1);
        localDates.add(localDate2);
        localDates.add(localDate3);
        localDates.add(localDate4);

        IDateSorterImpl test = new IDateSorterImpl();
        System.out.println(test.sortDates(localDates));
    }
}
