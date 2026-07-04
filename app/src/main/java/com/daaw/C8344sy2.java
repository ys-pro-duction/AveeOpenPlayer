package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.sy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8344sy2 implements InterfaceC1343Jz2 {
    public final C4219eF2 a;

    public C8344sy2(C4219eF2 c4219eF2) {
        this.a = c4219eF2;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        C4219eF2 c4219eF2 = this.a;
        Bundle bundle = (Bundle) obj;
        if (c4219eF2 != null) {
            bundle.putBoolean("render_in_browser", c4219eF2.d());
            bundle.putBoolean("disable_ml", this.a.c());
        }
    }
}
