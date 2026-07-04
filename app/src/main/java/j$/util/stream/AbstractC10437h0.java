package j$.util.stream;

import j$.util.C10397o;
import j$.util.C10535y;
import j$.util.C10536z;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10437h0 extends AbstractC10401a implements InterfaceC10452k0 {
    @Override // j$.util.stream.InterfaceC10452k0
    public final j$.util.A findAny() {
        return (j$.util.A) C(G.d);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final j$.util.A findFirst() {
        return (j$.util.A) C(G.c);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 sorted() {
        return new C2(this, V2.q | V2.o, 0);
    }

    public void forEach(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        C(new N(longConsumer, false));
    }

    public void forEachOrdered(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        C(new N(longConsumer, true));
    }

    public static j$.util.Y T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.Y) {
            return (j$.util.Y) spliterator;
        }
        if (F3.a) {
            F3.a(AbstractC10401a.class, "using LongStream.adapt(Spliterator<Long> s)");
            throw null;
        }
        throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
    }

    @Override // j$.util.stream.AbstractC10401a
    public final W2 H() {
        return W2.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final E0 E(AbstractC10401a abstractC10401a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC10497t1.E(abstractC10401a, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final Spliterator P(AbstractC10401a abstractC10401a, Supplier supplier, boolean z) {
        return new C10455k3(abstractC10401a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final boolean G(Spliterator spliterator, InterfaceC10444i2 interfaceC10444i2) {
        LongConsumer j;
        boolean zN;
        j$.util.Y yT = T(spliterator);
        if (interfaceC10444i2 instanceof LongConsumer) {
            j = (LongConsumer) interfaceC10444i2;
        } else {
            if (F3.a) {
                F3.a(AbstractC10401a.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC10444i2);
            j = new j$.util.J(interfaceC10444i2, 1);
        }
        do {
            zN = interfaceC10444i2.n();
            if (zN) {
                break;
            }
        } while (yT.tryAdvance(j));
        return zN;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10511w0 I(long j, IntFunction intFunction) {
        return AbstractC10497t1.Q(j);
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final j$.util.M iterator() {
        j$.util.Y ySpliterator = spliterator();
        Objects.requireNonNull(ySpliterator);
        return new j$.util.f0(ySpliterator);
    }

    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final j$.util.Y spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final C asDoubleStream() {
        return new C10490s(this, V2.n, 5);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final Stream boxed() {
        return new r(this, 0, new C10471o(29), 2);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 d() {
        Objects.requireNonNull(null);
        return new C10500u(this, V2.p | V2.n, 3);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final Stream mapToObj(LongFunction longFunction) {
        Objects.requireNonNull(longFunction);
        return new r(this, V2.p | V2.n, longFunction, 2);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final IntStream w() {
        Objects.requireNonNull(null);
        return new C10495t(this, V2.p | V2.n, 4);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final C k() {
        Objects.requireNonNull(null);
        return new C10490s(this, V2.p | V2.n, 6);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 e(C10397o c10397o) {
        Objects.requireNonNull(c10397o);
        return new C10422e0(this, V2.p | V2.n | V2.t, c10397o, 0);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 b() {
        Objects.requireNonNull(null);
        return new C10500u(this, V2.t, 5);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 peek(LongConsumer longConsumer) {
        Objects.requireNonNull(longConsumer);
        return new C10422e0(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC10497t1.W(this, 0L, j);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC10497t1.W(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 a() {
        int i = b4.a;
        Objects.requireNonNull(null);
        return new C2(this, b4.a, 1);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 c() {
        int i = b4.a;
        Objects.requireNonNull(null);
        return new O3(this, b4.b, 0);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 distinct() {
        return ((AbstractC10404a2) boxed()).distinct().mapToLong(new C10471o(26));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final long sum() {
        return reduce(0L, new C10402a0(4));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final j$.util.A min() {
        return reduce(new C10471o(25));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final j$.util.A max() {
        return reduce(new C10402a0(3));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final C10536z average() {
        long j = ((long[]) collect(new C10402a0(0), new C10402a0(1), new C10402a0(2)))[0];
        return j > 0 ? new C10536z(r0[1] / j) : C10536z.c;
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final long reduce(long j, LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return ((Long) C(new C10502u1(W2.LONG_VALUE, longBinaryOperator, j))).longValue();
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final C10535y summaryStatistics() {
        return (C10535y) collect(new j$.time.f(15), new C10471o(24), new C10471o(27));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C10476p c10476p = new C10476p(biConsumer, 2);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objLongConsumer);
        Objects.requireNonNull(c10476p);
        return C(new C10522y1(W2.LONG_VALUE, c10476p, objLongConsumer, supplier, 0));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final boolean v() {
        return ((Boolean) C(AbstractC10497t1.V(EnumC10486r0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final boolean q() {
        return ((Boolean) C(AbstractC10497t1.V(EnumC10486r0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final j$.util.A reduce(LongBinaryOperator longBinaryOperator) {
        Objects.requireNonNull(longBinaryOperator);
        return (j$.util.A) C(new C10512w1(W2.LONG_VALUE, longBinaryOperator, 0));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final boolean n() {
        return ((Boolean) C(AbstractC10497t1.V(EnumC10486r0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final long[] toArray() {
        return (long[]) AbstractC10497t1.M((C0) D(new C10471o(28))).d();
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final long count() {
        return ((Long) C(new A1(0))).longValue();
    }
}
