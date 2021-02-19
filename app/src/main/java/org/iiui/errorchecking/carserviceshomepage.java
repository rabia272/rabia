package org.iiui.errorchecking;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class carserviceshomepage extends AppCompatActivity {
    String carbreakdownservicesnames[], prices1[];
    String cartowingservicesnames[], prices2[];
    String carkeylockservicesnames[], prices3[];
    String caroutoffuelservicesnames[], prices4[];
    String carbatteryjumperservicesnames[], prices5[];
    String carflattyreservicesnames[], prices6[];

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carserviceshomepage);
        recyclerView = findViewById(R.id.recyclerView1);
        carbreakdownservicesnames = getResources().getStringArray(R.array.Car_Breakdown_Fault);
        prices1 = getResources().getStringArray(R.array.Car_Breakdown_Fault_Prices);

        cartowingservicesnames = getResources().getStringArray(R.array.Car_Towing_Fault);
        prices2 = getResources().getStringArray(R.array.Car_Towing_Fault_Prices);

        carkeylockservicesnames = getResources().getStringArray(R.array.Key_Lockout_Fault);
        prices3 = getResources().getStringArray(R.array.Key_Lockout_Fault_Prices);

        caroutoffuelservicesnames = getResources().getStringArray(R.array.Out_Of_Fuel_Fault);
        prices4 = getResources().getStringArray(R.array.Out_Of_Fuel_Fault_Prices);

        carbatteryjumperservicesnames = getResources().getStringArray(R.array.Battery_Jumper_Fault);
        prices5 = getResources().getStringArray(R.array.Battery_Jumper_Fault_Prices);

        carflattyreservicesnames = getResources().getStringArray(R.array.Flat_Tyre_Fault);
        prices6 = getResources().getStringArray(R.array.Flat_Tyre_Fault_Prices);


        Intent intent = getIntent();
        String pos = intent.getStringExtra("keyposition0");
        System.out.println("Intent is" + pos);


        if(pos.equals("position0"))
        {
           Carservicesadapterclass myAdapter=new Carservicesadapterclass(this,carbreakdownservicesnames,prices1);
            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        if(pos.equals("position1"))
        {
            Carservicesadapterclass myAdapter=new Carservicesadapterclass(this,cartowingservicesnames,prices2);
            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        if(pos.equals("position2"))
        {
            Carservicesadapterclass myAdapter=new Carservicesadapterclass(this,carkeylockservicesnames,prices3);
            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        if(pos.equals("position3"))
        {
            Carservicesadapterclass myAdapter=new Carservicesadapterclass(this,caroutoffuelservicesnames,prices4);
            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        if(pos.equals("position4"))
        {
            Carservicesadapterclass myAdapter=new Carservicesadapterclass(this,carbatteryjumperservicesnames,prices5);
            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }
        if(pos.equals("position5"))
        {
            Carservicesadapterclass myAdapter=new Carservicesadapterclass(this,carflattyreservicesnames,prices6);
            recyclerView.setAdapter(myAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        }


    }
}
