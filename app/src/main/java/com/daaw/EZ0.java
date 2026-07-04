package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: loaded from: classes.dex */
public class EZ0 extends NB {
    public Dialog W0;
    public DialogInterface.OnCancelListener X0;
    public Dialog Y0;

    public static EZ0 Y1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        EZ0 ez0 = new EZ0();
        Dialog dialog2 = (Dialog) AbstractC7506py0.m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        ez0.W0 = dialog2;
        if (onCancelListener != null) {
            ez0.X0 = onCancelListener;
        }
        return ez0;
    }

    @Override // com.daaw.NB
    public Dialog P1(Bundle bundle) {
        Dialog dialog = this.W0;
        if (dialog != null) {
            return dialog;
        }
        V1(false);
        if (this.Y0 == null) {
            this.Y0 = new AlertDialog.Builder((Context) AbstractC7506py0.l(u())).create();
        }
        return this.Y0;
    }

    @Override // com.daaw.NB
    public void X1(FragmentManager fragmentManager, String str) {
        super.X1(fragmentManager, str);
    }

    @Override // com.daaw.NB, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.X0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
