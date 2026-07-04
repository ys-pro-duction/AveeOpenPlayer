package com.daaw;

/* JADX INFO: renamed from: com.daaw.bL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3405bL {
    public static final a a = new a(null);
    public static final int b = c(0);
    public static final int c = c(1);
    public static final int d = c(2);
    public static final int e = c(3);

    /* JADX INFO: renamed from: com.daaw.bL$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final int a() {
            return AbstractC3405bL.c;
        }

        public final int b() {
            return AbstractC3405bL.b;
        }

        public a() {
        }
    }

    public static final boolean d(int i, int i2) {
        return i == i2;
    }

    public static String f(int i) {
        return d(i, b) ? "None" : d(i, c) ? "Low" : d(i, d) ? "Medium" : d(i, e) ? "High" : "Unknown";
    }

    public static int c(int i) {
        return i;
    }

    public static int e(int i) {
        return i;
    }
}
