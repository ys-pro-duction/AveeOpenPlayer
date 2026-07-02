package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.pH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC7313pH extends DialogFragment {
    public Dialog B;
    public DialogInterface.OnCancelListener C;
    public Dialog D;

    public static DialogFragmentC7313pH a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        DialogFragmentC7313pH dialogFragmentC7313pH = new DialogFragmentC7313pH();
        Dialog dialog2 = (Dialog) AbstractC7506py0.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        dialogFragmentC7313pH.B = dialog2;
        if (onCancelListener != null) {
            dialogFragmentC7313pH.C = onCancelListener;
        }
        return dialogFragmentC7313pH;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.C;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.B;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.D == null) {
            this.D = new AlertDialog.Builder((Context) AbstractC7506py0.l(getActivity())).create();
        }
        return this.D;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
