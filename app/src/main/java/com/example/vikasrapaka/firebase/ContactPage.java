package com.example.vikasrapaka.firebase;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ContactPage extends AppCompatActivity {

    private EditText name,email,phone;
    private Button saveuser;
    ProgressDialog myProgres;
    DatabaseReference ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact_page);

        name = (EditText) findViewById(R.id.nameEdit);
        email = (EditText) findViewById(R.id.emailEdit);
        phone = (EditText) findViewById(R.id.phoneEdit);

        saveuser = (Button) findViewById(R.id.save);
        myProgres = new ProgressDialog(this);
        myProgres.setMessage("Saving....");
        ref = FirebaseDatabase.getInstance().getReference().child("user");

       saveuser.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               addData();
               saveuser.setEnabled(false);

           }
       });

    }
    public void addData(){

        String Name = name.getText().toString().trim();
        String Email = email.getText().toString().trim();
        String Phno = phone.getText().toString().trim();
        myProgres.show();
        SaveData saveData = new SaveData(Name,Email,Phno);
        ref.push().setValue(saveData);
        myProgres.dismiss();
        Toast.makeText(this, "Save Successfullyyy.....", Toast.LENGTH_LONG).show();

    }


}
