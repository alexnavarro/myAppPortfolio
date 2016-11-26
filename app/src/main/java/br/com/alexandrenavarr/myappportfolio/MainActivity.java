package br.com.alexandrenavarr.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_popular_movies).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will lauch my popular movies project", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_stock_hawk).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will lauch my stock hawk project", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_build_it_bigger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will lauch my build id bigger project", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_make_you_app_material).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will lauch my make your app material project", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_go_ubiquitous).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will lauch my got ubiquitous project", Toast.LENGTH_SHORT).show();
            }
        });

        findViewById(R.id.btn_capstone).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "This button will lauch my capstone project", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
