package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public class X2 extends DialogFragment {
    public static C10217zg1 C = new C10217zg1();
    public int B = 0;

    public class a implements View.OnClickListener {
        public final /* synthetic */ EditText B;

        public a(EditText editText) {
            this.B = editText;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (X2.this.B == 0) {
                this.B.setText(JD0.L0);
            } else if (X2.this.B == 1) {
                this.B.setText(JD0.M0);
            } else if (X2.this.B == 2) {
                this.B.setText(JD0.N0);
            } else if (X2.this.B == 3) {
                this.B.setText(JD0.O0);
            } else if (X2.this.B == 4) {
                this.B.setText("http://yt-dash-mse-test.commondatastorage.googleapis.com/media/oops-20120802-manifest.mpd");
            } else if (X2.this.B == 5) {
                this.B.setText("http://wams.edgesuite.net/media/MPTExpressionData02/BigBuckBunny_1080p24_IYUV_2ch.ism/manifest(format=mpd-time-csf)");
            } else if (X2.this.B == 6) {
                this.B.setText("http://playready.directtaps.net/smoothstreaming/TTLSS720VC1/To_The_Limit_720.ism/Manifest");
            } else if (X2.this.B == 7) {
                this.B.setText("http://playready.directtaps.net/smoothstreaming/TTLSS720VC1/To_The_Limit_720_688.ismv");
            } else if (X2.this.B == 8) {
                this.B.setText("http://techslides.com/demos/sample-videos/small.flv");
            }
            X2 x2 = X2.this;
            x2.B = (x2.B + 1) % 9;
        }
    }

    public class b implements DialogInterface.OnClickListener {
        public final /* synthetic */ EditText B;

        public b(EditText editText) {
            this.B = editText;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            X2.C.a(this.B.getText().toString());
        }
    }

    public class c implements DialogInterface.OnClickListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC1765Ob1.g(X2.this.getDialog());
        }
    }

    public static X2 c() {
        X2 x2 = new X2();
        AbstractC1765Ob1.w(x2, "AddLinkDialog");
        return x2;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.f, null);
        builder.setView(viewInflate);
        EditText editText = (EditText) viewInflate.findViewById(AbstractC5056hD0.M0);
        editText.setText(JD0.K0);
        ((TextView) viewInflate.findViewById(AbstractC5056hD0.h4)).setOnClickListener(new a(editText));
        builder.setTitle(JD0.P0);
        builder.setPositiveButton(JD0.I0, new b(editText));
        builder.setNegativeButton(JD0.S0, new c());
        return builder.create();
    }
}
