package com.daaw;

/* JADX INFO: renamed from: com.daaw.sK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8161sK {
    public final C6488mK a;
    public final InterfaceC6146l51 b;

    public C8161sK(C6488mK c6488mK, InterfaceC6146l51 interfaceC6146l51) {
        this.a = c6488mK;
        this.b = interfaceC6146l51;
    }

    public C6488mK a() {
        return this.a;
    }

    public InterfaceC6146l51 b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8161sK.class != obj.getClass()) {
            return false;
        }
        C8161sK c8161sK = (C8161sK) obj;
        if (this.a.equals(c8161sK.a)) {
            return this.b.equals(c8161sK.b);
        }
        return false;
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
