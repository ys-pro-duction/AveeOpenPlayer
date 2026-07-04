package com.daaw;

import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.tx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8617tx0 {
    public final E90 a;
    public final UV b;
    public final C7502px0 c;
    public final VV d;
    public boolean e;

    public C8617tx0(E90 e90) {
        G10.g(e90, "root");
        this.a = e90;
        this.b = new UV(e90.d());
        this.c = new C7502px0();
        this.d = new VV();
    }

    public final int a(C8059rx0 c8059rx0, InterfaceC1956Px0 interfaceC1956Px0, boolean z) {
        boolean z2;
        G10.g(c8059rx0, "pointerEvent");
        G10.g(interfaceC1956Px0, "positionCalculator");
        if (this.e) {
            return AbstractC8903ux0.a(false, false);
        }
        boolean z3 = true;
        try {
            this.e = true;
            C7241p10 c7241p10B = this.c.b(c8059rx0, interfaceC1956Px0);
            Collection<C7223ox0> collectionValues = c7241p10B.a().values();
            if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
                for (C7223ox0 c7223ox0 : collectionValues) {
                    if (c7223ox0.g() || c7223ox0.i()) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
            for (C7223ox0 c7223ox02 : c7241p10B.a().values()) {
                if (z2 || AbstractC4413ex0.b(c7223ox02)) {
                    this.a.u0(c7223ox02.f(), this.d, (8 & 4) != 0 ? false : AbstractC10298zx0.g(c7223ox02.j(), AbstractC10298zx0.a.d()), (8 & 8) != 0);
                    if (!this.d.isEmpty()) {
                        this.b.a(c7223ox02.e(), this.d);
                        this.d.clear();
                    }
                }
            }
            this.b.d();
            boolean zB = this.b.b(c7241p10B, z);
            if (c7241p10B.c()) {
                z3 = false;
            } else {
                Collection<C7223ox0> collectionValues2 = c7241p10B.a().values();
                if (!(collectionValues2 instanceof Collection) || !collectionValues2.isEmpty()) {
                    for (C7223ox0 c7223ox03 : collectionValues2) {
                        if (AbstractC4413ex0.j(c7223ox03) && c7223ox03.l()) {
                            break;
                        }
                    }
                }
                z3 = false;
            }
            int iA = AbstractC8903ux0.a(zB, z3);
            this.e = false;
            return iA;
        } catch (Throwable th) {
            this.e = false;
            throw th;
        }
    }

    public final void b() {
        this.c.a();
        this.b.c();
    }
}
