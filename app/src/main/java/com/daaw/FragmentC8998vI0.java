package com.daaw;

import android.app.Activity;
import android.app.Fragment;
import java.util.HashSet;

/* JADX INFO: renamed from: com.daaw.vI0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class FragmentC8998vI0 extends Fragment {
    public final C9483x2 B;
    public final InterfaceC9556xI0 C;
    public C8712uI0 D;
    public final HashSet E;
    public FragmentC8998vI0 F;

    /* JADX INFO: renamed from: com.daaw.vI0$b */
    public class b implements InterfaceC9556xI0 {
        public b() {
        }
    }

    public FragmentC8998vI0() {
        this(new C9483x2());
    }

    public final void a(FragmentC8998vI0 fragmentC8998vI0) {
        this.E.add(fragmentC8998vI0);
    }

    public C9483x2 b() {
        return this.B;
    }

    public C8712uI0 c() {
        return this.D;
    }

    public InterfaceC9556xI0 d() {
        return this.C;
    }

    public final void e(FragmentC8998vI0 fragmentC8998vI0) {
        this.E.remove(fragmentC8998vI0);
    }

    public void f(C8712uI0 c8712uI0) {
        this.D = c8712uI0;
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            FragmentC8998vI0 fragmentC8998vI0H = C9277wI0.f().h(getActivity().getFragmentManager());
            this.F = fragmentC8998vI0H;
            if (fragmentC8998vI0H != this) {
                fragmentC8998vI0H.a(this);
            }
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.B.b();
    }

    @Override // android.app.Fragment
    public void onDetach() {
        super.onDetach();
        FragmentC8998vI0 fragmentC8998vI0 = this.F;
        if (fragmentC8998vI0 != null) {
            fragmentC8998vI0.e(this);
            this.F = null;
        }
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        C8712uI0 c8712uI0 = this.D;
        if (c8712uI0 != null) {
            c8712uI0.w();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        this.B.c();
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        this.B.d();
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks2
    public void onTrimMemory(int i) {
        C8712uI0 c8712uI0 = this.D;
        if (c8712uI0 != null) {
            c8712uI0.x(i);
        }
    }

    public FragmentC8998vI0(C9483x2 c9483x2) {
        this.C = new b();
        this.E = new HashSet();
        this.B = c9483x2;
    }
}
