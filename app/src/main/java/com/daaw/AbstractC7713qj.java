package com.daaw;

/* JADX INFO: renamed from: com.daaw.qj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7713qj {

    /* JADX INFO: renamed from: com.daaw.qj$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC1073Hk0 B;
        public final /* synthetic */ NQ C;
        public final /* synthetic */ int D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq, int i) {
            super(2);
            this.B = interfaceC1073Hk0;
            this.C = nq;
            this.D = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC7713qj.a(this.B, this.C, interfaceC5781jp, this.D | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq, InterfaceC5781jp interfaceC5781jp, int i) {
        int i2;
        G10.g(interfaceC1073Hk0, "modifier");
        G10.g(nq, "onDraw");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-932836462);
        if ((i & 14) == 0) {
            i2 = (interfaceC5781jpQ.P(interfaceC1073Hk0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= interfaceC5781jpQ.P(nq) ? 32 : 16;
        }
        if ((i2 & 91) == 18 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            TU0.a(LD.a(interfaceC1073Hk0, nq), interfaceC5781jpQ, 0);
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new a(interfaceC1073Hk0, nq, i));
    }
}
