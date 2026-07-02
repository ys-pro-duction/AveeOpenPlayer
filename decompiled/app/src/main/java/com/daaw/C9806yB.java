package com.daaw;

import com.daaw.InterfaceC1583Mi;

/* JADX INFO: renamed from: com.daaw.yB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9806yB extends C4765gA0 implements EA {
    public final HA0 d0;
    public final InterfaceC2664Wm0 e0;
    public final B81 f0;
    public final C10202zd1 g0;
    public final WA h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9806yB(InterfaceC8612tw interfaceC8612tw, InterfaceC4476fA0 interfaceC4476fA0, InterfaceC3072a8 interfaceC3072a8, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, boolean z, C2352Tm0 c2352Tm0, InterfaceC1583Mi.a aVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, HA0 ha0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, C10202zd1 c10202zd1, WA wa) {
        super(interfaceC8612tw, interfaceC4476fA0, interfaceC3072a8, enumC0336Ak0, abstractC8965vA, z, c2352Tm0, aVar, RU0.a, z2, z3, z6, false, z4, z5);
        G10.g(interfaceC8612tw, "containingDeclaration");
        G10.g(interfaceC3072a8, "annotations");
        G10.g(enumC0336Ak0, "modality");
        G10.g(abstractC8965vA, "visibility");
        G10.g(c2352Tm0, "name");
        G10.g(aVar, "kind");
        G10.g(ha0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        G10.g(c10202zd1, "versionRequirementTable");
        this.d0 = ha0;
        this.e0 = interfaceC2664Wm0;
        this.f0 = b81;
        this.g0 = c10202zd1;
        this.h0 = wa;
    }

    @Override // com.daaw.InterfaceC3086aB
    public B81 P() {
        return this.f0;
    }

    @Override // com.daaw.C4765gA0
    public C4765gA0 P0(InterfaceC8612tw interfaceC8612tw, EnumC0336Ak0 enumC0336Ak0, AbstractC8965vA abstractC8965vA, InterfaceC4476fA0 interfaceC4476fA0, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, RU0 ru0) {
        G10.g(interfaceC8612tw, "newOwner");
        G10.g(enumC0336Ak0, "newModality");
        G10.g(abstractC8965vA, "newVisibility");
        G10.g(aVar, "kind");
        G10.g(c2352Tm0, "newName");
        G10.g(ru0, "source");
        return new C9806yB(interfaceC8612tw, interfaceC4476fA0, getAnnotations(), enumC0336Ak0, abstractC8965vA, f0(), c2352Tm0, aVar, p0(), y(), isExternal(), L(), J(), C(), Y(), P(), g1(), a0());
    }

    @Override // com.daaw.InterfaceC3086aB
    public InterfaceC2664Wm0 Y() {
        return this.e0;
    }

    @Override // com.daaw.InterfaceC3086aB
    public WA a0() {
        return this.h0;
    }

    @Override // com.daaw.InterfaceC3086aB
    /* JADX INFO: renamed from: f1, reason: merged with bridge method [inline-methods] */
    public HA0 C() {
        return this.d0;
    }

    public C10202zd1 g1() {
        return this.g0;
    }

    @Override // com.daaw.C4765gA0, com.daaw.InterfaceC2232Si0
    public boolean isExternal() {
        Boolean boolD = SM.E.d(C().e0());
        G10.f(boolD, "get(...)");
        return boolD.booleanValue();
    }
}
