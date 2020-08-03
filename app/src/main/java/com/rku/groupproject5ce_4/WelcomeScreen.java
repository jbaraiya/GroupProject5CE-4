package com.rku.groupproject5ce_4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
                Intent intentLogin=new Intent(WelcomeScreen.this,LoginScreen.class);
                startActivity(intentLogin);
                break;
            case R.id.item2:
                Intent intentContentUs=new Intent(WelcomeScreen.this,ContactUs.class);
                startActivity(intentContentUs);
                break;
            case R.id.item3:
                Intent intentAboutUs=new Intent(WelcomeScreen.this,AboutUs.class);
                startActivity(intentAboutUs);
                break;
        }
        return true;
    }
}