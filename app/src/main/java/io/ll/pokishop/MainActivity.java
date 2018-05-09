package io.ll.pokishop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import io.ll.poki.core.app.Poki;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(Poki.getApplicationContext(), "hello", Toast.LENGTH_SHORT).show();
    }
}
