package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: com.daaw.c41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC3611c41 extends DialogFragment {

    /* JADX INFO: renamed from: com.daaw.c41$a */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().a0(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.t, false);
        }
    }

    public static DialogFragmentC3611c41 a() {
        DialogFragmentC3611c41 dialogFragmentC3611c41 = new DialogFragmentC3611c41();
        AbstractC1765Ob1.w(dialogFragmentC3611c41, "TipReorderDialog");
        return dialogFragmentC3611c41;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(View.inflate(getActivity(), AbstractC9815yD0.Y, null));
        builder.setTitle(JD0.j1);
        builder.setPositiveButton(JD0.Y0, new a());
        return builder.create();
    }
}
