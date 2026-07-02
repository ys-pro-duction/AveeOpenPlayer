package com.daaw;

import com.daaw.AbstractC4451f50;
import com.daaw.AbstractC5674jS;
import com.daaw.AbstractC7261p50;
import com.daaw.C5193hj0;

/* JADX INFO: renamed from: com.daaw.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8070s {
    public static final C5193hj0 a(HA0 ha0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, boolean z, boolean z2, boolean z3) {
        G10.g(ha0, "proto");
        G10.g(interfaceC2664Wm0, "nameResolver");
        G10.g(b81, "typeTable");
        AbstractC5674jS.f fVar = AbstractC7261p50.d;
        G10.f(fVar, "propertySignature");
        AbstractC7261p50.d dVar = (AbstractC7261p50.d) SA0.a(ha0, fVar);
        if (dVar == null) {
            return null;
        }
        if (z) {
            AbstractC4451f50.a aVarC = C7540q50.a.c(ha0, interfaceC2664Wm0, b81, z3);
            if (aVarC == null) {
                return null;
            }
            return C5193hj0.b.b(aVarC);
        }
        if (!z2 || !dVar.L()) {
            return null;
        }
        C5193hj0.a aVar = C5193hj0.b;
        AbstractC7261p50.c cVarG = dVar.G();
        G10.f(cVarG, "getSyntheticMethod(...)");
        return aVar.c(interfaceC2664Wm0, cVarG);
    }

    public static /* synthetic */ C5193hj0 b(HA0 ha0, InterfaceC2664Wm0 interfaceC2664Wm0, B81 b81, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            z3 = true;
        }
        return a(ha0, interfaceC2664Wm0, b81, z, z2, z3);
    }
}
