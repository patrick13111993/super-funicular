package com.example.user.wordcounter;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.user.wordcounter.R;

/**
 * Created by user on 13/12/2016.
 */
public class WordCounter extends AppCompatActivity {
    EditText enterEditText;
    Button countButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterEditText = (EditText) findViewById(R.id.enter_text);
        countButton = (Button) findViewById(R.id.count_button);

        countButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String count = enterEditText.getText().toString();
                Counter counter = new Counter();
                int result = counter.getWordCount(count);
                String answer = Integer.toString(result);

                Intent intent = new Intent(WordCounter.this, CounterActivity.class);
                intent.putExtra("counter", answer);

                startActivity(intent);
            }
        });
    }
}