package com.daaw;

/* JADX INFO: renamed from: com.daaw.e83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4190e83 implements InterfaceC4758g83 {
    public InterfaceC8394t83 a;

    public static void a(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        C4190e83 c4190e83 = (C4190e83) interfaceC8394t83;
        if (c4190e83.a != null) {
            throw new IllegalStateException();
        }
        c4190e83.a = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final Object zzb() {
        InterfaceC8394t83 interfaceC8394t83 = this.a;
        if (interfaceC8394t83 != null) {
            return interfaceC8394t83.zzb();
        }
        throw new IllegalStateException();
    }
}
