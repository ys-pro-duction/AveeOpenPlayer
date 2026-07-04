package com.daaw;

import android.os.Bundle;

/* JADX INFO: renamed from: com.daaw.Uk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2450Uk2 implements InterfaceC7676qb2 {
    public final Bundle B = new Bundle();

    @Override // com.daaw.InterfaceC7676qb2
    public final synchronized void a(String str, String str2) {
        this.B.putInt(str, 3);
    }

    public final synchronized Bundle b() {
        return new Bundle(this.B);
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final synchronized void l(String str) {
        this.B.putInt(str, 2);
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final synchronized void o(String str) {
        this.B.putInt(str, 1);
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final void zze() {
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final void zzf() {
    }

    @Override // com.daaw.InterfaceC7676qb2
    public final void zza(String str) {
    }
}
