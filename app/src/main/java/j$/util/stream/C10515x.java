package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10515x extends AbstractC10525z {
    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final C sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final C parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC10525z, j$.util.stream.C
    public final void forEach(DoubleConsumer doubleConsumer) {
        if (this.a.k) {
            super.forEach(doubleConsumer);
        } else {
            AbstractC10525z.T(O()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC10525z, j$.util.stream.C
    public final void forEachOrdered(DoubleConsumer doubleConsumer) {
        if (this.a.k) {
            super.forEachOrdered(doubleConsumer);
        } else {
            AbstractC10525z.T(O()).forEachRemaining(doubleConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final InterfaceC10431g unordered() {
        return !V2.ORDERED.r(this.f) ? this : new C10490s(this, V2.r, 1);
    }

    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return spliterator();
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
