package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.daaw.C10217zg1;
import com.daaw.C2600Vw0;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pN0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC7338pN0 extends DialogFragment {
    public static C0746Eg1 D = new C0746Eg1();
    public static C9938yg1 E = new C9938yg1();
    public static C10217zg1 F = new C10217zg1();
    public TextView B;
    public List C = new LinkedList();

    /* JADX INFO: renamed from: com.daaw.pN0$a */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            DialogFragmentC7338pN0.E.a();
        }
    }

    /* JADX INFO: renamed from: com.daaw.pN0$b */
    public class b implements C10217zg1.a {
        public b() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C2600Vw0.p pVar) {
            DialogFragmentC7338pN0.this.e(pVar);
        }
    }

    public static DialogFragmentC7338pN0 b() {
        DialogFragmentC7338pN0 dialogFragmentC7338pN0 = new DialogFragmentC7338pN0();
        AbstractC1765Ob1.w(dialogFragmentC7338pN0, "ScanPlaylistFilesDialog");
        return dialogFragmentC7338pN0;
    }

    public static void d(C2600Vw0.p pVar) {
        F.a(pVar);
    }

    public boolean c() {
        return this.B != null;
    }

    public final void e(C2600Vw0.p pVar) {
        if (c()) {
            if (pVar.b) {
                this.B.setText(pVar.a);
            } else {
                this.B.setText("..");
                AbstractC1765Ob1.j(this);
            }
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        F.b(new b(), this.C);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.T, null);
        builder.setView(viewInflate);
        this.B = (TextView) viewInflate.findViewById(AbstractC5056hD0.R3);
        builder.setTitle(JD0.d1);
        builder.setNegativeButton(JD0.S0, new a());
        C2600Vw0.p pVar = (C2600Vw0.p) D.a(null);
        if (pVar != null) {
            e(pVar);
        }
        return builder.create();
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        F.c(this.C);
        this.C.clear();
        super.onDestroy();
    }
}
