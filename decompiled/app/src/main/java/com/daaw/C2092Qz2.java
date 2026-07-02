package com.daaw;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;

/* JADX INFO: renamed from: com.daaw.Qz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2092Qz2 {
    public final String a;
    public final String b;
    public final long c;
    public final Bundle d;

    public C2092Qz2(String str, String str2, Bundle bundle, long j) {
        this.a = str;
        this.b = str2;
        this.d = bundle;
        this.c = j;
    }

    public static C2092Qz2 b(zzau zzauVar) {
        return new C2092Qz2(zzauVar.B, zzauVar.D, zzauVar.C.m(), zzauVar.E);
    }

    public final zzau a() {
        return new zzau(this.a, new zzas(new Bundle(this.d)), this.b, this.c);
    }

    public final String toString() {
        return "origin=" + this.b + ",name=" + this.a + ",params=" + this.d.toString();
    }
}
