package com.hackathon.hospitaltimetablemanagement.view.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.hackathon.hospitaltimetablemanagement.adapterr.DoctorCategoriesAdapter;
import com.hackathon.hospitaltimetablemanagement.R;


public class DoctorCategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctors_list);

        String[] categories = getData();
        setRecyclerView(categories);
    }

    /**
     *  This method sets the recycler view
     * @param pCategories
     */
    private void setRecyclerView(String[] pCategories) {
        RecyclerView categoriesRecyclerView = (RecyclerView) findViewById(R.id.doctors_recycler_view);
        categoriesRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        categoriesRecyclerView.setAdapter(new DoctorCategoriesAdapter(this, pCategories));
    }

    /**
     * This method gets the types of doctors from the database
     */
    private String[] getData() {
        //TODO - ACCESS THE DATABASE HERE AND GET ALL THE CATEGORIES OF DOCTOR

        String[] categories = new String[] {"Orthopedic", "Cardiologist"};
        return categories;
    }
}
