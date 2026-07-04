package com.daaw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.ea1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4302ea1 {
    public static final C4302ea1 a = new C4302ea1();
    public static final Set b;
    public static final Set c;
    public static final HashMap d;
    public static final HashMap e;
    public static final HashMap f;
    public static final Set g;

    static {
        EnumC4024da1[] enumC4024da1ArrValues = EnumC4024da1.values();
        ArrayList arrayList = new ArrayList(enumC4024da1ArrValues.length);
        for (EnumC4024da1 enumC4024da1 : enumC4024da1ArrValues) {
            arrayList.add(enumC4024da1.h());
        }
        b = AbstractC2455Um.Q0(arrayList);
        EnumC3467ba1[] enumC3467ba1ArrValues = EnumC3467ba1.values();
        ArrayList arrayList2 = new ArrayList(enumC3467ba1ArrValues.length);
        for (EnumC3467ba1 enumC3467ba1 : enumC3467ba1ArrValues) {
            arrayList2.add(enumC3467ba1.c());
        }
        c = AbstractC2455Um.Q0(arrayList2);
        d = new HashMap();
        e = new HashMap();
        f = AbstractC1473Lg0.j(D61.a(EnumC3467ba1.D, C2352Tm0.l("ubyteArrayOf")), D61.a(EnumC3467ba1.E, C2352Tm0.l("ushortArrayOf")), D61.a(EnumC3467ba1.F, C2352Tm0.l("uintArrayOf")), D61.a(EnumC3467ba1.G, C2352Tm0.l("ulongArrayOf")));
        EnumC4024da1[] enumC4024da1ArrValues2 = EnumC4024da1.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC4024da1 enumC4024da12 : enumC4024da1ArrValues2) {
            linkedHashSet.add(enumC4024da12.c().h());
        }
        g = linkedHashSet;
        for (EnumC4024da1 enumC4024da13 : EnumC4024da1.values()) {
            d.put(enumC4024da13.c(), enumC4024da13.g());
            e.put(enumC4024da13.g(), enumC4024da13.c());
        }
    }

    public static final boolean d(I80 i80) {
        InterfaceC10240zl interfaceC10240zlC;
        G10.g(i80, "type");
        if (D81.w(i80) || (interfaceC10240zlC = i80.N0().c()) == null) {
            return false;
        }
        return a.c(interfaceC10240zlC);
    }

    public final C6607ml a(C6607ml c6607ml) {
        G10.g(c6607ml, "arrayClassId");
        return (C6607ml) d.get(c6607ml);
    }

    public final boolean b(C2352Tm0 c2352Tm0) {
        G10.g(c2352Tm0, "name");
        return g.contains(c2352Tm0);
    }

    public final boolean c(InterfaceC8612tw interfaceC8612tw) {
        G10.g(interfaceC8612tw, "descriptor");
        InterfaceC8612tw interfaceC8612twB = interfaceC8612tw.b();
        return (interfaceC8612twB instanceof InterfaceC2372Tr0) && G10.c(((InterfaceC2372Tr0) interfaceC8612twB).d(), YV0.A) && b.contains(interfaceC8612tw.getName());
    }
}
