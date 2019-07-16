package com.example.challenge10;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class profilePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("My Profile");

        TextView track = findViewById(R.id.track_v);
        TextView country = findViewById(R.id.country);
        TextView email = findViewById(R.id.email_v);
        TextView phone_no = findViewById(R.id.phoneno_v);
        TextView username_s = findViewById(R.id.username_slack_v);

        track.setText("Android");
        country.setText("Kenya");
        email.setText("zjwafula@gmail.com");
        phone_no.setText("254707096997");
        username_s.setText("@zaibu juma");}
}
