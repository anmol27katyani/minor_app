package io.github.octamois.minor;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    //public static final String EXTRA_MESSAGE = "com.example.minor.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState)
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
public class JSONTask extends AsyncTask<URL, String, Void> {

    @Override
    protected Void doInBackground(URL... urls){
        HttpURLConnection connection=null;
        BufferedReader reader = null;
        try {
            URL url=  new URL("https://jsonparsingdemo-cec5b.firebaseapp.com/jsonData/moviesDemoItem.txt");
            connection = (HttpURLConnection) url.openConnection();
            connection.connect();

            InputStream stream  = connection.getInputStream();
            reader = new BufferedReader(new InputStreamReader(stream));

            StringBuffer buffer = new StringBuffer();

            String line = "";
            while ((line=reader.readLine()) != null){
                buffer.append(line);
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection!=null)
            {connection.disconnect();}
            try { if (reader!=null){
                reader.close();}
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        return null;
    }


    @Override
    protected void onPostExecute(String result) {
        super.onPostExecute(s);

    }
}
