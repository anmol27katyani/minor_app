package io.github.octamois.minor;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

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
    public class HttpGetRequest extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... params){

            return null;
        }
        @Override
        protected void onPostExecute(String result){
            super.onPostExecute(result);
        }
    }
    public class SomeOtherClass {
        //Some url endpoint that you may have
        String myUrl = "http://myApi.com/get_some_data";
        //String to place our result in
        String result;
        //Instantiate new instance of our class
        HttpGetRequest getRequest = new HttpGetRequest();
        //Perform the doInBackground method, passing in our url
        result = getRequest.execute(myUrl).get();
    }

}
