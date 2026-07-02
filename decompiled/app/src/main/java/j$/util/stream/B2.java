package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class B2 extends Y {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B2(AbstractC10401a abstractC10401a, int i, int i2) {
        super(abstractC10401a, i, 0);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC10401a
    public Spliterator K(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        switch (this.m) {
            case 1:
                return V2.ORDERED.r(abstractC10401a.f) ? J(abstractC10401a, spliterator, new C10402a0(20)).spliterator() : new X3((j$.util.V) abstractC10401a.S(spliterator), 1);
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
                int[] iArr = (int[]) ((A0) abstractC10401a.B(spliterator, true, intFunction)).d();
                Arrays.sort(iArr);
                return new Z0(iArr);
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
                return V2.SIZED.r(i) ? new G2(interfaceC10444i2) : new C10523y2(interfaceC10444i2);
            default:
                return new J3(this, interfaceC10444i2);
        }
    }
}
