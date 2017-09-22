package com.hackathon.hospitaltimetablemanagement.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by saumy on 9/21/2017.
 */

public class DoctorModel {

    private String uid;
    private String name;
    private String email;
    private String type;
    private Date upcomingLeaves;
    private ArrayList<AppointmentModel> appointments;

    /**
     * Constructor for Doctormodel
     *
     * @param pUid
     * @param pName
     * @param pEmail
     * @param pType
     * @param pUpcomingLeaves
     * @param pAppointments
     */
    public DoctorModel(String pUid, String pName, String pEmail, String pType, Date pUpcomingLeaves, ArrayList<AppointmentModel> pAppointments) {
        uid = pUid;
        name = pName;
        email = pEmail;
        type = pType;
        upcomingLeaves = pUpcomingLeaves;
        appointments = pAppointments;
    }


    private String getUid() {
        return uid;
    }

    private void setUid(String pUid) {
        uid = pUid;
    }

    private String getName() {
        return name;
    }

    private void setName(String pName) {
        name = pName;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String pEmail) {
        email = pEmail;
    }

    private String getType() {
        return type;
    }

    private void setType(String pType) {
        type = pType;
    }

    private Date getUpcomingLeaves() {
        return upcomingLeaves;
    }

    private void setUpcomingLeaves(Date pUpcomingLeaves) {
        upcomingLeaves = pUpcomingLeaves;
    }

    private ArrayList<AppointmentModel> getAppointments() {
        return appointments;
    }

    private void setAppointments(ArrayList<AppointmentModel> pAppointments) {
        appointments = pAppointments;
    }
}
