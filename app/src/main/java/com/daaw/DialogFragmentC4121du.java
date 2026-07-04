package com.daaw;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.du, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC4121du extends DialogFragment {
    public static C0425Bg1 B = new C0425Bg1();
    public static C0642Dg1 C = new C0642Dg1();

    /* JADX INFO: renamed from: com.daaw.du$a */
    public class a implements DialogInterface.OnClickListener {
        public final /* synthetic */ EditText B;
        public final /* synthetic */ Spinner C;
        public final /* synthetic */ long[] D;
        public final /* synthetic */ ArrayList E;

        public a(EditText editText, Spinner spinner, long[] jArr, ArrayList arrayList) {
            this.B = editText;
            this.C = spinner;
            this.D = jArr;
            this.E = arrayList;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            String string = this.B.getText().toString();
            int selectedItemPosition = this.C.getSelectedItemPosition();
            if (selectedItemPosition >= 0) {
                C1121Hw0[] c1121Hw0Arr = C1121Hw0.d;
                if (selectedItemPosition < c1121Hw0Arr.length + 1) {
                    if (selectedItemPosition == 0) {
                        DialogFragmentC4121du.B.a(string, this.D, this.E);
                    } else {
                        DialogFragmentC4121du.C.a(null, string, c1121Hw0Arr[selectedItemPosition - 1], this.E, Boolean.TRUE);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.du$b */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            AbstractC1765Ob1.g(DialogFragmentC4121du.this.getDialog());
        }
    }

    public static DialogFragmentC4121du a(long[] jArr, List list) {
        DialogFragmentC4121du dialogFragmentC4121duB = b(jArr, list);
        AbstractC1765Ob1.w(dialogFragmentC4121duB, "CreatePlaylistDialog");
        return dialogFragmentC4121duB;
    }

    public static DialogFragmentC4121du b(long[] jArr, List list) {
        DialogFragmentC4121du dialogFragmentC4121du = new DialogFragmentC4121du();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", 0);
        bundle.putString("arg2", null);
        bundle.putStringArrayList("arg3", (ArrayList) list);
        bundle.putLongArray("arg4", jArr);
        dialogFragmentC4121du.setArguments(bundle);
        return dialogFragmentC4121du;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Bundle arguments = getArguments();
        int i = arguments.getInt("arg1");
        String string = arguments.getString("arg2");
        ArrayList<String> stringArrayList = arguments.getStringArrayList("arg3");
        long[] longArray = arguments.getLongArray("arg4");
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.j, null);
        builder.setView(viewInflate);
        EditText editText = (EditText) viewInflate.findViewById(AbstractC5056hD0.P0);
        if (string == null) {
            editText.setText(JD0.Q0);
        } else {
            editText.setText(string);
        }
        Spinner spinner = (Spinner) viewInflate.findViewById(AbstractC5056hD0.b3);
        String[] strArr = new String[C1121Hw0.d.length + 1];
        strArr[0] = getResources().getString(JD0.v4);
        int i2 = 0;
        while (true) {
            C1121Hw0[] c1121Hw0Arr = C1121Hw0.d;
            if (i2 >= c1121Hw0Arr.length) {
                break;
            }
            int i3 = i2 + 1;
            strArr[i3] = c1121Hw0Arr[i2].a;
            i2 = i3;
        }
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), R.layout.simple_spinner_item, strArr));
        TextView textView = (TextView) viewInflate.findViewById(AbstractC5056hD0.R3);
        if (longArray == null && stringArrayList == null) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            int length = longArray != null ? longArray.length : stringArrayList.size();
            textView.setText(getResources().getQuantityString(FD0.m, length, Integer.valueOf(length)));
        }
        if (i == 0) {
            builder.setTitle(JD0.R0);
            builder.setPositiveButton(JD0.W0, new a(editText, spinner, longArray, stringArrayList));
        }
        builder.setNegativeButton(JD0.S0, new b());
        return builder.create();
    }
}
