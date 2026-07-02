package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.daaw.C0321Ag1;
import com.daaw.C0642Dg1;
import com.daaw.C0746Eg1;
import com.daaw.C0850Fg1;
import com.daaw.C10217zg1;
import com.daaw.C2951Zg;
import com.daaw.C9938yg1;
import com.daaw.avee.MainActivity;
import com.daaw.avee.comp.playback.MediaPlaybackService;
import com.google.android.material.navigation.NavigationView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class X61 {
    public static final a h = new a(null);
    public static final int i = 8;
    public static final C0746Eg1 j = new C0746Eg1();
    public static final C0746Eg1 k = new C0746Eg1();
    public static final C9938yg1 l = new C9938yg1();
    public final List a;
    public C2951Zg b;
    public boolean c;
    public boolean d;
    public int e;
    public final DrawerLayout.e f;
    public boolean g;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public static /* synthetic */ boolean c(a aVar, MainActivity mainActivity, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return aVar.b(mainActivity, z);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0073 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:36:? A[LOOP:0: B:10:0x002f->B:36:?, LOOP_END, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean b(com.daaw.avee.MainActivity r7, boolean r8) {
            /*
                r6 = this;
                java.lang.String r8 = "mainActivity"
                com.daaw.G10.g(r7, r8)
                int r8 = android.os.Build.VERSION.SDK_INT
                r0 = 26
                r1 = 0
                if (r8 < r0) goto L77
                android.app.FragmentManager r7 = r7.getFragmentManager()
                java.util.List r7 = com.daaw.W61.a(r7)
                java.lang.String r8 = "getFragments(...)"
                com.daaw.G10.f(r7, r8)
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                boolean r8 = r7 instanceof java.util.Collection
                r0 = 1
                if (r8 == 0) goto L2b
                r8 = r7
                java.util.Collection r8 = (java.util.Collection) r8
                boolean r8 = r8.isEmpty()
                if (r8 == 0) goto L2b
            L29:
                r7 = 0
                goto L74
            L2b:
                java.util.Iterator r7 = r7.iterator()
            L2f:
                boolean r8 = r7.hasNext()
                if (r8 == 0) goto L29
                java.lang.Object r8 = r7.next()
                android.app.Fragment r8 = (android.app.Fragment) r8
                java.lang.Class r2 = r8.getClass()
                com.daaw.J50 r2 = com.daaw.AbstractC5624jG0.b(r2)
                java.lang.String r2 = r2.toString()
                java.lang.String r3 = "Dialog"
                r4 = 2
                r5 = 0
                boolean r2 = com.daaw.BY0.z(r2, r3, r1, r4, r5)
                if (r2 == 0) goto L70
                boolean r2 = r8.isVisible()
                if (r2 != 0) goto L6e
                boolean r2 = r8 instanceof android.app.DialogFragment
                if (r2 == 0) goto L5e
                r5 = r8
                android.app.DialogFragment r5 = (android.app.DialogFragment) r5
            L5e:
                if (r5 == 0) goto L6b
                android.app.Dialog r8 = r5.getDialog()
                if (r8 == 0) goto L6b
                boolean r8 = r8.isShowing()
                goto L6c
            L6b:
                r8 = 0
            L6c:
                if (r8 == 0) goto L70
            L6e:
                r8 = 1
                goto L71
            L70:
                r8 = 0
            L71:
                if (r8 == 0) goto L2f
                r7 = 1
            L74:
                if (r7 == 0) goto L77
                return r0
            L77:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.X61.a.b(com.daaw.avee.MainActivity, boolean):boolean");
        }

        public final MainActivity d() {
            return MainActivity.INSTANCE.e();
        }

        public final C0746Eg1 e() {
            return X61.k;
        }

        public final C0746Eg1 f() {
            return X61.j;
        }

        public final boolean g() {
            return o("pref_hasSeenEditor7");
        }

        public final boolean h() {
            return o("pref_hasSeenExport7");
        }

        public final boolean i() {
            return o("pref_hasSeenLibrary7");
        }

        public final boolean j() {
            return o("pref_hasSeenVisualizer7");
        }

        public final boolean k() {
            return o("pref_hasSeenVisualizerChooser7");
        }

        public final boolean l() {
            return o("pref_hasSwiped7");
        }

        public final long m() {
            SharedPreferences sharedPreferencesP;
            Context contextB = com.daaw.avee.a.d.b();
            if (contextB == null || (sharedPreferencesP = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().p(contextB)) == null) {
                return 0L;
            }
            return SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.N(sharedPreferencesP, "pref_lastPremiumShowcaseTimestamp", 0L);
        }

        public final C9938yg1 n() {
            return X61.l;
        }

        public final boolean o(String str) {
            Context contextB = com.daaw.avee.a.d.b();
            if (contextB != null) {
                return SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().K(contextB, str, false);
            }
            return true;
        }

        public final void p(boolean z) {
            w("pref_hasSeenEditor7", z);
        }

        public final void q(boolean z) {
            w("pref_hasSeenExport7", z);
        }

        public final void r(boolean z) {
            w("pref_hasSeenLibrary7", z);
        }

        public final void s(boolean z) {
            w("pref_hasSeenVisualizer7", z);
        }

        public final void t(boolean z) {
            w("pref_hasSeenVisualizerChooser7", z);
        }

        public final void u(boolean z) {
            w("pref_hasSwiped7", z);
        }

        public final void v(long j) {
            SharedPreferences sharedPreferencesP;
            Context contextB = com.daaw.avee.a.d.b();
            if (contextB == null || (sharedPreferencesP = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().p(contextB)) == null) {
                return;
            }
            try {
                SharedPreferences.Editor editorEdit = sharedPreferencesP.edit();
                editorEdit.putLong("pref_lastPremiumShowcaseTimestamp", j);
                editorEdit.apply();
                editorEdit.apply();
            } catch (Exception unused) {
            }
        }

        public final void w(String str, boolean z) {
            Context contextB = com.daaw.avee.a.d.b();
            if (contextB != null) {
                SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().Q(contextB, str, z);
            }
        }

        public a() {
        }
    }

    public static final class b implements InterfaceC3778ch {
        public final /* synthetic */ View b;

        public b(View view) {
            this.b = view;
        }

        @Override // com.daaw.InterfaceC3778ch
        public void a(C2951Zg c2951Zg) {
            G10.g(c2951Zg, "bubbleShowCase");
        }

        @Override // com.daaw.InterfaceC3778ch
        public void b(C2951Zg c2951Zg) {
            G10.g(c2951Zg, "bubbleShowCase");
            c2951Zg.j();
            X61.this.b = null;
        }

        @Override // com.daaw.InterfaceC3778ch
        public void c(C2951Zg c2951Zg) {
            G10.g(c2951Zg, "bubbleShowCase");
            c2951Zg.j();
            X61.this.b = null;
        }

        @Override // com.daaw.InterfaceC3778ch
        public void d(C2951Zg c2951Zg) {
            G10.g(c2951Zg, "bubbleShowCase");
            c2951Zg.j();
            X61.this.b = null;
            View view = this.b;
            if (view != null) {
                view.performClick();
            }
        }
    }

    public X61() {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.e = -1;
        this.f = new c();
        j.b(new C0746Eg1.a() { // from class: com.daaw.E61
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return X61.s(this.a);
            }
        }, arrayList);
        k.b(new C0746Eg1.a() { // from class: com.daaw.O61
            @Override // com.daaw.C0746Eg1.a
            public final Object invoke() {
                return Boolean.valueOf(this.a.M());
            }
        }, arrayList);
        l.b(new C9938yg1.a() { // from class: com.daaw.P61
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                X61.t(this.a);
            }
        }, arrayList);
        DialogFragmentC7214ov.X.b(new C9938yg1.a() { // from class: com.daaw.Q61
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                X61.v(this.a);
            }
        }, arrayList);
        if (!h.j()) {
            MediaPlaybackService.s0.b(new C0642Dg1.a() { // from class: com.daaw.R61
                @Override // com.daaw.C0642Dg1.a
                public final void e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    X61.w(this.a, ((Boolean) obj).booleanValue(), (Boolean) obj2, (Integer) obj3, (String) obj4, (C2078Qw0) obj5);
                }
            }, arrayList);
        }
        MainActivity.L0.b(new C10217zg1.a() { // from class: com.daaw.S61
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                X61.x(this.a, (Activity) obj);
            }
        }, arrayList);
        MainActivity.R0.b(new C0321Ag1.a() { // from class: com.daaw.T61
            @Override // com.daaw.C0321Ag1.a
            public final void invoke(Object obj, Object obj2) {
                X61.y(this.a, (Integer) obj, (Activity) obj2);
            }
        }, arrayList);
        MainActivity.n1.b(new C0850Fg1.a() { // from class: com.daaw.U61
            @Override // com.daaw.C0850Fg1.a
            public final Object invoke(Object obj) {
                return X61.z(this.a, (Integer) obj);
            }
        }, arrayList);
        DialogFragmentC7214ov.Y.b(new C9938yg1.a() { // from class: com.daaw.V61
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                X61.A(this.a);
            }
        }, arrayList);
        DialogFragmentC10212zf1.c0.b(new C9938yg1.a() { // from class: com.daaw.F61
            @Override // com.daaw.C9938yg1.a
            public final void invoke() {
                X61.B(this.a);
            }
        }, arrayList);
        MainActivity.O0.b(new C10217zg1.a() { // from class: com.daaw.N61
            @Override // com.daaw.C10217zg1.a
            public final void invoke(Object obj) {
                X61.u(this.a, (Configuration) obj);
            }
        }, arrayList);
    }

    public static final void A(X61 x61) {
        G10.g(x61, "this$0");
        if (h.h()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new G61(x61));
    }

    public static final void B(final X61 x61) {
        G10.g(x61, "this$0");
        if (h.l()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.daaw.I61
            @Override // java.lang.Runnable
            public final void run() {
                this.B.S();
            }
        });
    }

    public static /* synthetic */ boolean L(X61 x61, View view, int i2, boolean z, Integer num, C2951Zg.a aVar, boolean z2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            num = null;
        }
        if ((i3 & 16) != 0) {
            aVar = null;
        }
        if ((i3 & 32) != 0) {
            z2 = false;
        }
        return x61.K(view, i2, z, num, aVar, z2);
    }

    public static void k(X61 x61) {
        G10.g(x61, "this$0");
        if (h.j()) {
            return;
        }
        x61.T();
    }

    public static final DrawerLayout.e s(X61 x61) {
        G10.g(x61, "this$0");
        return x61.f;
    }

    public static final void t(X61 x61) {
        G10.g(x61, "this$0");
        if (h.g()) {
            return;
        }
        new Handler(Looper.getMainLooper()).post(new K61(x61));
    }

    public static final void u(X61 x61, Configuration configuration) {
        G10.g(x61, "this$0");
        C2951Zg c2951Zg = x61.b;
        if (c2951Zg != null) {
            c2951Zg.j();
            c2951Zg.E();
        }
    }

    public static final void v(X61 x61) {
        G10.g(x61, "this$0");
        h.p(true);
        x61.M();
    }

    public static final void w(final X61 x61, boolean z, Boolean bool, Integer num, String str, C2078Qw0 c2078Qw0) {
        G10.g(x61, "this$0");
        x61.d = z;
        if (z) {
            int i2 = x61.e;
            if (i2 == 2) {
                if (i2 == 2) {
                    x61.N();
                }
            } else {
                MainActivity mainActivityD = h.d();
                if (mainActivityD != null) {
                    mainActivityD.runOnUiThread(new Runnable() { // from class: com.daaw.L61
                        @Override // java.lang.Runnable
                        public final void run() {
                            X61.k(this.B);
                        }
                    });
                }
            }
        }
    }

    public static final void x(final X61 x61, Activity activity) {
        G10.g(x61, "this$0");
        if (activity != null && C3465ba.a(activity, null)) {
            if (x61.e != 0 || h.i()) {
                new Handler(Looper.getMainLooper()).postDelayed(new H61(x61), 2000L);
            } else {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.daaw.J61
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.B.Q();
                    }
                });
            }
        }
    }

    public static final void y(X61 x61, Integer num, Activity activity) {
        G10.g(x61, "this$0");
        G10.d(num);
        x61.e = num.intValue();
        if (num.intValue() == 2) {
            if (x61.d) {
                x61.N();
            }
        } else if (num.intValue() == 1) {
            new Handler(Looper.getMainLooper()).post(new H61(x61));
        }
    }

    public static final Boolean z(X61 x61, Integer num) {
        G10.g(x61, "this$0");
        x61.M();
        return Boolean.TRUE;
    }

    public final void J(boolean z) {
        if (this.d) {
            boolean z2 = z ? !this.c : this.c;
            if (z2 != this.g) {
                this.g = z2;
                M();
                if (z2) {
                    V();
                }
            }
        }
    }

    public final boolean K(View view, int i2, boolean z, Integer num, C2951Zg.a aVar, boolean z2) {
        a aVar2 = h;
        MainActivity mainActivityD = aVar2.d();
        if (mainActivityD == null || !((view != null || z) && this.b == null && z2 == this.c)) {
            return false;
        }
        Drawable drawableQ = null;
        if (a.c(aVar2, mainActivityD, false, 2, null)) {
            return false;
        }
        C3500bh c3500bh = new C3500bh(mainActivityD);
        String string = mainActivityD.getResources().getString(i2);
        G10.f(string, "getString(...)");
        C3500bh c3500bhE = c3500bh.E(string);
        if (view != null) {
            c3500bhE.C(view);
        }
        if (num != null) {
            c3500bhE.y(num.intValue());
        }
        if (aVar != null) {
            c3500bhE.b(aVar);
        }
        C3500bh c3500bhD = c3500bhE.c(-1).D(-16777216);
        Drawable drawableE = AbstractC9438ws.e(mainActivityD, AbstractC3374bD0.v);
        if (drawableE != null) {
            Drawable drawableR = SD.r(drawableE);
            G10.f(drawableR, "wrap(...)");
            SD.n(drawableR, -16777216);
            drawableQ = SD.q(drawableR);
        }
        this.b = c3500bhD.e(drawableQ).z(new b(view)).A();
        return true;
    }

    public final boolean M() {
        C2951Zg c2951Zg = this.b;
        if (c2951Zg == null) {
            return false;
        }
        c2951Zg.j();
        this.b = null;
        return true;
    }

    public final void N() {
        a aVar = h;
        aVar.s(true);
        if (!aVar.k()) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.daaw.M61
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.U();
                }
            }, 3000L);
        } else if (!aVar.g()) {
            new Handler(Looper.getMainLooper()).postDelayed(new K61(this), 2000L);
        } else {
            if (aVar.h()) {
                return;
            }
            new Handler(Looper.getMainLooper()).postDelayed(new G61(this), 2000L);
        }
    }

    public final void O() {
        a aVar = h;
        if (aVar.g()) {
            return;
        }
        MainActivity mainActivityD = aVar.d();
        L(this, mainActivityD != null ? mainActivityD.findViewById(AbstractC5056hD0.c) : null, JD0.w5, false, null, null, false, 60, null);
    }

    public final void P() {
        a aVar = h;
        if (aVar.h()) {
            return;
        }
        MainActivity mainActivityD = aVar.d();
        L(this, mainActivityD != null ? mainActivityD.findViewById(AbstractC5056hD0.d) : null, JD0.x5, false, null, null, false, 60, null);
    }

    public final void Q() {
        FP fpB;
        View viewM;
        if (h.i() || (fpB = MainActivity.INSTANCE.b()) == null || (viewM = fpB.m()) == null) {
            return;
        }
        L(this, viewM, JD0.y5, false, null, null, false, 60, null);
    }

    public final void R() {
        MainActivity mainActivityD;
        NavigationView navigationView;
        View childAt;
        Object objA = WB0.m.a(Boolean.TRUE);
        G10.f(objA, "invoke(...)");
        if (((Boolean) objA).booleanValue()) {
            return;
        }
        a aVar = h;
        if (aVar.h() && aVar.g() && aVar.k()) {
            long jM = aVar.m();
            if (((long) 604800000) + jM <= System.currentTimeMillis() && (mainActivityD = aVar.d()) != null) {
                if (a.c(aVar, mainActivityD, false, 2, null)) {
                    return;
                }
                if (this.c) {
                    MainActivity mainActivityD2 = aVar.d();
                    if (L(this, mainActivityD2 != null ? mainActivityD2.findViewById(AbstractC5056hD0.e2) : null, JD0.z5, false, null, C2951Zg.a.B, true, 12, null)) {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (jM == 0) {
                            jCurrentTimeMillis -= (long) 518400000;
                        }
                        aVar.v(jCurrentTimeMillis);
                        return;
                    }
                    return;
                }
                MainActivity mainActivityD3 = aVar.d();
                if (mainActivityD3 != null) {
                    mainActivityD3.u1();
                }
                MainActivity mainActivityD4 = aVar.d();
                if (mainActivityD4 == null || (navigationView = (NavigationView) mainActivityD4.findViewById(AbstractC5056hD0.m2)) == null || (childAt = navigationView.getChildAt(0)) == null) {
                    return;
                }
                childAt.scrollBy(0, childAt.getBottom() - 100);
            }
        }
    }

    public final void S() {
        if (h.l()) {
            return;
        }
        L(this, null, JD0.A5, true, Integer.valueOf(AbstractC3374bD0.X), null, false, 48, null);
    }

    public final void T() {
        if (this.c) {
            V();
            return;
        }
        MainActivity mainActivityD = h.d();
        if (mainActivityD != null && mainActivityD.l1().getChildCount() > 0) {
            L(this, mainActivityD.l1().getChildAt(0), JD0.v5, false, null, null, false, 60, null);
        }
    }

    public final void U() {
        a aVar = h;
        if (aVar.k()) {
            return;
        }
        MainActivity mainActivityD = aVar.d();
        L(this, mainActivityD != null ? mainActivityD.findViewById(AbstractC5056hD0.b) : null, JD0.B5, false, null, null, false, 60, null);
    }

    public final void V() {
        a aVar = h;
        if (aVar.j()) {
            return;
        }
        MainActivity mainActivityD = aVar.d();
        L(this, mainActivityD != null ? mainActivityD.findViewById(AbstractC5056hD0.j2) : null, JD0.C5, false, null, null, false, 60, null);
    }

    public static final class c implements DrawerLayout.e {
        public c() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void a(View view) {
            G10.g(view, "drawerView");
            X61.this.c = true;
            X61.this.R();
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void b(View view) {
            G10.g(view, "drawerView");
            X61.this.c = false;
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void d(View view, float f) {
            G10.g(view, "drawerView");
            X61.this.J(true);
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.e
        public void c(int i) {
        }
    }
}
