package com.example.task1m;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.ImageView;

public class sixscreen extends AppCompatActivity {

    EditText phone;
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixscreen);
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
