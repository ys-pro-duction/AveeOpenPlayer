package com.daaw;

import com.daaw.YV0;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.s30, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C8087s30 extends C8640u20 {
    public static final /* synthetic */ W60[] h = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C8087s30.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    public final InterfaceC0881Fo0 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8087s30(InterfaceC7525q20 interfaceC7525q20, C0504Ca0 c0504Ca0) {
        super(c0504Ca0, interfaceC7525q20, YV0.a.L);
        G10.g(interfaceC7525q20, "annotation");
        G10.g(c0504Ca0, "c");
        this.g = c0504Ca0.e().h(new C7808r30(this));
    }

    public static final Map h(C8087s30 c8087s30) {
        G10.g(c8087s30, "this$0");
        AbstractC2887Yq abstractC2887YqB = C9763y20.a.b(c8087s30.b());
        Map mapE = abstractC2887YqB != null ? AbstractC1369Kg0.e(D61.a(C8926v20.a.c(), abstractC2887YqB)) : null;
        return mapE == null ? AbstractC1473Lg0.h() : mapE;
    }

    @Override // com.daaw.C8640u20, com.daaw.O7
    public Map k() {
        return (Map) AbstractC9895yX0.a(this.g, this, h[0]);
    }
}
