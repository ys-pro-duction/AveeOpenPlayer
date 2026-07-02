package com.daaw;

/* JADX INFO: renamed from: com.daaw.zy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10303zy1 extends AbstractCallableC3025Zy1 {
    public final C2917Yx1 i;

    public C10303zy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2, C2917Yx1 c2917Yx1) {
        super(c2813Xx1, "8UC+BMIoCN+KAKrN9TZmuJsGMmo3RUHS+FjVMSp9QfgjxjGZ10kqO/oSdOn5Rw29", "L3kn/AgbpZo67rOPPyFD0YaeqBdfOWuRWDM5lgBYp0M=", c9733xv1, i, 85);
        this.i = c2917Yx1;
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() {
        long[] jArr = (long[]) this.f.invoke(null, Long.valueOf(this.i.d()), Long.valueOf(this.i.h()), Long.valueOf(this.i.b()), Long.valueOf(this.i.f()));
        synchronized (this.e) {
            this.e.w0(jArr[0]);
            this.e.v0(jArr[1]);
        }
    }
}
