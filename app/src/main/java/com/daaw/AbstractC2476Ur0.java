package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ur0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2476Ur0 extends AbstractC9456ww implements InterfaceC2372Tr0 {
    public final AP F;
    public final String G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC2476Ur0(InterfaceC2968Zk0 interfaceC2968Zk0, AP ap) {
        super(interfaceC2968Zk0, InterfaceC3072a8.b.b(), ap.h(), RU0.a);
        G10.g(interfaceC2968Zk0, "module");
        G10.g(ap, "fqName");
        this.F = ap;
        this.G = "package " + ap + " of " + interfaceC2968Zk0;
    }

    @Override // com.daaw.InterfaceC2372Tr0
    public final AP d() {
        return this.F;
    }

    @Override // com.daaw.InterfaceC8612tw
    public Object h0(InterfaceC9735xw interfaceC9735xw, Object obj) {
        G10.g(interfaceC9735xw, "visitor");
        return interfaceC9735xw.e(this, obj);
    }

    @Override // com.daaw.AbstractC9456ww, com.daaw.InterfaceC10293zw
    public RU0 j() {
        RU0 ru0 = RU0.a;
        G10.f(ru0, "NO_SOURCE");
        return ru0;
    }

    @Override // com.daaw.AbstractC8898uw
    public String toString() {
        return this.G;
    }

    @Override // com.daaw.AbstractC9456ww, com.daaw.InterfaceC8612tw
    public InterfaceC2968Zk0 b() {
        InterfaceC8612tw interfaceC8612twB = super.b();
        G10.e(interfaceC8612twB, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor");
        return (InterfaceC2968Zk0) interfaceC8612twB;
    }
}
