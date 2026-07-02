package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.q73, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7553q73 implements InterfaceC2850Yg2 {
    public final InterfaceC1483Li2 a;

    public C7553q73(InterfaceC1483Li2 interfaceC1483Li2) {
        this.a = interfaceC1483Li2;
    }

    @Override // com.daaw.InterfaceC1483Li2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Executor executor = AbstractC5295i42.b;
        AbstractC4911gi2.a(executor);
        return new DS2(executor);
    }
}
