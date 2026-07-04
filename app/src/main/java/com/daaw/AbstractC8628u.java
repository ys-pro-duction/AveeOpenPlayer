package com.daaw;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8628u extends W0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC8628u(InterfaceC10174zX0 interfaceC10174zX0) {
        super(interfaceC10174zX0);
        if (interfaceC10174zX0 == null) {
            H(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void H(int r9) {
        /*
            r0 = 4
            r1 = 3
            r2 = 1
            if (r9 == r2) goto Lc
            if (r9 == r1) goto Lc
            if (r9 == r0) goto Lc
            java.lang.String r3 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto Le
        Lc:
            java.lang.String r3 = "@NotNull method %s.%s must not return null"
        Le:
            r4 = 2
            if (r9 == r2) goto L17
            if (r9 == r1) goto L17
            if (r9 == r0) goto L17
            r5 = 3
            goto L18
        L17:
            r5 = 2
        L18:
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor"
            r7 = 0
            if (r9 == r2) goto L2f
            if (r9 == r4) goto L2a
            if (r9 == r1) goto L2f
            if (r9 == r0) goto L2f
            java.lang.String r8 = "storageManager"
            r5[r7] = r8
            goto L31
        L2a:
            java.lang.String r8 = "classifier"
            r5[r7] = r8
            goto L31
        L2f:
            r5[r7] = r6
        L31:
            if (r9 == r2) goto L3f
            if (r9 == r1) goto L3a
            if (r9 == r0) goto L3a
            r5[r2] = r6
            goto L43
        L3a:
            java.lang.String r6 = "getAdditionalNeighboursInSupertypeGraph"
            r5[r2] = r6
            goto L43
        L3f:
            java.lang.String r6 = "getBuiltIns"
            r5[r2] = r6
        L43:
            if (r9 == r2) goto L54
            if (r9 == r4) goto L50
            if (r9 == r1) goto L54
            if (r9 == r0) goto L54
            java.lang.String r6 = "<init>"
            r5[r4] = r6
            goto L54
        L50:
            java.lang.String r6 = "isSameClassifier"
            r5[r4] = r6
        L54:
            java.lang.String r3 = java.lang.String.format(r3, r5)
            if (r9 == r2) goto L64
            if (r9 == r1) goto L64
            if (r9 == r0) goto L64
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r3)
            goto L69
        L64:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            r9.<init>(r3)
        L69:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8628u.H(int):void");
    }

    /* JADX INFO: renamed from: I */
    public abstract InterfaceC4923gl c();

    @Override // com.daaw.AbstractC9961yl
    public boolean h(InterfaceC10240zl interfaceC10240zl) {
        if (interfaceC10240zl == null) {
            H(2);
        }
        return (interfaceC10240zl instanceof InterfaceC4923gl) && f(c(), interfaceC10240zl);
    }

    @Override // com.daaw.C71
    public AbstractC8670u80 p() {
        AbstractC8670u80 abstractC8670u80M = AbstractC8400tA.m(c());
        if (abstractC8670u80M == null) {
            H(1);
        }
        return abstractC8670u80M;
    }

    @Override // com.daaw.W0
    public I80 s() {
        if (AbstractC8670u80.u0(c())) {
            return null;
        }
        return p().i();
    }

    @Override // com.daaw.W0
    public Collection t(boolean z) {
        InterfaceC8612tw interfaceC8612twB = c().b();
        if (!(interfaceC8612twB instanceof InterfaceC4923gl)) {
            List list = Collections.EMPTY_LIST;
            if (list == null) {
                H(3);
            }
            return list;
        }
        UT0 ut0 = new UT0();
        InterfaceC4923gl interfaceC4923gl = (InterfaceC4923gl) interfaceC8612twB;
        ut0.add(interfaceC4923gl.s());
        InterfaceC4923gl interfaceC4923glQ = interfaceC4923gl.Q();
        if (z && interfaceC4923glQ != null) {
            ut0.add(interfaceC4923glQ.s());
        }
        return ut0;
    }
}
