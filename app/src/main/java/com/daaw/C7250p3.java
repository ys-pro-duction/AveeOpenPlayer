package com.daaw;

import android.app.Activity;
import com.daaw.AbstractC1969Qa1;
import com.daaw.C1058Hg1;
import com.daaw.InterfaceC2263Sq;
import com.daaw.avee.MainActivity;
import com.google.android.gms.ads.MobileAds;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.daaw.p3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7250p3 {
    public boolean b;
    public InterfaceC2367Tq c;
    public InterfaceC1396Kn e;
    public final InterfaceC0412Bd0 a = AbstractC0837Fd0.a(C7250p3.class);
    public final LinkedList d = new LinkedList();

    /* JADX INFO: renamed from: com.daaw.p3$a */
    public static final class a implements C1058Hg1.a {
        public a() {
        }

        @Override // com.daaw.C1058Hg1.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean invoke(U2 u2, Integer num, Integer num2) {
            if ((u2 != null ? u2.a : null) == null || num == null || num2 == null) {
                return Boolean.FALSE;
            }
            C0746Eg1 c0746Eg1 = WB0.m;
            Boolean bool = Boolean.TRUE;
            Object objA = c0746Eg1.a(bool);
            G10.f(objA, "invoke(...)");
            if (((Boolean) objA).booleanValue() || !WB0.k.a() || C4989gz0.a.e() || num.intValue() == 1 || (num.intValue() == 2 && num2.intValue() < C7250p3.this.g())) {
                u2.a.setVisibility(8);
                return Boolean.FALSE;
            }
            u2.a.loadAd(P2.a.b());
            return bool;
        }
    }

    public static final void j(C7250p3 c7250p3, Activity activity) {
        G10.g(c7250p3, "this$0");
        G10.g(activity, "$it");
        c7250p3.m(activity);
    }

    public static final void k(C7250p3 c7250p3, C4824gP c4824gP) {
        G10.g(c7250p3, "this$0");
        c7250p3.a.h(c4824gP.a() + ": " + c4824gP.b());
        InterfaceC1396Kn interfaceC1396Kn = c7250p3.e;
        if (interfaceC1396Kn != null) {
            interfaceC1396Kn.B0(G91.a);
        }
    }

    public static final void n(final C7250p3 c7250p3, Activity activity, InterfaceC2263Sq interfaceC2263Sq) {
        G10.g(c7250p3, "this$0");
        G10.g(activity, "$activity");
        InterfaceC2367Tq interfaceC2367Tq = c7250p3.c;
        if (interfaceC2367Tq != null && interfaceC2367Tq.b() == 2) {
            interfaceC2263Sq.a(activity, new InterfaceC2263Sq.a() { // from class: com.daaw.o3
                @Override // com.daaw.InterfaceC2263Sq.a
                public final void a(C4824gP c4824gP) {
                    C7250p3.o(this.a, c4824gP);
                }
            });
            return;
        }
        InterfaceC1396Kn interfaceC1396Kn = c7250p3.e;
        if (interfaceC1396Kn != null) {
            interfaceC1396Kn.B0(G91.a);
        }
    }

    public static final void o(C7250p3 c7250p3, C4824gP c4824gP) {
        G10.g(c7250p3, "this$0");
        if (c4824gP != null) {
            c7250p3.a.h(c4824gP.a() + ": " + c4824gP.b());
        }
        InterfaceC2367Tq interfaceC2367Tq = c7250p3.c;
        if (interfaceC2367Tq != null && interfaceC2367Tq.b() == 3) {
            c7250p3.l();
        }
        InterfaceC1396Kn interfaceC1396Kn = c7250p3.e;
        if (interfaceC1396Kn != null) {
            interfaceC1396Kn.B0(G91.a);
        }
    }

    public static final void p(C7250p3 c7250p3, C4824gP c4824gP) {
        G10.g(c7250p3, "this$0");
        c7250p3.a.h(c4824gP.a() + ": " + c4824gP.b());
        InterfaceC1396Kn interfaceC1396Kn = c7250p3.e;
        if (interfaceC1396Kn != null) {
            interfaceC1396Kn.B0(G91.a);
        }
    }

    public final int g() {
        int iK = SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.e().k(SharedPreferencesOnSharedPreferenceChangeListenerC5706ja.V);
        if (iK != 0) {
            return iK != 1 ? 20 : 10;
        }
        return 5;
    }

    public final Activity h() {
        MainActivity mainActivityE = MainActivity.INSTANCE.e();
        G10.d(mainActivityE);
        return mainActivityE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.daaw.InterfaceC1396Kn i() {
        /*
            r5 = this;
            com.daaw.Kn r0 = r5.e
            if (r0 == 0) goto L10
            boolean r0 = r0.o()
            if (r0 != 0) goto L10
            com.daaw.Kn r0 = r5.e
            com.daaw.G10.d(r0)
            return r0
        L10:
            r0 = 1
            r1 = 0
            com.daaw.Kn r0 = com.daaw.AbstractC1603Mn.b(r1, r0, r1)
            r5.e = r0
            com.daaw.Uq$a r0 = new com.daaw.Uq$a
            r0.<init>()
            r2 = 0
            com.daaw.Uq$a r0 = r0.b(r2)
            com.daaw.Uq r0 = r0.a()
            com.daaw.avee.a$a r2 = com.daaw.avee.a.d
            android.app.Activity r2 = r2.c()
            if (r2 == 0) goto L4b
            android.content.Context r3 = r2.getApplicationContext()
            com.daaw.Tq r3 = com.daaw.AbstractC1969Qa1.a(r3)
            r5.c = r3
            if (r3 == 0) goto L49
            com.daaw.k3 r1 = new com.daaw.k3
            r1.<init>()
            com.daaw.l3 r4 = new com.daaw.l3
            r4.<init>()
            r3.a(r2, r0, r1, r4)
            com.daaw.G91 r1 = com.daaw.G91.a
        L49:
            if (r1 != 0) goto L54
        L4b:
            com.daaw.Kn r0 = r5.e
            if (r0 == 0) goto L54
            com.daaw.G91 r1 = com.daaw.G91.a
            r0.B0(r1)
        L54:
            r5.l()
            com.daaw.Kn r0 = r5.e
            com.daaw.G10.d(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C7250p3.i():com.daaw.Kn");
    }

    public final void l() {
        if (this.b) {
            return;
        }
        this.b = true;
        MobileAds.initialize(h().getApplicationContext());
        MobileAds.setRequestConfiguration(P2.a.a());
        FragmentC10191zb0.j0.b(new a(), this.d);
    }

    public final void m(final Activity activity) {
        AbstractC1969Qa1.b(activity, new AbstractC1969Qa1.b() { // from class: com.daaw.m3
            @Override // com.daaw.AbstractC1969Qa1.b
            public final void a(InterfaceC2263Sq interfaceC2263Sq) {
                C7250p3.n(this.a, activity, interfaceC2263Sq);
            }
        }, new AbstractC1969Qa1.a() { // from class: com.daaw.n3
            @Override // com.daaw.AbstractC1969Qa1.a
            public final void b(C4824gP c4824gP) {
                C7250p3.p(this.a, c4824gP);
            }
        });
    }
}
