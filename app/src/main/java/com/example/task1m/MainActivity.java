package com.example.task1m;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText email,password;
    ImageButton commit;
    Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void onStart() {
        super.onStart();
        email=findViewById(R.id.editText3);
        password=findViewById(R.id.editText2);
        commit=findViewById(R.id.imageButton);
        commit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText()!=null&&password.getText()!=null){
                    String message=" email : "+email.getText().toString()+" phone:"+password.getText().toString();
                    Toast.makeText(getBaseContext(),message,Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(getBaseContext(),"Error please enter data",Toast.LENGTH_LONG).show();
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message=" Sign Up";
                Toast.makeText(getBaseContext(),message,Toast.LENGTH_LONG).show();
            }
        });
}
}

