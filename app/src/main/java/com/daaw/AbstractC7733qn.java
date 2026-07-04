package com.daaw;

import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7733qn {
    public static final AbstractC6453mB0 a = AbstractC2153Rp.d(a.B);

    /* JADX INFO: renamed from: com.daaw.qn$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C7454pn invoke() {
            return AbstractC7733qn.e(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    }

    public static final long a(C7454pn c7454pn, long j) {
        G10.g(c7454pn, "$this$contentColorFor");
        return C2559Vm.o(j, c7454pn.j()) ? c7454pn.g() : C2559Vm.o(j, c7454pn.k()) ? c7454pn.g() : C2559Vm.o(j, c7454pn.l()) ? c7454pn.h() : C2559Vm.o(j, c7454pn.m()) ? c7454pn.h() : C2559Vm.o(j, c7454pn.c()) ? c7454pn.e() : C2559Vm.o(j, c7454pn.n()) ? c7454pn.i() : C2559Vm.o(j, c7454pn.d()) ? c7454pn.f() : C2559Vm.b.g();
    }

    public static final long b(long j, InterfaceC5781jp interfaceC5781jp, int i) {
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:295)");
        }
        long jA = a(C6309lh0.a.a(interfaceC5781jp, 6), j);
        if (jA == C2559Vm.b.g()) {
            jA = ((C2559Vm) interfaceC5781jp.O(AbstractC2787Xr.a())).w();
        }
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        return jA;
    }

    public static final AbstractC6453mB0 c() {
        return a;
    }

    public static final C7454pn d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new C7454pn(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, null);
    }

    public static /* synthetic */ C7454pn e(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long jC = (i & 1) != 0 ? AbstractC3530bn.c(4284612846L) : j;
        long jC2 = (i & 2) != 0 ? AbstractC3530bn.c(4281794739L) : j2;
        long jC3 = (i & 4) != 0 ? AbstractC3530bn.c(4278442694L) : j3;
        long jC4 = (i & 8) != 0 ? AbstractC3530bn.c(4278290310L) : j4;
        long jH = (i & 16) != 0 ? C2559Vm.b.h() : j5;
        long jH2 = (i & 32) != 0 ? C2559Vm.b.h() : j6;
        long jC5 = (i & 64) != 0 ? AbstractC3530bn.c(4289724448L) : j7;
        long jH3 = (i & 128) != 0 ? C2559Vm.b.h() : j8;
        long j13 = jC;
        long jA = (i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? C2559Vm.b.a() : j9;
        long jA2 = (i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? C2559Vm.b.a() : j10;
        long jA3 = (i & 1024) != 0 ? C2559Vm.b.a() : j11;
        if ((i & 2048) != 0) {
            j12 = C2559Vm.b.h();
        }
        return d(j13, jC2, jC3, jC4, jH, jH2, jC5, jH3, jA, jA2, jA3, j12);
    }

    public static final void f(C7454pn c7454pn, C7454pn c7454pn2) {
        G10.g(c7454pn, "<this>");
        G10.g(c7454pn2, "other");
        c7454pn.x(c7454pn2.j());
        c7454pn.y(c7454pn2.k());
        c7454pn.z(c7454pn2.l());
        c7454pn.A(c7454pn2.m());
        c7454pn.p(c7454pn2.c());
        c7454pn.B(c7454pn2.n());
        c7454pn.q(c7454pn2.d());
        c7454pn.u(c7454pn2.g());
        c7454pn.v(c7454pn2.h());
        c7454pn.s(c7454pn2.e());
        c7454pn.w(c7454pn2.i());
        c7454pn.t(c7454pn2.f());
        c7454pn.r(c7454pn2.o());
    }
}
