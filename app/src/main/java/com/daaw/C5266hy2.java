package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.hy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5266hy2 implements InterfaceC1343Jz2 {
    public final Boolean a;

    public C5266hy2(Boolean bool) {
        this.a = bool;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Boolean bool = this.a;
        Bundle bundle = (Bundle) obj;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
