package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class L3 extends Y implements S3 {
    @Override // j$.util.stream.AbstractC10401a
    public final Spliterator K(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        return V2.ORDERED.r(abstractC10401a.f) ? J(abstractC10401a, spliterator, new C10402a0(21)).spliterator() : new X3((j$.util.V) abstractC10401a.S(spliterator), 0);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final E0 J(AbstractC10401a abstractC10401a, Spliterator spliterator, IntFunction intFunction) {
        return (E0) new U3(this, abstractC10401a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        return new K3(this, interfaceC10444i2, false);
    }

    @Override // j$.util.stream.S3
    public final T3 j(InterfaceC10511w0 interfaceC10511w0, boolean z) {
        return new K3(this, interfaceC10511w0, z);
    }
}
