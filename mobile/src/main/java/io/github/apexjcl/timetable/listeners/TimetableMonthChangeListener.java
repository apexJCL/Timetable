package io.github.apexjcl.timetable.listeners;

import com.alamkanak.weekview.MonthLoader;
import com.alamkanak.weekview.WeekViewEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zero_ on 22/01/2017.
 */

public class TimetableMonthChangeListener implements MonthLoader.MonthChangeListener {

    @Override
    public List<? extends WeekViewEvent> onMonthChange(int newYear, int newMonth) {
        List<WeekViewEvent> events = new ArrayList<>();
        return events;
    }

}
