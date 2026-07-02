package com.daaw;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class EH extends DialogFragmentC1037Hb0 {
    public static C10217zg1 H = new C10217zg1();
    public static C10217zg1 I = new C10217zg1();
    public static C10217zg1 J = new C10217zg1();
    public static String K = "EulaDialog";

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            EH.I.a(EH.this);
            dialogInterface.dismiss();
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            EH.H.a(EH.this);
            dialogInterface.dismiss();
        }
    }

    public static void i(boolean z) {
        EH eh = new EH();
        Bundle bundle = new Bundle();
        bundle.putBoolean("keyShowCloseButton", false);
        bundle.putInt("licenseResId", GD0.A);
        bundle.putInt("titleResId", 0);
        bundle.putString("extraUrl", "");
        eh.setArguments(bundle);
        eh.setCancelable(false);
        AbstractC1765Ob1.l(eh, K);
    }

    @Override // com.daaw.DialogFragmentC1037Hb0
    public void h(AlertDialog.Builder builder) {
        super.h(builder);
        builder.setNegativeButton(JD0.r1, new a());
        builder.setPositiveButton(JD0.q1, new b());
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        J.a(this);
    }
}
