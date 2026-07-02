package com.daaw;

import com.daaw.FI0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.daaw.Il, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1180Il extends AbstractC4253eO0 {
    public static final C1180Il a = new C1180Il();

    /* JADX INFO: renamed from: com.daaw.Il$a */
    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return AbstractC1188In.a(AbstractC8400tA.o((InterfaceC4923gl) obj).b(), AbstractC8400tA.o((InterfaceC4923gl) obj2).b());
        }
    }

    public static final void b(InterfaceC4923gl interfaceC4923gl, LinkedHashSet linkedHashSet, InterfaceC4346ej0 interfaceC4346ej0, boolean z) {
        for (InterfaceC8612tw interfaceC8612tw : FI0.a.a(interfaceC4346ej0, C1651Mz.t, null, 2, null)) {
            if (interfaceC8612tw instanceof InterfaceC4923gl) {
                InterfaceC4923gl interfaceC4923glR = (InterfaceC4923gl) interfaceC8612tw;
                if (interfaceC4923glR.J()) {
                    C2352Tm0 name = interfaceC4923glR.getName();
                    G10.f(name, "getName(...)");
                    InterfaceC10240zl interfaceC10240zlG = interfaceC4346ej0.g(name, EnumC5496io0.N);
                    interfaceC4923glR = interfaceC10240zlG instanceof InterfaceC4923gl ? (InterfaceC4923gl) interfaceC10240zlG : interfaceC10240zlG instanceof InterfaceC5586j71 ? ((InterfaceC5586j71) interfaceC10240zlG).r() : null;
                }
                if (interfaceC4923glR != null) {
                    if (AbstractC7006oA.z(interfaceC4923glR, interfaceC4923gl)) {
                        linkedHashSet.add(interfaceC4923glR);
                    }
                    if (z) {
                        InterfaceC4346ej0 interfaceC4346ej0W0 = interfaceC4923glR.w0();
                        G10.f(interfaceC4346ej0W0, "getUnsubstitutedInnerClassesScope(...)");
                        b(interfaceC4923gl, linkedHashSet, interfaceC4346ej0W0, z);
                    }
                }
            }
        }
    }

    public Collection a(InterfaceC4923gl interfaceC4923gl, boolean z) {
        Object next;
        InterfaceC8612tw interfaceC8612twB;
        G10.g(interfaceC4923gl, "sealedClass");
        if (interfaceC4923gl.l() != EnumC0336Ak0.D) {
            return AbstractC1599Mm.k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z) {
            Iterator it = AbstractC8400tA.u(interfaceC4923gl).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC8612tw) next) instanceof InterfaceC2372Tr0) {
                    break;
                }
            }
            interfaceC8612twB = (InterfaceC8612tw) next;
        } else {
            interfaceC8612twB = interfaceC4923gl.b();
        }
        if (interfaceC8612twB instanceof InterfaceC2372Tr0) {
            b(interfaceC4923gl, linkedHashSet, ((InterfaceC2372Tr0) interfaceC8612twB).q(), z);
        }
        InterfaceC4346ej0 interfaceC4346ej0W0 = interfaceC4923gl.w0();
        G10.f(interfaceC4346ej0W0, "getUnsubstitutedInnerClassesScope(...)");
        b(interfaceC4923gl, linkedHashSet, interfaceC4346ej0W0, true);
        return AbstractC2455Um.H0(linkedHashSet, new a());
    }
}
