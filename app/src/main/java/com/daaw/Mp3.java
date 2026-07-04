package com.daaw;

import android.net.Uri;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public final class Mp3 {
    public static final AtomicLong d = new AtomicLong();
    public final C5835k03 a;
    public final Uri b;
    public final Map c;

    public Mp3(long j, C5835k03 c5835k03, Uri uri, Map map, long j2, long j3, long j4) {
        this.a = c5835k03;
        this.b = uri;
        this.c = map;
    }

    public static long a() {
        return d.getAndIncrement();
    }
}
