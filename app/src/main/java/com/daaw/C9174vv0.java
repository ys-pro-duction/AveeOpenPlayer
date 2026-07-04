package com.daaw;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.vv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C9174vv0 implements J8 {
    public final String a;
    public final T00 b;
    public final C9972yn0 c;
    public final Executor d;
    public final Executor e;
    public final C6206lJ0 f;

    public C9174vv0(C7050oL c7050oL, Executor executor, Executor executor2) {
        this(c7050oL.n().d(), U00.a(c7050oL.k()), new C9972yn0(c7050oL), executor, executor2, new C6206lJ0());
    }

    public static /* synthetic */ AbstractC6963o11 e(final C9174vv0 c9174vv0, X00 x00) {
        c9174vv0.getClass();
        final C7874rI c7874rI = new C7874rI(x00.a());
        return A11.c(c9174vv0.e, new Callable() { // from class: com.daaw.sv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C9174vv0 c9174vv02 = this.a;
                return c9174vv02.c.b(c7874rI.a().getBytes("UTF-8"), 3, c9174vv02.f);
            }
        });
    }

    @Override // com.daaw.J8
    public AbstractC6963o11 a() {
        return g().p(this.d, new InterfaceC9066vZ0() { // from class: com.daaw.qv0
            @Override // com.daaw.InterfaceC9066vZ0
            public final AbstractC6963o11 a(Object obj) {
                return C9174vv0.e(this.a, (X00) obj);
            }
        }).p(this.d, new InterfaceC9066vZ0() { // from class: com.daaw.rv0
            @Override // com.daaw.InterfaceC9066vZ0
            public final AbstractC6963o11 a(Object obj) {
                return A11.e(C1639Mw.c((N8) obj));
            }
        });
    }

    public final AbstractC6963o11 g() {
        final C4557fS c4557fS = new C4557fS();
        return A11.c(this.e, new Callable() { // from class: com.daaw.tv0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C9174vv0 c9174vv0 = this.a;
                return C4836gS.a(c9174vv0.c.c(c4557fS.a().getBytes("UTF-8"), c9174vv0.f));
            }
        }).p(this.d, new InterfaceC9066vZ0() { // from class: com.daaw.uv0
            @Override // com.daaw.InterfaceC9066vZ0
            public final AbstractC6963o11 a(Object obj) {
                C9174vv0 c9174vv0 = this.a;
                return c9174vv0.b.a(W00.a().b(Long.parseLong(c9174vv0.a)).c(((C4836gS) obj).b()).a());
            }
        });
    }

    public C9174vv0(String str, T00 t00, C9972yn0 c9972yn0, Executor executor, Executor executor2, C6206lJ0 c6206lJ0) {
        this.a = str;
        this.b = t00;
        this.c = c9972yn0;
        this.d = executor;
        this.e = executor2;
        this.f = c6206lJ0;
    }
}
