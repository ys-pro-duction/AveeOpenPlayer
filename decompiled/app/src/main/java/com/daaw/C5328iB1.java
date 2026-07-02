package com.daaw;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzaxh;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: com.daaw.iB1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5328iB1 {
    public YA1 a;
    public boolean b;
    public final Context c;
    public final Object d = new Object();

    public C5328iB1(Context context) {
        this.c = context;
    }

    public static /* bridge */ /* synthetic */ void e(C5328iB1 c5328iB1) {
        synchronized (c5328iB1.d) {
            try {
                YA1 ya1 = c5328iB1.a;
                if (ya1 == null) {
                    return;
                }
                ya1.disconnect();
                c5328iB1.a = null;
                Binder.flushPendingCommands();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Future c(zzaxh zzaxhVar) {
        C3645cB1 c3645cB1 = new C3645cB1(this);
        C4770gB1 c4770gB1 = new C4770gB1(this, zzaxhVar, c3645cB1);
        C5049hB1 c5049hB1 = new C5049hB1(this, c3645cB1);
        synchronized (this.d) {
            YA1 ya1 = new YA1(this.c, zzt.zzt().zzb(), c4770gB1, c5049hB1);
            this.a = ya1;
            ya1.checkAvailabilityAndConnect();
        }
        return c3645cB1;
    }
}
