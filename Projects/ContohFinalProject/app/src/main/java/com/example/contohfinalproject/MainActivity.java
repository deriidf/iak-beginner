package com.example.contohfinalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sosmed(View v){
//        Intent intent = new Intent(Intent.ACTION_VIEW);
//        intent.setData(Uri.parse("http://github.com/deriidf"));
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://github.com/deriidf")));
    }

    public void aplikasi1(View v){
        startActivity(new Intent(this, Aplikasi1Activity.class));
    }
    public void aplikasi2(View v){
        startActivity(new Intent(this, Aplikasi2Activity.class));
    }
    public void aplikasi3(View v){
        startActivity(new Intent(this, Aplikasi3Activity.class));
    }
}
