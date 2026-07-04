package com.daaw;

import com.daaw.AbstractC5867k70;
import com.daaw.C60;

/* JADX INFO: loaded from: classes4.dex */
public final class E60 extends C3068a70 implements X60, C60 {
    public final O90 R;

    public static final class a extends AbstractC5867k70.d implements C60.a, NQ {
        public final E60 K;

        public a(E60 e60) {
            G10.g(e60, "property");
            this.K = e60;
        }

        @Override // com.daaw.W60.a
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
        public E60 m() {
            return this.K;
        }

        public void f0(Object obj) throws C3457bY {
            m().q0(obj);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws C3457bY {
            f0(obj);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E60(AbstractC7823r60 abstractC7823r60, InterfaceC4476fA0 interfaceC4476fA0) {
        super(abstractC7823r60, interfaceC4476fA0);
        G10.g(abstractC7823r60, "container");
        G10.g(interfaceC4476fA0, "descriptor");
        this.R = AbstractC3192ab0.b(EnumC7395pb0.C, new D60(this));
    }

    public static final a n0(E60 e60) {
        G10.g(e60, "this$0");
        return new a(e60);
    }

    @Override // com.daaw.C60
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public a g() {
        return (a) this.R.getValue();
    }

    public void q0(Object obj) throws C3457bY {
        g().call(obj);
    }
}
