package com.daaw;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: renamed from: com.daaw.ix2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5539ix2 implements InterfaceC1343Jz2 {
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final float i;
    public final boolean j;

    public C5539ix2(int i, boolean z, boolean z2, int i2, int i3, int i4, int i5, int i6, float f, boolean z3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = f;
        this.j = z3;
    }

    @Override // com.daaw.InterfaceC1343Jz2
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.a);
        bundle.putBoolean("ma", this.b);
        bundle.putBoolean("sp", this.c);
        bundle.putInt("muv", this.d);
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.ba)).booleanValue()) {
            bundle.putInt("muv_min", this.e);
            bundle.putInt("muv_max", this.f);
        }
        bundle.putInt("rm", this.g);
        bundle.putInt("riv", this.h);
        bundle.putFloat("android_app_volume", this.i);
        bundle.putBoolean("android_app_muted", this.j);
    }
}
