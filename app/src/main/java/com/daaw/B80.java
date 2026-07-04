package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class B80 implements WA {
    public final InterfaceC10072z80 b;
    public final C4864gZ c;
    public final boolean d;
    public final VA e;

    public B80(InterfaceC10072z80 interfaceC10072z80, C4864gZ c4864gZ, boolean z, VA va) {
        G10.g(interfaceC10072z80, "binaryClass");
        G10.g(va, "abiStability");
        this.b = interfaceC10072z80;
        this.c = c4864gZ;
        this.d = z;
        this.e = va;
    }

    @Override // com.daaw.RU0
    public SU0 a() {
        SU0 su0 = SU0.a;
        G10.f(su0, "NO_SOURCE_FILE");
        return su0;
    }

    @Override // com.daaw.WA
    public String c() {
        return "Class '" + this.b.e().a().b() + '\'';
    }

    public final InterfaceC10072z80 d() {
        return this.b;
    }

    public String toString() {
        return B80.class.getSimpleName() + ": " + this.b;
    }
}
