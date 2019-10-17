package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Person;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   // private Intent llamda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     /*   Bundle bb= getIntent().getExtras();
       /* String Nombre= bb.getString("Nombre")!=null?bb.getString("Nombre"):"no tiene nombre";
        String Edad= bb.getString("Edad");

        Toast.makeText(this, "Nombre"+ " " + "Edad", Toast.LENGTH_SHORT).show();*/

       /* Persona p = (Persona) bb.getSerializable("Persona");
        Toast.makeText(this, p.getNombre()+ " " + p.getEdad(), Toast.LENGTH_SHORT).show();

        Intent llamada = new Intent(Intent.ACTION_CALL,Uri.parse("871-176-50.65"));

        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE)== PackageManager.PERMISSION_GRANTED){
            startActivity(llamda);
            Toast.makeText(this, "Permiso concedido", Toast.LENGTH_SHORT).show();
        }else{
            explicarUsoPermiso();
            solicitarPermisoLlamada();
        }*/


                
        Button button0 = (Button) findViewById(R.id.btnCero);
        Button button1 = (Button)findViewById(R.id.btnUno);
        Button button2 = (Button)findViewById(R.id.btnDos);
        Button button3 = (Button)findViewById(R.id.btnTres);
        Button button4 = (Button)findViewById(R.id.btnCuatro);
        Button button5 = (Button)findViewById(R.id.btnCinco);
        Button button6 = (Button)findViewById(R.id.btnSeis);
        Button button7 = (Button)findViewById(R.id.btnSiete);
        Button button8 = (Button)findViewById(R.id.btnOcho);
        Button button9 = (Button)findViewById(R.id.btnNueve);
        Button buttonpoint = (Button)findViewById(R.id.btnPunto);
        Button buttonmore = (Button)findViewById(R.id.btnSuma);
        Button buttonmenos = (Button)findViewById(R.id.btnResta);
        Button buttondivi = (Button)findViewById(R.id.btnDivision);
        Button buttonmulti = (Button)findViewById(R.id.btnMulti);
        Button buttonigual = (Button)findViewById(R.id.btnIgual);
        Button buttonC = (Button)findViewById(R.id.btnBorrar);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonpoint.setOnClickListener(this);
        buttonmore.setOnClickListener(this);
        buttonmenos.setOnClickListener(this);
        buttondivi.setOnClickListener(this);
        buttonmulti.setOnClickListener(this);
        buttonigual.setOnClickListener(this);
        buttonC.setOnClickListener(this);

    }

    /*private void solicitarPermisoLlamada() {
        ActivityCompat.requestPermissions(this, new String[]{android.Manifest.permission.CALL_PHONE}, 1);
        Toast.makeText(this, "Pedimos el permiso", Toast.LENGTH_SHORT).show();
    }

    private void explicarUsoPermiso() {
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, android.Manifest.permission.CALL_PHONE )){
            Toast.makeText(this, "Explicamos el permiso", Toast.LENGTH_SHORT).show();
        }
    }*/

    double num=0;
    double num2=0, res=0;



    public void pulsa(View view) {
        TextView pantalla = findViewById(R.id.Numero);
            switch (view.getId())
            {
                case R.id.btnCero:
                {
                    pantalla.setText(pantalla.getText() + "0");
                    break;
                }
                case R.id.btnUno:
                {
                    pantalla.setText(pantalla.getText() + "1");
                    break;
                }
                case R.id.btnDos:
                {
                    pantalla.setText(pantalla.getText() + "2");
                    break;
                }
                case R.id.btnTres:
                {
                    pantalla.setText(pantalla.getText() + "3");
                    break;
                }
                case R.id.btnCuatro:
                {
                    pantalla.setText(pantalla.getText() + "4");
                    break;
                }
                case R.id.btnCinco:
                {
                    pantalla.setText(pantalla.getText() + "5");
                    break;
                }
                case R.id.btnSeis:
                {
                    pantalla.setText(pantalla.getText() + "6");
                    break;
                }
                case R.id.btnSiete:
                {
                    pantalla.setText(pantalla.getText() + "7");
                    break;
                }
                case R.id.btnOcho:
                {
                    pantalla.setText(pantalla.getText() + "8");
                    break;
                }
                case R.id.btnNueve:
                {
                    pantalla.setText(pantalla.getText() + "9");
                    break;
                }
                case R.id.btnPunto:
                {
                    pantalla.setText(pantalla.getText() + ".");
                    break;
                }
                case R.id.btnSuma:
                {
                    num= Double.parseDouble(pantalla.getText().toString());
                    break;

                }


                case R.id.btnResta:
                {
                    num= Double.parseDouble(pantalla.getText().toString());
                }
                case R.id.btnDivision:
                {
                    num= Double.parseDouble(pantalla.getText().toString());
                }
                case R.id.btnMulti:
                {
                    num= Double.parseDouble(pantalla.getText().toString());
                }
                case R.id.btnBorrar:
                {
                    Toast.makeText(this, "Ocho", Toast.LENGTH_SHORT).show();
                }
                case R.id.btnIgual:
                {
                    Toast.makeText(this, "Ocho", Toast.LENGTH_SHORT).show();
                }

            }
    }



    @Override
    public void onClick(View v) {
        pulsa(v);
        
    }
}

