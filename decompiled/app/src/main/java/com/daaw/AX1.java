package com.daaw;

import android.content.Context;
import com.google.android.gms.internal.ads.zzcaz;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class AX1 {
    public zzcaz a;
    public Context b;
    public WeakReference c;

    public final AX1 c(Context context) {
        this.c = new WeakReference(context);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.b = context;
        return this;
    }

    public final AX1 d(zzcaz zzcazVar) {
        this.a = zzcazVar;
        return this;
    }
}
