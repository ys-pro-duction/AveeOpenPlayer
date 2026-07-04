package com.daaw;

import android.R;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.daaw.C10217zg1;
import com.daaw.C3381bF;
import com.daaw.avee.Common.VerticalSeekBar;
import com.triggertrap.seekarc.SeekArc;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.fH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC4503fH extends DialogFragment {
    public static C10217zg1 W = new C10217zg1();
    public static C0321Ag1 X = new C0321Ag1();
    public static C0746Eg1 Y = new C0746Eg1();
    public static int Z = 30;
    public SwitchCompat C;
    public Spinner D;
    public ScrollView E;
    public HorizontalScrollView F;
    public ViewGroup G;
    public VerticalSeekBar[] H;
    public TextView[] I;
    public SeekArc J;
    public SeekArc K;
    public TextView L;
    public TextView M;
    public SeekBar N;
    public float S;
    public float T;
    public List B = new LinkedList();
    public boolean O = false;
    public C4792gH P = null;
    public int Q = 30;
    public C3381bF R = C3381bF.a(C3381bF.c);
    public boolean U = false;
    public View.OnTouchListener V = new a();

    /* JADX INFO: renamed from: com.daaw.fH$a */
    public class a implements View.OnTouchListener {
        public a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                DialogFragmentC4503fH.this.E.requestDisallowInterceptTouchEvent(true);
                DialogFragmentC4503fH.this.F.requestDisallowInterceptTouchEvent(true);
            }
            return view.onTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: renamed from: com.daaw.fH$b */
    public class b implements CompoundButton.OnCheckedChangeListener {
        public b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            DialogFragmentC4503fH.this.v();
        }
    }

    /* JADX INFO: renamed from: com.daaw.fH$f */
    public class f implements C10217zg1.a {
        public f() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(C4792gH c4792gH) {
            DialogFragmentC4503fH.this.A(c4792gH);
        }
    }

    public static DialogFragmentC4503fH q() {
        DialogFragmentC4503fH dialogFragmentC4503fH = new DialogFragmentC4503fH();
        AbstractC1765Ob1.w(dialogFragmentC4503fH, "EqualizerDialog");
        return dialogFragmentC4503fH;
    }

    public static String r(float f2) {
        return s((int) (f2 * 1000.0f));
    }

    public static String s(int i) {
        if (i < 1000) {
            return String.format(Locale.US, "%.1fHz", Float.valueOf(i * 0.001f));
        }
        if (i >= 1000000) {
            return String.format(Locale.US, "%.1fkHz", Float.valueOf(i * 1.0E-6f));
        }
        return "" + (i / 1000) + "Hz";
    }

    public final void A(C4792gH c4792gH) {
        if (getActivity() != null && t()) {
            this.U = true;
            if (c4792gH == null) {
                c4792gH = C4792gH.k;
            }
            this.P = c4792gH;
            this.C.setChecked(c4792gH.c);
            this.R = C3381bF.a(this.P.b);
            C4792gH c4792gH2 = this.P;
            int length = c4792gH2.b.b.length;
            int i = this.Q;
            if (i % 2 != 0) {
                this.Q = i + 1;
            }
            this.O = false;
            int length2 = c4792gH2.e.length + 1;
            String[] strArr = new String[length2];
            strArr[0] = getResources().getString(JD0.L);
            int i2 = 0;
            while (true) {
                C3381bF[] c3381bFArr = this.P.e;
                if (i2 >= c3381bFArr.length) {
                    break;
                }
                int i3 = i2 + 1;
                strArr[i3] = c3381bFArr[i2].a;
                i2 = i3;
            }
            this.D.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), R.layout.simple_spinner_item, strArr));
            int i4 = this.P.d;
            int i5 = i4 >= 0 ? i4 + 1 : 0;
            if (i5 < 0 || i5 >= length2) {
                i5 = 0;
            }
            this.D.setSelection(i5, false);
            this.D.setOnItemSelectedListener(new g());
            this.O = true;
            this.H = new VerticalSeekBar[length];
            this.I = new TextView[length];
            this.G.removeAllViews();
            for (int i6 = 0; i6 < length; i6++) {
                View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.O, null);
                this.H[i6] = (VerticalSeekBar) viewInflate.findViewById(AbstractC5056hD0.V2);
                this.I[i6] = (TextView) viewInflate.findViewById(AbstractC5056hD0.N3);
                ((TextView) viewInflate.findViewById(AbstractC5056hD0.M3)).setText(r(this.P.b.b[i6].a));
                this.H[i6].setMax(this.Q);
                this.H[i6].setOnTouchListener(this.V);
                this.H[i6].setOnSeekBarChangeFromUserListener(new h(i6));
                this.G.addView(viewInflate);
            }
            C4792gH c4792gH3 = this.P;
            u(c4792gH3.f, c4792gH3.h, false, true);
            w(this.P.j, false);
            this.U = false;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        W.b(new f(), this.B);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.N, null);
        builder.setView(viewInflate);
        SwitchCompat switchCompat = (SwitchCompat) viewInflate.findViewById(AbstractC5056hD0.m3);
        this.C = switchCompat;
        switchCompat.setOnCheckedChangeListener(new b());
        this.D = (Spinner) viewInflate.findViewById(AbstractC5056hD0.Z2);
        this.E = (ScrollView) viewInflate.findViewById(AbstractC5056hD0.M2);
        this.F = (HorizontalScrollView) viewInflate.findViewById(AbstractC5056hD0.N2);
        this.G = (ViewGroup) viewInflate.findViewById(AbstractC5056hD0.T1);
        this.L = (TextView) viewInflate.findViewById(AbstractC5056hD0.t3);
        SeekArc seekArc = (SeekArc) viewInflate.findViewById(AbstractC5056hD0.O2);
        this.J = seekArc;
        seekArc.setOnTouchListener(this.V);
        this.J.setOnSeekArcChangeListener(new c());
        this.M = (TextView) viewInflate.findViewById(AbstractC5056hD0.w3);
        SeekArc seekArc2 = (SeekArc) viewInflate.findViewById(AbstractC5056hD0.P2);
        this.K = seekArc2;
        seekArc2.setOnTouchListener(this.V);
        this.K.setOnSeekArcChangeListener(new d());
        SeekBar seekBar = (SeekBar) viewInflate.findViewById(AbstractC5056hD0.U2);
        this.N = seekBar;
        seekBar.setMax(100);
        this.N.setOnTouchListener(this.V);
        this.N.setOnSeekBarChangeListener(new e());
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.setCancelable(true);
        alertDialogCreate.setCanceledOnTouchOutside(true);
        return alertDialogCreate;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        W.c(this.B);
        this.B.clear();
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        A((C4792gH) Y.a(null));
    }

    public boolean t() {
        return this.C != null;
    }

    public final void u(float f2, float f3, boolean z, boolean z2) {
        this.S = f2;
        this.T = f3;
        if (!z) {
            this.J.setProgress(Math.round((Z / 2) * f2) + (Z / 2));
            this.K.setProgress(Math.round((Z / 2) * f3) + (Z / 2));
        }
        int iRound = Math.round((Z / 2) * f2);
        TextView textView = this.L;
        textView.setText(textView.getResources().getQuantityString(FD0.b, iRound, Integer.valueOf(iRound)));
        int iRound2 = Math.round((Z / 2) * f3);
        TextView textView2 = this.M;
        textView2.setText(textView2.getResources().getQuantityString(FD0.d, iRound2, Integer.valueOf(iRound2)));
        C3381bF.a[] aVarArr = this.R.b;
        float[] fArr = new float[aVarArr.length];
        int length = aVarArr.length;
        float[] fArr2 = new float[length];
        for (int i = 0; i < length; i++) {
            fArr2[i] = this.R.b[i].a;
        }
        if (z2) {
            C3381bF c3381bF = this.R;
            C4792gH c4792gH = this.P;
            AbstractC4224eH.b(c3381bF, c4792gH.g, c4792gH.i, f2, f3, fArr, fArr2);
            y(fArr);
        }
    }

    public final void v() {
        VerticalSeekBar[] verticalSeekBarArr;
        C4792gH c4792gH;
        if (this.U || (verticalSeekBarArr = this.H) == null || (c4792gH = this.P) == null) {
            return;
        }
        if (verticalSeekBarArr.length != c4792gH.b.b.length) {
            AbstractC0441Bk1.c("equalizerUIDesc bands count doesnt match ");
            return;
        }
        C5071hH c5071hH = new C5071hH();
        c5071hH.a = this.C.isChecked();
        c5071hH.b = this.D.getSelectedItemPosition() - 1;
        c5071hH.f = new C3381bF("Default", this.H.length);
        c5071hH.d = this.S;
        c5071hH.e = this.T;
        c5071hH.c = this.R;
        c5071hH.g = this.N.getProgress() / this.N.getMax();
        z(c5071hH.f);
        X.a(c5071hH, this.P);
    }

    public final void w(float f2, boolean z) {
        if (z) {
            return;
        }
        this.N.setProgress((int) (f2 * 100.0f));
    }

    public final void x(int i, int i2, boolean z) {
        int i3 = this.Q;
        int iK = AbstractC0405Bb1.k(i2, -(i3 / 2), i3 / 2);
        if (!z) {
            this.H[i].setProgress((this.Q / 2) + iK);
            this.H[i].a();
        }
        this.I[i].setText("" + iK);
    }

    public final void y(float[] fArr) {
        if (fArr.length != this.H.length) {
            return;
        }
        for (int i = 0; i < fArr.length; i++) {
            x(i, Math.round((this.Q / 2) * fArr[i]), false);
        }
    }

    public void z(C3381bF c3381bF) {
        VerticalSeekBar[] verticalSeekBarArr = this.H;
        int i = 0;
        int max = (verticalSeekBarArr.length > 0 ? verticalSeekBarArr[0].getMax() : 2) / 2;
        int length = c3381bF.b.length;
        VerticalSeekBar[] verticalSeekBarArr2 = this.H;
        if (length != verticalSeekBarArr2.length) {
            c3381bF.d(verticalSeekBarArr2.length);
        }
        while (true) {
            if (i >= this.H.length) {
                return;
            }
            c3381bF.b[i] = new C3381bF.a(this.P.b.b[i].a, (r1[i].getProgress() - max) / max);
            i++;
        }
    }

    /* JADX INFO: renamed from: com.daaw.fH$c */
    public class c implements SeekArc.a {
        public c() {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void c(SeekArc seekArc, int i, boolean z) {
            if (z) {
                DialogFragmentC4503fH.this.D.setSelection(0, false);
                DialogFragmentC4503fH.this.S = (i - (DialogFragmentC4503fH.Z / 2)) / (DialogFragmentC4503fH.Z / 2.0f);
                DialogFragmentC4503fH dialogFragmentC4503fH = DialogFragmentC4503fH.this;
                dialogFragmentC4503fH.u(dialogFragmentC4503fH.S, DialogFragmentC4503fH.this.T, true, true);
                DialogFragmentC4503fH.this.v();
            }
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void a(SeekArc seekArc) {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void b(SeekArc seekArc) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.fH$d */
    public class d implements SeekArc.a {
        public d() {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void c(SeekArc seekArc, int i, boolean z) {
            if (z) {
                DialogFragmentC4503fH.this.D.setSelection(0, false);
                DialogFragmentC4503fH.this.T = (i - (DialogFragmentC4503fH.Z / 2)) / (DialogFragmentC4503fH.Z / 2.0f);
                DialogFragmentC4503fH dialogFragmentC4503fH = DialogFragmentC4503fH.this;
                dialogFragmentC4503fH.u(dialogFragmentC4503fH.S, DialogFragmentC4503fH.this.T, true, true);
                DialogFragmentC4503fH.this.v();
            }
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void a(SeekArc seekArc) {
        }

        @Override // com.triggertrap.seekarc.SeekArc.a
        public void b(SeekArc seekArc) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.fH$e */
    public class e implements SeekBar.OnSeekBarChangeListener {
        public e() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            DialogFragmentC4503fH.this.w(i / 100.0f, true);
            DialogFragmentC4503fH.this.v();
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.fH$g */
    public class g implements AdapterView.OnItemSelectedListener {
        public g() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            int i2 = i - 1;
            if (i2 >= 0 && i2 < DialogFragmentC4503fH.this.P.e.length) {
                AbstractC4224eH.c(DialogFragmentC4503fH.this.P.e[i2], DialogFragmentC4503fH.this.R);
                DialogFragmentC4503fH.this.u(0.0f, 0.0f, false, true);
            }
            DialogFragmentC4503fH.this.v();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.fH$h */
    public class h implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ int a;

        public h(int i) {
            this.a = i;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                DialogFragmentC4503fH.this.D.setSelection(0, false);
                DialogFragmentC4503fH dialogFragmentC4503fH = DialogFragmentC4503fH.this;
                dialogFragmentC4503fH.x(this.a, i - (dialogFragmentC4503fH.Q / 2), true);
                DialogFragmentC4503fH dialogFragmentC4503fH2 = DialogFragmentC4503fH.this;
                dialogFragmentC4503fH2.z(dialogFragmentC4503fH2.R);
                DialogFragmentC4503fH.this.u(0.0f, 0.0f, false, false);
                DialogFragmentC4503fH.this.v();
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }
}
