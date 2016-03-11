package com.tatianacespedes.punto_4;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.support.v4.app.FragmentActivity;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends FragmentActivity{
    private EditText eloggin, epassword, ereppass, ecorreo;
    private RadioButton rbfem, rbmas;
    private Spinner sciudades;
    private CheckBox cdeportes, cpeliculas, cviajes;
    private Button baceptar, bfechanac;
    int year_x, month_x, day_x;
    static final int DIALOG_ID =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.punto4);
        
        eloggin =(EditText) findViewById(R.id.eloggin);
        epassword=(EditText) findViewById(R.id.epassword);
        ereppass=(EditText) findViewById(R.id.ereppass);
        ecorreo=(EditText) findViewById(R.id.ecorreo);
        rbfem=(RadioButton) findViewById(R.id.rbfem);
        rbmas=(RadioButton) findViewById(R.id.rbmas);
        sciudades=(Spinner) findViewById(R.id.sciudades);
        cdeportes=(CheckBox)findViewById(R.id.cdeportes);
        cpeliculas=(CheckBox)findViewById(R.id.cpeliculas);
        cviajes=(CheckBox)findViewById(R.id.cviajes);
        baceptar=(Button)findViewById(R.id.baceptar);
        bfechanac=(Button)findViewById(R.id.bfechanac);
        showDialogOnButtonClick();

        baceptar.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View v) {



            }
        });
        bfechanac.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {



            }
        });

    }
    /*public void setDate(View view)    {
        PickerDialogs pickerDialogs = new PickerDialogs();
        pickerDialogs.show(getSupportFragmentManager(), "date_picker");
        //pickerDialogs.show(getSupportFragmentManager(),'');

    }*/
    public void showDialogOnButtonClick(){
        bfechanac = (Button)findViewById(R.id.bfechanac);
        bfechanac.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View v) {
                        showDialog(DIALOG_ID);
                    }


                }
        );
    }

    @Override
    protected Dialog onCreateDialog(int id){
        if(id==DIALOG_ID)
            return new DatePickerDialog(this, dpickerListener, year_x, month_x, day_x);
            return null;


    }
    private  DatePickerDialog.OnDateSetListener dpickerListener = new DatePickerDialog.OnDateSetListener() {

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            year_x=year;
            month_x=monthOfYear;
            day_x=dayOfMonth;
            Toast.makeText(MainActivity.this,year_x+" / "+ month_x +" / "+day_x,Toast.LENGTH_LONG).show();
        }
    };

}
