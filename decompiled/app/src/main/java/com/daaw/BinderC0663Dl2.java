package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Dl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC0663Dl2 extends ZW1 {
    public final M83 B;

    public BinderC0663Dl2(M83 m83) {
        this.B = m83;
    }

    @Override // com.daaw.FX1
    public final void P(String str, String str2, Bundle bundle, long j) {
        this.B.a(str, str2, bundle, j);
    }

    @Override // com.daaw.FX1
    public final int zzd() {
        return System.identityHashCode(this.B);
    }
}
