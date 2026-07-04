package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10528z2 extends AbstractC10508v2 {
    public P2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.P2, j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.R2] */
    @Override // j$.util.stream.AbstractC10419d2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        ?? r2;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r2 = new R2();
        } else {
            r2 = new P2((int) j);
        }
        this.c = r2;
    }

    @Override // j$.util.stream.AbstractC10419d2, j$.util.stream.InterfaceC10444i2
    public final void k() {
        long[] jArr = (long[]) this.c.d();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC10444i2 interfaceC10444i2 = this.a;
        interfaceC10444i2.l(length);
        int i = 0;
        if (!this.b) {
            int length2 = jArr.length;
            while (i < length2) {
                interfaceC10444i2.accept(jArr[i]);
                i++;
            }
        } else {
            int length3 = jArr.length;
            while (i < length3) {
                long j = jArr[i];
                if (interfaceC10444i2.n()) {
                    break;
                }
                interfaceC10444i2.accept(j);
                i++;
            }
        }
        interfaceC10444i2.k();
    }

    @Override // j$.util.stream.InterfaceC10439h2, j$.util.stream.InterfaceC10444i2
    public final void accept(long j) {
        this.c.accept(j);
    }
}
