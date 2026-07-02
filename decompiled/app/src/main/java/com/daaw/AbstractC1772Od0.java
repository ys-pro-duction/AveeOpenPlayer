package com.daaw;

/* JADX INFO: renamed from: com.daaw.Od0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1772Od0 {
    public static AbstractC1772Od0 a = null;
    public static final int b = 20;

    /* JADX INFO: renamed from: com.daaw.Od0$a */
    public static class a extends AbstractC1772Od0 {
        public int c;

        public a(int i) {
            super(i);
            this.c = i;
        }

        @Override // com.daaw.AbstractC1772Od0
        public void a(String str, String str2, Throwable... thArr) {
            if (this.c > 3 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.AbstractC1772Od0
        public void b(String str, String str2, Throwable... thArr) {
            if (this.c > 6 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.AbstractC1772Od0
        public void d(String str, String str2, Throwable... thArr) {
            if (this.c > 4 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.AbstractC1772Od0
        public void g(String str, String str2, Throwable... thArr) {
            if (this.c > 2 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }

        @Override // com.daaw.AbstractC1772Od0
        public void h(String str, String str2, Throwable... thArr) {
            if (this.c > 5 || thArr == null || thArr.length < 1) {
                return;
            }
            Throwable th = thArr[0];
        }
    }

    public AbstractC1772Od0(int i) {
    }

    public static synchronized AbstractC1772Od0 c() {
        try {
            if (a == null) {
                a = new a(3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a;
    }

    public static synchronized void e(AbstractC1772Od0 abstractC1772Od0) {
        a = abstractC1772Od0;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        int i = b;
        if (length >= i) {
            sb.append(str.substring(0, i));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public abstract void g(String str, String str2, Throwable... thArr);

    public abstract void h(String str, String str2, Throwable... thArr);
}
