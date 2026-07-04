package com.daaw;

import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.TrackGroup;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1360Ke implements com.google.android.exoplayer2.trackselection.c {
    public final TrackGroup a;
    public final int b;
    public final int[] c;
    public final Format[] d;
    public final long[] e;
    public int f;

    /* JADX INFO: renamed from: com.daaw.Ke$b */
    public static final class b implements Comparator {
        public b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Format format, Format format2) {
            return format2.C - format.C;
        }
    }

    public AbstractC1360Ke(TrackGroup trackGroup, int... iArr) {
        int i = 0;
        AbstractC7115ob.f(iArr.length > 0);
        this.a = (TrackGroup) AbstractC7115ob.e(trackGroup);
        int length = iArr.length;
        this.b = length;
        this.d = new Format[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = trackGroup.a(iArr[i2]);
        }
        Arrays.sort(this.d, new b());
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = trackGroup.b(this.d[i]);
                i++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final TrackGroup a() {
        return this.a;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final boolean c(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zQ = q(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zQ) {
            zQ = (i2 == i || q(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zQ) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], jElapsedRealtime + j);
        return true;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final Format d(int i) {
        return this.d[i];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            AbstractC1360Ke abstractC1360Ke = (AbstractC1360Ke) obj;
            if (this.a == abstractC1360Ke.a && Arrays.equals(this.c, abstractC1360Ke.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int g(int i) {
        return this.c[i];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public int h(long j, List list) {
        return list.size();
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = (System.identityHashCode(this.a) * 31) + Arrays.hashCode(this.c);
        }
        return this.f;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int i(Format format) {
        for (int i = 0; i < this.b; i++) {
            if (this.d[i] == format) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int j() {
        return this.c[b()];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final Format k() {
        return this.d[b()];
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int length() {
        return this.c.length;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public final int p(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public final boolean q(int i, long j) {
        return this.e[i] > j;
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void e() {
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void f() {
    }

    @Override // com.google.android.exoplayer2.trackselection.c
    public void m(float f) {
    }
}
