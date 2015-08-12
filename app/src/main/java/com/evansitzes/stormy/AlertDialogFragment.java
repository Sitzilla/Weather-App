package com.evansitzes.stormy;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by evan on 8/11/15.
 */
public class AlertDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Context context = getActivity();
        AlertDialog.Builder builder = new AlertDialog.Builder(context)
                .setTitle((context.getString(R.string.error_title)))
                .setMessage(R.string.error_message)
                .setPositiveButton(R.string.error_okay_button_text, null);

        AlertDialog dialog = builder.create();
        return dialog;
    }
}
