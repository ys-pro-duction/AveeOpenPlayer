package com.google.android.gms.ads.internal.util;

import android.graphics.Bitmap;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class zzby {
    public final Map a = new ConcurrentHashMap();
    public final AtomicInteger b = new AtomicInteger(0);

    public final Bitmap zza(Integer num) {
        return (Bitmap) this.a.get(num);
    }
}
