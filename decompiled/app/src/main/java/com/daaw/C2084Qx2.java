package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Qx2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2084Qx2 implements InterfaceC1343Jz2 {
    public final Bundle a;

    public C2084Qx2(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((Bundle) obj).putBundle("content_info", this.a);
    }
}
