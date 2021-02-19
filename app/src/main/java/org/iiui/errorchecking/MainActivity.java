package org.iiui.errorchecking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String s1[];
    int images[]={R.drawable.flattyre,R.drawable.carbreakdown,R.drawable.carbattery,R.drawable.outoffuel,R.drawable.keylock,R.drawable.cartowing};
    int images1[]={R.drawable.ic_keyboard_arrow_right_black_24dp,R.drawable.ic_keyboard_arrow_right_black_24dp,R.drawable.ic_keyboard_arrow_right_black_24dp,R.drawable.ic_keyboard_arrow_right_black_24dp,R.drawable.ic_keyboard_arrow_right_black_24dp,R.drawable.ic_keyboard_arrow_right_black_24dp};
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = findViewById(R.id.viewpagerid);
        ImageAdapter adapter = new ImageAdapter(this);
        viewPager.setAdapter(adapter);

        recyclerView=findViewById(R.id.recyclerView);
        s1=getResources().getStringArray(R.array.services_name);
        MyAdapter myAdapter=new MyAdapter(this,s1,images,images1);

        recyclerView.setAdapter(myAdapter);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        myAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                if(position==0)
                {
                    Intent intent=new Intent(getApplicationContext(), carserviceshomepage.class);
                    intent.putExtra("keyposition0","position0");
                    startActivity(intent);
                }
                if (position==1)
                {
                    Intent intent=new Intent(getApplicationContext(), carserviceshomepage.class);
                    intent.putExtra("keyposition0","position1");
                    startActivity(intent);
                }
                if (position==2)
                {
                    Intent intent=new Intent(getApplicationContext(), carserviceshomepage.class);
                    intent.putExtra("keyposition0","position2");
                    startActivity(intent);
                }
                if (position==3)
                {
                    Intent intent=new Intent(getApplicationContext(), carserviceshomepage.class);
                    intent.putExtra("keyposition0","position3");
                    startActivity(intent);
                }
                if (position==4)
                {
                    Intent intent=new Intent(getApplicationContext(), carserviceshomepage.class);
                    intent.putExtra("keyposition0","position4");
                    startActivity(intent);
                }
                if (position==5)
                {
                    Intent intent=new Intent(getApplicationContext(), carserviceshomepage.class);
                    intent.putExtra("keyposition0","position5");
                    startActivity(intent);
                }
            }
        });


    }
}
