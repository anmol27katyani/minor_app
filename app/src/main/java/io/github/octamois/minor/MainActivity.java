package io.github.octamois.minor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
import android.annotation.SuppressLint;
import android.support.v4.app.NavUtils;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //public static final String EXTRA_MESSAGE = "com.example.minor.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessageFaculty(View view) {
        Intent intent = new Intent(this, facultyLoginPage.class);
        //EditText editText = (EditText) findViewById(R.id.editText);
        //String message = editText.getText().toString();
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void sendMessageStudent(View view) {
        Intent intent = new Intent(this, studentLoginPage.class);
        startActivity(intent);
    }
}
