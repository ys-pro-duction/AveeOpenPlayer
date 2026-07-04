package com.daaw;

import com.daaw.AbstractC5867k70;
import com.daaw.InterfaceC3347b70;
import java.lang.reflect.Member;

/* JADX INFO: renamed from: com.daaw.e70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C4182e70 extends AbstractC5867k70 implements InterfaceC3347b70 {
    public final O90 P;
    public final O90 Q;

    /* JADX INFO: renamed from: com.daaw.e70$a */
    public static final class a extends AbstractC5867k70.c implements InterfaceC3347b70.a {
        public final C4182e70 K;

        public a(C4182e70 c4182e70) {
            G10.g(c4182e70, "property");
            this.K = c4182e70;
        }

        @Override // com.daaw.W60.a
        /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
        public C4182e70 m() {
            return this.K;
        }

        @Override // com.daaw.NQ
        public Object invoke(Object obj) {
            return m().get(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4182e70(AbstractC7823r60 abstractC7823r60, String str, String str2, Object obj) {
        super(abstractC7823r60, str, str2, obj);
        G10.g(abstractC7823r60, "container");
        G10.g(str, "name");
        G10.g(str2, "signature");
        EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.C;
        this.P = AbstractC3192ab0.b(enumC7395pb0, new C3625c70(this));
        this.Q = AbstractC3192ab0.b(enumC7395pb0, new C3904d70(this));
    }

    public static final a i0(C4182e70 c4182e70) {
        G10.g(c4182e70, "this$0");
        return new a(c4182e70);
    }

    public static final Member l0(C4182e70 c4182e70) {
        G10.g(c4182e70, "this$0");
        return c4182e70.b0();
    }

    @Override // com.daaw.InterfaceC3347b70
    public Object get(Object obj) {
        return f0().call(obj);
    }

    @Override // com.daaw.NQ
    public Object invoke(Object obj) {
        return get(obj);
    }

    @Override // com.daaw.AbstractC5867k70
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public a f0() {
        return (a) this.P.getValue();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4182e70(AbstractC7823r60 abstractC7823r60, InterfaceC4476fA0 interfaceC4476fA0) {
        super(abstractC7823r60, interfaceC4476fA0);
        G10.g(abstractC7823r60, "container");
        G10.g(interfaceC4476fA0, "descriptor");
        EnumC7395pb0 enumC7395pb0 = EnumC7395pb0.C;
        this.P = AbstractC3192ab0.b(enumC7395pb0, new C3625c70(this));
        this.Q = AbstractC3192ab0.b(enumC7395pb0, new C3904d70(this));
    }
}
