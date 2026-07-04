package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Ma3 implements Ae3 {
    public final C5459ig3 a;
    public final Ja3 b;
    public Uf3 c;
    public Ae3 d;
    public boolean e = true;
    public boolean f;

    public Ma3(Ja3 ja3, InterfaceC1810Om2 interfaceC1810Om2) {
        this.b = ja3;
        this.a = new C5459ig3(interfaceC1810Om2);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(boolean r6) {
        /*
            r5 = this;
            com.daaw.Uf3 r0 = r5.c
            if (r0 == 0) goto L66
            boolean r0 = r0.i()
            if (r0 != 0) goto L66
            com.daaw.Uf3 r0 = r5.c
            boolean r0 = r0.u()
            if (r0 != 0) goto L1d
            if (r6 != 0) goto L66
            com.daaw.Uf3 r6 = r5.c
            boolean r6 = r6.zzN()
            if (r6 == 0) goto L1d
            goto L66
        L1d:
            com.daaw.Ae3 r6 = r5.d
            r6.getClass()
            long r0 = r6.zza()
            boolean r2 = r5.e
            if (r2 == 0) goto L46
            com.daaw.ig3 r2 = r5.a
            long r2 = r2.zza()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L3a
            com.daaw.ig3 r6 = r5.a
            r6.c()
            goto L72
        L3a:
            r2 = 0
            r5.e = r2
            boolean r2 = r5.f
            if (r2 == 0) goto L46
            com.daaw.ig3 r2 = r5.a
            r2.b()
        L46:
            com.daaw.ig3 r2 = r5.a
            r2.a(r0)
            com.daaw.pW1 r6 = r6.zzc()
            com.daaw.ig3 r0 = r5.a
            com.daaw.pW1 r0 = r0.zzc()
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L72
            com.daaw.ig3 r0 = r5.a
            r0.d(r6)
            com.daaw.Ja3 r0 = r5.b
            r0.a(r6)
            goto L72
        L66:
            r6 = 1
            r5.e = r6
            boolean r6 = r5.f
            if (r6 == 0) goto L72
            com.daaw.ig3 r6 = r5.a
            r6.b()
        L72:
            boolean r6 = r5.e
            if (r6 == 0) goto L7d
            com.daaw.ig3 r6 = r5.a
            long r0 = r6.zza()
            return r0
        L7d:
            com.daaw.Ae3 r6 = r5.d
            r6.getClass()
            long r0 = r6.zza()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Ma3.a(boolean):long");
    }

    public final void b(Uf3 uf3) {
        if (uf3 == this.c) {
            this.d = null;
            this.c = null;
            this.e = true;
        }
    }

    public final void c(Uf3 uf3) throws Sa3 {
        Ae3 ae3;
        Ae3 ae3Zzk = uf3.zzk();
        if (ae3Zzk == null || ae3Zzk == (ae3 = this.d)) {
            return;
        }
        if (ae3 != null) {
            throw Sa3.d(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = ae3Zzk;
        this.c = uf3;
        ae3Zzk.d(this.a.zzc());
    }

    @Override // com.daaw.Ae3
    public final void d(C7375pW1 c7375pW1) {
        Ae3 ae3 = this.d;
        if (ae3 != null) {
            ae3.d(c7375pW1);
            c7375pW1 = this.d.zzc();
        }
        this.a.d(c7375pW1);
    }

    public final void e(long j) {
        this.a.a(j);
    }

    public final void f() {
        this.f = true;
        this.a.b();
    }

    public final void g() {
        this.f = false;
        this.a.c();
    }

    @Override // com.daaw.Ae3
    public final long zza() {
        throw null;
    }

    @Override // com.daaw.Ae3
    public final C7375pW1 zzc() {
        Ae3 ae3 = this.d;
        return ae3 != null ? ae3.zzc() : this.a.zzc();
    }
}
