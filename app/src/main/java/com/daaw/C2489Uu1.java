package com.daaw;

import java.io.Closeable;

/* JADX INFO: renamed from: com.daaw.Uu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2489Uu1 extends M73 implements Closeable, AutoCloseable {
    public static final T73 J = T73.b(C2489Uu1.class);

    public C2489Uu1(N73 n73, InterfaceC2385Tu1 interfaceC2385Tu1) {
        o(n73, n73.zzc(), interfaceC2385Tu1);
    }

    @Override // com.daaw.M73
    public final String toString() {
        String string = this.C.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.daaw.M73, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
