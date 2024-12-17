package com.fisat.employeeapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edt1,edt2;
    Button b1;

    String getUser,getPass,res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edt1=(EditText)findViewById(R.id.username);
        edt2=(EditText)findViewById(R.id.password);
        b1=(Button)findViewById(R.id.loginButton);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getUser=edt1.getText().toString();
                getPass=edt2.getText().toString();

                res="INVALID CREDENTIALS";

                if(getUser.equals("admin") && getPass.equals("123")){
                    Intent ob=new Intent(getApplicationContext(), reg.class);
                    startActivity(ob);
                }
                else{
                    Toast.makeText(getApplicationContext(),res,Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}