package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class G2 extends AbstractC10503u2 {
    public int[] c;
    public int d;

    @Override // j$.util.stream.AbstractC10414c2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.c = new int[(int) j];
    }

    @Override // j$.util.stream.AbstractC10414c2, j$.util.stream.InterfaceC10444i2
    public final void k() {
        int i = 0;
        Arrays.sort(this.c, 0, this.d);
        long j = this.d;
        InterfaceC10444i2 interfaceC10444i2 = this.a;
        interfaceC10444i2.l(j);
        if (!this.b) {
            while (i < this.d) {
                interfaceC10444i2.accept(this.c[i]);
                i++;
            }
        } else {
            while (i < this.d && !interfaceC10444i2.n()) {
                interfaceC10444i2.accept(this.c[i]);
                i++;
            }
        }
        interfaceC10444i2.k();
        this.c = null;
    }

    @Override // j$.util.stream.InterfaceC10434g2, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        int[] iArr = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        iArr[i2] = i;
    }
}
