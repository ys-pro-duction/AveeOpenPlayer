package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Ga3 implements InterfaceC6576me3 {
    public final Ls3 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public int g;
    public boolean h;

    public Ga3() {
        Ls3 ls3 = new Ls3(true, 65536);
        d(2500, 0, "bufferForPlaybackMs", "0");
        d(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        d(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        d(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        d(50000, 50000, "maxBufferMs", "minBufferMs");
        d(0, 0, "backBufferDurationMs", "0");
        this.a = ls3;
        this.b = AbstractC9004vJ2.C(50000L);
        this.c = AbstractC9004vJ2.C(50000L);
        this.d = AbstractC9004vJ2.C(2500L);
        this.e = AbstractC9004vJ2.C(5000L);
        this.g = 13107200;
        this.f = AbstractC9004vJ2.C(0L);
    }

    public static void d(int i, int i2, String str, String str2) {
        AbstractC6048km2.e(i >= i2, str + " cannot be less than " + str2);
    }

    @Override // com.daaw.InterfaceC6576me3
    public final void a(AbstractC8657u52 abstractC8657u52, Vp3 vp3, Uf3[] uf3Arr, C6362lr3 c6362lr3, InterfaceC9442ws3[] interfaceC9442ws3Arr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = uf3Arr.length;
            if (i >= 2) {
                int iMax = Math.max(13107200, i2);
                this.g = iMax;
                this.a.f(iMax);
                return;
            } else {
                if (interfaceC9442ws3Arr[i] != null) {
                    i2 += uf3Arr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.daaw.InterfaceC6576me3
    public final boolean b(AbstractC8657u52 abstractC8657u52, Vp3 vp3, long j, float f, boolean z, long j2) {
        long jB = AbstractC9004vJ2.B(j, f);
        long jMin = z ? this.e : this.d;
        if (j2 != -9223372036854775807L) {
            jMin = Math.min(j2 / 2, jMin);
        }
        return jMin <= 0 || jB >= jMin || this.a.a() >= this.g;
    }

    @Override // com.daaw.InterfaceC6576me3
    public final boolean c(long j, long j2, float f) {
        int iA = this.a.a();
        int i = this.g;
        long jMin = this.b;
        if (f > 1.0f) {
            jMin = Math.min(AbstractC9004vJ2.A(jMin, f), this.c);
        }
        if (j2 < Math.max(jMin, 500000L)) {
            boolean z = iA < i;
            this.h = z;
            if (!z && j2 < 500000) {
                AbstractC3305ay2.f("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.c || iA >= i) {
            this.h = false;
        }
        return this.h;
    }

    public final void e(boolean z) {
        this.g = 13107200;
        this.h = false;
        if (z) {
            this.a.e();
        }
    }

    @Override // com.daaw.InterfaceC6576me3
    public final long zza() {
        return this.f;
    }

    @Override // com.daaw.InterfaceC6576me3
    public final void zzb() {
        e(false);
    }

    @Override // com.daaw.InterfaceC6576me3
    public final void zzc() {
        e(true);
    }

    @Override // com.daaw.InterfaceC6576me3
    public final void zzd() {
        e(true);
    }

    @Override // com.daaw.InterfaceC6576me3
    public final boolean zzf() {
        return false;
    }

    @Override // com.daaw.InterfaceC6576me3
    public final Ls3 zzi() {
        return this.a;
    }
}
