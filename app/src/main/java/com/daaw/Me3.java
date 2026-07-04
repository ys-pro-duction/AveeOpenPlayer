package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Me3 implements InterfaceC8968vA2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ C8812uf3 b;

    public Me3(C8812uf3 c8812uf3, String str) {
        this.b = c8812uf3;
        this.a = str;
    }

    @Override // com.daaw.InterfaceC8968vA2
    public final void a(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.b.l(i, th, bArr, this.a);
    }
}
