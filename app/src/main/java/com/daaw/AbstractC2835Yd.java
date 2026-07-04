package com.daaw;

/* JADX INFO: renamed from: com.daaw.Yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2835Yd {

    /* JADX INFO: renamed from: com.daaw.Yd$a */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static AbstractC2835Yd a() {
        return new C6841nc(a.FATAL_ERROR, -1L);
    }

    public static AbstractC2835Yd d() {
        return new C6841nc(a.INVALID_PAYLOAD, -1L);
    }

    public static AbstractC2835Yd e(long j) {
        return new C6841nc(a.OK, j);
    }

    public static AbstractC2835Yd f() {
        return new C6841nc(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}
