package com.tatianacespedes.moviles_sustentacion2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //punto 2
   /* private EditText etermino1, etermino2;
    private Button bcalcular;
    private RadioButton rbsuma, rbresta, rbmultiplicacion, rbdivision;
    private TextView tresultado, toperador;
    private double sum=0, res=0, mul=0, div=0;*/

    //punto 3
   /* private RadioButton rbcuadro, rbtriangulo, rbrectangulo, rbcirculo;
    private TextView targumento1, targumento2, tresultado3;
    private EditText eargumento1, eargumento2;
    private Button bcalculararea;
    private double cuad=0, trian=0, rect=0, circ=0;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //punto2
        /*etermino1= (EditText) findViewById(R.id.etermino1);
        etermino2= (EditText) findViewById(R.id.etermino2);
        bcalcular=(Button) findViewById(R.id.bcalcular);
        rbsuma= (RadioButton) findViewById(R.id.rbsuma);
        rbresta= (RadioButton) findViewById(R.id.rbresta);
        rbmultiplicacion= (RadioButton) findViewById(R.id.rbmultiplicacion);
        rbdivision= (RadioButton) findViewById(R.id.rbdivision);
        tresultado= (TextView) findViewById(R.id.tresultado);
        toperador= (TextView) findViewById(R.id.toperador);
*/

        //punto3
        /*rbcuadro=(RadioButton) findViewById(R.id.cuadro);
        rbtriangulo=(RadioButton) findViewById(R.id.rbtriangulo);
        rbrectangulo=(RadioButton) findViewById(R.id.rbrectangulo);
        rbcirculo=(RadioButton) findViewById(R.id.rbcirculo);
        targumento1=(TextView) findViewById(R.id.targumento1);
        targumento2=(TextView) findViewById(R.id.targumento2);
        eargumento1=(EditText) findViewById(R.id.eargumento1);
        eargumento2=(EditText) findViewById(R.id.eargumento2);
        tresultado3=(TextView) findViewById(R.id.tresultado3);
        bcalculararea=(Button) findViewById(R.id.bcalculararea);*/


      /*  bcalcular.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double term1= Double.valueOf(etermino1.getText().toString());
                double term2= Double.valueOf(etermino2.getText().toString());
                double resul=0;

                if(sum==1){
                    resul=term1+term2;
                    tresultado.setText(""+resul);
                }else if(res==1){
                    resul=term1-term2;
                    tresultado.setText(""+resul);
                }else if(mul==1){
                    resul=term1*term2;
                    tresultado.setText(""+resul);
                }else if(div==1){
                    resul=term1/term2;
                    tresultado.setText(""+resul);
                }else{
                    tresultado.setText("No ha seleccionado operación");
                }
            }
        });*/

        /*bcalculararea.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                double term1= Double.valueOf(eargumento1.getText().toString());
                double term2= Double.valueOf(eargumento2.getText().toString());
                double resul=0;
                if(cuad==1){
                    resul=term1*term1;
                    tresultado.setText(""+resul);
                }else if(trian==1){
                    resul=(term1*term2)/2;
                    tresultado.setText(""+resul);
                }else if(rect==1){
                    resul=term1*term2;
                    tresultado.setText(""+resul);
                }else if(circ==1){
                    resul=term1*term1;
                    tresultado.setText(""+resul);
                }else{
                    tresultado.setText("No ha seleccionado operación");
                }


            }
        });*/

    }


    // Radio Button Punto2
    /*public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.rbsuma:
                if (checked)
                    sum=1;
                    res=0;
                    mul=0;
                    div=0;
                    toperador.setText("+");
                    break;
            case R.id.rbresta:
                if (checked)
                    sum=0;
                    res=1;
                    mul=0;
                    div=0;
                    toperador.setText("-");
                    break;
            case R.id.rbmultiplicacion:
                if (checked)
                    sum=0;
                    res=0;
                    mul=1;
                    div=0;
                    toperador.setText("*");
                    break;
            case R.id.rbdivision:
                if (checked)
                    sum=0;
                    res=0;
                    mul=0;
                    div=1;
                    toperador.setText("/");
                    break;
            default:
                sum=0;
                res=0;
                mul=0;
                div=0;
                toperador.setText(" ");
                break;
        }
    }
*/
    // Radio Button Punto3
    /*public void OnRadioButtomAreas(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch(view.getId()) {
            case R.id.rbcuadro:
                if (checked)
                    targumento1.setText("Lado");
                    targumento1.setEnabled(true);
                    targumento2.setEnabled(false);
                    cuad=1; trian=0; rect=0; circ=0;
                break;
            case R.id.rbtriangulo:
                if (checked)
                    targumento1.setText("Base");
                    targumento1.setEnabled(true);
                    targumento2.setText("Altura");
                    targumento2.setEnabled(false);
                    eargumento2.setEnabled(false);
                    cuad=0; trian=1; rect=0; circ=0;
                    break;
            case R.id.rbrectangulo:
                if (checked)
                    targumento1.setText("Base");
                    targumento1.setEnabled(true);
                    targumento2.setText("Altura");
                    targumento2.setEnabled(true);
                    cuad=0; trian=0; rect=1; circ=0;
                    break;
            case R.id.rbcirculo:
                if (checked)
                    targumento1.setText("Radio");
                    targumento1.setEnabled(true);
                    targumento2.setEnabled(false);
                    eargumento2.setEnabled(false);
                    cuad=0; trian=0; rect=0; circ=1;
                    break;
            default:
                targumento1.setEnabled(false);
                targumento2.setEnabled(false);
                eargumento1.setEnabled(false);
                eargumento2.setEnabled(false);
                cuad=0; trian=0; rect=0; circ=0;
                break;
        }
    }*/

}
