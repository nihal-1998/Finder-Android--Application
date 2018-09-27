package com.example.nihalpatel.slashscreen;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button b, c;
    EditText f1, f2, f3, f4, f5, f6, f7, f9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            c = (Button) findViewById(R.id.button2);
            b = (Button) findViewById(R.id.button);
            // f1= (EditText) findViewById(R.id.editText6);
            f7 = (EditText) findViewById(R.id.editText2);
            f5 = (EditText) findViewById(R.id.editText3);
            f4 = (EditText) findViewById(R.id.editText4);
            f3 = (EditText) findViewById(R.id.editText5);
            f9 = (EditText) findViewById(R.id.editText);
            f2 = (EditText) findViewById(R.id.editText8);
            f6 = (EditText) findViewById(R.id.editText7);


            c.setOnClickListener(this);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    f6.setText(" Lost or Found");
                    f7.setText(" What did you find or lost ");
                    f5.setText(" Lost or Found date ");
                    f4.setText(" Lost or Found time");
                    f3.setText(" Your mobile No. ");
                    f9.setText(" place where you found or lost");
                    f2.setText(" Enter description about the thing ");
                }
            });


        }

   // private void startActivities(Intent intent) {
    //}


    @Override
    public void onClick(View view) {
        String s1 = "lostfinder123@gmail.com";
        String s3 = f6.getText().toString();
        String ss = f2.getText().toString() + "\n" + f7.getText().toString() + "\n" + f5.getText().toString() + "\n" + f4.getText().toString() + "\n" + f9.getText().toString() + "\n" + f3.getText().toString();
        String s2 = f2.getText().toString();
        String s7 = f7.getText().toString();
        String s5 = f5.getText().toString();
        String s4 = f4.getText().toString();
        String s9 = f9.getText().toString();
        String s8 = f3.getText().toString();
        if (s3.isEmpty()) {

            Toast.makeText(getApplicationContext(), "Please Fill lost or found", Toast.LENGTH_LONG).show();


        } else if (s7.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please Fill What you Found or Lost", Toast.LENGTH_LONG).show();
        } else if (s5.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please Fill Date", Toast.LENGTH_LONG).show();
        } else if (s4.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please Fill Time", Toast.LENGTH_LONG).show();
        } else if (s8.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please Fill Your Mobile Number", Toast.LENGTH_LONG).show();
        } else if (s9.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please Fill Where you find or lost", Toast.LENGTH_LONG).show();
        } else if (s2.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please Fill description about thing", Toast.LENGTH_LONG).show();
            } else {
                Intent i = new Intent(Intent.ACTION_SEND);
              //  Intent email1 = getPackageManager().getLaunchIntentForPackage("com.google.android.gm");
                //DatagramPacket intent = null;
           // Intent intent = Intent.setData(Uri.parse(""));

            i.putExtra(Intent.EXTRA_TEXT, ss);

                i.putExtra(Intent.EXTRA_SUBJECT, s3);
                //  email.setClassName("com.google.android.gm","com.google.android.gm.ConversationListActivity");
                // Intent mailClient = null;
                //email.setClassName("com.google.android.gm", "com.google.android.gm.ConversationListActivity");
            //   email.setData(Uri.parse("lostfinder123@gmail.com"));
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{s1});
            i.setType("message/rfc822");
            //startActivity(Intent.createChooser(i,"gmail"));
            startActivity(i);








            }
        }
    }


