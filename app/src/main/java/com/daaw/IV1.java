package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class IV1 implements InterfaceC6576me3 {
    public final Ls3 a = new Ls3(true, 65536);
    public long b = 15000000;
    public long c = 30000000;
    public long d = 2500000;
    public long e = 5000000;
    public int f;
    public boolean g;

    @Override // com.daaw.InterfaceC6576me3
    public final /* synthetic */ void a(AbstractC8657u52 abstractC8657u52, Vp3 vp3, Uf3[] uf3Arr, C6362lr3 c6362lr3, InterfaceC9442ws3[] interfaceC9442ws3Arr) {
        int i = 0;
        this.f = 0;
        while (true) {
            int length = uf3Arr.length;
            if (i >= 2) {
                this.a.f(this.f);
                return;
            } else {
                if (interfaceC9442ws3Arr[i] != null) {
                    this.f += uf3Arr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.daaw.InterfaceC6576me3
    public final /* synthetic */ boolean b(AbstractC8657u52 abstractC8657u52, Vp3 vp3, long j, float f, boolean z, long j2) {
        long j3 = z ? this.e : this.d;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.daaw.InterfaceC6576me3
    public final boolean c(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.c ? (char) 0 : j2 < this.b ? (char) 2 : (char) 1;
        int iA = this.a.a();
        int i = this.f;
        if (c != 2 && (c != 1 || !this.g || iA >= i)) {
            z = false;
        }
        this.g = z;
        return z;
    }

    public final void d(boolean z) {
        this.f = 0;
        this.g = false;
        if (z) {
            this.a.e();
        }
    }

    public final synchronized void e(int i) {
        this.d = ((long) i) * 1000;
    }

    public final synchronized void f(int i) {
        this.e = ((long) i) * 1000;
    }

    public final synchronized void g(int i) {
        this.c = ((long) i) * 1000;
    }

    public final synchronized void h(int i) {
        this.b = ((long) i) * 1000;
    }

    @Override // com.daaw.InterfaceC6576me3
    public final long zza() {
        return 0L;
    }

    @Override // com.daaw.InterfaceC6576me3
    public final void zzb() {
        d(false);
    }

    @Override // com.daaw.InterfaceC6576me3
    public final void zzc() {
        d(true);
    }

    @Override // com.daaw.InterfaceC6576me3
    public final void zzd() {
        d(true);
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
