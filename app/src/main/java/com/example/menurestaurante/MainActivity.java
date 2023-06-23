package com.example.menurestaurante;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.Struct;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ingresa(View V){
        Intent intento=new Intent(this, MenuUno.class);

        startActivity(intento);

        TextView text= findViewById(R.id.correoUsr);
        EditText usr=findViewById(R.id.correoUsr);

        System.out.println(text);
        String usuario=        usr.getText().toString();
        System.out.println(usuario );

    }
}