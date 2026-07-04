package com.daaw;

import android.content.Context;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Jy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1338Jy1 extends AbstractCallableC3025Zy1 {
    public List i;
    public final Context j;

    public C1338Jy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, Context context) {
        super(c2813Xx1, "y3yRmC/kyT5sblAh6MVmMMe529YDQrbaaQxNMdjlDdcJ+gZ0vSS7aY/hNYvCePEW", "Y0trGqGVEUAa7A3LYgSQFKe4N9h1BuTC7OKFYCHfLSg=", c9733xv1, i, 31);
        this.i = null;
        this.j = context;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        this.e.O(-1L);
        this.e.J(-1L);
        Context contextB = this.j;
        if (contextB == null) {
            contextB = this.b.b();
        }
        if (this.i == null) {
            this.i = (List) this.f.invoke(null, contextB);
        }
        List list = this.i;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.e) {
            this.e.O(((Long) this.i.get(0)).longValue());
            this.e.J(((Long) this.i.get(1)).longValue());
        }
    }
}
