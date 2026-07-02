package com.daaw;

import com.daaw.U30;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.tF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8420tF {
    public static final C9252wC a = new C9252wC();

    public static final void a(Object obj, NQ nq, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(nq, "effect");
        interfaceC5781jp.e(-1371986847);
        interfaceC5781jp.e(1157296644);
        boolean zP = interfaceC5781jp.P(obj);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            interfaceC5781jp.H(new C8687uC(nq));
        }
        interfaceC5781jp.L();
        interfaceC5781jp.L();
    }

    public static final void b(Object obj, Object obj2, NQ nq, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(nq, "effect");
        interfaceC5781jp.e(1429097729);
        interfaceC5781jp.e(511388516);
        boolean zP = interfaceC5781jp.P(obj) | interfaceC5781jp.P(obj2);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            interfaceC5781jp.H(new C8687uC(nq));
        }
        interfaceC5781jp.L();
        interfaceC5781jp.L();
    }

    public static final void c(Object obj, InterfaceC3429bR interfaceC3429bR, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(interfaceC3429bR, "block");
        interfaceC5781jp.e(1179185413);
        InterfaceC4684ft interfaceC4684ftC = interfaceC5781jp.C();
        interfaceC5781jp.e(1157296644);
        boolean zP = interfaceC5781jp.P(obj);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            interfaceC5781jp.H(new C5318i90(interfaceC4684ftC, interfaceC3429bR));
        }
        interfaceC5781jp.L();
        interfaceC5781jp.L();
    }

    public static final void d(Object obj, Object obj2, InterfaceC3429bR interfaceC3429bR, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(interfaceC3429bR, "block");
        interfaceC5781jp.e(590241125);
        InterfaceC4684ft interfaceC4684ftC = interfaceC5781jp.C();
        interfaceC5781jp.e(511388516);
        boolean zP = interfaceC5781jp.P(obj) | interfaceC5781jp.P(obj2);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            interfaceC5781jp.H(new C5318i90(interfaceC4684ftC, interfaceC3429bR));
        }
        interfaceC5781jp.L();
        interfaceC5781jp.L();
    }

    public static final void e(Object obj, Object obj2, Object obj3, InterfaceC3429bR interfaceC3429bR, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(interfaceC3429bR, "block");
        interfaceC5781jp.e(-54093371);
        InterfaceC4684ft interfaceC4684ftC = interfaceC5781jp.C();
        interfaceC5781jp.e(1618982084);
        boolean zP = interfaceC5781jp.P(obj) | interfaceC5781jp.P(obj2) | interfaceC5781jp.P(obj3);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            interfaceC5781jp.H(new C5318i90(interfaceC4684ftC, interfaceC3429bR));
        }
        interfaceC5781jp.L();
        interfaceC5781jp.L();
    }

    public static final void f(Object[] objArr, InterfaceC3429bR interfaceC3429bR, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(objArr, "keys");
        G10.g(interfaceC3429bR, "block");
        interfaceC5781jp.e(-139560008);
        InterfaceC4684ft interfaceC4684ftC = interfaceC5781jp.C();
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        interfaceC5781jp.e(-568225417);
        boolean zP = false;
        for (Object obj : objArrCopyOf) {
            zP |= interfaceC5781jp.P(obj);
        }
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            interfaceC5781jp.H(new C5318i90(interfaceC4684ftC, interfaceC3429bR));
        }
        interfaceC5781jp.L();
        interfaceC5781jp.L();
    }

    public static final void g(LQ lq, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(lq, "effect");
        interfaceC5781jp.e(-1288466761);
        interfaceC5781jp.g(lq);
        interfaceC5781jp.L();
    }

    public static final InterfaceC7484pt i(InterfaceC4684ft interfaceC4684ft, InterfaceC5781jp interfaceC5781jp) {
        G10.g(interfaceC4684ft, "coroutineContext");
        G10.g(interfaceC5781jp, "composer");
        U30.b bVar = U30.k;
        if (interfaceC4684ft.a(bVar) == null) {
            InterfaceC4684ft interfaceC4684ftC = interfaceC5781jp.C();
            return AbstractC7763qt.a(interfaceC4684ftC.U(AbstractC3053a40.a((U30) interfaceC4684ftC.a(bVar))).U(interfaceC4684ft));
        }
        InterfaceC1707Nn interfaceC1707NnB = AbstractC3332b40.b(null, 1, null);
        interfaceC1707NnB.c(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"));
        return AbstractC7763qt.a(interfaceC1707NnB);
    }
}
