package com.daaw;

/* JADX INFO: renamed from: com.daaw.Gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0952Gg implements InterfaceC1385Kk0, InterfaceC9429wq0 {
    public final InterfaceC1160Ig B;
    public InterfaceC1160Ig C;
    public InterfaceC7002o90 D;

    public AbstractC0952Gg(InterfaceC1160Ig interfaceC1160Ig) {
        G10.g(interfaceC1160Ig, "defaultParent");
        this.B = interfaceC1160Ig;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    public final InterfaceC7002o90 a() {
        InterfaceC7002o90 interfaceC7002o90 = this.D;
        if (interfaceC7002o90 == null || !interfaceC7002o90.C()) {
            return null;
        }
        return interfaceC7002o90;
    }

    public final InterfaceC1160Ig c() {
        InterfaceC1160Ig interfaceC1160Ig = this.C;
        return interfaceC1160Ig == null ? this.B : interfaceC1160Ig;
    }

    @Override // com.daaw.InterfaceC1385Kk0
    public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
        G10.g(interfaceC1904Pk0, "scope");
        this.C = (InterfaceC1160Ig) interfaceC1904Pk0.a(AbstractC1056Hg.a());
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    @Override // com.daaw.InterfaceC9429wq0
    public void o(InterfaceC7002o90 interfaceC7002o90) {
        G10.g(interfaceC7002o90, "coordinates");
        this.D = interfaceC7002o90;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
