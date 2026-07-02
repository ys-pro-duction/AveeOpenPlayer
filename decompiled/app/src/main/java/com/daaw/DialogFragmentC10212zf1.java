package com.daaw;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TimePicker;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.DialogFragmentC10212zf1;
import com.daaw.HG;
import com.daaw.avee.comp.Common.PrControls.PrEditText;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: com.daaw.zf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC10212zf1 extends DialogFragment {
    public static C0425Bg1 Y = new C0425Bg1();
    public static C9938yg1 Z = new C9938yg1();
    public static C0321Ag1 a0 = new C0321Ag1();
    public static C0425Bg1 b0 = new C0425Bg1();
    public static C9938yg1 c0 = new C9938yg1();
    public static C0746Eg1 d0 = new C0746Eg1();
    public static final C10217zg1 e0 = new C10217zg1();
    public static final C10217zg1 f0 = new C10217zg1();
    public DialogFragmentC0421Bf1 C;
    public ViewGroup D;
    public Button E;
    public EditText F;
    public Spinner G;
    public Spinner H;
    public Spinner I;
    public PrEditText J;
    public PrEditText K;
    public PrEditText L;
    public PrEditText M;
    public CheckBox N;
    public CheckBox O;
    public CheckBox P;
    public CheckBox Q;
    public PrEditText R;
    public CheckBox S;
    public Button T;
    public Button U;
    public d B = null;
    public int V = 0;
    public int W = 0;
    public final List X = new LinkedList();

    /* JADX INFO: renamed from: com.daaw.zf1$d */
    public static class d {
        public e[] a;
        public int b;
        public e c;
        public List d;
        public int e;
        public String f;
        public String g;
        public boolean h;
        public int i;
        public int j;
        public boolean k;
        public boolean l;
        public boolean m;

        public void b(String str) {
            String[] strArrA = AbstractC1557Mb1.a(";", str);
            if (strArrA.length != 9) {
                return;
            }
            this.b = AbstractC0405Bb1.x(strArrA[0], this.b);
            this.e = AbstractC0405Bb1.x(strArrA[1], this.e);
            this.f = AbstractC0405Bb1.A(strArrA[2], this.f);
            this.h = AbstractC0405Bb1.t(strArrA[4], this.h);
            this.k = AbstractC0405Bb1.t(strArrA[7], this.k);
            this.l = AbstractC0405Bb1.t(strArrA[8], this.l);
        }

        public e c(int i) {
            if (i < 0) {
                return null;
            }
            e[] eVarArr = this.a;
            if (i >= eVarArr.length) {
                return null;
            }
            return eVarArr[i];
        }

        public e d(int i) {
            e eVarC = c(i);
            if (eVarC != null) {
                return eVarC.clone();
            }
            return null;
        }

        public final String[] e(String str) {
            int i = 1;
            int i2 = 0;
            String[] strArr = new String[this.a.length + (str != null ? 1 : 0)];
            if (str != null) {
                strArr[0] = str;
            } else {
                i = 0;
            }
            while (true) {
                e[] eVarArr = this.a;
                if (i2 >= eVarArr.length) {
                    return strArr;
                }
                strArr[i2 + i] = eVarArr[i2].b;
                i2++;
            }
        }

        public HG.a f(int i) {
            List list = this.d;
            if (list != null && i >= 0 && i < list.size()) {
                return (HG.a) this.d.get(i);
            }
            return null;
        }

        public String g() {
            return this.b + ";" + this.e + ";" + AbstractC1557Mb1.c(';', '_', this.f) + ";" + AbstractC1557Mb1.c(';', '_', this.g) + ";" + this.h + ";" + this.i + ";" + this.j + ";" + this.k + ";" + this.l;
        }
    }

    /* JADX INFO: renamed from: com.daaw.zf1$f */
    public static class f {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public String e;
    }

    public static void I(String str) {
        e0.a(str);
    }

    public static void K(f fVar) {
        f0.a(fVar);
    }

    public static void p() {
        AbstractC1765Ob1.w(new DialogFragmentC10212zf1(), "VisExportDialog");
    }

    public final /* synthetic */ void A(TimePicker timePicker, int i, int i2) {
        F((i2 + (i * 60)) * 1000);
    }

    public final /* synthetic */ void B(View view) {
        Activity activity = getActivity();
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: com.daaw.pf1
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                this.a.A(timePicker, i, i2);
            }
        };
        int i = this.W;
        new TimePickerDialog(activity, onTimeSetListener, i / 60000, (i % 60000) / 1000, true).show();
    }

    public final /* synthetic */ Boolean C(Boolean bool) {
        if (!((Boolean) WB0.m.a(Boolean.FALSE)).booleanValue()) {
            J((d) d0.a(null));
        } else if (!C4989gz0.a.e()) {
            L();
        }
        return Boolean.TRUE;
    }

    public final void D(e eVar) {
        if (this.D == null) {
            return;
        }
        H();
        int i = eVar.i;
        if (i < 0 || i >= this.H.getAdapter().getCount()) {
            this.H.setSelection(0, false);
        } else {
            this.H.setSelection(i, false);
        }
        this.H.setOnItemSelectedListener(new c());
        this.J.setText("" + eVar.c);
        this.K.setText("" + eVar.d);
        this.L.setText("" + eVar.e);
        this.M.setText("" + eVar.f);
        this.Q.setChecked(eVar.g > 1);
        this.R.setText("" + eVar.h);
    }

    public final void E(e eVar) {
        this.J.setLimit(Integer.valueOf(eVar.c));
        this.K.setLimit(Integer.valueOf(eVar.d));
        this.M.setLimit(Integer.valueOf((int) eVar.f));
        this.L.setLimit(Integer.valueOf(eVar.e));
        this.R.setLimit(Integer.valueOf((int) eVar.h));
    }

    public final void F(int i) {
        int iMin = Math.min(this.B.j, Math.max(0, i));
        this.W = iMin;
        this.U.setText(AbstractC0405Bb1.o(iMin / 1000));
    }

    public final void G(int i) {
        int iMin = Math.min(this.B.j, Math.max(0, i));
        this.V = iMin;
        this.T.setText(AbstractC0405Bb1.o(iMin / 1000));
    }

    public final void H() {
        HG.a aVar = (HG.a) this.B.d.get((int) this.G.getSelectedItemId());
        boolean z = aVar != null && aVar.c();
        ArrayList arrayListB = HG.b();
        if (z) {
            arrayListB.add("High");
        }
        if (this.H.getAdapter() == null || this.H.getAdapter().getCount() != arrayListB.size()) {
            int selectedItemPosition = this.H.getSelectedItemPosition();
            this.H.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), R.layout.simple_spinner_item, arrayListB));
            if (selectedItemPosition < 0 || selectedItemPosition >= arrayListB.size()) {
                return;
            }
            this.H.setSelection(selectedItemPosition, false);
        }
    }

    public void J(d dVar) {
        Activity activity;
        if (this.D == null) {
            return;
        }
        this.B = dVar;
        if (dVar == null || (activity = getActivity()) == null) {
            return;
        }
        this.E.setText(dVar.f);
        this.F.setText(dVar.g);
        int i = dVar.e;
        List list = dVar.d;
        String[] strArrC = list != null ? HG.c(list) : new String[]{"<empty>"};
        this.G.setAdapter((SpinnerAdapter) new ArrayAdapter(activity, R.layout.simple_spinner_item, strArrC));
        if (i < 0 || i >= strArrC.length) {
            this.G.setSelection(0, false);
        } else {
            this.G.setSelection(i, false);
        }
        this.G.setOnItemSelectedListener(new a());
        int i2 = dVar.b;
        this.I.setAdapter((SpinnerAdapter) new ArrayAdapter(getActivity(), R.layout.simple_spinner_item, dVar.e(this.I.getResources().getString(JD0.n7))));
        this.I.setSelection(i2, false);
        this.I.setOnItemSelectedListener(new b(dVar));
        this.N.setChecked(dVar.l);
        this.O.setChecked(dVar.k);
        this.P.setChecked(dVar.h);
        D(dVar.c);
        G(dVar.i);
        F(dVar.j);
        C0746Eg1 c0746Eg1 = WB0.m;
        Boolean bool = Boolean.FALSE;
        if (((Boolean) c0746Eg1.a(bool)).booleanValue()) {
            return;
        }
        E(e.d(dVar.a));
        D(dVar.c(Math.max(dVar.b, 0)));
        L();
        Button button = this.U;
        button.setEnabled(((Boolean) AbstractC2916Yx0.c.a(Integer.valueOf(button.getId()), bool)).booleanValue());
    }

    public void L() {
        if (((Boolean) AbstractC2916Yx0.c.a(Integer.valueOf(this.S.getId()), Boolean.FALSE)).booleanValue()) {
            this.S.setEnabled(true);
        } else {
            this.S.setEnabled(false);
            this.S.setChecked(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o() {
        /*
            r7 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 0
            if (r0 <= r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L45
            com.daaw.zf1$d r1 = r7.B
            java.util.List r1 = r1.d
            if (r1 == 0) goto L45
            android.widget.Spinner r1 = r7.G
            long r3 = r1.getSelectedItemId()
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L45
            com.daaw.zf1$d r1 = r7.B
            java.util.List r1 = r1.d
            int r1 = r1.size()
            long r5 = (long) r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L45
            com.daaw.zf1$d r0 = r7.B
            java.util.List r0 = r0.d
            int r1 = (int) r3
            java.lang.Object r0 = r0.get(r1)
            com.daaw.HG$a r0 = (com.daaw.HG.a) r0
            java.lang.String r1 = r0.a()
            java.lang.String r3 = "video/avc"
            boolean r1 = r3.equals(r1)
            boolean r0 = r0.c()
            goto L47
        L45:
            r1 = r0
            r0 = 0
        L47:
            android.widget.Spinner r3 = r7.H
            long r3 = r3.getSelectedItemId()
            int r4 = (int) r3
            r3 = 2
            if (r4 != r3) goto L53
            if (r0 == 0) goto L57
        L53:
            if (r4 <= 0) goto L5c
            if (r1 != 0) goto L5c
        L57:
            android.widget.Spinner r0 = r7.H
            r0.setSelection(r2, r2)
        L5c:
            android.widget.Spinner r0 = r7.H
            r0.setEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.DialogFragmentC10212zf1.o():void");
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            b0.a(this, Integer.valueOf(i), intent);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e0.b(new C10217zg1.a() { // from class: com.daaw.of1
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.r((String) obj);
            }
        }, this.X);
        f0.b(new C10217zg1.a() { // from class: com.daaw.qf1
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                this.a.s((DialogFragmentC10212zf1.f) obj);
            }
        }, this.X);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        try {
            View viewInflate = View.inflate(getActivity(), AbstractC9815yD0.P, null);
            builder.setView(viewInflate);
            this.D = (ViewGroup) viewInflate.findViewById(AbstractC5056hD0.D1);
            Button button = (Button) viewInflate.findViewById(AbstractC5056hD0.F);
            button.setTextColor(AbstractC1765Ob1.n(button, KC0.q));
            button.setSelected(true);
            button.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.rf1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.B.v(view);
                }
            });
            Button button2 = (Button) viewInflate.findViewById(AbstractC5056hD0.G);
            button2.setTextColor(AbstractC1765Ob1.n(button, KC0.q));
            button2.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.sf1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.B.w(view);
                }
            });
            Button button3 = (Button) viewInflate.findViewById(AbstractC5056hD0.x);
            this.E = button3;
            button3.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.tf1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.B.x(view);
                }
            });
            this.F = (EditText) viewInflate.findViewById(AbstractC5056hD0.L0);
            this.I = (Spinner) viewInflate.findViewById(AbstractC5056hD0.a3);
            this.G = (Spinner) viewInflate.findViewById(AbstractC5056hD0.d3);
            this.H = (Spinner) viewInflate.findViewById(AbstractC5056hD0.e3);
            this.J = (PrEditText) viewInflate.findViewById(AbstractC5056hD0.Q0);
            this.K = (PrEditText) viewInflate.findViewById(AbstractC5056hD0.O0);
            this.L = (PrEditText) viewInflate.findViewById(AbstractC5056hD0.N0);
            this.M = (PrEditText) viewInflate.findViewById(AbstractC5056hD0.K0);
            this.N = (CheckBox) viewInflate.findViewById(AbstractC5056hD0.s0);
            this.O = (CheckBox) viewInflate.findViewById(AbstractC5056hD0.q0);
            this.P = (CheckBox) viewInflate.findViewById(AbstractC5056hD0.r0);
            this.Q = (CheckBox) viewInflate.findViewById(AbstractC5056hD0.p0);
            this.R = (PrEditText) viewInflate.findViewById(AbstractC5056hD0.H0);
            this.S = (CheckBox) viewInflate.findViewById(AbstractC5056hD0.t0);
            if (((Boolean) WB0.m.a(Boolean.FALSE)).booleanValue() && C4989gz0.a.a()) {
                this.S.setVisibility(8);
                viewInflate.findViewById(AbstractC5056hD0.Q3).setVisibility(8);
                viewInflate.findViewById(AbstractC5056hD0.j).setVisibility(8);
            }
            this.T = (Button) viewInflate.findViewById(AbstractC5056hD0.c0);
            this.U = (Button) viewInflate.findViewById(AbstractC5056hD0.A);
            this.T.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.uf1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.B.z(view);
                }
            });
            this.U.setOnClickListener(new View.OnClickListener() { // from class: com.daaw.vf1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.B.B(view);
                }
            });
            AlertDialog alertDialogCreate = builder.create();
            alertDialogCreate.setCancelable(false);
            alertDialogCreate.setCanceledOnTouchOutside(false);
            J((d) d0.a(null));
            WB0.s.b(new C0850Fg1.a() { // from class: com.daaw.wf1
                @Override // com.daaw.C0850Fg1.a
                public final Object invoke(Object obj) {
                    return this.a.C((Boolean) obj);
                }
            }, this.X);
            return alertDialogCreate;
        } catch (Exception e2) {
            AbstractC0441Bk1.b(e2, "Dialog inflation error");
            return null;
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        e0.c(this.X);
        f0.c(this.X);
        this.X.clear();
        this.D = null;
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        Z.a();
        c0.a();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        X61.h.q(true);
    }

    public final d q() {
        d dVar = new d();
        boolean z = true;
        dVar.c = new e(0, AbstractC0405Bb1.w(this.J.getText().toString()), AbstractC0405Bb1.w(this.K.getText().toString()), AbstractC0405Bb1.w(this.L.getText().toString()), AbstractC0405Bb1.u(this.M.getText().toString()), this.Q.isChecked() ? 2 : 1, AbstractC0405Bb1.u(this.R.getText().toString()), this.H.getSelectedItemPosition());
        dVar.d = this.B.d;
        dVar.e = this.G.getSelectedItemPosition();
        dVar.f = this.E.getText().toString();
        dVar.g = this.F.getText().toString();
        dVar.l = this.N.isChecked();
        dVar.h = this.P.isChecked();
        dVar.i = this.V;
        dVar.j = this.W;
        dVar.k = this.O.isChecked();
        if (!C4989gz0.a.a() && !this.S.isChecked()) {
            z = false;
        }
        dVar.m = z;
        return dVar;
    }

    public final void r(String str) {
        if (t()) {
            this.E.setText(str);
        }
    }

    public final void s(f fVar) {
        if (t()) {
            if (!fVar.a) {
                DialogFragmentC0421Bf1 dialogFragmentC0421Bf1 = this.C;
                if (dialogFragmentC0421Bf1 == null || !dialogFragmentC0421Bf1.isVisible()) {
                    return;
                }
                this.C.dismissAllowingStateLoss();
                this.D.post(new Runnable() { // from class: com.daaw.yf1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.B.u();
                    }
                });
                return;
            }
            if (this.C == null) {
                this.C = DialogFragmentC0421Bf1.g();
            }
            if (!this.C.isVisible()) {
                this.C.show(getActivity().getFragmentManager(), "progress");
            }
            getDialog().hide();
            this.C.h(fVar);
        }
    }

    public boolean t() {
        return this.D != null;
    }

    public final /* synthetic */ void u() {
        getDialog().show();
    }

    public final /* synthetic */ void v(View view) {
        Y.a(this, q(), Boolean.FALSE);
        this.S.setChecked(false);
    }

    public final /* synthetic */ void w(View view) {
        Y.a(this, q(), Boolean.TRUE);
    }

    public final /* synthetic */ void x(View view) {
        a0.a(this, this.E.getText().toString());
    }

    public final /* synthetic */ void y(TimePicker timePicker, int i, int i2) {
        G((i2 + (i * 60)) * 1000);
    }

    public final /* synthetic */ void z(View view) {
        Activity activity = getActivity();
        TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: com.daaw.xf1
            @Override // android.app.TimePickerDialog.OnTimeSetListener
            public final void onTimeSet(TimePicker timePicker, int i, int i2) {
                this.a.y(timePicker, i, i2);
            }
        };
        int i = this.V;
        new TimePickerDialog(activity, onTimeSetListener, i / 60000, (i % 60000) / 1000, true).show();
    }

    /* JADX INFO: renamed from: com.daaw.zf1$e */
    public static class e {
        public int a;
        public String b;
        public int c;
        public int d;
        public int e;
        public float f;
        public int g;
        public float h;
        public int i;

        public e(int i, int i2, int i3, int i4, float f, boolean z, int i5) {
            this.a = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = f;
            if (z) {
                this.g = 2;
                this.h = 384.0f;
            } else {
                this.g = 2;
                this.h = 256.0f;
            }
            this.i = i5;
            this.b = e();
        }

        public static e d(e[] eVarArr) {
            if (eVarArr == null || eVarArr.length <= 0) {
                return new e(0, 0, 0, 0, 0.0f, 0, 0.0f, 0);
            }
            e eVarClone = eVarArr[0].clone();
            for (e eVar : eVarArr) {
                eVarClone.c = Math.max(eVarClone.c, eVar.c);
                eVarClone.d = Math.max(eVarClone.d, eVar.d);
                eVarClone.e = Math.max(eVarClone.e, eVar.e);
                eVarClone.f = Math.max(eVarClone.f, eVar.f);
                eVarClone.g = Math.max(eVarClone.g, eVar.g);
                eVarClone.h = Math.max(eVarClone.h, eVar.h);
                eVarClone.i = Math.max(eVarClone.i, eVar.i);
            }
            eVarClone.b = eVarClone.e();
            return eVarClone;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e clone() {
            try {
                super.clone();
            } catch (Exception unused) {
            }
            return new e(this.a, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
        }

        public void b(String str) {
            String[] strArrA = AbstractC1557Mb1.a(";", str);
            if (strArrA.length != 9) {
                return;
            }
            this.a = AbstractC0405Bb1.x(strArrA[0], this.a);
            this.b = AbstractC0405Bb1.A(strArrA[1], this.b);
            this.c = AbstractC0405Bb1.x(strArrA[2], this.c);
            this.d = AbstractC0405Bb1.x(strArrA[3], this.d);
            this.e = AbstractC0405Bb1.x(strArrA[4], this.e);
            this.f = AbstractC0405Bb1.v(strArrA[5], this.f);
            this.g = AbstractC0405Bb1.x(strArrA[6], this.g);
            this.h = AbstractC0405Bb1.v(strArrA[7], this.h);
            this.i = AbstractC0405Bb1.x(strArrA[8], this.i);
        }

        public void c(e eVar) {
            int iMax = Math.max(eVar.c, eVar.d);
            C0850Fg1 c0850Fg1 = AbstractC2916Yx0.c;
            Integer numValueOf = Integer.valueOf(AbstractC5056hD0.Q0);
            Boolean bool = Boolean.FALSE;
            if (!((Boolean) c0850Fg1.a(numValueOf, bool)).booleanValue()) {
                this.c = Math.min(this.c, iMax);
            }
            if (!((Boolean) c0850Fg1.a(Integer.valueOf(AbstractC5056hD0.O0), bool)).booleanValue()) {
                this.d = Math.min(this.d, iMax);
            }
            if (!((Boolean) c0850Fg1.a(Integer.valueOf(AbstractC5056hD0.N0), bool)).booleanValue()) {
                this.e = Math.min(this.e, eVar.e);
            }
            if (!((Boolean) c0850Fg1.a(Integer.valueOf(AbstractC5056hD0.K0), bool)).booleanValue()) {
                this.f = Math.min(this.f, eVar.f);
            }
            this.g = Math.min(this.g, eVar.g);
            if (!((Boolean) c0850Fg1.a(Integer.valueOf(AbstractC5056hD0.H0), bool)).booleanValue()) {
                this.h = Math.min(this.h, eVar.h);
            }
            this.i = Math.min(this.i, eVar.i);
            this.b = e();
        }

        public String e() {
            int i = this.a;
            return String.format(Locale.US, "%s%dp @%d %.1fMbps%s %.1fKbps %s", i == 1 ? " " : i == 2 ? "  " : i == 3 ? "   " : i == 4 ? "    " : "", Integer.valueOf(this.d), Integer.valueOf(this.e), Float.valueOf(this.f), "", Float.valueOf(this.h), this.i == 0 ? "L" : "H");
        }

        public String f() {
            return this.a + ";" + AbstractC1557Mb1.c(';', '_', this.b) + ";" + this.c + ";" + this.d + ";" + this.e + ";" + this.f + ";" + this.g + ";" + this.h + ";" + this.i;
        }

        public e(int i, int i2, int i3, int i4, float f, int i5, float f2, int i6) {
            this.a = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = f;
            this.g = i5;
            this.h = f2;
            this.i = i6;
            this.b = e();
        }
    }

    /* JADX INFO: renamed from: com.daaw.zf1$a */
    public class a implements AdapterView.OnItemSelectedListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            DialogFragmentC10212zf1.this.o();
            DialogFragmentC10212zf1.this.H();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.zf1$b */
    public class b implements AdapterView.OnItemSelectedListener {
        public final /* synthetic */ d B;

        public b(d dVar) {
            this.B = dVar;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            int i2 = i - 1;
            if (i2 >= 0) {
                DialogFragmentC10212zf1.this.D(this.B.c(i2));
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: renamed from: com.daaw.zf1$c */
    public class c implements AdapterView.OnItemSelectedListener {
        public c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            DialogFragmentC10212zf1.this.o();
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }
}
