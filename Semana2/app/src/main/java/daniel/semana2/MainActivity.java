package daniel.semana2;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnFecha, btnSiguiente;
    EditText etcNombre, etcFecha, etcTelefono, etcmail, etcDescr;
    private int dia, mes, anio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recibimos los parametros a editar del DetalleDatos
        //Bundle parametros = getIntent().getExtras();
        //String nombre = parametros.getString(getResources().getString(R.string.pNombre));
        //String fecha = parametros.getString(getResources().getString(R.string.pFecha));
        //String telefono = parametros.getString(getResources().getString(R.string.pTelefono));
        //String mail = parametros.getString(getResources().getString(R.string.pEmail));
        //String descripcion = parametros.getString(getResources().getString(R.string.pDescripcion));



        btnFecha = (Button) findViewById(R.id.btnFec);
        btnSiguiente = (Button) findViewById(R.id.btnSiguiente);
        etcNombre = (EditText) findViewById(R.id.etNombre);
        etcFecha = (EditText) findViewById(R.id.etFecha);
        etcTelefono = (EditText) findViewById(R.id.etTelefono);
        etcmail = (EditText) findViewById(R.id.etEmail);
        etcDescr = (EditText) findViewById(R.id.etDescripcion);

        btnFecha.setOnClickListener(this);


        //Seteamos los datos que fueron enviados a editar desde la Ventana DetalleDatos
        //etcNombre.setText(nombre);
        //etcFecha.setText(fecha);
        //etcTelefono.setText(telefono);
        //etcmail.setText(mail);
        //etcDescr.setText(descripcion);

    }

 public void pasarParametros(View view){
        String nombre= etcNombre.getText().toString();
     String fecha= etcFecha.getText().toString();
     String telefono= etcTelefono.getText().toString();
     String email= etcmail.getText().toString();
     String descripcion= etcDescr.getText().toString();
     if(!nombre.matches("") && !fecha.matches("") && !telefono.matches("")&& !email.matches("")&&
             !descripcion.matches("")){
         Intent intent = new Intent(getApplicationContext(), DetalleDatos.class);
         //intent.putExtra(getResources().getString(R.string.pNombre),etcNombre.getText());
         //intent.putExtra(getResources().getString(R.string.pFecha),etcFecha.getText());
         //intent.putExtra(getResources().getString(R.string.pTelefono),etcTelefono.getText());
         //intent.putExtra(getResources().getString(R.string.pEmail),etcmail.getText());
         //intent.putExtra(getResources().getString(R.string.pDescripcion),etcDescr.getText());

         intent.putExtra("Nombre",nombre);
         intent.putExtra("Fecha",fecha);
         intent.putExtra("Telefono",telefono);
         intent.putExtra("Email",email);
         intent.putExtra("Descripcion",descripcion);
         startActivity(intent);

     }else{
         Toast.makeText(this,"Campos Obligatorios",Toast.LENGTH_SHORT).show();
     }

     //finish();
 }


    @Override
    public void onClick(View v) {
        if(v==btnFecha){
            final Calendar calendar = Calendar.getInstance();
            dia = calendar.get(Calendar.DAY_OF_MONTH);
            mes = calendar.get(Calendar.MONTH);
            anio = calendar.get(Calendar.YEAR);

            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                    etcFecha.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                }
            },dia,mes,anio);
            datePickerDialog.show();
            }
        }

}
