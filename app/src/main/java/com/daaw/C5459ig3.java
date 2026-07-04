package com.daaw;

import android.os.SystemClock;

/* JADX INFO: renamed from: com.daaw.ig3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5459ig3 implements Ae3 {
    public final InterfaceC1810Om2 a;
    public boolean b;
    public long c;
    public long d;
    public C7375pW1 e = C7375pW1.d;

    public C5459ig3(InterfaceC1810Om2 interfaceC1810Om2) {
        this.a = interfaceC1810Om2;
    }

    public final void a(long j) {
        this.c = j;
        if (this.b) {
            this.d = SystemClock.elapsedRealtime();
        }
    }

    public final void b() {
        if (this.b) {
            return;
        }
        this.d = SystemClock.elapsedRealtime();
        this.b = true;
    }

    public final void c() {
        if (this.b) {
            a(zza());
            this.b = false;
        }
    }

    @Override // com.daaw.Ae3
    public final void d(C7375pW1 c7375pW1) {
        if (this.b) {
            a(zza());
        }
        this.e = c7375pW1;
    }

    @Override // com.daaw.Ae3
    public final long zza() {
        long j = this.c;
        if (!this.b) {
            return j;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.d;
        C7375pW1 c7375pW1 = this.e;
        return j + (c7375pW1.a == 1.0f ? AbstractC9004vJ2.C(jElapsedRealtime) : c7375pW1.a(jElapsedRealtime));
    }

    @Override // com.daaw.Ae3
    public final C7375pW1 zzc() {
        return this.e;
    }
}
