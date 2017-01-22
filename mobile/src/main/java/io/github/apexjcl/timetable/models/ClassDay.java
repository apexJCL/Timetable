package io.github.apexjcl.timetable.models;

import java.util.Date;

import io.realm.RealmObject;

/**
 * Created by zero_ on 22/01/2017.
 */

public class ClassDay extends RealmObject {

    private long id;
    private Day day;
    private Date beginHour;
    private Date endHour;

}
