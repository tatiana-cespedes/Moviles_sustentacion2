/*package com.tatianacespedes.punto_4;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;

import java.util.Calendar;


public class PickerDialogs extends DialogFragment {
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Datos1 dateSettings = new Datos1(getActivity());
        Calendar calendario = Calendar.getInstance();
        int years = calendario.get(Calendar.YEAR);
        int months = calendario.get(Calendar.MONTH);
        int days= calendario.get(Calendar.DAY_OF_MONTH);
        DatePickerDialog dialog;
        dialog= new DatePickerDialog(getActivity(), dateSettings, years, months, days);



        return dialog;
    }
}
*/