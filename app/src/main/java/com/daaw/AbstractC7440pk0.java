package com.daaw;

import com.daaw.AbstractC7818r50;
import com.daaw.YV0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.pk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC7440pk0 {
    public static final void a(StringBuilder sb, I80 i80) {
        sb.append(g(i80));
    }

    public static final String b(InterfaceC8468tR interfaceC8468tR, boolean z, boolean z2) {
        String strC;
        G10.g(interfaceC8468tR, "<this>");
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (interfaceC8468tR instanceof InterfaceC7195or) {
                strC = "<init>";
            } else {
                strC = interfaceC8468tR.getName().c();
                G10.f(strC, "asString(...)");
            }
            sb.append(strC);
        }
        sb.append("(");
        RE0 re0I0 = interfaceC8468tR.i0();
        if (re0I0 != null) {
            I80 type = re0I0.getType();
            G10.f(type, "getType(...)");
            a(sb, type);
        }
        Iterator it = interfaceC8468tR.h().iterator();
        while (it.hasNext()) {
            I80 type2 = ((InterfaceC9918yc1) it.next()).getType();
            G10.f(type2, "getType(...)");
            a(sb, type2);
        }
        sb.append(")");
        if (z) {
            if (AbstractC0820Ez.c(interfaceC8468tR)) {
                sb.append("V");
            } else {
                I80 returnType = interfaceC8468tR.getReturnType();
                G10.d(returnType);
                a(sb, returnType);
            }
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ String c(InterfaceC8468tR interfaceC8468tR, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return b(interfaceC8468tR, z, z2);
    }

    public static final String d(InterfaceC1376Ki interfaceC1376Ki) {
        G10.g(interfaceC1376Ki, "<this>");
        C7079oS0 c7079oS0 = C7079oS0.a;
        if (AbstractC7006oA.E(interfaceC1376Ki)) {
            return null;
        }
        InterfaceC8612tw interfaceC8612twB = interfaceC1376Ki.b();
        InterfaceC4923gl interfaceC4923gl = interfaceC8612twB instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC8612twB : null;
        if (interfaceC4923gl == null || interfaceC4923gl.getName().m()) {
            return null;
        }
        InterfaceC1376Ki interfaceC1376KiA = interfaceC1376Ki.a();
        IS0 is0 = interfaceC1376KiA instanceof IS0 ? (IS0) interfaceC1376KiA : null;
        if (is0 == null) {
            return null;
        }
        return AbstractC7161ok0.a(c7079oS0, interfaceC4923gl, c(is0, false, false, 3, null));
    }

    public static final boolean e(InterfaceC1376Ki interfaceC1376Ki) {
        InterfaceC8468tR interfaceC8468tRL;
        G10.g(interfaceC1376Ki, "f");
        if (!(interfaceC1376Ki instanceof InterfaceC8468tR)) {
            return false;
        }
        InterfaceC8468tR interfaceC8468tR = (InterfaceC8468tR) interfaceC1376Ki;
        if (G10.c(interfaceC8468tR.getName().c(), "remove") && interfaceC8468tR.h().size() == 1 && !AbstractC4849gV0.n((InterfaceC1583Mi) interfaceC1376Ki)) {
            List listH = interfaceC8468tR.a().h();
            G10.f(listH, "getValueParameters(...)");
            I80 type = ((InterfaceC9918yc1) AbstractC2455Um.C0(listH)).getType();
            G10.f(type, "getType(...)");
            AbstractC7818r50 abstractC7818r50G = g(type);
            AbstractC7818r50.d dVar = abstractC7818r50G instanceof AbstractC7818r50.d ? (AbstractC7818r50.d) abstractC7818r50G : null;
            if ((dVar != null ? dVar.i() : null) != EnumC6703n50.INT || (interfaceC8468tRL = C1579Mh.l(interfaceC8468tR)) == null) {
                return false;
            }
            List listH2 = interfaceC8468tRL.a().h();
            G10.f(listH2, "getValueParameters(...)");
            I80 type2 = ((InterfaceC9918yc1) AbstractC2455Um.C0(listH2)).getType();
            G10.f(type2, "getType(...)");
            AbstractC7818r50 abstractC7818r50G2 = g(type2);
            InterfaceC8612tw interfaceC8612twB = interfaceC8468tRL.b();
            G10.f(interfaceC8612twB, "getContainingDeclaration(...)");
            if (G10.c(AbstractC8400tA.p(interfaceC8612twB), YV0.a.f0.j()) && (abstractC7818r50G2 instanceof AbstractC7818r50.c) && G10.c(((AbstractC7818r50.c) abstractC7818r50G2).i(), "java/lang/Object")) {
                return true;
            }
        }
        return false;
    }

    public static final String f(InterfaceC4923gl interfaceC4923gl) {
        G10.g(interfaceC4923gl, "<this>");
        C9489x30 c9489x30 = C9489x30.a;
        BP bpJ = AbstractC8400tA.o(interfaceC4923gl).j();
        G10.f(bpJ, "toUnsafe(...)");
        C6607ml c6607mlN = c9489x30.n(bpJ);
        if (c6607mlN == null) {
            return AbstractC0820Ez.b(interfaceC4923gl, null, 2, null);
        }
        String strH = Y40.h(c6607mlN);
        G10.f(strH, "internalNameByClassId(...)");
        return strH;
    }

    public static final AbstractC7818r50 g(I80 i80) {
        G10.g(i80, "<this>");
        return (AbstractC7818r50) AbstractC0820Ez.e(i80, C8376t50.a, Y71.o, X71.a, null, null, 32, null);
    }
}
