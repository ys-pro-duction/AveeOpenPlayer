package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.wH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9272wH implements InterfaceC4346ej0 {
    public final EnumC9551xH b;
    public final String c;

    public C9272wH(EnumC9551xH enumC9551xH, String... strArr) {
        G10.g(enumC9551xH, "kind");
        G10.g(strArr, "formatParams");
        this.b = enumC9551xH;
        String strC = enumC9551xH.c();
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length);
        String str = String.format(strC, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        G10.f(str, "format(...)");
        this.c = str;
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set b() {
        return AbstractC9867yQ0.d();
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set d() {
        return AbstractC9867yQ0.d();
    }

    @Override // com.daaw.InterfaceC4346ej0
    public Set e() {
        return AbstractC9867yQ0.d();
    }

    @Override // com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        return AbstractC1599Mm.k();
    }

    @Override // com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        String str = String.format(EnumC7592qH.C.c(), Arrays.copyOf(new Object[]{c2352Tm0}, 1));
        G10.f(str, "format(...)");
        C2352Tm0 c2352Tm0O = C2352Tm0.o(str);
        G10.f(c2352Tm0O, "special(...)");
        return new C6755nH(c2352Tm0O);
    }

    @Override // com.daaw.InterfaceC4346ej0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public Set c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return AbstractC9588xQ0.c(new C7870rH(BH.a.h()));
    }

    @Override // com.daaw.InterfaceC4346ej0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        return BH.a.j();
    }

    public final String j() {
        return this.c;
    }

    public String toString() {
        return "ErrorScope{" + this.c + '}';
    }
}
