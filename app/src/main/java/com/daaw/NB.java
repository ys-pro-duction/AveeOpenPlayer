package com.daaw;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentManager;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class NB extends androidx.fragment.app.c implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler G0;
    public boolean P0;
    public Dialog R0;
    public boolean S0;
    public boolean T0;
    public boolean U0;
    public Runnable H0 = new a();
    public DialogInterface.OnCancelListener I0 = new b();
    public DialogInterface.OnDismissListener J0 = new c();
    public int K0 = 0;
    public int L0 = 0;
    public boolean M0 = true;
    public boolean N0 = true;
    public int O0 = -1;
    public InterfaceC9145vp0 Q0 = new d();
    public boolean V0 = false;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            NB.this.J0.onDismiss(NB.this.R0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (NB.this.R0 != null) {
                NB nb = NB.this;
                nb.onCancel(nb.R0);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (NB.this.R0 != null) {
                NB nb = NB.this;
                nb.onDismiss(nb.R0);
            }
        }
    }

    public class d implements InterfaceC9145vp0 {
        public d() {
        }

        @Override // com.daaw.InterfaceC9145vp0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(InterfaceC1764Ob0 interfaceC1764Ob0) {
            if (interfaceC1764Ob0 == null || !NB.this.N0) {
                return;
            }
            View viewT1 = NB.this.t1();
            if (viewT1.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (NB.this.R0 != null) {
                if (FragmentManager.J0(3)) {
                    toString();
                    Objects.toString(NB.this.R0);
                }
                NB.this.R0.setContentView(viewT1);
            }
        }
    }

    public class e extends OP {
        public final /* synthetic */ OP B;

        public e(OP op) {
            this.B = op;
        }

        @Override // com.daaw.OP
        public View k(int i) {
            return this.B.m() ? this.B.k(i) : NB.this.Q1(i);
        }

        @Override // com.daaw.OP
        public boolean m() {
            return this.B.m() || NB.this.R1();
        }
    }

    @Override // androidx.fragment.app.c
    public LayoutInflater A0(Bundle bundle) {
        LayoutInflater layoutInflaterA0 = super.A0(bundle);
        if (this.N0 && !this.P0) {
            S1(bundle);
            if (FragmentManager.J0(2)) {
                toString();
            }
            Dialog dialog = this.R0;
            if (dialog != null) {
                return layoutInflaterA0.cloneInContext(dialog.getContext());
            }
        } else if (FragmentManager.J0(2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("getting layout inflater for DialogFragment ");
            sb.append(this);
        }
        return layoutInflaterA0;
    }

    public void L1() {
        M1(false, false, false);
    }

    public final void M1(boolean z, boolean z2, boolean z3) {
        if (this.T0) {
            return;
        }
        this.T0 = true;
        this.U0 = false;
        Dialog dialog = this.R0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.R0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.G0.getLooper()) {
                    onDismiss(this.R0);
                } else {
                    this.G0.post(this.H0);
                }
            }
        }
        this.S0 = true;
        if (this.O0 >= 0) {
            if (z3) {
                I().Y0(this.O0, 1);
            } else {
                I().W0(this.O0, 1, z);
            }
            this.O0 = -1;
            return;
        }
        androidx.fragment.app.g gVarO = I().o();
        gVarO.p(true);
        gVarO.l(this);
        if (z3) {
            gVarO.h();
        } else if (z) {
            gVarO.g();
        } else {
            gVarO.f();
        }
    }

    @Override // androidx.fragment.app.c
    public void N0(Bundle bundle) {
        super.N0(bundle);
        Dialog dialog = this.R0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i = this.K0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.L0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.M0;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.N0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.O0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    public Dialog N1() {
        return this.R0;
    }

    @Override // androidx.fragment.app.c
    public void O0() {
        super.O0();
        Dialog dialog = this.R0;
        if (dialog != null) {
            this.S0 = false;
            dialog.show();
            View decorView = this.R0.getWindow().getDecorView();
            AbstractC2217Se1.b(decorView, this);
            AbstractC2529Ve1.b(decorView, this);
            AbstractC2425Ue1.b(decorView, this);
        }
    }

    public int O1() {
        return this.L0;
    }

    @Override // androidx.fragment.app.c
    public void P0() {
        super.P0();
        Dialog dialog = this.R0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    public Dialog P1(Bundle bundle) {
        if (FragmentManager.J0(3)) {
            toString();
        }
        return new DialogC9139vo(s1(), O1());
    }

    public View Q1(int i) {
        Dialog dialog = this.R0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // androidx.fragment.app.c
    public void R0(Bundle bundle) {
        Bundle bundle2;
        super.R0(bundle);
        if (this.R0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.R0.onRestoreInstanceState(bundle2);
    }

    public boolean R1() {
        return this.V0;
    }

    public final void S1(Bundle bundle) {
        if (this.N0 && !this.V0) {
            try {
                this.P0 = true;
                Dialog dialogP1 = P1(bundle);
                this.R0 = dialogP1;
                if (this.N0) {
                    W1(dialogP1, this.K0);
                    Context contextU = u();
                    if (contextU instanceof Activity) {
                        this.R0.setOwnerActivity((Activity) contextU);
                    }
                    this.R0.setCancelable(this.M0);
                    this.R0.setOnCancelListener(this.I0);
                    this.R0.setOnDismissListener(this.J0);
                    this.V0 = true;
                } else {
                    this.R0 = null;
                }
                this.P0 = false;
            } catch (Throwable th) {
                this.P0 = false;
                throw th;
            }
        }
    }

    public final Dialog T1() {
        Dialog dialogN1 = N1();
        if (dialogN1 != null) {
            return dialogN1;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    public void U1(boolean z) {
        this.M0 = z;
        Dialog dialog = this.R0;
        if (dialog != null) {
            dialog.setCancelable(z);
        }
    }

    public void V1(boolean z) {
        this.N0 = z;
    }

    public void W1(Dialog dialog, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void X1(FragmentManager fragmentManager, String str) {
        this.T0 = false;
        this.U0 = true;
        androidx.fragment.app.g gVarO = fragmentManager.o();
        gVarO.p(true);
        gVarO.d(this, str);
        gVarO.f();
    }

    @Override // androidx.fragment.app.c
    public void Y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.Y0(layoutInflater, viewGroup, bundle);
        if (this.l0 != null || this.R0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.R0.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.c
    public OP g() {
        return new e(super.g());
    }

    @Override // androidx.fragment.app.c
    public void l0(Bundle bundle) {
        super.l0(bundle);
    }

    @Override // androidx.fragment.app.c
    public void o0(Context context) {
        super.o0(context);
        Z().g(this.Q0);
        if (this.U0) {
            return;
        }
        this.T0 = false;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.S0) {
            return;
        }
        if (FragmentManager.J0(3)) {
            toString();
        }
        M1(true, true, false);
    }

    @Override // androidx.fragment.app.c
    public void r0(Bundle bundle) {
        super.r0(bundle);
        this.G0 = new Handler();
        this.N0 = this.b0 == 0;
        if (bundle != null) {
            this.K0 = bundle.getInt("android:style", 0);
            this.L0 = bundle.getInt("android:theme", 0);
            this.M0 = bundle.getBoolean("android:cancelable", true);
            this.N0 = bundle.getBoolean("android:showsDialog", this.N0);
            this.O0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.c
    public void y0() {
        super.y0();
        Dialog dialog = this.R0;
        if (dialog != null) {
            this.S0 = true;
            dialog.setOnDismissListener(null);
            this.R0.dismiss();
            if (!this.T0) {
                onDismiss(this.R0);
            }
            this.R0 = null;
            this.V0 = false;
        }
    }

    @Override // androidx.fragment.app.c
    public void z0() {
        super.z0();
        if (!this.U0 && !this.T0) {
            this.T0 = true;
        }
        Z().k(this.Q0);
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
