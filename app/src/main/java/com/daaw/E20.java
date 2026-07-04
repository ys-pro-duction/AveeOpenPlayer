package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class E20 implements InterfaceC4077dl {
    public final InterfaceC8956v80 a;
    public final ZA b;

    public E20(InterfaceC8956v80 interfaceC8956v80, ZA za) {
        G10.g(interfaceC8956v80, "kotlinClassFinder");
        G10.g(za, "deserializedDescriptorResolver");
        this.a = interfaceC8956v80;
        this.b = za;
    }

    @Override // com.daaw.InterfaceC4077dl
    public C3798cl a(C6607ml c6607ml) {
        G10.g(c6607ml, "classId");
        InterfaceC10072z80 interfaceC10072z80A = AbstractC9235w80.a(this.a, c6607ml, CA.a(this.b.f().g()));
        if (interfaceC10072z80A == null) {
            return null;
        }
        G10.c(interfaceC10072z80A.e(), c6607ml);
        return this.b.l(interfaceC10072z80A);
    }
}
