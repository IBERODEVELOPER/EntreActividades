package com.informatico.ibero.entreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityDisplay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Intent intent=getIntent();
        String mensagge=intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView=(TextView)findViewById(R.id.tvmensajerecibido);
        String saludo=getString(R.string.mensaje_recibido,mensagge);
        textView.setText(saludo);
    }
}