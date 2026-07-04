package com.daaw;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Jb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1246Jb1 {
    public static final I80 a(I80 i80) {
        return (I80) AbstractC0435Bj.b(i80).d();
    }

    public static final String b(C71 c71) {
        StringBuilder sb = new StringBuilder();
        c("type: " + c71, sb);
        c("hashCode: " + c71.hashCode(), sb);
        c("javaClass: " + c71.getClass().getCanonicalName(), sb);
        for (InterfaceC8612tw interfaceC8612twC = c71.c(); interfaceC8612twC != null; interfaceC8612twC = interfaceC8612twC.b()) {
            c("fqName: " + AbstractC2923Yz.h.O(interfaceC8612twC), sb);
            c("javaClass: " + interfaceC8612twC.getClass().getCanonicalName(), sb);
        }
        String string = sb.toString();
        G10.f(string, "toString(...)");
        return string;
    }

    public static final StringBuilder c(String str, StringBuilder sb) {
        G10.g(str, "<this>");
        sb.append(str);
        G10.f(sb, "append(...)");
        sb.append('\n');
        G10.f(sb, "append(...)");
        return sb;
    }

    public static final I80 d(I80 i80, I80 i802, InterfaceC10068z71 interfaceC10068z71) {
        G10.g(i80, "subtype");
        G10.g(i802, "supertype");
        G10.g(interfaceC10068z71, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new C8780uZ0(i80, null));
        C71 c71N0 = i802.N0();
        while (!arrayDeque.isEmpty()) {
            C8780uZ0 c8780uZ0 = (C8780uZ0) arrayDeque.poll();
            I80 i80B = c8780uZ0.b();
            C71 c71N02 = i80B.N0();
            if (interfaceC10068z71.a(c71N02, c71N0)) {
                boolean zO0 = i80B.O0();
                for (C8780uZ0 c8780uZ0A = c8780uZ0.a(); c8780uZ0A != null; c8780uZ0A = c8780uZ0A.a()) {
                    I80 i80B2 = c8780uZ0A.b();
                    List listL0 = i80B2.L0();
                    if ((listL0 instanceof Collection) && listL0.isEmpty()) {
                        i80B = E71.c.a(i80B2).c().n(i80B, EnumC1042Hc1.F);
                        G10.d(i80B);
                    } else {
                        Iterator it = listL0.iterator();
                        while (it.hasNext()) {
                            EnumC1042Hc1 enumC1042Hc1B = ((InterfaceC6440m81) it.next()).b();
                            EnumC1042Hc1 enumC1042Hc1 = EnumC1042Hc1.F;
                            if (enumC1042Hc1B != enumC1042Hc1) {
                                I80 i80N = AbstractC0860Fj.h(E71.c.a(i80B2), false, 1, null).c().n(i80B, enumC1042Hc1);
                                G10.f(i80N, "safeSubstitute(...)");
                                i80B = a(i80N);
                                break;
                            }
                        }
                        i80B = E71.c.a(i80B2).c().n(i80B, EnumC1042Hc1.F);
                        G10.d(i80B);
                    }
                    zO0 = zO0 || i80B2.O0();
                }
                C71 c71N03 = i80B.N0();
                if (interfaceC10068z71.a(c71N03, c71N0)) {
                    return D81.p(i80B, zO0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(c71N03) + ", \n\nsupertype: " + b(c71N0) + " \n" + interfaceC10068z71.a(c71N03, c71N0));
            }
            for (I80 i803 : c71N02.b()) {
                G10.d(i803);
                arrayDeque.add(new C8780uZ0(i803, c8780uZ0));
            }
        }
        return null;
    }
}
