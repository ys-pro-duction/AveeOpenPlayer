package com.daaw;

import com.daaw.C8240sd;

/* JADX INFO: renamed from: com.daaw.i41, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5294i41 {

    /* JADX INFO: renamed from: com.daaw.i41$a */
    public static abstract class a {
        public abstract AbstractC5294i41 a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j);
    }

    /* JADX INFO: renamed from: com.daaw.i41$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new C8240sd.b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
