package com.daaw;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.cZ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3742cZ2 {
    public Uri a;
    public Map b = Collections.EMPTY_MAP;
    public long c;
    public int d;

    public final C3742cZ2 a(int i) {
        this.d = 6;
        return this;
    }

    public final C3742cZ2 b(Map map) {
        this.b = map;
        return this;
    }

    public final C3742cZ2 c(long j) {
        this.c = j;
        return this;
    }

    public final C3742cZ2 d(Uri uri) {
        this.a = uri;
        return this;
    }

    public final C5835k03 e() {
        if (this.a != null) {
            return new C5835k03(this.a, this.b, this.c, this.d);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
