package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableRow;
import android.widget.TextView;
import com.daaw.C2078Qw0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class KU0 extends DialogFragment {
    public static C0529Cg1 B = new C0529Cg1();

    public static KU0 a(Context context, C2078Qw0 c2078Qw0) {
        KU0 ku0C = c(context, c2078Qw0);
        AbstractC1765Ob1.w(ku0C, "SongDetailsDialog");
        return ku0C;
    }

    public static String b(int i) {
        if (i <= 0) {
            return "";
        }
        return "" + i;
    }

    public static KU0 c(Context context, C2078Qw0 c2078Qw0) {
        KU0 ku0 = new KU0();
        ArrayList<String> arrayList = new ArrayList<>();
        C2078Qw0.c cVarK = c2078Qw0.k(context);
        arrayList.add(b(cVarK.l));
        arrayList.add(b(cVarK.m));
        arrayList.add(cVarK.e);
        arrayList.add(cVarK.g);
        arrayList.add(cVarK.f);
        arrayList.add(cVarK.h);
        arrayList.add(b(cVarK.n));
        arrayList.add(cVarK.p);
        if (cVarK.o > 0) {
            arrayList.add("" + (cVarK.o / 1000) + "kbps");
        } else {
            arrayList.add("");
        }
        if (cVarK.j <= 0 || cVarK.k <= 0) {
            arrayList.add("");
        } else {
            arrayList.add("" + cVarK.j + "x" + cVarK.k);
        }
        String strD = cVarK.a.d();
        String strE = cVarK.a.e();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", cVarK.b ? 1 : 0);
        bundle.putString("argSrc", c2078Qw0.g());
        bundle.putString("argSrcFile", cVarK.a.b);
        bundle.putStringArrayList("arg2", arrayList);
        bundle.putString("arg3", strD);
        bundle.putString("arg4", strE);
        bundle.putString("arg5", cVarK.a.a.toString());
        bundle.putString("arg6", cVarK.a.b());
        ku0.setArguments(bundle);
        return ku0;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        arguments.getInt("arg1");
        String string = arguments.getString("argSrc");
        String string2 = arguments.getString("argSrcFile");
        ArrayList<String> stringArrayList = arguments.getStringArrayList("arg2");
        String string3 = arguments.getString("arg3");
        arguments.getString("arg4");
        Uri uri = Uri.parse(arguments.getString("arg5"));
        String string4 = arguments.getString("arg6");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.V, null);
        builder.setView(viewInflate);
        ((TextView) viewInflate.findViewById(AbstractC5056hD0.A3)).setText(string);
        if (string2 == null || string2.length() <= 0) {
            viewInflate.findViewById(AbstractC5056hD0.B2).setVisibility(8);
        } else {
            viewInflate.findViewById(AbstractC5056hD0.B2).setVisibility(0);
            ((TextView) viewInflate.findViewById(AbstractC5056hD0.B3)).setText(string2);
        }
        TableRow[] tableRowArr = {(TableRow) viewInflate.findViewById(AbstractC5056hD0.C2), (TableRow) viewInflate.findViewById(AbstractC5056hD0.E2), (TableRow) viewInflate.findViewById(AbstractC5056hD0.F2), (TableRow) viewInflate.findViewById(AbstractC5056hD0.G2), (TableRow) viewInflate.findViewById(AbstractC5056hD0.H2), (TableRow) viewInflate.findViewById(AbstractC5056hD0.I2), (TableRow) viewInflate.findViewById(AbstractC5056hD0.J2), (TableRow) viewInflate.findViewById(AbstractC5056hD0.K2), (TableRow) viewInflate.findViewById(AbstractC5056hD0.L2), (TableRow) viewInflate.findViewById(AbstractC5056hD0.D2)};
        TextView[] textViewArr = {(TextView) viewInflate.findViewById(AbstractC5056hD0.C3), (TextView) viewInflate.findViewById(AbstractC5056hD0.E3), (TextView) viewInflate.findViewById(AbstractC5056hD0.F3), (TextView) viewInflate.findViewById(AbstractC5056hD0.G3), (TextView) viewInflate.findViewById(AbstractC5056hD0.H3), (TextView) viewInflate.findViewById(AbstractC5056hD0.I3), (TextView) viewInflate.findViewById(AbstractC5056hD0.J3), (TextView) viewInflate.findViewById(AbstractC5056hD0.K3), (TextView) viewInflate.findViewById(AbstractC5056hD0.L3), (TextView) viewInflate.findViewById(AbstractC5056hD0.D3)};
        if (stringArrayList != null) {
            for (int i = 0; i < stringArrayList.size(); i++) {
                if (stringArrayList.get(i) == null || stringArrayList.get(i).isEmpty()) {
                    tableRowArr[i].setVisibility(8);
                } else {
                    tableRowArr[i].setVisibility(0);
                    textViewArr[i].setText(stringArrayList.get(i));
                }
            }
        }
        B.a(new G3(uri, string3, string4), (ImageView) viewInflate.findViewById(AbstractC5056hD0.x1), Boolean.FALSE, Boolean.TRUE);
        builder.setNegativeButton(JD0.V0, new a());
        return builder.create();
    }

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
        }
    }
}
