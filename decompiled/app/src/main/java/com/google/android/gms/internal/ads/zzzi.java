package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import com.daaw.AbstractC0999Gr2;
import com.daaw.AbstractC6048km2;
import com.daaw.Qt3;
import com.daaw.Rt3;

/* JADX INFO: loaded from: classes3.dex */
public final class zzzi extends Surface {
    public static int E;
    public static boolean F;
    public final boolean B;
    public final Qt3 C;
    public boolean D;

    public /* synthetic */ zzzi(Qt3 qt3, SurfaceTexture surfaceTexture, boolean z, Rt3 rt3) {
        super(surfaceTexture);
        this.C = qt3;
        this.B = z;
    }

    public static zzzi a(Context context, boolean z) {
        boolean z2 = true;
        if (z && !b(context)) {
            z2 = false;
        }
        AbstractC6048km2.f(z2);
        return new Qt3().a(z ? E : 0);
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!F) {
                E = AbstractC0999Gr2.c(context) ? AbstractC0999Gr2.d() ? 1 : 2 : 0;
                F = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return E != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.C) {
            try {
                if (!this.D) {
                    this.C.b();
                    this.D = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
