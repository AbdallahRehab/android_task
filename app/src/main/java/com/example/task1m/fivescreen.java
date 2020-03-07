package com.example.task1m;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class fivescreen extends AppCompatActivity {

    EditText phone;
    ImageView im;
    //Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fivescreen);
        im=findViewById(R.id.imageView10);
        phone.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                im.setImageResource(R.drawable.group47);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }
}
