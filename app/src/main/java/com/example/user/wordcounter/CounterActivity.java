package com.example.user.wordcounter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by user on 13/12/2016.
 */
public class CounterActivity extends AppCompatActivity {
    TextView countText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        countText = (TextView) findViewById(R.id.count_text);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("counter");
        countText.setText(answer);
    }
}
