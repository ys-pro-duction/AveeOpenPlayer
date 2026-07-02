package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10427f0 extends AbstractC10437h0 {
    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final InterfaceC10452k0 sequential() {
        this.a.k = false;
        return this;
    }

    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final InterfaceC10452k0 parallel() {
        this.a.k = true;
        return this;
    }

    @Override // j$.util.stream.AbstractC10437h0, j$.util.stream.InterfaceC10452k0
    public final void forEach(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEach(longConsumer);
        } else {
            AbstractC10437h0.T(O()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.AbstractC10437h0, j$.util.stream.InterfaceC10452k0
    public final void forEachOrdered(LongConsumer longConsumer) {
        if (this.a.k) {
            super.forEachOrdered(longConsumer);
        } else {
            AbstractC10437h0.T(O()).forEachRemaining(longConsumer);
        }
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final InterfaceC10431g unordered() {
        return !V2.ORDERED.r(this.f) ? this : new C10500u(this, V2.r, 4);
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
