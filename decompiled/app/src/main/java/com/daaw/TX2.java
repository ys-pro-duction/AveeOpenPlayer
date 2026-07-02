package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class TX2 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ K43 d;

    public TX2(K43 k43, String str, String str2, String str3) {
        this.d = k43;
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.d.B.b();
        return this.d.B.V().a0(this.a, this.b, this.c);
    }
}
