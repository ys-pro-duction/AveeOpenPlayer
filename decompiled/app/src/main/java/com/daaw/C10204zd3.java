package com.daaw;

/* JADX INFO: renamed from: com.daaw.zd3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10204zd3 implements Ne3 {
    public final Object a;
    public final Xp3 b;
    public AbstractC8657u52 c;

    public C10204zd3(Object obj, Qp3 qp3) {
        this.a = obj;
        this.b = qp3;
        this.c = qp3.H();
    }

    public final void a(AbstractC8657u52 abstractC8657u52) {
        this.c = abstractC8657u52;
    }

    @Override // com.daaw.Ne3
    public final AbstractC8657u52 zza() {
        return this.c;
    }

    @Override // com.daaw.Ne3
    public final Object zzb() {
        return this.a;
    }
}
