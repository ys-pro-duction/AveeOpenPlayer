package com.daaw;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.shawnlin.numberpicker.NumberPicker;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class LT0 extends DialogFragment {
    public static C0529Cg1 J = new C0529Cg1();
    public static C0746Eg1 K = new C0746Eg1();
    public static C0746Eg1 L = new C0746Eg1();
    public static C0746Eg1 M = new C0746Eg1();
    public NumberPicker B;
    public NumberPicker C;
    public ImageButton D;
    public TextView E;
    public int F = 0;
    public Date G = new Date();
    public int H;
    public Runnable I;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LT0.this.F = (int) ((LT0.this.G.getTime() - new Date().getTime()) / 1000);
            LT0.this.i();
            LT0.this.E.postDelayed(LT0.this.I, 1000L);
        }
    }

    public class b implements NumberPicker.e {
        public b() {
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.e
        public void a(NumberPicker numberPicker, int i, int i2) {
            LT0.this.f(true, true);
        }
    }

    public class c implements NumberPicker.e {
        public c() {
        }

        @Override // com.shawnlin.numberpicker.NumberPicker.e
        public void a(NumberPicker numberPicker, int i, int i2) {
            LT0.this.f(true, true);
        }
    }

    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            LT0.this.e(true);
        }
    }

    public class e implements DialogInterface.OnClickListener {
        public e() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            LT0.this.e(false);
        }
    }

    public static LT0 g() {
        LT0 lt0 = new LT0();
        AbstractC1765Ob1.w(lt0, "SleepTimerDialog");
        return lt0;
    }

    public void e(boolean z) {
        f(z, false);
    }

    public void f(boolean z, boolean z2) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(11, this.C.getValue());
        calendar2.set(12, this.B.getValue());
        calendar2.set(13, 0);
        if (calendar2.before(calendar)) {
            calendar2.add(11, 24);
        }
        this.G = new Date(calendar2.getTimeInMillis());
        if (z2) {
            return;
        }
        J.a(Boolean.valueOf(z), Integer.valueOf(h()), this.G, Boolean.FALSE);
    }

    public int h() {
        return this.B.getValue() + (this.C.getValue() * 60);
    }

    public void i() {
        this.E.setText(((Object) this.E.getResources().getText(JD0.i1)) + " " + AbstractC0405Bb1.n(this.F, false));
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.U, null);
        builder.setView(viewInflate);
        builder.setTitle(JD0.h1);
        this.B = (NumberPicker) viewInflate.findViewById(AbstractC5056hD0.o2);
        this.C = (NumberPicker) viewInflate.findViewById(AbstractC5056hD0.n2);
        this.D = null;
        TextView textView = (TextView) viewInflate.findViewById(AbstractC5056hD0.f4);
        this.E = textView;
        this.H = textView.getCurrentTextColor();
        this.G = (Date) ((B61) M.a(new B61(new Date(), Boolean.FALSE))).a;
        this.I = new a();
        if (((IT0) K.a(null)) == null) {
            new IT0();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(this.G);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        this.B.setMaxValue(59);
        this.B.setMinValue(0);
        this.B.setValue(i2);
        this.C.setMaxValue(23);
        this.C.setMinValue(0);
        this.C.setValue(i);
        this.C.setDividerColor(this.H);
        this.B.setDividerColor(this.H);
        this.C.setSelectedTextColor(this.H);
        this.B.setSelectedTextColor(this.H);
        this.C.setTextColor(this.H);
        this.B.setTextColor(this.H);
        this.B.setOnValueChangedListener(new b());
        this.C.setOnValueChangedListener(new c());
        builder.setPositiveButton(JD0.g1, new d());
        builder.setNegativeButton(JD0.T0, new e());
        this.E.postDelayed(this.I, 0L);
        return builder.create();
    }
}
