package com.informatico.ibero.entreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE="com.example.miapp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }

        public void OnclicEnviarMensaje(View view){
        Intent intentact=new Intent(this,ActivityDisplay.class);
        EditText editText=(EditText)findViewById(R.id.edtmensjaenviar);
        String mensaje=editText.getText().toString();
        intentact.putExtra(EXTRA_MESSAGE,mensaje);
        startActivity(intentact);
        }
}