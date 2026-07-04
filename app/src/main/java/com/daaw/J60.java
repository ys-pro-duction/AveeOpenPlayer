package com.daaw;

import com.daaw.AbstractC5867k70;
import com.daaw.C60;

/* JADX INFO: loaded from: classes4.dex */
public final class J60 extends C5029h70 implements W60, InterfaceC3429bR, C60 {
    public final O90 R;

    public static final class a extends AbstractC5867k70.d implements C60.a, InterfaceC3986dR {
        public final J60 K;

        public a(J60 j60) {
            G10.g(j60, "property");
            this.K = j60;
        }

        @Override // com.daaw.W60.a
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
        public J60 m() {
            return this.K;
        }

        public void f0(Object obj, Object obj2, Object obj3) throws C3457bY {
            m().r0(obj, obj2, obj3);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws C3457bY {
            f0(obj, obj2, obj3);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J60(AbstractC7823r60 abstractC7823r60, InterfaceC4476fA0 interfaceC4476fA0) {
        super(abstractC7823r60, interfaceC4476fA0);
        G10.g(abstractC7823r60, "container");
        G10.g(interfaceC4476fA0, "descriptor");
        this.R = AbstractC3192ab0.b(EnumC7395pb0.C, new I60(this));
    }

    public static final a o0(J60 j60) {
        G10.g(j60, "this$0");
        return new a(j60);
    }

    @Override // com.daaw.C60
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public a g() {
        return (a) this.R.getValue();
    }

    public void r0(Object obj, Object obj2, Object obj3) throws C3457bY {
        g().call(obj, obj2, obj3);
    }
}
