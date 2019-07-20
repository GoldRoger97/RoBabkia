package com.example.hamza.robabkia;

import android.app.ProgressDialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class RegistrationActivity extends AppCompatActivity {
private Button mRegister;
private EditText mName,mPhoneNumber,mPassword;
private ProgressDialog progressBar;




    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


           mRegister=findViewById(R.id.registrastion);
            mName=findViewById(R.id.name);
            mPhoneNumber=findViewById(R.id.phone_number);
            mPassword=findViewById(R.id.password);


        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAccount();
            }
        });


    }

    private void CreateAccount() {

        String enteredName = mName.getText().toString();
        String enteredphone = mPhoneNumber.getText().toString();
        String enteredPasword = mPassword.getText().toString();
        if(enteredName.isEmpty())
        {
            Toast.makeText(getApplicationContext(),"please enter your name ...",Toast.LENGTH_SHORT).show();
        }
        if(enteredphone.isEmpty())
        {
            Toast.makeText(getApplicationContext(),"please enter your yourphone ...",Toast.LENGTH_SHORT).show();
        }
        if(enteredPasword.isEmpty())
        {
            Toast.makeText(getApplicationContext(),"please enter your password ...",Toast.LENGTH_SHORT).show();
        }
        else{
            progressBar.setTitle("create Account");
            progressBar.setMessage("please wait untill cheaking the info");
            progressBar.setCanceledOnTouchOutside(false);
            progressBar.show();
            validatePhoneNumber(enteredName,enteredPasword,enteredphone);
        }
    }

    private void validatePhoneNumber(String enteredName, String enteredPasword, String enteredphone) {

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference();
        ref.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                if((DataSnapshot.child("user").child))
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

    }


}
