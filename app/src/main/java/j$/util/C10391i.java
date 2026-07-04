package j$.util;

import java.util.RandomAccess;

/* JADX INFO: renamed from: j$.util.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10391i extends C10389g implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.C10389g, java.util.List
    public final java.util.List subList(int i, int i2) {
        C10391i c10391i;
        synchronized (this.b) {
            c10391i = new C10391i(this.c.subList(i, i2), this.b);
        }
        return c10391i;
    }

    private Object writeReplace() {
        return new C10389g(this.c);
    }
}
