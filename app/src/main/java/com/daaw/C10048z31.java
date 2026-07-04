package com.daaw;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.z31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C10048z31 extends C9272wH {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10048z31(EnumC9551xH enumC9551xH, String... strArr) {
        super(enumC9551xH, (String[]) Arrays.copyOf(strArr, strArr.length));
        G10.g(enumC9551xH, "kind");
        G10.g(strArr, "formatParams");
    }

    @Override // com.daaw.C9272wH, com.daaw.InterfaceC4346ej0
    public Set b() {
        throw new IllegalStateException();
    }

    @Override // com.daaw.C9272wH, com.daaw.InterfaceC4346ej0
    public Set d() {
        throw new IllegalStateException();
    }

    @Override // com.daaw.C9272wH, com.daaw.InterfaceC4346ej0
    public Set e() {
        throw new IllegalStateException();
    }

    @Override // com.daaw.C9272wH, com.daaw.FI0
    public Collection f(C1651Mz c1651Mz, NQ nq) {
        G10.g(c1651Mz, "kindFilter");
        G10.g(nq, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // com.daaw.C9272wH, com.daaw.FI0
    public InterfaceC10240zl g(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        throw new IllegalStateException(j() + ", required name: " + c2352Tm0);
    }

    @Override // com.daaw.C9272wH, com.daaw.InterfaceC4346ej0
    /* JADX INFO: renamed from: h */
    public Set c(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        throw new IllegalStateException(j() + ", required name: " + c2352Tm0);
    }

    @Override // com.daaw.C9272wH, com.daaw.InterfaceC4346ej0
    /* JADX INFO: renamed from: i */
    public Set a(C2352Tm0 c2352Tm0, InterfaceC7689qe0 interfaceC7689qe0) {
        G10.g(c2352Tm0, "name");
        G10.g(interfaceC7689qe0, "location");
        throw new IllegalStateException(j() + ", required name: " + c2352Tm0);
    }

    @Override // com.daaw.C9272wH
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
