package io.github.apexjcl.timetable.models;

import java.util.Date;

import io.realm.RealmList;
import io.realm.RealmObject;

/**
 * Created by zero_ on 22/01/2017.
 */

public class SchoolClass extends RealmObject {

    private int id;

    private String name;

    private Teacher teacher;
    private Classroom classroom;

    private RealmList<ClassDay> classDays;

}
