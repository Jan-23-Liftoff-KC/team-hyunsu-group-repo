package org.launchcode.healthehub.models;

import org.launchcode.healthehub.models.DateItem;
import org.launchcode.healthehub.models.sortItems;
import java.util.ArrayList;
import java.util.Collections;

public class DateComparator {

    public static void main(String[] args) {

        ArrayList<DateItem> datesList = new ArrayList<>();
        datesList.add(new DateItem("11/17/1993"));
        datesList.add(new DateItem("10/24/2009"));
        datesList.add(new DateItem("08/16/1998"));
        datesList.add(new DateItem("07/30/2003"));
        datesList.add(new DateItem("12/03/2020"));

        Collections.sort(datesList, new sortItems());

        for (DateItem d : datesList) {
            System.out.println(d.date);
        }


    }

}
