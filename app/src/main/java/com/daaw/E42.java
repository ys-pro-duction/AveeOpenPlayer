package com.daaw;

import com.google.android.gms.ads.internal.overlay.zzo;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class E42 implements zzo {
    public final C72 B;
    public final AtomicBoolean C = new AtomicBoolean(false);
    public final AtomicBoolean D = new AtomicBoolean(false);

    public E42(C72 c72) {
        this.B = c72;
    }

    private final void b() {
        if (this.D.get()) {
            return;
        }
        this.D.set(true);
        this.B.zza();
    }

    public final boolean a() {
        return this.C.get();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbu() {
        b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbv() {
        this.B.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzby(int i) {
        this.C.set(true);
        b();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbL() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzo
    public final void zzbx() {
    }
}
