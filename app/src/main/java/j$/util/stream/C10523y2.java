package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10523y2 extends AbstractC10503u2 {
    public N2 c;

    /* JADX WARN: Type inference failed for: r0v2, types: [j$.util.stream.N2, j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [j$.util.stream.R2] */
    /* JADX WARN: Type inference failed for: r0v6, types: [j$.util.stream.R2] */
    @Override // j$.util.stream.AbstractC10414c2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        ?? r2;
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        if (j <= 0) {
            r2 = new R2();
        } else {
            r2 = new N2((int) j);
        }
        this.c = r2;
    }

    @Override // j$.util.stream.AbstractC10414c2, j$.util.stream.InterfaceC10444i2
    public final void k() {
        int[] iArr = (int[]) this.c.d();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC10444i2 interfaceC10444i2 = this.a;
        interfaceC10444i2.l(length);
        int i = 0;
        if (!this.b) {
            int length2 = iArr.length;
            while (i < length2) {
                interfaceC10444i2.accept(iArr[i]);
                i++;
            }
        } else {
            int length3 = iArr.length;
            while (i < length3) {
                int i2 = iArr[i];
                if (interfaceC10444i2.n()) {
                    break;
                }
                interfaceC10444i2.accept(i2);
                i++;
            }
        }
        interfaceC10444i2.k();
    }

    @Override // j$.util.stream.InterfaceC10434g2, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        this.c.accept(i);
    }
}
