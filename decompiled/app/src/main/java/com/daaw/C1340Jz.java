package com.daaw;

import com.daaw.C0789Er0;
import com.daaw.InterfaceC1583Mi;
import com.daaw.Q80;
import java.util.Collection;

/* JADX INFO: renamed from: com.daaw.Jz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1340Jz {
    public static final C1340Jz a = new C1340Jz();

    public static /* synthetic */ boolean f(C1340Jz c1340Jz, InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, boolean z, boolean z2, boolean z3, Q80 q80, int i, Object obj) {
        return c1340Jz.e(interfaceC1376Ki, interfaceC1376Ki2, z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? false : z3, q80);
    }

    public static final boolean g(InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2) {
        return false;
    }

    public static final boolean h(boolean z, InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, C71 c71, C71 c712) {
        G10.g(interfaceC1376Ki, "$a");
        G10.g(interfaceC1376Ki2, "$b");
        G10.g(c71, "c1");
        G10.g(c712, "c2");
        if (G10.c(c71, c712)) {
            return true;
        }
        InterfaceC10240zl interfaceC10240zlC = c71.c();
        InterfaceC10240zl interfaceC10240zlC2 = c712.c();
        if ((interfaceC10240zlC instanceof Z71) && (interfaceC10240zlC2 instanceof Z71)) {
            return a.n((Z71) interfaceC10240zlC, (Z71) interfaceC10240zlC2, z, new C1236Iz(interfaceC1376Ki, interfaceC1376Ki2));
        }
        return false;
    }

    public static final boolean i(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2) {
        G10.g(interfaceC1376Ki, "$a");
        G10.g(interfaceC1376Ki2, "$b");
        return G10.c(interfaceC8612tw, interfaceC1376Ki) && G10.c(interfaceC8612tw2, interfaceC1376Ki2);
    }

    public static /* synthetic */ boolean l(C1340Jz c1340Jz, InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2, boolean z, boolean z2, int i, Object obj) {
        if ((i & 8) != 0) {
            z2 = true;
        }
        return c1340Jz.k(interfaceC8612tw, interfaceC8612tw2, z, z2);
    }

    public static /* synthetic */ boolean o(C1340Jz c1340Jz, Z71 z71, Z71 z712, boolean z, InterfaceC3429bR interfaceC3429bR, int i, Object obj) {
        if ((i & 8) != 0) {
            interfaceC3429bR = C0924Fz.B;
        }
        return c1340Jz.n(z71, z712, z, interfaceC3429bR);
    }

    public static final boolean p(InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2) {
        return false;
    }

    public final boolean e(InterfaceC1376Ki interfaceC1376Ki, InterfaceC1376Ki interfaceC1376Ki2, boolean z, boolean z2, boolean z3, Q80 q80) {
        G10.g(interfaceC1376Ki, "a");
        G10.g(interfaceC1376Ki2, "b");
        G10.g(q80, "kotlinTypeRefiner");
        if (G10.c(interfaceC1376Ki, interfaceC1376Ki2)) {
            return true;
        }
        if (!G10.c(interfaceC1376Ki.getName(), interfaceC1376Ki2.getName())) {
            return false;
        }
        if (z2 && (interfaceC1376Ki instanceof InterfaceC2232Si0) && (interfaceC1376Ki2 instanceof InterfaceC2232Si0) && ((InterfaceC2232Si0) interfaceC1376Ki).J() != ((InterfaceC2232Si0) interfaceC1376Ki2).J()) {
            return false;
        }
        if ((G10.c(interfaceC1376Ki.b(), interfaceC1376Ki2.b()) && (!z || !G10.c(r(interfaceC1376Ki), r(interfaceC1376Ki2)))) || AbstractC7006oA.E(interfaceC1376Ki) || AbstractC7006oA.E(interfaceC1376Ki2) || !q(interfaceC1376Ki, interfaceC1376Ki2, C1028Gz.B, z)) {
            return false;
        }
        C0789Er0 c0789Er0I = C0789Er0.i(q80, new C1132Hz(z, interfaceC1376Ki, interfaceC1376Ki2));
        G10.f(c0789Er0I, "create(...)");
        C0789Er0.i.a aVarC = c0789Er0I.E(interfaceC1376Ki, interfaceC1376Ki2, null, !z3).c();
        C0789Er0.i.a aVar = C0789Er0.i.a.OVERRIDABLE;
        return aVarC == aVar && c0789Er0I.E(interfaceC1376Ki2, interfaceC1376Ki, null, z3 ^ true).c() == aVar;
    }

    public final boolean j(InterfaceC4923gl interfaceC4923gl, InterfaceC4923gl interfaceC4923gl2) {
        return G10.c(interfaceC4923gl.k(), interfaceC4923gl2.k());
    }

    public final boolean k(InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2, boolean z, boolean z2) {
        return ((interfaceC8612tw instanceof InterfaceC4923gl) && (interfaceC8612tw2 instanceof InterfaceC4923gl)) ? j((InterfaceC4923gl) interfaceC8612tw, (InterfaceC4923gl) interfaceC8612tw2) : ((interfaceC8612tw instanceof Z71) && (interfaceC8612tw2 instanceof Z71)) ? o(this, (Z71) interfaceC8612tw, (Z71) interfaceC8612tw2, z, null, 8, null) : ((interfaceC8612tw instanceof InterfaceC1376Ki) && (interfaceC8612tw2 instanceof InterfaceC1376Ki)) ? f(this, (InterfaceC1376Ki) interfaceC8612tw, (InterfaceC1376Ki) interfaceC8612tw2, z, z2, false, Q80.a.a, 16, null) : ((interfaceC8612tw instanceof InterfaceC2372Tr0) && (interfaceC8612tw2 instanceof InterfaceC2372Tr0)) ? G10.c(((InterfaceC2372Tr0) interfaceC8612tw).d(), ((InterfaceC2372Tr0) interfaceC8612tw2).d()) : G10.c(interfaceC8612tw, interfaceC8612tw2);
    }

    public final boolean m(Z71 z71, Z71 z712, boolean z) {
        G10.g(z71, "a");
        G10.g(z712, "b");
        return o(this, z71, z712, z, null, 8, null);
    }

    public final boolean n(Z71 z71, Z71 z712, boolean z, InterfaceC3429bR interfaceC3429bR) {
        G10.g(z71, "a");
        G10.g(z712, "b");
        G10.g(interfaceC3429bR, "equivalentCallables");
        if (G10.c(z71, z712)) {
            return true;
        }
        return !G10.c(z71.b(), z712.b()) && q(z71, z712, interfaceC3429bR, z) && z71.getIndex() == z712.getIndex();
    }

    public final boolean q(InterfaceC8612tw interfaceC8612tw, InterfaceC8612tw interfaceC8612tw2, InterfaceC3429bR interfaceC3429bR, boolean z) {
        InterfaceC8612tw interfaceC8612twB = interfaceC8612tw.b();
        InterfaceC8612tw interfaceC8612twB2 = interfaceC8612tw2.b();
        return ((interfaceC8612twB instanceof InterfaceC1583Mi) || (interfaceC8612twB2 instanceof InterfaceC1583Mi)) ? ((Boolean) interfaceC3429bR.invoke(interfaceC8612twB, interfaceC8612twB2)).booleanValue() : l(this, interfaceC8612twB, interfaceC8612twB2, z, false, 8, null);
    }

    public final RU0 r(InterfaceC1376Ki interfaceC1376Ki) {
        while (interfaceC1376Ki instanceof InterfaceC1583Mi) {
            InterfaceC1583Mi interfaceC1583Mi = (InterfaceC1583Mi) interfaceC1376Ki;
            if (interfaceC1583Mi.i() != InterfaceC1583Mi.a.FAKE_OVERRIDE) {
                break;
            }
            Collection collectionE = interfaceC1583Mi.e();
            G10.f(collectionE, "getOverriddenDescriptors(...)");
            interfaceC1376Ki = (InterfaceC1583Mi) AbstractC2455Um.D0(collectionE);
            if (interfaceC1376Ki == null) {
                return null;
            }
        }
        return interfaceC1376Ki.j();
    }
}
