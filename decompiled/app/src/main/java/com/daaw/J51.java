package com.daaw;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class J51 implements I51 {
    public final Set a;
    public final H51 b;
    public final N51 c;

    public J51(Set set, H51 h51, N51 n51) {
        this.a = set;
        this.b = h51;
        this.c = n51;
    }

    @Override // com.daaw.I51
    public F51 a(String str, Class cls, EG eg, InterfaceC7819r51 interfaceC7819r51) {
        if (this.a.contains(eg)) {
            return new M51(this.b, str, eg, interfaceC7819r51, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", eg, this.a));
    }
}
