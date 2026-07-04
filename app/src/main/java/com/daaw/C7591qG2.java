package com.daaw;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import java.util.HashSet;

/* JADX INFO: renamed from: com.daaw.qG2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7591qG2 implements U62 {
    public final HashSet B = new HashSet();
    public final Context C;
    public final RS1 D;

    public C7591qG2(Context context, RS1 rs1) {
        this.C = context;
        this.D = rs1;
    }

    @Override // com.daaw.U62
    public final synchronized void P(zze zzeVar) {
        if (zzeVar.zza != 3) {
            this.D.k(this.B);
        }
    }

    public final Bundle a() {
        return this.D.m(this.C, this);
    }

    public final synchronized void b(HashSet hashSet) {
        this.B.clear();
        this.B.addAll(hashSet);
    }
}
