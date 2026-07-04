package com.daaw;

import android.app.Application;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Xw1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2809Xw1 implements InterfaceC2850Yg2 {
    public final InterfaceC1483Li2 a;
    public final InterfaceC1483Li2 b;
    public final InterfaceC1483Li2 c;

    public C2809Xw1(InterfaceC1483Li2 interfaceC1483Li2, InterfaceC1483Li2 interfaceC1483Li22, InterfaceC1483Li2 interfaceC1483Li23) {
        this.a = interfaceC1483Li2;
        this.b = interfaceC1483Li22;
        this.c = interfaceC1483Li23;
    }

    @Override // com.daaw.InterfaceC1483Li2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8056rw1 zzb() {
        Application application = (Application) this.a.zzb();
        C0814Ex1 c0814Ex1 = (C0814Ex1) this.b.zzb();
        Executor executor = AbstractC5295i42.b;
        AbstractC4911gi2.a(executor);
        return new C8056rw1(application, c0814Ex1, executor);
    }
}
