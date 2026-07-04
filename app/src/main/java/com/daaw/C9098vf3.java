package com.daaw;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.vf3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9098vf3 implements Ne3 {
    public final Qp3 a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public C9098vf3(Xp3 xp3, boolean z) {
        this.a = new Qp3(xp3, z);
    }

    public final void a(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }

    @Override // com.daaw.Ne3
    public final AbstractC8657u52 zza() {
        return this.a.H();
    }

    @Override // com.daaw.Ne3
    public final Object zzb() {
        return this.b;
    }
}
