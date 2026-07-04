package com.daaw;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.rS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7916rS1 {
    public final C10096zD2 a;
    public ES2 b;
    public final C7735qn1 c;
    public final Ct3 d;

    public C7916rS1() {
        C10096zD2 c10096zD2 = new C10096zD2();
        this.a = c10096zD2;
        this.b = c10096zD2.b.a();
        this.c = new C7735qn1();
        this.d = new Ct3();
        c10096zD2.d.a("internal.registerCallback", new Callable() { // from class: com.daaw.rm1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.b();
            }
        });
        c10096zD2.d.a("internal.eventLogger", new Callable() { // from class: com.daaw.IC1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new C8523td3(this.a.c);
            }
        });
    }

    public final C7735qn1 a() {
        return this.c;
    }

    public final /* synthetic */ AbstractC9435wr1 b() {
        return new Lq3(this.d);
    }

    public final void c(F33 f33) throws C7557q82 {
        AbstractC9435wr1 abstractC9435wr1;
        try {
            this.b = this.a.b.a();
            if (this.a.a(this.b, (C4459f63[]) f33.D().toArray(new C4459f63[0])) instanceof C5229hq1) {
                throw new IllegalStateException("Program loading failed");
            }
            for (C9487x23 c9487x23 : f33.B().E()) {
                List listD = c9487x23.D();
                String strC = c9487x23.C();
                Iterator it = listD.iterator();
                while (it.hasNext()) {
                    InterfaceC1637Mv1 interfaceC1637Mv1A = this.a.a(this.b, (C4459f63) it.next());
                    if (!(interfaceC1637Mv1A instanceof C2693Wt1)) {
                        throw new IllegalArgumentException("Invalid rule definition");
                    }
                    ES2 es2 = this.b;
                    if (es2.h(strC)) {
                        InterfaceC1637Mv1 interfaceC1637Mv1D = es2.d(strC);
                        if (!(interfaceC1637Mv1D instanceof AbstractC9435wr1)) {
                            throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(strC)));
                        }
                        abstractC9435wr1 = (AbstractC9435wr1) interfaceC1637Mv1D;
                    } else {
                        abstractC9435wr1 = null;
                    }
                    if (abstractC9435wr1 == null) {
                        throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(strC)));
                    }
                    abstractC9435wr1.a(this.b, Collections.singletonList(interfaceC1637Mv1A));
                }
            }
        } catch (Throwable th) {
            throw new C7557q82(th);
        }
    }

    public final void d(String str, Callable callable) {
        this.a.d.a(str, callable);
    }

    public final boolean e(C1498Lm1 c1498Lm1) throws C7557q82 {
        try {
            this.c.d(c1498Lm1);
            this.a.c.g("runtime.counter", new C1825Oq1(Double.valueOf(0.0d)));
            this.d.b(this.b.a(), this.c);
            if (g()) {
                return true;
            }
            return f();
        } catch (Throwable th) {
            throw new C7557q82(th);
        }
    }

    public final boolean f() {
        return !this.c.c().isEmpty();
    }

    public final boolean g() {
        C7735qn1 c7735qn1 = this.c;
        return !c7735qn1.b().equals(c7735qn1.a());
    }
}
