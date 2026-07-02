package com.daaw;

import android.R;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import com.daaw.C0321Ag1;
import com.daaw.C10217zg1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.ov, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class DialogFragmentC7214ov extends DialogFragment {
    public static C0321Ag1 Q = new C0321Ag1();
    public static C0529Cg1 R = new C0529Cg1();
    public static C0529Cg1 S = new C0529Cg1();
    public static C0425Bg1 T = new C0425Bg1();
    public static C0425Bg1 U = new C0425Bg1();
    public static C0642Dg1 V = new C0642Dg1();
    public static C0425Bg1 W = new C0425Bg1();
    public static C9938yg1 X = new C9938yg1();
    public static C9938yg1 Y = new C9938yg1();
    public static C0425Bg1 Z = new C0425Bg1();
    public static C1058Hg1 a0 = new C1058Hg1();
    public static C0850Fg1 b0 = new C0850Fg1();
    public static C0321Ag1 c0 = new C0321Ag1();
    public static C0321Ag1 d0 = new C0321Ag1();
    public static C0529Cg1 e0 = new C0529Cg1();
    public static C0850Fg1 f0 = new C0850Fg1();
    public static WeakReference g0 = new WeakReference(null);
    public C7493pv E;
    public C8887uv F;
    public C9452wv G;
    public int J;
    public C2695Wu K;
    public int L;
    public int B = 0;
    public int C = 268435455;
    public boolean D = false;
    public C0321Ag1 H = new C0321Ag1();
    public List I = new LinkedList();
    public boolean M = false;
    public C8696uE0 N = new C8696uE0(80);
    public ArrayList O = null;
    public String P = null;

    /* JADX INFO: renamed from: com.daaw.ov$a */
    public class a implements KQ {
        public a() {
        }

        @Override // com.daaw.KQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC5559j2 a() {
            DialogFragmentC7214ov dialogFragmentC7214ov = DialogFragmentC7214ov.this;
            return dialogFragmentC7214ov.F.h(dialogFragmentC7214ov.O, DialogFragmentC7214ov.this.P);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ov$c */
    public class c implements C10217zg1.a {
        public c() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            DialogFragmentC7214ov.d0.a(num, DialogFragmentC7214ov.this.K);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ov$d */
    public class d implements C10217zg1.a {
        public d() {
        }

        @Override // com.daaw.C10217zg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num) {
            DialogFragmentC7214ov.c0.a(num, DialogFragmentC7214ov.this.K);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ov$e */
    public class e extends Dialog {
        public e(Context context, int i) {
            super(context, i);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (((Boolean) DialogFragmentC7214ov.b0.a(DialogFragmentC7214ov.k(), Boolean.FALSE)).booleanValue()) {
                return;
            }
            super.onBackPressed();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ov$f */
    public class f implements KQ {
        public f() {
        }

        @Override // com.daaw.KQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC5559j2 a() {
            DialogFragmentC7214ov dialogFragmentC7214ov = DialogFragmentC7214ov.this;
            return dialogFragmentC7214ov.F.h(dialogFragmentC7214ov.O, DialogFragmentC7214ov.this.P);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ov$g */
    public class g implements InterfaceC6408m2 {
        public g() {
        }

        @Override // com.daaw.InterfaceC6408m2
        public void a() {
            C0529Cg1 c0529Cg1 = DialogFragmentC7214ov.S;
            Integer numValueOf = Integer.valueOf(DialogFragmentC7214ov.this.L);
            DialogFragmentC7214ov dialogFragmentC7214ov = DialogFragmentC7214ov.this;
            c0529Cg1.a(numValueOf, dialogFragmentC7214ov.K, Integer.valueOf(dialogFragmentC7214ov.J), null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ov$h */
    public class h implements KQ {
        public h() {
        }

        @Override // com.daaw.KQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public InterfaceC5559j2 a() {
            DialogFragmentC7214ov dialogFragmentC7214ov = DialogFragmentC7214ov.this;
            return dialogFragmentC7214ov.F.h(dialogFragmentC7214ov.O, DialogFragmentC7214ov.this.P);
        }
    }

    public DialogFragmentC7214ov() {
        setStyle(2, 0);
        g0 = new WeakReference(this);
        this.E = new C7493pv();
        this.F = new C8887uv();
        this.G = new C9452wv();
    }

    public static DialogFragmentC7214ov j(Integer num, C2695Wu c2695Wu, String[] strArr) {
        DialogFragmentC7214ov dialogFragmentC7214ov = new DialogFragmentC7214ov();
        Bundle bundle = new Bundle();
        bundle.putInt("arg1", num.intValue());
        bundle.putStringArray("arg2", strArr);
        bundle.putString("arg3", c2695Wu.o());
        dialogFragmentC7214ov.setArguments(bundle);
        AbstractC1765Ob1.w(dialogFragmentC7214ov, "CustomizeVisDialog");
        return dialogFragmentC7214ov;
    }

    public static DialogFragmentC7214ov k() {
        return (DialogFragmentC7214ov) g0.get();
    }

    public static boolean o(FragmentManager fragmentManager) {
        fragmentManager.executePendingTransactions();
        return (k() == null || fragmentManager.findFragmentByTag("CustomizeVisDialog") == null) ? false : true;
    }

    public void A(C2591Vu c2591Vu, String str, InterfaceC5559j2 interfaceC5559j2) {
        this.F.g(c2591Vu, str, interfaceC5559j2);
    }

    public void d(AdapterView adapterView) {
        TextView textView = (TextView) adapterView.getChildAt(0);
        if (textView != null) {
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(this.C);
        }
    }

    public void e(Spinner spinner) {
        TextView textView = (TextView) spinner.getSelectedView();
        if (textView != null) {
            textView.setTextSize(2, 12.0f);
            textView.setTextColor(this.C);
        }
    }

    public void f(C2591Vu c2591Vu, String str) {
        DialogFragmentC7214ov dialogFragmentC7214ovK = k();
        if (dialogFragmentC7214ovK == null) {
            return;
        }
        e0.a(dialogFragmentC7214ovK, this.K, c2591Vu, str);
    }

    public void g(String str, String str2) {
        DialogFragmentC7214ov dialogFragmentC7214ovK = k();
        if (dialogFragmentC7214ovK == null) {
            return;
        }
        Z.a(dialogFragmentC7214ovK, str, str2);
    }

    public B61 h(String str, String str2) {
        return (B61) a0.a(k(), str, str2, new B61(new String[0], ""));
    }

    public boolean i() {
        boolean z = this.G.c() && (this.D || this.E.k());
        v(null, null, null, null);
        return z;
    }

    public i l(int i2) {
        return this.E.j(i2);
    }

    public boolean m(int i2) {
        boolean z = false;
        boolean z2 = i2 == 1 && !this.D;
        boolean z3 = z2 != this.E.k();
        this.E.x(z2);
        if (!z2 && !this.D) {
            z = true;
        }
        this.F.F(z);
        i();
        return z3;
    }

    public boolean n(String str) {
        return ((Boolean) f0.a(str, Boolean.TRUE)).booleanValue();
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i3 == -1) {
            W.a(k(), Integer.valueOf(i2), intent);
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(2, 0);
        this.H.b(new b(), this.I);
        AbstractC2487Uu.b.b(new c(), this.I);
        AbstractC2487Uu.a.b(new d(), this.I);
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        return new e(getActivity(), getTheme());
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.B = getResources().getInteger(R.integer.config_shortAnimTime);
        this.C = AbstractC9438ws.c(getActivity(), PC0.g);
        this.D = getResources().getBoolean(MC0.a);
        Bundle arguments = getArguments();
        this.L = arguments.getInt("arg1");
        String[] stringArray = arguments.getStringArray("arg2");
        this.K = C2695Wu.g(arguments.getString("arg3"));
        this.J = 0;
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(AbstractC9815yD0.m, viewGroup, false);
        this.G.e(layoutInflater, viewGroup2, bundle, getActivity());
        if (bundle != null) {
            this.E.r(bundle.getInt("arg4", -1));
            this.O = bundle.getStringArrayList("arg5");
            this.P = bundle.getString("arg6");
            this.G.g(this.K.i(this.O), this.P, new f());
        }
        this.E.m(layoutInflater, viewGroup2, bundle, getActivity(), stringArray);
        this.M = false;
        C7493pv c7493pv = this.E;
        c7493pv.y(c7493pv.l);
        this.M = true;
        this.F.B(layoutInflater, viewGroup2, bundle);
        this.M = false;
        C7493pv c7493pv2 = this.E;
        c7493pv2.r(c7493pv2.l);
        this.M = false;
        this.E.q(this.K);
        this.M = true;
        return viewGroup2;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        this.H.c(this.I);
        AbstractC2487Uu.b.c(this.I);
        AbstractC2487Uu.a.c(this.I);
        this.I.clear();
        super.onDestroy();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onDestroyView() {
        if (this.K != null) {
            getArguments().putString("arg3", this.K.o());
        }
        super.onDestroyView();
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        s();
        Y.a();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        DialogFragmentC7214ov dialogFragmentC7214ovK = k();
        if (dialogFragmentC7214ovK == null || !dialogFragmentC7214ovK.equals(this)) {
            return;
        }
        X.a();
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("arg4", this.E.l);
        bundle.putStringArrayList("arg5", this.O);
        bundle.putString("arg6", this.P);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onStart() {
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -1);
            }
            dialog.setCancelable(true);
            dialog.setCanceledOnTouchOutside(true);
        }
    }

    public boolean p() {
        return getActivity() != null;
    }

    public void q() {
        if (this.M && this.K != null) {
            S.a(Integer.valueOf(this.L), this.K, Integer.valueOf(this.J), this.H);
        }
    }

    public void r(boolean z) {
        if (this.M && this.K != null) {
            AbstractC0441Bk1.c("onCompositionChanged invoke");
            S.a(Integer.valueOf(this.L), this.K, Integer.valueOf(this.J), z ? this.H : null);
        }
    }

    public void s() {
        T.a(Integer.valueOf(this.L), this.K, Integer.valueOf(this.J));
    }

    public void t(TextView textView, List list, String str, String str2) {
        this.F.C(textView, list, str, str2);
        C7493pv c7493pv = this.E;
        c7493pv.r(c7493pv.l);
        InterfaceC5559j2 interfaceC5559j2H = this.F.h(list, str);
        if (interfaceC5559j2H != null) {
            interfaceC5559j2H.a(null);
        }
    }

    public void u() {
        if (this.M && this.K != null) {
            this.N.a(new g());
            C7493pv c7493pv = this.E;
            c7493pv.E(c7493pv.l);
        }
    }

    public void v(C2591Vu c2591Vu, String str, View view, InterfaceC5559j2 interfaceC5559j2) {
        this.O = c2591Vu != null ? c2591Vu.k() : null;
        this.P = str;
        this.G.g(c2591Vu, str, new h());
    }

    public void w(int i2, boolean z) {
        i iVarL = l(i2);
        U.a(Integer.valueOf(this.L), Integer.valueOf(iVarL != null ? iVarL.b : -1), Boolean.valueOf(z));
    }

    public void x(C2695Wu c2695Wu, boolean z, int i2) {
        this.K = c2695Wu;
        this.M = false;
        this.E.q(c2695Wu);
        C7493pv c7493pv = this.E;
        c7493pv.r(c7493pv.l);
        this.G.g(c2695Wu.i(this.O), this.P, new a());
        this.M = true;
        if (z) {
            this.E.v();
        } else if (i2 > -1) {
            this.E.w(i2);
        }
    }

    public void y(C2591Vu c2591Vu) {
        this.F.E(c2591Vu);
    }

    public void z(int i2) {
        this.E.u(i2);
    }

    /* JADX INFO: renamed from: com.daaw.ov$i */
    public static class i {
        public String a;
        public int b;
        public C2279Su c;
        public C2591Vu d;

        public i(String str, C2279Su c2279Su, int i, boolean z) {
            this.a = str;
            this.b = i;
            this.c = c2279Su;
        }

        public C2279Su a() {
            return this.c;
        }

        public C2591Vu b() {
            return this.d;
        }

        public String c() {
            C2591Vu c2591Vu = this.d;
            return c2591Vu == null ? "" : c2591Vu.B();
        }

        public boolean d() {
            return this.c != null;
        }

        public i(String str, C2591Vu c2591Vu, int i) {
            this.a = str;
            this.b = i;
            this.d = c2591Vu;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ov$b */
    public class b implements C0321Ag1.a {
        public b() {
        }

        @Override // com.daaw.C0321Ag1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void invoke(Integer num, C2695Wu c2695Wu) {
        }
    }
}
