package Proyecto.Myapplication_clase3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    EditText LadoUno;
    EditText LadoDos;
    TextView Resultado;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        LadoUno =(EditText) findViewById(R.id.resultadoUno);
        LadoDos =(EditText) findViewById(R.id.resultadoDos);
        Resultado =(TextView) findViewById(R.id.result);

        String sideOne = getIntent().getStringExtra("LadoUno");
        String sideTwo = getIntent().getStringExtra("LadoDos");
        String result = getIntent().getStringExtra("result");

        publicarDato1(sideOne);
        publicarDato2(sideTwo);
        publicarDatoR(result);

    }

    public void publicarDato1(String sideOne){

        LadoUno.setText(sideOne);

    }

    public void publicarDato2(String sideTwo){

        LadoDos.setText(sideTwo);

    }

    public void publicarDatoR(String result){

        Resultado.setText(result);

    }


}