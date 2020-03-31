package com.BDND.stegno;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView Nav_view;
    ImageView addimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawerLayout = findViewById(R.id.drawer);
        Nav_view = findViewById(R.id.nav_view);
        Nav_view.setNavigationItemSelectedListener(this);
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        addimg = findViewById(R.id.addimg);
        addimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), secondactivity.class));
            }
        });

    }
        public boolean onNavigationItemSelected (@NonNull MenuItem item) {

        switch (item.getItemId ()){

            case R.id.nav_home:
                startActivity (new Intent ( getApplicationContext (),MainActivity.class ));
                break;

            case R.id.nav_about:
            startActivity (new Intent ( getApplicationContext (),About.class ));
            break;

            case R.id.nav_feedback:
            startActivity (new Intent ( getApplicationContext (),Feedback.class ));
            break;

            case R.id.contect_us:
            startActivity (new Intent ( getApplicationContext (),Contectus.class ));
            break;

            case R.id.nav_exit:
            finish ();
            break;


            default:
                Toast.makeText ( this , "coming soon..." , Toast.LENGTH_SHORT ).show ();
            }
                return false;
            }


    }

