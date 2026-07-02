package com.daaw;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.pA2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7288pA2 implements InterfaceC1447Kz2 {
    public final Executor a;
    public final String b;
    public final PackageInfo c;
    public final C5396iS1 d;

    public C7288pA2(C5396iS1 c5396iS1, Executor executor, String str, PackageInfo packageInfo, int i) {
        this.d = c5396iS1;
        this.a = executor;
        this.b = str;
        this.c = packageInfo;
    }

    public final /* synthetic */ InterfaceFutureC8236sc0 a(Throwable th) {
        return AbstractC7360pS2.h(new C7567qA2(this.b));
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final int zza() {
        return 41;
    }

    @Override // com.daaw.InterfaceC1447Kz2
    public final InterfaceFutureC8236sc0 zzb() {
        return AbstractC7360pS2.f(AbstractC7360pS2.m(AbstractC7360pS2.h(this.b), new WN2() { // from class: com.daaw.nA2
            @Override // com.daaw.WN2
            public final Object apply(Object obj) {
                return new C7567qA2((String) obj);
            }
        }, this.a), Throwable.class, new WR2() { // from class: com.daaw.oA2
            @Override // com.daaw.WR2
            public final InterfaceFutureC8236sc0 zza(Object obj) {
                return this.a.a((Throwable) obj);
            }
        }, this.a);
    }
}
