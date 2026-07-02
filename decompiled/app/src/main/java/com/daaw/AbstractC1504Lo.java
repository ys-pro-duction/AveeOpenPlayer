package com.daaw;

/* JADX INFO: renamed from: com.daaw.Lo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1504Lo {

    /* JADX INFO: renamed from: com.daaw.Lo$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ int B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i) {
            super(2);
            this.B = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC1504Lo.a(interfaceC5781jp, this.B | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(InterfaceC5781jp interfaceC5781jp, int i) {
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(749037174);
        if (i == 0 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(749037174, i, -1, "com.daaw.avee.composables.MyComposableScreen (ComposableActivity.kt:40)");
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new a(i));
    }
}
