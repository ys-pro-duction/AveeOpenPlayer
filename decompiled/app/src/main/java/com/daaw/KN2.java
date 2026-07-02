package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class KN2 implements Fn3 {
    public final /* synthetic */ QO2 a;

    public KN2(QO2 qo2) {
        this.a = qo2;
    }

    @Override // com.daaw.Fn3
    public final void a(int i, String str, List list, boolean z, boolean z2) {
        int i2 = i - 1;
        C4140dy2 c4140dy2R = i2 != 0 ? i2 != 1 ? i2 != 3 ? i2 != 4 ? this.a.a.w().r() : z ? this.a.a.w().y() : !z2 ? this.a.a.w().u() : this.a.a.w().t() : this.a.a.w().s() : z ? this.a.a.w().q() : !z2 ? this.a.a.w().o() : this.a.a.w().n() : this.a.a.w().m();
        int size = list.size();
        if (size == 1) {
            c4140dy2R.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c4140dy2R.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c4140dy2R.a(str);
        } else {
            c4140dy2R.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
