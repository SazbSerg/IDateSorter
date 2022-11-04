package sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IDateSorterImpl implements IDateSorter {

    @Override
    public Collection<LocalDate> sortDates(List<LocalDate> unsortedDates) {
        Collection<LocalDate> resultList = new ArrayList<>();
        List<LocalDate> localDatesWithR = new ArrayList<>();
        List<LocalDate> localDatesWithoutR = new ArrayList<>();

        for (LocalDate localDate : unsortedDates){
            if (localDate.getMonth().toString().contains("R")) {
                localDatesWithR.add(localDate);
            } else {
                localDatesWithoutR.add(localDate);
            }
        }

        Collections.sort(localDatesWithR);
        Collections.reverse(localDatesWithoutR);
        resultList.addAll(localDatesWithR);
        resultList.addAll(localDatesWithoutR);
        return resultList;
    }
}
