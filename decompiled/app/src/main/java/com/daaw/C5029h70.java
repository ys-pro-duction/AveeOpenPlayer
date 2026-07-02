package com.daaw;

import com.daaw.AbstractC5867k70;
import com.daaw.W60;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: com.daaw.h70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C5029h70 extends AbstractC5867k70 implements W60, InterfaceC3429bR {
    public final O90 P;
    public final O90 Q;

    /* JADX INFO: renamed from: com.daaw.h70$a */
    public static final class a extends AbstractC5867k70.c implements W60.b, InterfaceC3429bR {
        public final C5029h70 K;

        public a(C5029h70 c5029h70) {
            G10.g(c5029h70, "property");
            this.K = c5029h70;
        }

        @Override // com.daaw.W60.a
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
        public C5029h70 m() {
            return this.K;
        }

        @Override // com.daaw.InterfaceC3429bR
        public Object invoke(Object obj, Object obj2) {
            return m().m0(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5029h70(AbstractC7823r60 abstractC7823r60, InterfaceC4476fA0 interfaceC4476fA0) {
        super(abstractC7823r60, interfaceC4476fA0);
        G10.g(abstractC7823r60, "container");
        G10.g(interfaceC4476fA0, "descriptor");
        EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.C;
        this.P = AbstractC3192ab0.b(enumC7395pb0, new C4461f70(this));
        this.Q = AbstractC3192ab0.b(enumC7395pb0, new C4750g70(this));
    }

    public static final a i0(C5029h70 c5029h70) {
        G10.g(c5029h70, "this$0");
        return new a(c5029h70);
    }

    public static final Member l0(C5029h70 c5029h70) {
        G10.g(c5029h70, "this$0");
        return c5029h70.b0();
    }

    @Override // com.daaw.InterfaceC3429bR
    public Object invoke(Object obj, Object obj2) {
        return m0(obj, obj2);
    }

    public Object m0(Object obj, Object obj2) {
        return f0().call(obj, obj2);
    }

    @Override // com.daaw.AbstractC5867k70
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public a f0() {
        return (a) this.P.getValue();
    }
}
