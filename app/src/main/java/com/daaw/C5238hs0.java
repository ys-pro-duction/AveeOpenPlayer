package com.daaw;

/* JADX INFO: renamed from: com.daaw.hs0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5238hs0 implements InterfaceC2967Zk {
    public final Class B;
    public final String C;

    public C5238hs0(Class cls, String str) {
        G10.g(cls, "jClass");
        G10.g(str, "moduleName");
        this.B = cls;
        this.C = str;
    }

    @Override // com.daaw.InterfaceC2967Zk
    public Class b() {
        return this.B;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5238hs0) && G10.c(b(), ((C5238hs0) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
