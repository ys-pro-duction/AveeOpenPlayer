package com.daaw;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzt;

/* JADX INFO: renamed from: com.daaw.rR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7912rR1 implements InterfaceC9191vz1 {
    public final Context B;
    public final Object C;
    public final String D;
    public boolean E;

    public C7912rR1(Context context, String str) {
        this.B = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.D = str;
        this.E = false;
        this.C = new Object();
    }

    public final String a() {
        return this.D;
    }

    @Override // com.daaw.InterfaceC9191vz1
    public final void b0(C8912uz1 c8912uz1) {
        d(c8912uz1.j);
    }

    public final void d(boolean z) {
        if (zzt.zzn().z(this.B)) {
            synchronized (this.C) {
                try {
                    if (this.E == z) {
                        return;
                    }
                    this.E = z;
                    if (TextUtils.isEmpty(this.D)) {
                        return;
                    }
                    if (this.E) {
                        zzt.zzn().m(this.B, this.D);
                    } else {
                        zzt.zzn().n(this.B, this.D);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
