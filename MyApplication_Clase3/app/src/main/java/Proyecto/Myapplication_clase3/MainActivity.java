package Proyecto.Myapplication_clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String TAG ="Depuracion";

    EditText sideOne, sideTwo;
    TextView result;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG, "Estoy en OnCreate");

        sideOne= (EditText) findViewById(R.id.sideOne);
        sideTwo=(EditText) findViewById(R.id.sideTwo);
        result=(TextView) findViewById(R.id.result);
        calculate=(Button) findViewById(R.id.calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float valor1 = Float.parseFloat(sideOne.getText().toString());
                float valor2 = Float.parseFloat(sideTwo.getText().toString());
                float resultado = valor1*valor2;

                result.setText(String.valueOf(resultado));
                gotoActividad2(view);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Entre a OnStar");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "Entre a OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Entre a OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Entre a OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Entre a OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Entre a OnDestroy");
    }

    public void gotoActividad2(View view){


        Intent pasarDatos = new Intent(this,MainActivity2.class);
        pasarDatos.putExtra("LadoUno",sideOne.getText().toString());
        pasarDatos.putExtra("LadoDos",sideTwo.getText().toString());
        pasarDatos.putExtra("result",result.getText().toString());

        startActivity(pasarDatos);



    }
}