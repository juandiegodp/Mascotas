package com.juandiegodp.tareamascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.juandiegodp.tareamascotas.R;

public class ActivityContacto extends AppCompatActivity {

    private Button botonEnviarCorreo;
    private EditText nombre, email, mensaje;

    String emailUsuario;
    String nombreUsuario;
    String mensajeUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar2);
        setSupportActionBar(miActionBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        botonEnviarCorreo = (Button) findViewById(R.id.botonEnviarMensaje);
        nombre = (EditText) findViewById(R.id.etNombreFormulario);
        email = (EditText) findViewById(R.id.etEmailFormulario);
        mensaje = (EditText) findViewById(R.id.etMensajeFormulario);

        botonEnviarCorreo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nombreUsuario=nombre.getText().toString();
                emailUsuario=email.getText().toString();
                mensajeUsuario = mensaje.getText().toString();

                Intent sendEmail = new Intent(Intent.ACTION_SEND);
                sendEmail.setType("plain/text");
                sendEmail.putExtra(Intent.EXTRA_EMAIL, new String[]{emailUsuario});
                sendEmail.putExtra(Intent.EXTRA_TEXT, mensajeUsuario);
                sendEmail.putExtra(Intent.EXTRA_SUBJECT, "Mensaje Enviado desde Petagram, por " + nombreUsuario);
                startActivity(Intent.createChooser(sendEmail, "Elige una app: "));
            }
        });


    }

}