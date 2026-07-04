package j$.util.stream;

import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public abstract class O0 extends G0 implements D0 {
    @Override // j$.util.stream.E0
    public final /* synthetic */ Object[] o(IntFunction intFunction) {
        return AbstractC10497t1.m(this, intFunction);
    }

    @Override // j$.util.stream.D0
    public final void e(Object obj) {
        ((D0) this.a).e(obj);
        ((D0) this.b).e(obj);
    }

    @Override // j$.util.stream.D0
    public final void r(int i, Object obj) {
        E0 e0 = this.a;
        ((D0) e0).r(i, obj);
        ((D0) this.b).r(i + ((int) ((D0) e0).count()), obj);
    }

    @Override // j$.util.stream.D0
    public final Object d() {
        long j = this.c;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object objC = c((int) j);
        r(0, objC);
        return objC;
    }

    public final String toString() {
        long j = this.c;
        return j < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(j));
    }
}
