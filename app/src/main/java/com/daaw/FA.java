package com.daaw;

import com.daaw.InterfaceC1583Mi;

/* JADX INFO: loaded from: classes4.dex */
public final class FA extends C3520bl implements EA {
    public final C9524xA0 g0;
    public final InterfaceC2664Wm0 h0;
    public final B81 i0;
    public final C10202zd1 j0;
    public final WA k0;

    public /* synthetic */ FA(InterfaceC4923gl interfaceC4923gl, InterfaceC7195or interfaceC7195or, InterfaceC3072a8 interfaceC3072a8, boolean z, InterfaceC1583Mi.a aVar, C9524xA0 c9524xA0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, C10202zd1 c10202zd1, WA wa, RU0 ru0, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC4923gl, interfaceC7195or, interfaceC3072a8, z, aVar, c9524xA0, interfaceC2664Wm0, b81, c10202zd1, wa, (i & 1024) != 0 ? null : ru0);
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC8468tR
    public boolean M() {
        return false;
    }

    @Override // com.daaw.InterfaceC3086aB
    public B81 P() {
        return this.i0;
    }

    @Override // com.daaw.InterfaceC3086aB
    public InterfaceC2664Wm0 Y() {
        return this.h0;
    }

    @Override // com.daaw.InterfaceC3086aB
    public WA a0() {
        return this.k0;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC2232Si0
    public boolean isExternal() {
        return false;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC8468tR
    public boolean isInline() {
        return false;
    }

    @Override // com.daaw.AbstractC8747uR, com.daaw.InterfaceC8468tR
    public boolean isSuspend() {
        return false;
    }

    @Override // com.daaw.C3520bl
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public FA o1(InterfaceC8612tw interfaceC8612tw, InterfaceC8468tR interfaceC8468tR, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0) {
        G10.g(interfaceC8612tw, "newOwner");
        G10.g(aVar, "kind");
        G10.g(interfaceC3072a8, "annotations");
        G10.g(ru0, "source");
        FA fa = new FA((InterfaceC4923gl) interfaceC8612tw, (InterfaceC7195or) interfaceC8468tR, interfaceC3072a8, this.f0, aVar, C(), Y(), P(), u1(), a0(), ru0);
        fa.Y0(Q0());
        return fa;
    }

    @Override // com.daaw.InterfaceC3086aB
    /* JADX INFO: renamed from: t1, reason: merged with bridge method [inline-methods] */
    public C9524xA0 C() {
        return this.g0;
    }

    public C10202zd1 u1() {
        return this.j0;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public FA(com.daaw.InterfaceC4923gl r12, com.daaw.InterfaceC7195or r13, com.daaw.InterfaceC3072a8 r14, boolean r15, com.daaw.InterfaceC1583Mi.a r16, com.daaw.C9524xA0 r17, com.daaw.InterfaceC2664Wm0 r18, com.daaw.B81 r19, com.daaw.C10202zd1 r20, com.daaw.WA r21, com.daaw.RU0 r22) {
        /*
            r11 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            java.lang.String r0 = "containingDeclaration"
            com.daaw.G10.g(r12, r0)
            java.lang.String r0 = "annotations"
            com.daaw.G10.g(r14, r0)
            java.lang.String r0 = "kind"
            r5 = r16
            com.daaw.G10.g(r5, r0)
            java.lang.String r0 = "proto"
            com.daaw.G10.g(r7, r0)
            java.lang.String r0 = "nameResolver"
            com.daaw.G10.g(r8, r0)
            java.lang.String r0 = "typeTable"
            com.daaw.G10.g(r9, r0)
            java.lang.String r0 = "versionRequirementTable"
            com.daaw.G10.g(r10, r0)
            if (r22 != 0) goto L38
            com.daaw.RU0 r0 = com.daaw.RU0.a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L3f
        L38:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L3f:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.g0 = r7
            r11.h0 = r8
            r11.i0 = r9
            r11.j0 = r10
            r1 = r21
            r11.k0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.FA.<init>(com.daaw.gl, com.daaw.or, com.daaw.a8, boolean, com.daaw.Mi$a, com.daaw.xA0, com.daaw.Wm0, com.daaw.B81, com.daaw.zd1, com.daaw.WA, com.daaw.RU0):void");
    }
}
