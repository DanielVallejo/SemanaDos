package daniel.semana2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DetalleDatos extends AppCompatActivity {
    TextView tvsNombre;
    TextView tvsTelefono;
    TextView tvsmail;
    TextView tvsFecha;
    TextView tvsDescr;
    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_datos);

        //Recibimos los parametros del MainActivity
        //Bundle parametros = getIntent().getExtras();
        //String nombre = parametros.getString(getResources().getString(R.string.pNombre));
        //String fecha = parametros.getString(getResources().getString(R.string.pFecha));
        //String telefono = parametros.getString(getResources().getString(R.string.pTelefono));
        //String mail = parametros.getString(getResources().getString(R.string.pEmail));
        //String descripcion = parametros.getString(getResources().getString(R.string.pDescripcion));



        regresar = (Button) findViewById(R.id.btnEditar);

        tvsNombre = (TextView) findViewById(R.id.tvNombre);
        tvsFecha = (TextView) findViewById(R.id.tvFechaNac);
        tvsTelefono = (TextView) findViewById(R.id.tvTelefono);
        tvsmail = (TextView) findViewById(R.id.tvemail);
        tvsDescr = (TextView) findViewById(R.id.tvDescrip);
        savedInstanceState = getIntent().getExtras();

        if(savedInstanceState !=null){
            String nombre = savedInstanceState.getString("Nombre");
            String fecha = savedInstanceState.getString("Fecha");
            String telefono = savedInstanceState.getString("Telefono");
            String mail = savedInstanceState.getString("Email");
            String descripcion = savedInstanceState.getString("Descripcion");

            //Agregamos los datos en los TextView de esta Ventana
            tvsNombre.setText(nombre);
            tvsFecha.setText(fecha);
            tvsTelefono.setText(telefono);
            tvsmail.setText(mail);
            tvsDescr.setText(descripcion);
        }
    }

    public void regresar(View v){
        //Regresamos con los parametros a edirtar en el MainActivity

        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        //intent.putExtra(getResources().getString(R.string.pNombre),tvsNombre.getText());
        //intent.putExtra(getResources().getString(R.string.pFecha),tvsFecha.getText());
        //intent.putExtra(getResources().getString(R.string.pTelefono),tvsTelefono.getText());
        //intent.putExtra(getResources().getString(R.string.pEmail),tvsmail.getText());
        //intent.putExtra(getResources().getString(R.string.pDescripcion),tvsDescr.getText());

        startActivity(intent);
        //finish();
    }
}
