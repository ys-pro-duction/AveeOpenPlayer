package com.daaw;

import com.daaw.InterfaceC3591c01;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: com.daaw.Px, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1955Px implements InterfaceC8174sN0 {
    public static final Logger f = Logger.getLogger(P51.class.getName());
    public final InterfaceC1689Ni1 a;
    public final Executor b;
    public final InterfaceC2627Wd c;
    public final XH d;
    public final InterfaceC3591c01 e;

    public C1955Px(Executor executor, InterfaceC2627Wd interfaceC2627Wd, InterfaceC1689Ni1 interfaceC1689Ni1, XH xh, InterfaceC3591c01 interfaceC3591c01) {
        this.b = executor;
        this.c = interfaceC2627Wd;
        this.a = interfaceC1689Ni1;
        this.d = xh;
        this.e = interfaceC3591c01;
    }

    public static /* synthetic */ Object b(C1955Px c1955Px, H51 h51, KH kh) {
        c1955Px.d.X(h51, kh);
        c1955Px.a.a(h51, 1);
        return null;
    }

    public static /* synthetic */ void c(final C1955Px c1955Px, final H51 h51, S51 s51, KH kh) {
        c1955Px.getClass();
        try {
            G51 g51A = c1955Px.c.a(h51.b());
            if (g51A == null) {
                String str = String.format("Transport backend '%s' is not registered", h51.b());
                f.warning(str);
                s51.a(new IllegalArgumentException(str));
            } else {
                final KH khB = g51A.b(kh);
                c1955Px.e.d(new InterfaceC3591c01.a() { // from class: com.daaw.Nx
                    @Override // com.daaw.InterfaceC3591c01.a
                    public final Object a() {
                        return C1955Px.b(this.a, h51, khB);
                    }
                });
                s51.a(null);
            }
        } catch (Exception e) {
            f.warning("Error scheduling event " + e.getMessage());
            s51.a(e);
        }
    }

    @Override // com.daaw.InterfaceC8174sN0
    public void a(final H51 h51, final KH kh, final S51 s51) {
        this.b.execute(new Runnable() { // from class: com.daaw.Mx
            @Override // java.lang.Runnable
            public final void run() {
                C1955Px.c(this.B, h51, s51, kh);
            }
        });
    }
}
