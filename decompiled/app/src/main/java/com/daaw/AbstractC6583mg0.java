package com.daaw;

/* JADX INFO: renamed from: com.daaw.mg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6583mg0 {

    /* JADX INFO: renamed from: com.daaw.mg0$a */
    public static final class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public static AbstractC6583mg0 d() {
        AbstractC6583mg0 abstractC6583mg0D = C6862ng0.b().d();
        if (abstractC6583mg0D != null) {
            return abstractC6583mg0D;
        }
        throw new a("No functional channel service provider found. Try adding a dependency on the grpc-okhttp, grpc-netty, or grpc-netty-shaded artifact");
    }

    public abstract AbstractC5456ig0 a(String str);

    public abstract boolean b();

    public abstract int c();
}
