package ingpaulin.mbds.ht.nytimessearcharticles.activities.utils;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

/**
 * Created by Ing paulin on 2/18/2018.
 */

public class DatePickerFragment extends DialogFragment {

    DatePickerDialog.OnDateSetListener ondateSet;
    DatePickerDialog.OnCancelListener onCancel;

    public DatePickerFragment() {
    }

    public void setCallBack(DatePickerDialog.OnDateSetListener ondate) {
        ondateSet = ondate;
    }

    public void setCancelCallBack(DatePickerDialog.OnCancelListener oncancel){
        onCancel = oncancel;
    }

    private int year, month, day;

    @Override
    public void setArguments(Bundle args) {
        super.setArguments(args);
        year = args.getInt("year");
        month = args.getInt("month");
        day = args.getInt("day");


    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        DatePickerDialog datePickerDialog =  new DatePickerDialog(
                getActivity(),
                ondateSet,
                year,
                month,
                day);

        return datePickerDialog;
    }
}
