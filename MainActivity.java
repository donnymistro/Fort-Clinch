package com.example.android.fortclinch;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    String website = "https://www.floridastateparks.org/park/Fort-Clinch";
    String phoneNumber = "(904) 277 7274";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAddress(View view){
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:30.6701, -81.4346"));
        startActivity(intent);

    }


    public void dialPhoneNumber(View view) {
        Intent intent1 = new Intent(Intent.ACTION_DIAL);
        intent1.setData(Uri.parse("tel:" + phoneNumber));
        if (intent1.resolveActivity(getPackageManager()) != null)
            startActivity(intent1);

    }

    public void goToWebsite (View view){
        Intent intent2 = new Intent(Intent.ACTION_VIEW);
        intent2.setData(Uri.parse(website));
        startActivity(intent2);

    }

}
