package com.google.android.gms.ads.internal.util;

import android.os.Looper;
import android.os.Message;
import com.daaw.HandlerC8451tM2;

/* JADX INFO: loaded from: classes.dex */
public final class zzf extends HandlerC8451tM2 {
    public zzf(Looper looper) {
        super(looper);
    }

    @Override // com.daaw.HandlerC8451tM2
    public final void a(Message message) {
        try {
            super.a(message);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzt.zzp();
            zzt.zzL(com.google.android.gms.ads.internal.zzt.zzo().c(), th);
            throw th;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            super.handleMessage(message);
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzo().u(e, "AdMobHandler.handleMessage");
        }
    }
}
