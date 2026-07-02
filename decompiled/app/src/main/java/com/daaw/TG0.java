package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
public class TG0 extends DialogFragment {
    public static C0425Bg1 B = new C0425Bg1();

    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ EditText B;
        public final /* synthetic */ long C;

        public a(EditText editText, long j) {
            this.B = editText;
            this.C = j;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            TG0.B.a(this.B.getContext(), Long.valueOf(this.C), this.B.getText().toString());
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC1765Ob1.g(TG0.this.getDialog());
        }
    }

    public static TG0 a(Long l, String str) {
        TG0 tg0B = b(l.longValue(), str);
        AbstractC1765Ob1.w(tg0B, "RenamePlaylistDialog");
        return tg0B;
    }

    public static TG0 b(long j, String str) {
        TG0 tg0 = new TG0();
        Bundle bundle = new Bundle();
        bundle.putLong("arg1", j);
        bundle.putString("arg2", str);
        tg0.setArguments(bundle);
        return tg0;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        long j = arguments.getLong("arg1");
        String string = arguments.getString("arg2");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.S, null);
        builder.setView(viewInflate);
        EditText editText = (EditText) viewInflate.findViewById(AbstractC5056hD0.P0);
        if (string == null) {
            editText.setText(JD0.Q0);
        } else {
            editText.setText(string);
        }
        builder.setTitle(JD0.c1);
        builder.setPositiveButton(JD0.b1, new a(editText, j));
        builder.setNegativeButton(JD0.S0, new b());
        return builder.create();
    }
}
