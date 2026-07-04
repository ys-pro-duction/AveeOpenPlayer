package com.daaw;

import com.google.android.gms.ads.AdRequest;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.ox0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7223ox0 {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final boolean g;
    public final int h;
    public final long i;
    public List j;
    public C8031rr k;

    public /* synthetic */ C7223ox0(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    public static /* synthetic */ C7223ox0 c(C7223ox0 c7223ox0, long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6, int i2, Object obj) {
        long j7;
        long j8 = (i2 & 1) != 0 ? c7223ox0.a : j;
        long j9 = (i2 & 2) != 0 ? c7223ox0.b : j2;
        long j10 = (i2 & 4) != 0 ? c7223ox0.c : j3;
        boolean z3 = (i2 & 8) != 0 ? c7223ox0.d : z;
        long j11 = (i2 & 16) != 0 ? c7223ox0.e : j4;
        long j12 = (i2 & 32) != 0 ? c7223ox0.f : j5;
        boolean z4 = (i2 & 64) != 0 ? c7223ox0.g : z2;
        int i3 = (i2 & 128) != 0 ? c7223ox0.h : i;
        if ((i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            j7 = c7223ox0.i;
            j8 = j8;
        } else {
            j7 = j6;
        }
        return c7223ox0.b(j8, j9, j10, z3, j11, j12, z4, i3, list, j7);
    }

    public final void a() {
        this.k.c(true);
        this.k.d(true);
    }

    public final C7223ox0 b(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, List list, long j6) {
        G10.g(list, "historical");
        C7223ox0 c7223ox0 = new C7223ox0(j, j2, j3, z, j4, j5, z2, false, i, list, j6, (AbstractC2911Yw) null);
        c7223ox0.k = this.k;
        return c7223ox0;
    }

    public final List d() {
        List list = this.j;
        return list == null ? AbstractC1599Mm.k() : list;
    }

    public final long e() {
        return this.a;
    }

    public final long f() {
        return this.c;
    }

    public final boolean g() {
        return this.d;
    }

    public final long h() {
        return this.f;
    }

    public final boolean i() {
        return this.g;
    }

    public final int j() {
        return this.h;
    }

    public final long k() {
        return this.b;
    }

    public final boolean l() {
        return this.k.a() || this.k.b();
    }

    public String toString() {
        return "PointerInputChange(id=" + ((Object) C6944nx0.f(this.a)) + ", uptimeMillis=" + this.b + ", position=" + ((Object) C9982yp0.s(this.c)) + ", pressed=" + this.d + ", previousUptimeMillis=" + this.e + ", previousPosition=" + ((Object) C9982yp0.s(this.f)) + ", previousPressed=" + this.g + ", isConsumed=" + l() + ", type=" + ((Object) AbstractC10298zx0.i(this.h)) + ", historical=" + d() + ",scrollDelta=" + ((Object) C9982yp0.s(this.i)) + ')';
    }

    public /* synthetic */ C7223ox0(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, list, j6);
    }

    public C7223ox0(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = z2;
        this.h = i;
        this.i = j6;
        this.k = new C8031rr(z3, z3);
    }

    public /* synthetic */ C7223ox0(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, AbstractC2911Yw abstractC2911Yw) {
        this(j, j2, j3, z, j4, j5, z2, z3, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? AbstractC10298zx0.a.d() : i, (i2 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? C9982yp0.b.c() : j6, (AbstractC2911Yw) null);
    }

    public C7223ox0(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6, (AbstractC2911Yw) null);
        this.j = list;
    }
}
