package com.daaw;

/* JADX INFO: renamed from: com.daaw.uk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8833uk {

    /* JADX INFO: renamed from: com.daaw.uk$a */
    public static abstract class a extends AbstractC8833uk {
    }

    /* JADX INFO: renamed from: com.daaw.uk$b */
    public static final class b extends a {
        public final char a;

        public b(char c) {
            this.a = c;
        }

        public String toString() {
            String strD = AbstractC8833uk.d(this.a);
            StringBuilder sb = new StringBuilder(String.valueOf(strD).length() + 18);
            sb.append("CharMatcher.is('");
            sb.append(strD);
            sb.append("')");
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: com.daaw.uk$c */
    public static abstract class c extends a {
        public final String a;

        public c(String str) {
            this.a = (String) AbstractC7785qy0.n(str);
        }

        public final String toString() {
            return this.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.uk$d */
    public static final class d extends c {
        public static final d b = new d();

        public d() {
            super("CharMatcher.none()");
        }
    }

    /* JADX INFO: renamed from: com.daaw.uk$e */
    public static final class e extends c {
        public static final int b = Integer.numberOfLeadingZeros(31);
        public static final e c = new e();

        public e() {
            super("CharMatcher.whitespace()");
        }
    }

    public static AbstractC8833uk b(char c2) {
        return new b(c2);
    }

    public static AbstractC8833uk c() {
        return d.b;
    }

    public static String d(char c2) {
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c2 & 15);
            c2 = (char) (c2 >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public static AbstractC8833uk e() {
        return e.c;
    }
}
