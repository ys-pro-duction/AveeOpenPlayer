package com.daaw;

import android.R;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import com.daaw.AbstractC0853Fh0;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9173vv extends C8887uv {

    /* JADX INFO: renamed from: com.daaw.vv$a */
    public class a implements View.OnClickListener {
        public final /* synthetic */ C2591Vu B;
        public final /* synthetic */ String C;
        public final /* synthetic */ C1469Lf0 D;
        public final /* synthetic */ float E;
        public final /* synthetic */ DialogFragmentC7214ov F;

        public a(C2591Vu c2591Vu, String str, C1469Lf0 c1469Lf0, float f, DialogFragmentC7214ov dialogFragmentC7214ov) {
            this.B = c2591Vu;
            this.C = str;
            this.D = c1469Lf0;
            this.E = f;
            this.F = dialogFragmentC7214ov;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1469Lf0 c1469Lf0T = this.B.t(this.C, new C1469Lf0(this.D));
            float f = this.E;
            this.B.c0(this.C, new C1469Lf0(c1469Lf0T, new C1477Lh0("Constant", f, f)));
            this.F.q();
        }
    }

    /* JADX INFO: renamed from: com.daaw.vv$b */
    public class b implements View.OnClickListener {
        public final /* synthetic */ C2591Vu B;
        public final /* synthetic */ String C;
        public final /* synthetic */ C1469Lf0 D;
        public final /* synthetic */ DialogFragmentC7214ov E;

        public b(C2591Vu c2591Vu, String str, C1469Lf0 c1469Lf0, DialogFragmentC7214ov dialogFragmentC7214ov) {
            this.B = c2591Vu;
            this.C = str;
            this.D = c1469Lf0;
            this.E = dialogFragmentC7214ov;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C1469Lf0 c1469Lf0T = this.B.t(this.C, new C1469Lf0(this.D));
            if (c1469Lf0T.h() > 1) {
                this.B.c0(this.C, new C1469Lf0(c1469Lf0T, 0, c1469Lf0T.h() - 1));
                this.E.q();
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.vv$c */
    public class c implements InterfaceC5559j2 {
        public final /* synthetic */ boolean[] a;
        public final /* synthetic */ C2591Vu b;
        public final /* synthetic */ String c;
        public final /* synthetic */ C1469Lf0 d;
        public final /* synthetic */ boolean e;
        public final /* synthetic */ TextView f;
        public final /* synthetic */ ViewGroup g;
        public final /* synthetic */ View h;
        public final /* synthetic */ View i;
        public final /* synthetic */ float j;
        public final /* synthetic */ float k;
        public final /* synthetic */ float l;
        public final /* synthetic */ boolean m;
        public final /* synthetic */ int n;
        public final /* synthetic */ SeekBar[] o;
        public final /* synthetic */ SeekBar[] p;
        public final /* synthetic */ EditText[] q;
        public final /* synthetic */ EditText[] r;
        public final /* synthetic */ Spinner[] s;
        public final /* synthetic */ String[] t;
        public final /* synthetic */ TextView[] u;
        public final /* synthetic */ TextView[] v;

        public c(boolean[] zArr, C2591Vu c2591Vu, String str, C1469Lf0 c1469Lf0, boolean z, TextView textView, ViewGroup viewGroup, View view, View view2, float f, float f2, float f3, boolean z2, int i, SeekBar[] seekBarArr, SeekBar[] seekBarArr2, EditText[] editTextArr, EditText[] editTextArr2, Spinner[] spinnerArr, String[] strArr, TextView[] textViewArr, TextView[] textViewArr2) {
            this.a = zArr;
            this.b = c2591Vu;
            this.c = str;
            this.d = c1469Lf0;
            this.e = z;
            this.f = textView;
            this.g = viewGroup;
            this.h = view;
            this.i = view2;
            this.j = f;
            this.k = f2;
            this.l = f3;
            this.m = z2;
            this.n = i;
            this.o = seekBarArr;
            this.p = seekBarArr2;
            this.q = editTextArr;
            this.r = editTextArr2;
            this.s = spinnerArr;
            this.t = strArr;
            this.u = textViewArr;
            this.v = textViewArr2;
        }

        @Override // com.daaw.InterfaceC5559j2
        public void a(Object obj) {
            boolean[] zArr = this.a;
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            C1469Lf0 c1469Lf0T = this.b.t(this.c, new C1469Lf0(this.d));
            if (this.e) {
                this.f.setText(c1469Lf0T.d(this.g.getContext()));
            } else {
                this.f.setText(c1469Lf0T.e(this.g.getContext()));
            }
            AbstractC3995dT0.a(this.h, this.i, (this.j - this.k) / this.l, (c1469Lf0T.f() - this.k) / this.l);
            if (this.m) {
                for (int i = 0; i < this.n; i++) {
                    C1477Lh0 c1477Lh0G = c1469Lf0T.g(i);
                    AbstractC0853Fh0.a aVarE = AbstractC0853Fh0.e(c1477Lh0G.e());
                    boolean z = aVarE == null || this.e || aVarE.d;
                    if (z) {
                        C1458Lc1 c1458Lc1G = c1477Lh0G.g();
                        if (!this.o[i].equals(obj)) {
                            this.o[i].setProgress((int) ((c1458Lc1G.a - this.k) / this.l));
                        }
                        if (!this.p[i].equals(obj)) {
                            this.p[i].setProgress((int) ((c1458Lc1G.b - this.k) / this.l));
                        }
                        if (!this.q[i].equals(obj)) {
                            this.q[i].setText(String.format(Locale.US, "%.3f", Float.valueOf(c1458Lc1G.a)));
                        }
                        if (!this.r[i].equals(obj)) {
                            this.r[i].setText(String.format(Locale.US, "%.3f", Float.valueOf(c1458Lc1G.b)));
                        }
                    } else {
                        float f = c1477Lh0G.f();
                        if (!this.o[i].equals(obj)) {
                            this.o[i].setProgress((int) ((f - this.k) / this.l));
                        }
                        if (!this.q[i].equals(obj)) {
                            this.q[i].setText(String.format(Locale.US, "%.3f", Float.valueOf(f)));
                        }
                    }
                    if (!this.s[i].equals(obj)) {
                        this.s[i].setSelection(AbstractC0405Bb1.e(this.t, c1477Lh0G.e()), false);
                    }
                    if (aVarE != null) {
                        this.u[i].setText(AbstractC9173vv.I(aVarE.b, this.g.getContext()));
                        this.v[i].setText(AbstractC9173vv.I(aVarE.c, this.g.getContext()));
                    } else {
                        this.u[i].setText("");
                        this.v[i].setText("");
                    }
                    int i2 = 8;
                    this.p[i].setVisibility(z ? 0 : 8);
                    this.r[i].setVisibility(z ? 0 : 8);
                    TextView textView = this.v[i];
                    if (z) {
                        i2 = 0;
                    }
                    textView.setVisibility(i2);
                }
            }
            this.a[0] = false;
        }
    }

    public static void H(DialogFragmentC7214ov dialogFragmentC7214ov, LayoutInflater layoutInflater, C2591Vu c2591Vu, boolean z, KQ kq, ViewGroup viewGroup, boolean z2, String str, String str2, float f2, float f3, float f4) {
        EditText[] editTextArr;
        Spinner[] spinnerArr;
        EditText[] editTextArr2;
        TextView[] textViewArr;
        String str3 = str2;
        C1469Lf0 c1469Lf0 = new C1469Lf0(new C1477Lh0("Constant", f2, f2));
        String[] strArr = z2 ? AbstractC0853Fh0.b : AbstractC0853Fh0.a;
        C1469Lf0 c1469Lf0T = c2591Vu.t(str3, new C1469Lf0(c1469Lf0));
        if (c1469Lf0T.h() == 0) {
            c1469Lf0T = new C1469Lf0(c1469Lf0);
            c2591Vu.c0(str3, c1469Lf0T);
        }
        C1469Lf0 c1469Lf02 = c1469Lf0T;
        View viewInflate = View.inflate(dialogFragmentC7214ov.getActivity(), z ? AbstractC9815yD0.M : AbstractC9815yD0.B, null);
        ((TextView) viewInflate.findViewById(AbstractC5056hD0.x3)).setText(str);
        TextView textView = (TextView) viewInflate.findViewById(AbstractC5056hD0.j4);
        View viewFindViewById = viewInflate.findViewById(AbstractC5056hD0.N1);
        View viewFindViewById2 = viewInflate.findViewById(AbstractC5056hD0.Q1);
        int iH = c1469Lf02.h();
        SeekBar[] seekBarArr = new SeekBar[iH];
        SeekBar[] seekBarArr2 = new SeekBar[iH];
        EditText[] editTextArr3 = new EditText[iH];
        EditText[] editTextArr4 = new EditText[iH];
        TextView[] textViewArr2 = new TextView[iH];
        TextView[] textViewArr3 = new TextView[iH];
        Spinner[] spinnerArr2 = new Spinner[iH];
        if (z) {
            Button button = (Button) viewInflate.findViewById(AbstractC5056hD0.s);
            Button button2 = (Button) viewInflate.findViewById(AbstractC5056hD0.T);
            ViewGroup viewGroup2 = (ViewGroup) viewInflate.findViewById(AbstractC5056hD0.m4);
            textViewArr = textViewArr3;
            editTextArr2 = editTextArr4;
            spinnerArr = spinnerArr2;
            editTextArr = editTextArr3;
            a aVar = new a(c2591Vu, str3, c1469Lf0, f2, dialogFragmentC7214ov);
            str3 = str3;
            button.setOnClickListener(aVar);
            button2.setOnClickListener(new b(c2591Vu, str3, c1469Lf0, dialogFragmentC7214ov));
            int i = 0;
            while (i < iH) {
                C1477Lh0 c1477Lh0G = c1469Lf02.g(i);
                int i2 = i;
                View viewInflate2 = View.inflate(dialogFragmentC7214ov.getActivity(), AbstractC9815yD0.C, null);
                seekBarArr[i2] = (SeekBar) viewInflate2.findViewById(AbstractC5056hD0.Q2);
                seekBarArr2[i2] = (SeekBar) viewInflate2.findViewById(AbstractC5056hD0.R2);
                editTextArr[i2] = (EditText) viewInflate2.findViewById(AbstractC5056hD0.I0);
                editTextArr2[i2] = (EditText) viewInflate2.findViewById(AbstractC5056hD0.J0);
                textViewArr2[i2] = (TextView) viewInflate2.findViewById(AbstractC5056hD0.p1);
                textViewArr[i2] = (TextView) viewInflate2.findViewById(AbstractC5056hD0.q1);
                spinnerArr[i2] = (Spinner) viewInflate2.findViewById(AbstractC5056hD0.b3);
                viewGroup2.addView(viewInflate2);
                int i3 = (int) ((f3 - f2) / f4);
                seekBarArr[i2].setMax(i3);
                seekBarArr2[i2].setMax(i3);
                int iE = AbstractC0405Bb1.e(strArr, c1477Lh0G.e());
                String[] strArr2 = new String[strArr.length];
                C1469Lf0 c1469Lf03 = c1469Lf0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    int iA = AbstractC0853Fh0.a(strArr[i4]);
                    if (iA > 0) {
                        strArr2[i4] = viewInflate2.getContext().getString(iA);
                    } else {
                        String str4 = strArr[i4];
                        strArr2[i4] = strArr[i4];
                    }
                }
                spinnerArr[i2].setAdapter((SpinnerAdapter) new ArrayAdapter(dialogFragmentC7214ov.getActivity(), R.layout.simple_spinner_item, strArr2));
                if (iE >= 0) {
                    spinnerArr[i2].setSelection(iE, false);
                }
                dialogFragmentC7214ov.e(spinnerArr[i2]);
                i = i2 + 1;
                c1469Lf0 = c1469Lf03;
            }
        } else {
            editTextArr = editTextArr3;
            spinnerArr = spinnerArr2;
            editTextArr2 = editTextArr4;
            textViewArr = textViewArr3;
        }
        C1469Lf0 c1469Lf04 = c1469Lf0;
        boolean[] zArr = {false};
        String str5 = str3;
        Spinner[] spinnerArr3 = spinnerArr;
        EditText[] editTextArr5 = editTextArr2;
        c cVar = new c(zArr, c2591Vu, str5, c1469Lf04, z2, textView, viewGroup, viewFindViewById, viewFindViewById2, f3, f2, f4, z, iH, seekBarArr, seekBarArr2, editTextArr, editTextArr5, spinnerArr3, strArr, textViewArr2, textViewArr);
        boolean[] zArr2 = zArr;
        C1469Lf0 c1469Lf05 = c1469Lf04;
        SeekBar[] seekBarArr3 = seekBarArr;
        InterfaceC5559j2 interfaceC5559j2L = C8887uv.l(dialogFragmentC7214ov, c2591Vu, z, viewInflate, str5, cVar);
        if (z) {
            int i5 = 0;
            while (i5 < iH) {
                boolean[] zArr3 = zArr2;
                int i6 = i5;
                seekBarArr3[i5].setOnSeekBarChangeListener(new d(zArr3, f4, f2, c2591Vu, str2, c1469Lf05, i6, dialogFragmentC7214ov, interfaceC5559j2L, seekBarArr3, kq));
                seekBarArr2[i6].setOnSeekBarChangeListener(new e(zArr3, f4, f2, c2591Vu, str2, c1469Lf05, i6, dialogFragmentC7214ov, interfaceC5559j2L, seekBarArr2, kq));
                editTextArr[i6].addTextChangedListener(new f(zArr3, f2, f3, c2591Vu, str2, c1469Lf05, i6, dialogFragmentC7214ov, interfaceC5559j2L, editTextArr, kq));
                editTextArr5[i6].addTextChangedListener(new g(zArr3, f2, f3, c2591Vu, str2, c1469Lf05, i6, dialogFragmentC7214ov, interfaceC5559j2L, editTextArr5, kq));
                Spinner spinner = spinnerArr3[i6];
                C1469Lf0 c1469Lf06 = c1469Lf05;
                InterfaceC5559j2 interfaceC5559j2 = interfaceC5559j2L;
                interfaceC5559j2L = interfaceC5559j2;
                c1469Lf05 = c1469Lf06;
                spinner.setOnItemSelectedListener(new h(dialogFragmentC7214ov, strArr, c2591Vu, str2, c1469Lf06, i6, interfaceC5559j2, spinnerArr3, kq));
                i5 = i6 + 1;
                zArr2 = zArr3;
                seekBarArr3 = seekBarArr3;
            }
        }
        viewGroup.addView(viewInflate);
    }

    public static String I(String str, Context context) {
        int iW = C8887uv.w(str);
        return (iW <= 0 || context == null) ? str : context.getString(iW);
    }

    /* JADX INFO: renamed from: com.daaw.vv$d */
    public class d implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ boolean[] a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ C2591Vu d;
        public final /* synthetic */ String e;
        public final /* synthetic */ C1469Lf0 f;
        public final /* synthetic */ int g;
        public final /* synthetic */ DialogFragmentC7214ov h;
        public final /* synthetic */ InterfaceC5559j2 i;
        public final /* synthetic */ SeekBar[] j;
        public final /* synthetic */ KQ k;

        public d(boolean[] zArr, float f, float f2, C2591Vu c2591Vu, String str, C1469Lf0 c1469Lf0, int i, DialogFragmentC7214ov dialogFragmentC7214ov, InterfaceC5559j2 interfaceC5559j2, SeekBar[] seekBarArr, KQ kq) {
            this.a = zArr;
            this.b = f;
            this.c = f2;
            this.d = c2591Vu;
            this.e = str;
            this.f = c1469Lf0;
            this.g = i;
            this.h = dialogFragmentC7214ov;
            this.i = interfaceC5559j2;
            this.j = seekBarArr;
            this.k = kq;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (!this.a[0] && z) {
                float f = (i * this.b) + this.c;
                C1469Lf0 c1469Lf0T = this.d.t(this.e, new C1469Lf0(this.f));
                if (this.g >= c1469Lf0T.h()) {
                    return;
                }
                C1477Lh0 c1477Lh0G = c1469Lf0T.g(this.g);
                c1469Lf0T.k(this.g, new C1477Lh0(c1477Lh0G.e(), f, c1477Lh0G.g().b));
                this.d.c0(this.e, c1469Lf0T);
                this.h.u();
                this.i.a(this.j[this.g]);
                InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.k.a();
                if (interfaceC5559j2 != null) {
                    interfaceC5559j2.a(null);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.vv$e */
    public class e implements SeekBar.OnSeekBarChangeListener {
        public final /* synthetic */ boolean[] a;
        public final /* synthetic */ float b;
        public final /* synthetic */ float c;
        public final /* synthetic */ C2591Vu d;
        public final /* synthetic */ String e;
        public final /* synthetic */ C1469Lf0 f;
        public final /* synthetic */ int g;
        public final /* synthetic */ DialogFragmentC7214ov h;
        public final /* synthetic */ InterfaceC5559j2 i;
        public final /* synthetic */ SeekBar[] j;
        public final /* synthetic */ KQ k;

        public e(boolean[] zArr, float f, float f2, C2591Vu c2591Vu, String str, C1469Lf0 c1469Lf0, int i, DialogFragmentC7214ov dialogFragmentC7214ov, InterfaceC5559j2 interfaceC5559j2, SeekBar[] seekBarArr, KQ kq) {
            this.a = zArr;
            this.b = f;
            this.c = f2;
            this.d = c2591Vu;
            this.e = str;
            this.f = c1469Lf0;
            this.g = i;
            this.h = dialogFragmentC7214ov;
            this.i = interfaceC5559j2;
            this.j = seekBarArr;
            this.k = kq;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (!this.a[0] && z) {
                float f = (i * this.b) + this.c;
                C1469Lf0 c1469Lf0T = this.d.t(this.e, new C1469Lf0(this.f));
                if (this.g >= c1469Lf0T.h()) {
                    return;
                }
                C1477Lh0 c1477Lh0G = c1469Lf0T.g(this.g);
                c1469Lf0T.k(this.g, new C1477Lh0(c1477Lh0G.e(), c1477Lh0G.g().a, f));
                this.d.c0(this.e, c1469Lf0T);
                this.h.u();
                this.i.a(this.j[this.g]);
                InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.k.a();
                if (interfaceC5559j2 != null) {
                    interfaceC5559j2.a(null);
                }
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.vv$h */
    public class h implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ DialogFragmentC7214ov B;
        public final /* synthetic */ String[] C;
        public final /* synthetic */ C2591Vu D;
        public final /* synthetic */ String E;
        public final /* synthetic */ C1469Lf0 F;
        public final /* synthetic */ int G;
        public final /* synthetic */ InterfaceC5559j2 H;
        public final /* synthetic */ Spinner[] I;
        public final /* synthetic */ KQ J;

        public h(DialogFragmentC7214ov dialogFragmentC7214ov, String[] strArr, C2591Vu c2591Vu, String str, C1469Lf0 c1469Lf0, int i, InterfaceC5559j2 interfaceC5559j2, Spinner[] spinnerArr, KQ kq) {
            this.B = dialogFragmentC7214ov;
            this.C = strArr;
            this.D = c2591Vu;
            this.E = str;
            this.F = c1469Lf0;
            this.G = i;
            this.H = interfaceC5559j2;
            this.I = spinnerArr;
            this.J = kq;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x000f  */
        @Override // android.widget.AdapterView.OnItemSelectedListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onItemSelected(android.widget.AdapterView r1, android.view.View r2, int r3, long r4) {
            /*
                r0 = this;
                com.daaw.ov r2 = r0.B
                r2.d(r1)
                if (r3 < 0) goto Lf
                java.lang.String[] r1 = r0.C
                int r2 = r1.length
                if (r3 >= r2) goto Lf
                r1 = r1[r3]
                goto L11
            Lf:
                java.lang.String r1 = "Constant"
            L11:
                com.daaw.Vu r2 = r0.D
                java.lang.String r3 = r0.E
                com.daaw.Lf0 r4 = new com.daaw.Lf0
                com.daaw.Lf0 r5 = r0.F
                r4.<init>(r5)
                com.daaw.Lf0 r2 = r2.t(r3, r4)
                int r3 = r0.G
                int r4 = r2.h()
                if (r3 < r4) goto L29
                goto L62
            L29:
                int r3 = r0.G
                com.daaw.Lh0 r3 = r2.g(r3)
                int r4 = r0.G
                com.daaw.Lh0 r5 = new com.daaw.Lh0
                com.daaw.Lc1 r3 = r3.g()
                r5.<init>(r1, r3)
                r2.k(r4, r5)
                com.daaw.Vu r1 = r0.D
                java.lang.String r3 = r0.E
                r1.c0(r3, r2)
                com.daaw.ov r1 = r0.B
                r1.u()
                com.daaw.j2 r1 = r0.H
                android.widget.Spinner[] r2 = r0.I
                int r3 = r0.G
                r2 = r2[r3]
                r1.a(r2)
                com.daaw.KQ r1 = r0.J
                java.lang.Object r1 = r1.a()
                com.daaw.j2 r1 = (com.daaw.InterfaceC5559j2) r1
                if (r1 == 0) goto L62
                r2 = 0
                r1.a(r2)
            L62:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9173vv.h.onItemSelected(android.widget.AdapterView, android.view.View, int, long):void");
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.vv$f */
    public class f implements TextWatcher {
        public final /* synthetic */ boolean[] B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;
        public final /* synthetic */ C2591Vu E;
        public final /* synthetic */ String F;
        public final /* synthetic */ C1469Lf0 G;
        public final /* synthetic */ int H;
        public final /* synthetic */ DialogFragmentC7214ov I;
        public final /* synthetic */ InterfaceC5559j2 J;
        public final /* synthetic */ EditText[] K;
        public final /* synthetic */ KQ L;

        public f(boolean[] zArr, float f, float f2, C2591Vu c2591Vu, String str, C1469Lf0 c1469Lf0, int i, DialogFragmentC7214ov dialogFragmentC7214ov, InterfaceC5559j2 interfaceC5559j2, EditText[] editTextArr, KQ kq) {
            this.B = zArr;
            this.C = f;
            this.D = f2;
            this.E = c2591Vu;
            this.F = str;
            this.G = c1469Lf0;
            this.H = i;
            this.I = dialogFragmentC7214ov;
            this.J = interfaceC5559j2;
            this.K = editTextArr;
            this.L = kq;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.B[0]) {
                return;
            }
            float fV = AbstractC0405Bb1.v(editable.toString(), this.C + (this.D * 0.5f));
            C1469Lf0 c1469Lf0T = this.E.t(this.F, new C1469Lf0(this.G));
            if (this.H >= c1469Lf0T.h()) {
                return;
            }
            C1477Lh0 c1477Lh0G = c1469Lf0T.g(this.H);
            c1469Lf0T.k(this.H, new C1477Lh0(c1477Lh0G.e(), fV, c1477Lh0G.g().b));
            this.E.c0(this.F, c1469Lf0T);
            this.I.u();
            this.J.a(this.K[this.H]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.L.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(null);
            }
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.vv$g */
    public class g implements TextWatcher {
        public final /* synthetic */ boolean[] B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;
        public final /* synthetic */ C2591Vu E;
        public final /* synthetic */ String F;
        public final /* synthetic */ C1469Lf0 G;
        public final /* synthetic */ int H;
        public final /* synthetic */ DialogFragmentC7214ov I;
        public final /* synthetic */ InterfaceC5559j2 J;
        public final /* synthetic */ EditText[] K;
        public final /* synthetic */ KQ L;

        public g(boolean[] zArr, float f, float f2, C2591Vu c2591Vu, String str, C1469Lf0 c1469Lf0, int i, DialogFragmentC7214ov dialogFragmentC7214ov, InterfaceC5559j2 interfaceC5559j2, EditText[] editTextArr, KQ kq) {
            this.B = zArr;
            this.C = f;
            this.D = f2;
            this.E = c2591Vu;
            this.F = str;
            this.G = c1469Lf0;
            this.H = i;
            this.I = dialogFragmentC7214ov;
            this.J = interfaceC5559j2;
            this.K = editTextArr;
            this.L = kq;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (this.B[0]) {
                return;
            }
            float fV = AbstractC0405Bb1.v(editable.toString(), this.C + (this.D * 0.5f));
            C1469Lf0 c1469Lf0T = this.E.t(this.F, new C1469Lf0(this.G));
            if (this.H >= c1469Lf0T.h()) {
                return;
            }
            C1477Lh0 c1477Lh0G = c1469Lf0T.g(this.H);
            c1469Lf0T.k(this.H, new C1477Lh0(c1477Lh0G.e(), c1477Lh0G.g().a, fV));
            this.E.c0(this.F, c1469Lf0T);
            this.I.u();
            this.J.a(this.K[this.H]);
            InterfaceC5559j2 interfaceC5559j2 = (InterfaceC5559j2) this.L.a();
            if (interfaceC5559j2 != null) {
                interfaceC5559j2.a(null);
            }
        }

        public int hashCode() {
            return super.hashCode();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
