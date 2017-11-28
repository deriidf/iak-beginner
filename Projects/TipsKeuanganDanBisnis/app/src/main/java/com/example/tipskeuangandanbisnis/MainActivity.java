package com.example.tipskeuangandanbisnis;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tipsBerhentiBoros(View v){
        startActivity(new Intent(this, TipsBerhentiBorosActivity.class));
    }

    public void tipsHematUang(View v){
        startActivity(new Intent(this, TipsHematUangActivity.class));
    }
    public void tipsMembeliSaham(View v){
        startActivity(new Intent(this, TipsMembeliSahamActivity.class));
    }
    public void tipsNabung(View v){
        startActivity(new Intent(this, TipsNabungActivty.class));
    }
    public void tipsNagihUtang(View v){
        startActivity(new Intent(this, TipsNagihUtangActivity.class));
    }
}
