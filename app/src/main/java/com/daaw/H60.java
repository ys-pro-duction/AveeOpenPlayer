package com.daaw;

import com.daaw.AbstractC5867k70;
import com.daaw.F60;

/* JADX INFO: loaded from: classes4.dex */
public final class H60 extends C4182e70 implements F60 {
    public final O90 R;

    public static final class a extends AbstractC5867k70.d implements F60.a {
        public final H60 K;

        public a(H60 h60) {
            G10.g(h60, "property");
            this.K = h60;
        }

        @Override // com.daaw.W60.a
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
        public H60 m() {
            return this.K;
        }

        public void f0(Object obj, Object obj2) throws C3457bY {
            m().q0(obj, obj2);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws C3457bY {
            f0(obj, obj2);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H60(AbstractC7823r60 abstractC7823r60, String str, String str2, Object obj) {
        super(abstractC7823r60, str, str2, obj);
        G10.g(abstractC7823r60, "container");
        G10.g(str, "name");
        G10.g(str2, "signature");
        this.R = AbstractC3192ab0.b(EnumC7395pb0.C, new G60(this));
    }

    public static final a n0(H60 h60) {
        G10.g(h60, "this$0");
        return new a(h60);
    }

    @Override // com.daaw.F60, com.daaw.C60
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public a g() {
        return (a) this.R.getValue();
    }

    public void q0(Object obj, Object obj2) throws C3457bY {
        g().call(obj, obj2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H60(AbstractC7823r60 abstractC7823r60, InterfaceC4476fA0 interfaceC4476fA0) {
        super(abstractC7823r60, interfaceC4476fA0);
        G10.g(abstractC7823r60, "container");
        G10.g(interfaceC4476fA0, "descriptor");
        this.R = AbstractC3192ab0.b(EnumC7395pb0.C, new G60(this));
    }
}
