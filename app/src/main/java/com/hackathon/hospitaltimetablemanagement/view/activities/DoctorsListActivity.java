package com.hackathon.hospitaltimetablemanagement.view.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

import com.hackathon.hospitaltimetablemanagement.DoctorsAdapter;
import com.hackathon.hospitaltimetablemanagement.R;
import com.hackathon.hospitaltimetablemanagement.model.*;

public class DoctorsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_list);

        ArrayList<DoctorModel> doctors = getData();
        setRecyclerView(doctors);
    }

    /**
     *  This method sets the recycler view
     * @param doctors
     */
    private void setRecyclerView(ArrayList<DoctorModel> doctors) {
        RecyclerView categoriesRecyclerView = (RecyclerView) findViewById(R.id.doctors_recycler_view);
        categoriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        categoriesRecyclerView.setAdapter(new DoctorsAdapter(this, doctors));
    }

    /**
     * This method gets the types of doctors from the database
     */
    private ArrayList<DoctorModel> getData() {
        //TODO - ACCESS THE DATABASE HERE AND GET ALL THE CATEGORIES OF DOCTOR
        ArrayList<DoctorModel> doctors = new ArrayList<>();

        AppointmentModel lAppointmentModel = new AppointmentModel(new Date(),"8-9","23423423");
        ArrayList<AppointmentModel> lAppointmentModelArrayList = new ArrayList<>();
        lAppointmentModelArrayList.add(lAppointmentModel);
        lAppointmentModelArrayList.add(lAppointmentModel);
        lAppointmentModelArrayList.add(lAppointmentModel);
        lAppointmentModelArrayList.add(lAppointmentModel);
        doctors.add(new DoctorModel("123123","Suresh Tripathi","sureshtripathi@gmail.com", "Orthopedic", new Date(), lAppointmentModelArrayList));

        return doctors;
    }
}
