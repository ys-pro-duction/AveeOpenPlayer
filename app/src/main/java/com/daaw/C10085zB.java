package com.daaw;

import com.daaw.InterfaceC1583Mi;

/* JADX INFO: renamed from: com.daaw.zB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10085zB extends JS0 implements EA {
    public final CA0 f0;
    public final InterfaceC2664Wm0 g0;
    public final B81 h0;
    public final C10202zd1 i0;
    public final WA j0;

    public /* synthetic */ C10085zB(InterfaceC8612tw interfaceC8612tw, IS0 is0, InterfaceC3072a8 interfaceC3072a8, C2352Tm0 c2352Tm0, InterfaceC1583Mi.a aVar, CA0 ca0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, C10202zd1 c10202zd1, WA wa, RU0 ru0, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC8612tw, is0, interfaceC3072a8, c2352Tm0, aVar, ca0, interfaceC2664Wm0, b81, c10202zd1, wa, (i & 1024) != 0 ? null : ru0);
    }

    @Override // com.daaw.JS0, com.daaw.AbstractC8747uR
    /* JADX INFO: renamed from: L0 */
    public AbstractC8747uR o1(InterfaceC8612tw interfaceC8612tw, InterfaceC8468tR interfaceC8468tR, InterfaceC1583Mi.a aVar, C2352Tm0 c2352Tm0, InterfaceC3072a8 interfaceC3072a8, RU0 ru0) {
        C2352Tm0 c2352Tm02;
        G10.g(interfaceC8612tw, "newOwner");
        G10.g(aVar, "kind");
        G10.g(interfaceC3072a8, "annotations");
        G10.g(ru0, "source");
        IS0 is0 = (IS0) interfaceC8468tR;
        if (c2352Tm0 == null) {
            C2352Tm0 name = getName();
            G10.f(name, "getName(...)");
            c2352Tm02 = name;
        } else {
            c2352Tm02 = c2352Tm0;
        }
        C10085zB c10085zB = new C10085zB(interfaceC8612tw, is0, interfaceC3072a8, c2352Tm02, aVar, C(), Y(), P(), q1(), a0(), ru0);
        c10085zB.Y0(Q0());
        return c10085zB;
    }

    @Override // com.daaw.InterfaceC3086aB
    public B81 P() {
        return this.h0;
    }

    @Override // com.daaw.InterfaceC3086aB
    public InterfaceC2664Wm0 Y() {
        return this.g0;
    }

    @Override // com.daaw.InterfaceC3086aB
    public WA a0() {
        return this.j0;
    }

    @Override // com.daaw.InterfaceC3086aB
    /* JADX INFO: renamed from: p1, reason: merged with bridge method [inline-methods] */
    public CA0 C() {
        return this.f0;
    }

    public C10202zd1 q1() {
        return this.i0;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public C10085zB(com.daaw.InterfaceC8612tw r12, com.daaw.IS0 r13, com.daaw.InterfaceC3072a8 r14, com.daaw.C2352Tm0 r15, com.daaw.InterfaceC1583Mi.a r16, com.daaw.CA0 r17, com.daaw.InterfaceC2664Wm0 r18, com.daaw.B81 r19, com.daaw.C10202zd1 r20, com.daaw.WA r21, com.daaw.RU0 r22) {
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
            java.lang.String r0 = "name"
            com.daaw.G10.g(r15, r0)
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
            if (r22 != 0) goto L3d
            com.daaw.RU0 r0 = com.daaw.RU0.a
            r6 = r0
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r0 = r11
            goto L44
        L3d:
            r6 = r22
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
        L44:
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r11.f0 = r7
            r11.g0 = r8
            r11.h0 = r9
            r11.i0 = r10
            r1 = r21
            r11.j0 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C10085zB.<init>(com.daaw.tw, com.daaw.IS0, com.daaw.a8, com.daaw.Tm0, com.daaw.Mi$a, com.daaw.CA0, com.daaw.Wm0, com.daaw.B81, com.daaw.zd1, com.daaw.WA, com.daaw.RU0):void");
    }
}
