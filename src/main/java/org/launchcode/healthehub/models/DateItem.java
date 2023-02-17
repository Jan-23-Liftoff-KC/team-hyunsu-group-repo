package org.launchcode.healthehub.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DateItem {
    String date;

    public DateItem(String date) {

      this.date = date;


    }
}
class sortItems implements Comparator<DateItem> {

    public int compare(DateItem a, DateItem b) {
        return b.date.compareTo(a.date);
    }

}

