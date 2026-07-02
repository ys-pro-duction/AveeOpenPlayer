package com.daaw;

/* JADX INFO: renamed from: com.daaw.oh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7146oh0 {

    /* JADX INFO: renamed from: com.daaw.oh0$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC3429bR B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3429bR interfaceC3429bR, int i) {
            super(2);
            this.B = interfaceC3429bR;
            this.C = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC7146oh0.a(this.B, interfaceC5781jp, this.C | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(InterfaceC3429bR interfaceC3429bR, InterfaceC5781jp interfaceC5781jp, int i) {
        int i2;
        G10.g(interfaceC3429bR, "content");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-1322912246);
        if ((i & 14) == 0) {
            i2 = (interfaceC5781jpQ.P(interfaceC3429bR) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-1322912246, i2, -1, "androidx.compose.material.PlatformMaterialTheme (MaterialTheme.android.kt:21)");
            }
            interfaceC3429bR.invoke(interfaceC5781jpQ, Integer.valueOf(i2 & 14));
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new a(interfaceC3429bR, i));
    }
}
