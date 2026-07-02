package com.daaw;

import android.view.View;
import com.google.android.gms.ads.internal.zzf;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.mu2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6655mu2 implements zzf {
    public final P62 a;
    public final C6715n72 b;
    public final C2204Sb2 c;
    public final C0831Fb2 d;
    public final C6690n22 e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public C6655mu2(P62 p62, C6715n72 c6715n72, C2204Sb2 c2204Sb2, C0831Fb2 c0831Fb2, C6690n22 c6690n22) {
        this.a = p62;
        this.b = c6715n72;
        this.c = c2204Sb2;
        this.d = c0831Fb2;
        this.e = c6690n22;
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final synchronized void zza(View view) {
        if (this.f.compareAndSet(false, true)) {
            this.e.zzq();
            this.d.B0(view);
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzb() {
        if (this.f.get()) {
            this.a.onAdClicked();
        }
    }

    @Override // com.google.android.gms.ads.internal.zzf
    public final void zzc() {
        if (this.f.get()) {
            this.b.zza();
            this.c.zza();
        }
    }
}
