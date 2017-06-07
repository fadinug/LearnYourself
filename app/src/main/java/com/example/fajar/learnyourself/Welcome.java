package com.example.fajar.learnyourself;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fajar.learnyourself.Activity.MainActivity;

public class Welcome extends AppCompatActivity {

    //deklarasi variable
    EditText nameedit;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        setTitle("Welcome");

        //inisialisasi komponen di xml ke java
        nameedit = (EditText) findViewById(R.id.nameedittxt);
        submit = (Button) findViewById(R.id.submitbtn);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent submit = new Intent(Welcome.this, MainActivity.class);
                submit.putExtra("name", nameedit.getText().toString());
                startActivity(submit);
                finish();
            }
        });
    }
}
