package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Yx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2918Yx2 implements InterfaceC1343Jz2 {
    public final boolean a;

    public C2918Yx2(boolean z) {
        this.a = z;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putBoolean("is_gbid", this.a);
    }
}
