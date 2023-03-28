package com.example.checkbox;

import static com.example.checkbox.R.id.show;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView text, text_2;
    CheckBox book, note, pen;
    Button show;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);
        text_2 = findViewById(R.id.text_2);
        book = findViewById(R.id.book);
        note = findViewById(R.id.note);
        pen = findViewById(R.id.pen);
        show = findViewById(R.id.show);


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                StringBuilder stringBuilder = new StringBuilder();


                if (book.isChecked()){

                    String value = book.getText().toString();
                    stringBuilder.append(value + " is orderd \n");
                }


                if (note.isChecked()){
                    String value = note.getText().toString();
                    stringBuilder.append(value + " is orderd \n");
                }


                if (pen.isChecked()){
                    String value = pen.getText().toString();
                    stringBuilder.append(value + " is orderd \n");
                }

                text_2.setText(stringBuilder);
                Toast.makeText(MainActivity.this, "Thanks for order !", Toast.LENGTH_SHORT).show();

            }
        });


    }

}