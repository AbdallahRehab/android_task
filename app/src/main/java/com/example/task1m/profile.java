package com.example.task1m;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class profile extends AppCompatActivity {
    EditText user,email,phone,location,language,sex;
    Button updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    @Override
    protected void onStart() {
        super.onStart();
        user=findViewById(R.id.textView12);
        email=findViewById(R.id.textView7);
        phone=findViewById(R.id.editText8);
        location=findViewById(R.id.editText9);
        language=findViewById(R.id.editText10);
        sex=findViewById(R.id.editText11);
        updateButton=findViewById(R.id.button);

        updateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText()!=null&&email.getText()!=null&&phone.getText()!=null&&
                        location.getText()!=null&&language.getText()!=null&&sex.getText()!=null){
                    String message="user: "+user.getText().toString()+" email : "+email.getText().toString()+" phone:"+phone.getText().toString()+
                            "location: "+location.getText().toString()+"language: "+language.getText().toString()+"sex : "+sex.getText().toString();
                    Toast.makeText(getBaseContext(),message,Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getBaseContext(),"Error please enter data",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
