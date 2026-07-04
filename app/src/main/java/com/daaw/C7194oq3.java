package com.daaw;

/* JADX INFO: renamed from: com.daaw.oq3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7194oq3 implements InterfaceC9442ws3 {
    public final InterfaceC9442ws3 a;
    public final A62 b;

    public C7194oq3(InterfaceC9442ws3 interfaceC9442ws3, A62 a62) {
        this.a = interfaceC9442ws3;
        this.b = a62;
    }

    @Override // com.daaw.As3
    public final int c(int i) {
        return this.a.c(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7194oq3)) {
            return false;
        }
        C7194oq3 c7194oq3 = (C7194oq3) obj;
        return this.a.equals(c7194oq3.a) && this.b.equals(c7194oq3.b);
    }

    @Override // com.daaw.As3
    public final C2485Ut1 f(int i) {
        return this.a.f(i);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + this.a.hashCode();
    }

    @Override // com.daaw.As3
    public final int zzb(int i) {
        return this.a.zzb(i);
    }

    @Override // com.daaw.As3
    public final int zzc() {
        return this.a.zzc();
    }

    @Override // com.daaw.As3
    public final A62 zze() {
        return this.b;
    }
}
