package com.daaw;

import java.io.PrintStream;

/* JADX INFO: renamed from: com.daaw.yr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C9992yr0 {
    public final b a;
    public final PrintStream b;

    /* JADX INFO: renamed from: com.daaw.yr0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.SYS_OUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.SYS_ERR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.CACHED_SYS_ERR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.CACHED_SYS_OUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.FILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.yr0$b */
    public enum b {
        SYS_OUT,
        CACHED_SYS_OUT,
        SYS_ERR,
        CACHED_SYS_ERR,
        FILE
    }

    public C9992yr0(b bVar) {
        if (bVar == b.FILE) {
            throw new IllegalArgumentException();
        }
        this.a = bVar;
        if (bVar == b.CACHED_SYS_OUT) {
            this.b = System.out;
        } else if (bVar == b.CACHED_SYS_ERR) {
            this.b = System.err;
        } else {
            this.b = null;
        }
    }

    public PrintStream a() {
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return System.out;
        }
        if (i == 2) {
            return System.err;
        }
        if (i == 3 || i == 4 || i == 5) {
            return this.b;
        }
        throw new IllegalArgumentException();
    }

    public C9992yr0(PrintStream printStream) {
        this.a = b.FILE;
        this.b = printStream;
    }
}
