package j$.util.stream;

import j$.util.EnumC10386d;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class D2 extends Z1 {
    public final boolean m;
    public final Comparator n;

    public D2(AbstractC10404a2 abstractC10404a2) {
        super(abstractC10404a2, V2.q | V2.o, 0);
        this.m = true;
        this.n = EnumC10386d.INSTANCE;
    }

    public D2(AbstractC10404a2 abstractC10404a2, Comparator comparator) {
        super(abstractC10404a2, V2.q | V2.p, 0);
        this.m = false;
        this.n = (Comparator) Objects.requireNonNull(comparator);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        Objects.requireNonNull(interfaceC10444i2);
        if (V2.SORTED.r(i) && this.m) {
            return interfaceC10444i2;
        }
        boolean zR = V2.SIZED.r(i);
        Comparator comparator = this.n;
        if (zR) {
            return new I2(interfaceC10444i2, comparator);
        }
        return new E2(interfaceC10444i2, comparator);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final E0 J(AbstractC10401a abstractC10401a, Spliterator spliterator, IntFunction intFunction) {
        if (V2.SORTED.r(abstractC10401a.f) && this.m) {
            return abstractC10401a.B(spliterator, false, intFunction);
        }
        Object[] objArrO = abstractC10401a.B(spliterator, true, intFunction).o(intFunction);
        Arrays.sort(objArrO, this.n);
        return new H0(objArrO);
    }
}
