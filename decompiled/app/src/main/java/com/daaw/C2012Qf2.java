package com.daaw;

/* JADX INFO: renamed from: com.daaw.Qf2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2012Qf2 implements InterfaceC2850Yg2 {
    public InterfaceC1483Li2 a;

    public static void a(InterfaceC1483Li2 interfaceC1483Li2, InterfaceC1483Li2 interfaceC1483Li22) {
        C2012Qf2 c2012Qf2 = (C2012Qf2) interfaceC1483Li2;
        if (c2012Qf2.a != null) {
            throw new IllegalStateException();
        }
        c2012Qf2.a = interfaceC1483Li22;
    }

    @Override // com.daaw.InterfaceC1483Li2
    public final Object zzb() {
        InterfaceC1483Li2 interfaceC1483Li2 = this.a;
        if (interfaceC1483Li2 != null) {
            return interfaceC1483Li2.zzb();
        }
        throw new IllegalStateException();
    }
}
