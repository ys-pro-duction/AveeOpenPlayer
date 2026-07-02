package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Wv2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2702Wv2 implements InterfaceC1343Jz2 {
    public final boolean a;

    public C2702Wv2(boolean z) {
        this.a = z;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.a ? "0" : "1");
    }
}
