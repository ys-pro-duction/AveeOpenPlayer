package com.daaw;

import android.content.Context;
import android.view.View;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Ay1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0393Ay1 extends AbstractCallableC3025Zy1 {
    public final Map i;
    public final View j;
    public final Context k;

    public C0393Ay1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, Map map, View view, Context context) {
        super(c2813Xx1, "7qOZVP58PfP3kLkbSBo98onihlohkIEpZC40FvE5nnCJ8ryn0NERK9JAnlww55zq", "SMfJnKfhfLLyTw7dzHC+3CXVRNFLWK4N2mQHKB3gm/o=", c9733xv1, i, 85);
        this.i = map;
        this.j = view;
        this.k = context;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        long[] jArr = {c(1), c(2)};
        Context contextB = this.k;
        if (contextB == null) {
            contextB = this.b.b();
        }
        long[] jArr2 = (long[]) this.f.invoke(null, jArr, contextB, this.j);
        long j = jArr2[0];
        this.i.put(1, Long.valueOf(jArr2[1]));
        long j2 = jArr2[2];
        this.i.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.e) {
            this.e.w0(j);
            this.e.v0(j2);
        }
    }

    public final long c(int i) {
        Map map = this.i;
        Integer numValueOf = Integer.valueOf(i);
        if (map.containsKey(numValueOf)) {
            return ((Long) this.i.get(numValueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }
}
