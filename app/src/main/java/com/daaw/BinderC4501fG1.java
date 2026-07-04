package com.daaw;

import android.graphics.drawable.Drawable;
import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.fG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC4501fG1 extends AbstractBinderC7868rG1 {
    public final Drawable B;
    public final Uri C;
    public final double D;
    public final int E;
    public final int F;

    public BinderC4501fG1(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.B = drawable;
        this.C = uri;
        this.D = d;
        this.E = i;
        this.F = i2;
    }

    @Override // com.daaw.InterfaceC8147sG1
    public final double zzb() {
        return this.D;
    }

    @Override // com.daaw.InterfaceC8147sG1
    public final int zzc() {
        return this.F;
    }

    @Override // com.daaw.InterfaceC8147sG1
    public final int zzd() {
        return this.E;
    }

    @Override // com.daaw.InterfaceC8147sG1
    public final Uri zze() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC8147sG1
    public final InterfaceC7934rX zzf() {
        return BinderC7744qp0.Z2(this.B);
    }
}
