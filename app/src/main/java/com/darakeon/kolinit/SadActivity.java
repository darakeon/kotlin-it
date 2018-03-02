package com.darakeon.kolinit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SadActivity extends AppCompatActivity {

    public static Boolean ImHappy = false;

    public String MyNameIs = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sad);

        Button sad_button = findViewById(R.id.sad_button);

        sad_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAppName();
            }
        });
    }

    private void showAppName() {
        Toast.makeText(
            this,
            R.string.app_name,
            Toast.LENGTH_SHORT
        ).show();
    }
}
