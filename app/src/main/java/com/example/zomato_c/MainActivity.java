package com.example.zomato_c;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
public BottomNavigationView  bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView=findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,new order_frag());
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment=null;
                switch (item.getItemId())
                {
                    case R.id.order:
                      fragment=new order_frag();
                      break;
                    case R.id.goout:
                        fragment=new goout_frag();
                        break;
                    case R.id.Explore:
                        fragment=new explore_frag();
                        break;
                    case R.id.Profile:
                        fragment=new profile_frag();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();


                return true;
            }
        });


    }

}
