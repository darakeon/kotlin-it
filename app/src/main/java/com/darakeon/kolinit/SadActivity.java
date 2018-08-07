package com.darakeon.kolinit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SadActivity extends AppCompatActivity {

    public static Boolean ImSad = true;

    public String MyNameIs = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sad);

        Button sad_button = findViewById(R.id.sad_button);

        sad_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    showText("Hey, listen!");
                } catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        });
    }

    private void showText(String text) throws Exception
    {
        if (text == null)
            throw new Exception();

        Toast.makeText(
            this,
            text,
            Toast.LENGTH_SHORT
        ).show();
    }
}
