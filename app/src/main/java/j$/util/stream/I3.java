package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public final class I3 extends Z1 implements S3 {
    public final /* synthetic */ Predicate m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I3(AbstractC10404a2 abstractC10404a2, int i, Predicate predicate) {
        super(abstractC10404a2, i, 0);
        this.m = predicate;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final Spliterator K(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        return V2.ORDERED.r(abstractC10401a.f) ? J(abstractC10401a, spliterator, new C10402a0(6)).spliterator() : new Z3(abstractC10401a.S(spliterator), this.m, 0);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final E0 J(AbstractC10401a abstractC10401a, Spliterator spliterator, IntFunction intFunction) {
        return (E0) new U3(this, abstractC10401a, spliterator, intFunction).invoke();
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        return new H3(this, interfaceC10444i2, false);
    }

    @Override // j$.util.stream.S3
    public final T3 j(InterfaceC10511w0 interfaceC10511w0, boolean z) {
        return new H3(this, interfaceC10511w0, z);
    }
}
