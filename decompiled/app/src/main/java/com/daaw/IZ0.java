package com.daaw;

import android.app.Activity;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class IZ0 extends androidx.fragment.app.c {
    public C8712uI0 G0;
    public final C9483x2 H0;
    public final InterfaceC9556xI0 I0;
    public final HashSet J0;
    public IZ0 K0;

    public class b implements InterfaceC9556xI0 {
        public b() {
        }
    }

    public IZ0() {
        this(new C9483x2());
    }

    public final void I1(IZ0 iz0) {
        this.J0.add(iz0);
    }

    public C9483x2 J1() {
        return this.H0;
    }

    public C8712uI0 K1() {
        return this.G0;
    }

    public InterfaceC9556xI0 L1() {
        return this.I0;
    }

    public final void M1(IZ0 iz0) {
        this.J0.remove(iz0);
    }

    public void N1(C8712uI0 c8712uI0) {
        this.G0 = c8712uI0;
    }

    @Override // androidx.fragment.app.c
    public void O0() {
        super.O0();
        this.H0.c();
    }

    @Override // androidx.fragment.app.c
    public void P0() {
        super.P0();
        this.H0.d();
    }

    @Override // androidx.fragment.app.c
    public void n0(Activity activity) {
        super.n0(activity);
        try {
            IZ0 iz0I = C9277wI0.f().i(m().f0());
            this.K0 = iz0I;
            if (iz0I != this) {
                iz0I.I1(this);
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.c, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        C8712uI0 c8712uI0 = this.G0;
        if (c8712uI0 != null) {
            c8712uI0.w();
        }
    }

    @Override // androidx.fragment.app.c
    public void w0() {
        super.w0();
        this.H0.b();
    }

    @Override // androidx.fragment.app.c
    public void z0() {
        super.z0();
        IZ0 iz0 = this.K0;
        if (iz0 != null) {
            iz0.M1(this);
            this.K0 = null;
        }
    }

    public IZ0(C9483x2 c9483x2) {
        this.I0 = new b();
        this.J0 = new HashSet();
        this.H0 = c9483x2;
    }
}
