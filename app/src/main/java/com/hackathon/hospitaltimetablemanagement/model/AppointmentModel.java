package com.hackathon.hospitaltimetablemanagement.model;

import java.util.Date;

/**
 * Created by saumy on 9/21/2017.
 */

public class AppointmentModel {

    private Date date;
    private String timeslot;
    private String patientUid;

    public AppointmentModel(Date pDate, String pTimeslot, String pPatientUid) {
        date = pDate;
        timeslot = pTimeslot;
        patientUid = pPatientUid;
    }

    private Date getDate() {
        return date;
    }

    private void setDate(Date pDate) {
        date = pDate;
    }

    private String getTimeslot() {
        return timeslot;
    }

    private void setTimeslot(String pTimeslot) {
        timeslot = pTimeslot;
    }

    private String getPatientUid() {
        return patientUid;
    }

    private void setPatientUid(String pPatientUid) {
        patientUid = pPatientUid;
    }
}
