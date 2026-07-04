package j$.util;

import java.util.RandomAccess;

/* JADX INFO: renamed from: j$.util.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10530t extends C10396n implements RandomAccess {
    private static final long serialVersionUID = -2542308836966382001L;

    @Override // j$.util.C10396n, java.util.List
    public final java.util.List subList(int i, int i2) {
        return new C10530t(this.b.subList(i, i2));
    }

    private Object writeReplace() {
        return new C10396n(this.b);
    }
}
