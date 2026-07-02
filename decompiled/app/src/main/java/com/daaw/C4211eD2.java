package com.daaw;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.eD2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4211eD2 implements UG2 {
    public final OD2 a;
    public final QD2 b;
    public final zzl c;
    public final String d;
    public final Executor e;
    public final zzw f;
    public final JG2 g;

    public C4211eD2(OD2 od2, QD2 qd2, zzl zzlVar, String str, Executor executor, zzw zzwVar, JG2 jg2) {
        this.a = od2;
        this.b = qd2;
        this.c = zzlVar;
        this.d = str;
        this.e = executor;
        this.f = zzwVar;
        this.g = jg2;
    }

    @Override // com.daaw.UG2
    public final JG2 zza() {
        return this.g;
    }

    @Override // com.daaw.UG2
    public final Executor zzb() {
        return this.e;
    }
}
