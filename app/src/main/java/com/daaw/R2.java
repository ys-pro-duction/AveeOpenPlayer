package com.daaw;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class R2 {
    public static final R2 f = new R2(new long[0]);
    public final int a;
    public final long[] b;
    public final a[] c;
    public final long d;
    public final long e;

    public static final class a {
        public final int a;
        public final Uri[] b;
        public final int[] c;
        public final long[] d;

        public a() {
            this(-1, new int[0], new Uri[0], new long[0]);
        }

        public int a() {
            return b(-1);
        }

        public int b(int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.c;
                if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean c() {
            return this.a == -1 || a() < this.a;
        }

        public a(int i, int[] iArr, Uri[] uriArr, long[] jArr) {
            AbstractC7115ob.a(iArr.length == uriArr.length);
            this.a = i;
            this.c = iArr;
            this.b = uriArr;
            this.d = jArr;
        }
    }

    public R2(long... jArr) {
        int length = jArr.length;
        this.a = length;
        this.b = Arrays.copyOf(jArr, length);
        this.c = new a[length];
        for (int i = 0; i < length; i++) {
            this.c[i] = new a();
        }
        this.d = 0L;
        this.e = -9223372036854775807L;
    }

    public int a(long j) {
        int i = 0;
        while (true) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                break;
            }
            long j2 = jArr[i];
            if (j2 == Long.MIN_VALUE || (j < j2 && this.c[i].c())) {
                break;
            }
            i++;
        }
        if (i < this.b.length) {
            return i;
        }
        return -1;
    }

    public int b(long j) {
        int length = this.b.length - 1;
        while (length >= 0) {
            long j2 = this.b[length];
            if (j2 != Long.MIN_VALUE && j2 <= j) {
                break;
            }
            length--;
        }
        if (length < 0 || !this.c[length].c()) {
            return -1;
        }
        return length;
    }
}
