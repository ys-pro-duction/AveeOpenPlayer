package com.daaw;

/* JADX INFO: renamed from: com.daaw.Sd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2212Sd0 {
    public static b a = b.WARN;

    /* JADX INFO: renamed from: com.daaw.Sd0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.Sd0$b */
    public enum b {
        DEBUG,
        WARN,
        NONE
    }

    public static void a(String str, String str2, Object... objArr) {
        b(b.DEBUG, str, str2, objArr);
    }

    public static void b(b bVar, String str, String str2, Object... objArr) {
        if (bVar.ordinal() >= a.ordinal()) {
            String.format("(%s) [%s]: ", "24.6.1", str);
            String.format(str2, objArr);
            if (a.a[bVar.ordinal()] == 3) {
                throw new IllegalStateException("Trying to log something on level NONE");
            }
        }
    }

    public static boolean c() {
        return a.ordinal() >= b.DEBUG.ordinal();
    }

    public static void d(String str, String str2, Object... objArr) {
        b(b.WARN, str, str2, objArr);
    }
}
