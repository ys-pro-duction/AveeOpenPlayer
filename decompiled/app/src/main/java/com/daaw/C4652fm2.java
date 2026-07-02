package com.daaw;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* JADX INFO: renamed from: com.daaw.fm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4652fm2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;

    public C4652fm2(InterfaceC8394t83 interfaceC8394t83) {
        this.a = interfaceC8394t83;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.a.zzb()).getApplicationInfo();
        AbstractC7000o83.b(applicationInfo);
        return applicationInfo;
    }
}
