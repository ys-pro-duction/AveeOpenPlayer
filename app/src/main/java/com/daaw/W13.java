package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class W13 implements NW2 {
    public InterfaceC3917d93 b;
    public String c;
    public boolean f;
    public final G83 a = new G83();
    public int d = 8000;
    public int e = 8000;

    public final W13 a(boolean z) {
        this.f = true;
        return this;
    }

    public final W13 b(int i) {
        this.d = i;
        return this;
    }

    public final W13 c(int i) {
        this.e = i;
        return this;
    }

    public final W13 d(InterfaceC3917d93 interfaceC3917d93) {
        this.b = interfaceC3917d93;
        return this;
    }

    public final W13 e(String str) {
        this.c = str;
        return this;
    }

    @Override // com.daaw.NW2
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final L43 zza() {
        L43 l43 = new L43(this.c, this.d, this.e, this.f, this.a);
        InterfaceC3917d93 interfaceC3917d93 = this.b;
        if (interfaceC3917d93 != null) {
            l43.k(interfaceC3917d93);
        }
        return l43;
    }
}
