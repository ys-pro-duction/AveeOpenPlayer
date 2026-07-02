package com.daaw;

import com.daaw.YV0;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.w30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9210w30 extends C8640u20 {
    public static final /* synthetic */ W60[] h = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C9210w30.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    public final InterfaceC0881Fo0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9210w30(InterfaceC7525q20 interfaceC7525q20, C0504Ca0 c0504Ca0) {
        super(c0504Ca0, interfaceC7525q20, YV0.a.H);
        G10.g(interfaceC7525q20, "annotation");
        G10.g(c0504Ca0, "c");
        this.g = c0504Ca0.e().h(new C8931v30(this));
    }

    public static final Map h(C9210w30 c9210w30) {
        G10.g(c9210w30, "this$0");
        InterfaceC7803r20 interfaceC7803r20B = c9210w30.b();
        AbstractC2887Yq abstractC2887YqD = interfaceC7803r20B instanceof InterfaceC10042z20 ? C9763y20.a.d(((InterfaceC10042z20) c9210w30.b()).e()) : interfaceC7803r20B instanceof U20 ? C9763y20.a.d(AbstractC1496Lm.e(c9210w30.b())) : null;
        Map mapE = abstractC2887YqD != null ? AbstractC1369Kg0.e(D61.a(C8926v20.a.d(), abstractC2887YqD)) : null;
        return mapE == null ? AbstractC1473Lg0.h() : mapE;
    }

    @Override // com.daaw.C8640u20, com.daaw.O7
    public Map k() {
        return (Map) AbstractC9895yX0.a(this.g, this, h[0]);
    }
}
