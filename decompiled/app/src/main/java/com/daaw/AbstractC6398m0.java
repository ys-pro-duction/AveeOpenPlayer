package com.daaw;

import com.daaw.AbstractC4512fJ0;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6398m0 {
    public AbstractC6956o0[] B;
    public int C;
    public int D;
    public C4019dZ0 E;

    public final AbstractC6956o0 g() {
        AbstractC6956o0 abstractC6956o0H;
        C4019dZ0 c4019dZ0;
        synchronized (this) {
            try {
                AbstractC6956o0[] abstractC6956o0ArrL = this.B;
                if (abstractC6956o0ArrL == null) {
                    abstractC6956o0ArrL = l(2);
                    this.B = abstractC6956o0ArrL;
                } else if (this.C >= abstractC6956o0ArrL.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(abstractC6956o0ArrL, abstractC6956o0ArrL.length * 2);
                    G10.f(objArrCopyOf, "copyOf(this, newSize)");
                    this.B = (AbstractC6956o0[]) objArrCopyOf;
                    abstractC6956o0ArrL = (AbstractC6956o0[]) objArrCopyOf;
                }
                int i = this.D;
                do {
                    abstractC6956o0H = abstractC6956o0ArrL[i];
                    if (abstractC6956o0H == null) {
                        abstractC6956o0H = h();
                        abstractC6956o0ArrL[i] = abstractC6956o0H;
                    }
                    i++;
                    if (i >= abstractC6956o0ArrL.length) {
                        i = 0;
                    }
                    G10.e(abstractC6956o0H, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!abstractC6956o0H.a(this));
                this.D = i;
                this.C++;
                c4019dZ0 = this.E;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (c4019dZ0 != null) {
            c4019dZ0.b0(1);
        }
        return abstractC6956o0H;
    }

    public abstract AbstractC6956o0 h();

    public final InterfaceC6537mW0 k() {
        C4019dZ0 c4019dZ0;
        synchronized (this) {
            c4019dZ0 = this.E;
            if (c4019dZ0 == null) {
                c4019dZ0 = new C4019dZ0(this.C);
                this.E = c4019dZ0;
            }
        }
        return c4019dZ0;
    }

    public abstract AbstractC6956o0[] l(int i);

    public final void m(AbstractC6956o0 abstractC6956o0) {
        C4019dZ0 c4019dZ0;
        int i;
        InterfaceC1416Ks[] interfaceC1416KsArrB;
        synchronized (this) {
            try {
                int i2 = this.C - 1;
                this.C = i2;
                c4019dZ0 = this.E;
                if (i2 == 0) {
                    this.D = 0;
                }
                G10.e(abstractC6956o0, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                interfaceC1416KsArrB = abstractC6956o0.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (InterfaceC1416Ks interfaceC1416Ks : interfaceC1416KsArrB) {
            if (interfaceC1416Ks != null) {
                AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
                interfaceC1416Ks.x(AbstractC4512fJ0.a(G91.a));
            }
        }
        if (c4019dZ0 != null) {
            c4019dZ0.b0(-1);
        }
    }

    public final int n() {
        return this.C;
    }

    public final AbstractC6956o0[] o() {
        return this.B;
    }
}
