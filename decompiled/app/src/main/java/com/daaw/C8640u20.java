package com.daaw;

import java.util.Collection;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.u20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C8640u20 implements InterfaceC2186Rx0 {
    public static final /* synthetic */ W60[] f = {AbstractC5624jG0.h(new C6728nA0(AbstractC5624jG0.b(C8640u20.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    public final AP a;
    public final RU0 b;
    public final InterfaceC0881Fo0 c;
    public final InterfaceC7803r20 d;
    public final boolean e;

    public C8640u20(C0504Ca0 c0504Ca0, InterfaceC7525q20 interfaceC7525q20, AP ap) {
        RU0 ru0A;
        Collection collectionC;
        G10.g(c0504Ca0, "c");
        G10.g(ap, "fqName");
        this.a = ap;
        if (interfaceC7525q20 == null || (ru0A = c0504Ca0.a().t().a(interfaceC7525q20)) == null) {
            ru0A = RU0.a;
            G10.f(ru0A, "NO_SOURCE");
        }
        this.b = ru0A;
        this.c = c0504Ca0.e().h(new C8361t20(c0504Ca0, this));
        this.d = (interfaceC7525q20 == null || (collectionC = interfaceC7525q20.c()) == null) ? null : (InterfaceC7803r20) AbstractC2455Um.f0(collectionC);
        boolean z = false;
        if (interfaceC7525q20 != null && interfaceC7525q20.f()) {
            z = true;
        }
        this.e = z;
    }

    public static final YS0 e(C0504Ca0 c0504Ca0, C8640u20 c8640u20) {
        G10.g(c0504Ca0, "$c");
        G10.g(c8640u20, "this$0");
        return c0504Ca0.d().p().o(c8640u20.d()).s();
    }

    public final InterfaceC7803r20 b() {
        return this.d;
    }

    @Override // com.daaw.O7
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public YS0 getType() {
        Object objA = AbstractC9895yX0.a(this.c, this, f[0]);
        G10.f(objA, "getValue(...)");
        return (YS0) objA;
    }

    @Override // com.daaw.O7
    public AP d() {
        return this.a;
    }

    @Override // com.daaw.InterfaceC2186Rx0
    public boolean f() {
        return this.e;
    }

    @Override // com.daaw.O7
    public RU0 j() {
        return this.b;
    }

    @Override // com.daaw.O7
    public Map k() {
        return AbstractC1473Lg0.h();
    }
}
