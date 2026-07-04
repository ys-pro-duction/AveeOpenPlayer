package com.daaw;

import java.util.Set;

/* JADX INFO: renamed from: com.daaw.Ec2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0731Ec2 implements InterfaceC4758g83 {
    public final C8517tc2 a;
    public final InterfaceC8394t83 b;

    public C0731Ec2(C8517tc2 c8517tc2, InterfaceC8394t83 interfaceC8394t83) {
        this.a = c8517tc2;
        this.b = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setF = this.a.f((C5305i62) this.b.zzb());
        AbstractC7000o83.b(setF);
        return setF;
    }
}
