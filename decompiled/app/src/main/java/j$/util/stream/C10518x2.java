package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10518x2 extends AbstractC10498t2 {
    public L2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.L2, j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.R2] */
    @Override // j$.util.stream.AbstractC10409b2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        ?? r2;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r2 = new R2();
        } else {
            r2 = new L2((int) j);
        }
        this.c = r2;
    }

    @Override // j$.util.stream.AbstractC10409b2, j$.util.stream.InterfaceC10444i2
    public final void k() {
        double[] dArr = (double[]) this.c.d();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC10444i2 interfaceC10444i2 = this.a;
        interfaceC10444i2.l(length);
        int i = 0;
        if (!this.b) {
            int length2 = dArr.length;
            while (i < length2) {
                interfaceC10444i2.accept(dArr[i]);
                i++;
            }
        } else {
            int length3 = dArr.length;
            while (i < length3) {
                double d = dArr[i];
                if (interfaceC10444i2.n()) {
                    break;
                }
                interfaceC10444i2.accept(d);
                i++;
            }
        }
        interfaceC10444i2.k();
    }

    @Override // j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        this.c.accept(d);
    }
}
