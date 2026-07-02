package com.daaw;

import android.content.Context;
import java.io.File;

/* JADX INFO: renamed from: com.daaw.Pu1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1945Pu1 implements InterfaceC0906Fu1 {
    public File a = null;
    public final /* synthetic */ Context b;

    public C1945Pu1(Context context) {
        this.b = context;
    }

    @Override // com.daaw.InterfaceC0906Fu1
    public final File zza() {
        if (this.a == null) {
            this.a = new File(this.b.getCacheDir(), "volley");
        }
        return this.a;
    }
}
