package com.example.menurestaurante;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuUno extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_uno);
    }
    public void retorna(View vista){
        finish();
    }
    public void platillouno(View V){
        Intent platilloUno=new Intent(this, activity_food_details.class);
        startActivity(platilloUno);

    }
}