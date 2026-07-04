package com.daaw;

import com.google.android.gms.ads.internal.client.zzq;

/* JADX INFO: renamed from: com.daaw.tX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8494tX1 {
    public final int a;
    public final int b;
    public final int c;

    public C8494tX1(int i, int i2, int i3) {
        this.a = i;
        this.c = i2;
        this.b = i3;
    }

    public static C8494tX1 a() {
        return new C8494tX1(0, 0, 0);
    }

    public static C8494tX1 b(int i, int i2) {
        return new C8494tX1(1, i, i2);
    }

    public static C8494tX1 c(zzq zzqVar) {
        return zzqVar.zzd ? new C8494tX1(3, 0, 0) : zzqVar.zzi ? new C8494tX1(2, 0, 0) : zzqVar.zzh ? a() : b(zzqVar.zzf, zzqVar.zzc);
    }

    public static C8494tX1 d() {
        return new C8494tX1(5, 0, 0);
    }

    public static C8494tX1 e() {
        return new C8494tX1(4, 0, 0);
    }

    public final boolean f() {
        return this.a == 0;
    }

    public final boolean g() {
        return this.a == 2;
    }

    public final boolean h() {
        return this.a == 5;
    }

    public final boolean i() {
        return this.a == 3;
    }

    public final boolean j() {
        return this.a == 4;
    }
}
