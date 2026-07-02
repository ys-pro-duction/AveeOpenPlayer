package com.daaw;

import com.daaw.C2831Yc;

/* JADX INFO: renamed from: com.daaw.o00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6957o00 {

    /* JADX INFO: renamed from: com.daaw.o00$a */
    public static abstract class a {
        public abstract AbstractC6957o00 a();

        public abstract a b(AbstractC5294i41 abstractC5294i41);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* JADX INFO: renamed from: com.daaw.o00$b */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new C2831Yc.b();
    }

    public abstract AbstractC5294i41 b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
