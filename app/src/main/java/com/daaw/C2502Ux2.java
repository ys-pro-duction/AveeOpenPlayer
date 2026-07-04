package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Ux2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2502Ux2 implements InterfaceC1343Jz2 {
    public final String a;
    public final boolean b;

    public C2502Ux2(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("gct", this.a);
        if (this.b) {
            bundle.putString("de", "1");
        }
    }
}
