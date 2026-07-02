package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class Y1 extends AbstractC10404a2 {
    @Override // j$.util.stream.AbstractC10404a2, j$.util.stream.Stream
    public final void forEach(Consumer consumer) {
        if (!this.a.k) {
            O().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
    }

    @Override // j$.util.stream.AbstractC10404a2, j$.util.stream.Stream
    public final void forEachOrdered(Consumer consumer) {
        if (!this.a.k) {
            O().forEachRemaining(consumer);
        } else {
            super.forEachOrdered(consumer);
        }
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final InterfaceC10431g unordered() {
        return !V2.ORDERED.r(this.f) ? this : new X1(this, V2.r, 1);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final boolean L() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        throw new UnsupportedOperationException();
    }
}
