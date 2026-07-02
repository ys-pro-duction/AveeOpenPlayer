package com.daaw;

import com.daaw.AbstractC5867k70;
import com.daaw.X60;

/* JADX INFO: renamed from: com.daaw.a70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3068a70 extends AbstractC5867k70 implements X60 {
    public final O90 P;
    public final O90 Q;

    /* JADX INFO: renamed from: com.daaw.a70$a */
    public static final class a extends AbstractC5867k70.c implements X60.a {
        public final C3068a70 K;

        public a(C3068a70 c3068a70) {
            G10.g(c3068a70, "property");
            this.K = c3068a70;
        }

        @Override // com.daaw.W60.a
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public C3068a70 m() {
            return this.K;
        }

        @Override // com.daaw.LQ
        public Object invoke() {
            return Y().get();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3068a70(AbstractC7823r60 abstractC7823r60, InterfaceC4476fA0 interfaceC4476fA0) {
        super(abstractC7823r60, interfaceC4476fA0);
        G10.g(abstractC7823r60, "container");
        G10.g(interfaceC4476fA0, "descriptor");
        EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.C;
        this.P = AbstractC3192ab0.b(enumC7395pb0, new Y60(this));
        this.Q = AbstractC3192ab0.b(enumC7395pb0, new Z60(this));
    }

    public static final a i0(C3068a70 c3068a70) {
        G10.g(c3068a70, "this$0");
        return new a(c3068a70);
    }

    public static final Object l0(C3068a70 c3068a70) {
        G10.g(c3068a70, "this$0");
        return c3068a70.d0(c3068a70.b0(), null, null);
    }

    @Override // com.daaw.X60
    public Object get() {
        return f().call(new Object[0]);
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return get();
    }

    @Override // com.daaw.AbstractC5867k70
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public a f0() {
        return (a) this.P.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3068a70(AbstractC7823r60 abstractC7823r60, String str, String str2, Object obj) {
        super(abstractC7823r60, str, str2, obj);
        G10.g(abstractC7823r60, "container");
        G10.g(str, "name");
        G10.g(str2, "signature");
        EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.C;
        this.P = AbstractC3192ab0.b(enumC7395pb0, new Y60(this));
        this.Q = AbstractC3192ab0.b(enumC7395pb0, new Z60(this));
    }
}
