package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class A2 extends AbstractC10520y {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A2(AbstractC10401a abstractC10401a, int i, int i2) {
        super(abstractC10401a, i, 0);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC10401a
    public Spliterator K(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        switch (this.m) {
            case 1:
                return V2.ORDERED.r(abstractC10401a.f) ? J(abstractC10401a, spliterator, new C10402a0(24)).spliterator() : new W3((j$.util.S) abstractC10401a.S(spliterator), 1);
            default:
                return super.K(abstractC10401a, spliterator);
        }
    }

    @Override // j$.util.stream.AbstractC10401a
    public final E0 J(AbstractC10401a abstractC10401a, Spliterator spliterator, IntFunction intFunction) {
        switch (this.m) {
            case 0:
                if (V2.SORTED.r(abstractC10401a.f)) {
                    return abstractC10401a.B(spliterator, false, intFunction);
                }
                double[] dArr = (double[]) ((InterfaceC10521y0) abstractC10401a.B(spliterator, true, intFunction)).d();
                Arrays.sort(dArr);
                return new Q0(dArr);
            default:
                return (E0) new V3(this, abstractC10401a, spliterator, intFunction).invoke();
        }
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        switch (this.m) {
            case 0:
                Objects.requireNonNull(interfaceC10444i2);
                if (V2.SORTED.r(i)) {
                    return interfaceC10444i2;
                }
                return V2.SIZED.r(i) ? new F2(interfaceC10444i2) : new C10518x2(interfaceC10444i2);
            default:
                return new P3(this, interfaceC10444i2);
        }
    }
}
