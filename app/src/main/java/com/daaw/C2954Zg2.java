package com.daaw;

/* JADX INFO: renamed from: com.daaw.Zg2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2954Zg2 extends AbstractC5468ii2 {
    public /* synthetic */ C2954Zg2(AbstractC9102vg2 abstractC9102vg2) {
        super(null);
    }

    @Override // com.daaw.AbstractC5468ii2
    public final void a(Object obj, long j) {
        ((M72) AbstractC4247eM2.k(obj, j)).zzb();
    }

    @Override // com.daaw.AbstractC5468ii2
    public final void b(Object obj, Object obj2, long j) {
        M72 m72F = (M72) AbstractC4247eM2.k(obj, j);
        M72 m72 = (M72) AbstractC4247eM2.k(obj2, j);
        int size = m72F.size();
        int size2 = m72.size();
        if (size > 0 && size2 > 0) {
            if (!m72F.zzc()) {
                m72F = m72F.f(size2 + size);
            }
            m72F.addAll(m72);
        }
        if (size > 0) {
            m72 = m72F;
        }
        AbstractC4247eM2.x(obj, j, m72);
    }
}
