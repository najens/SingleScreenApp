package com.example.android.singlescreenapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button button_sel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddListenerOnButton();
    }

    public void AddListenerOnButton() {
        button_sel = (Button)findViewById(R.id.btnJoin);
        button_sel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                Toast.makeText(MainActivity.this,
                        "Thank You for Joining!",Toast.LENGTH_LONG).show();
            }
        });
    }
}
