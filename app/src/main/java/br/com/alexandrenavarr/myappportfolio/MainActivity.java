package br.com.alexandrenavarr.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showToast(View v) {
        Toast.makeText(getApplicationContext(), String.format("This button will lauch %s project",
                ((Button) v).getText().toString()), Toast.LENGTH_SHORT).show();
    }
}