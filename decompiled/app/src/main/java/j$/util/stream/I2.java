package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class I2 extends AbstractC10513w2 {
    public Object[] d;
    public int e;

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        if (j >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.d = new Object[(int) j];
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public final void k() {
        int i = 0;
        Arrays.sort(this.d, 0, this.e, this.b);
        long j = this.e;
        InterfaceC10444i2 interfaceC10444i2 = this.a;
        interfaceC10444i2.l(j);
        if (!this.c) {
            while (i < this.e) {
                interfaceC10444i2.accept(this.d[i]);
                i++;
            }
        } else {
            while (i < this.e && !interfaceC10444i2.n()) {
                interfaceC10444i2.accept(this.d[i]);
                i++;
            }
        }
        interfaceC10444i2.k();
        this.d = null;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.d;
        int i = this.e;
        this.e = i + 1;
        objArr[i] = obj;
    }
}
