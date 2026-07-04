package com.daaw;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.fN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4539fN1 implements InterfaceC2850Yg2 {
    public final InterfaceC1483Li2 a;
    public final InterfaceC1483Li2 b;

    public C4539fN1(InterfaceC1483Li2 interfaceC1483Li2, InterfaceC1483Li2 interfaceC1483Li22) {
        this.a = interfaceC1483Li2;
        this.b = interfaceC1483Li22;
    }

    @Override // com.daaw.InterfaceC1483Li2
    public final /* synthetic */ Object zzb() {
        InterfaceC1483Li2 interfaceC1483Li2 = this.a;
        Executor executor = AbstractC5295i42.b;
        AbstractC4911gi2.a(executor);
        return new C10131zM1(interfaceC1483Li2, executor);
    }
}
