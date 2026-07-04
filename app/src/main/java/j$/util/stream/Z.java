package j$.util.stream;

import j$.util.C10533w;
import j$.util.C10536z;
import j$.util.Objects;
import j$.util.OptionalInt;
import j$.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.ObjIntConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z extends AbstractC10401a implements IntStream {
    @Override // j$.util.stream.IntStream
    public final OptionalInt findAny() {
        return (OptionalInt) C(F.d);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt findFirst() {
        return (OptionalInt) C(F.c);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream sorted() {
        return new B2(this, V2.q | V2.o, 0);
    }

    public void forEach(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new M(intConsumer, false));
    }

    public void forEachOrdered(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        C(new M(intConsumer, true));
    }

    public static j$.util.V T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.V) {
            return (j$.util.V) spliterator;
        }
        if (F3.a) {
            F3.a(AbstractC10401a.class, "using IntStream.adapt(Spliterator<Integer> s)");
            throw null;
        }
        throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
    }

    @Override // j$.util.stream.AbstractC10401a
    public final W2 H() {
        return W2.INT_VALUE;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final E0 E(AbstractC10401a abstractC10401a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC10497t1.D(abstractC10401a, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final Spliterator P(AbstractC10401a abstractC10401a, Supplier supplier, boolean z) {
        return new C10445i3(abstractC10401a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final boolean G(Spliterator spliterator, InterfaceC10444i2 interfaceC10444i2) {
        IntConsumer f;
        boolean zN;
        j$.util.V vT = T(spliterator);
        if (interfaceC10444i2 instanceof IntConsumer) {
            f = (IntConsumer) interfaceC10444i2;
        } else {
            if (F3.a) {
                F3.a(AbstractC10401a.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC10444i2);
            f = new j$.util.F(interfaceC10444i2, 1);
        }
        do {
            zN = interfaceC10444i2.n();
            if (zN) {
                break;
            }
        } while (vT.tryAdvance(f));
        return zN;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10511w0 I(long j, IntFunction intFunction) {
        return AbstractC10497t1.P(j);
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final j$.util.I iterator() {
        j$.util.V vSpliterator = spliterator();
        Objects.requireNonNull(vSpliterator);
        return new j$.util.e0(vSpliterator);
    }

    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final j$.util.V spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC10452k0 asLongStream() {
        return new C10500u(this, 0, 1);
    }

    @Override // j$.util.stream.IntStream
    public final C asDoubleStream() {
        return new C10490s(this, 0, 3);
    }

    @Override // j$.util.stream.IntStream
    public final Stream boxed() {
        return new r(this, 0, new C10471o(15), 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream d() {
        Objects.requireNonNull(null);
        return new C10495t(this, V2.p | V2.n, 1);
    }

    @Override // j$.util.stream.IntStream
    public final Stream mapToObj(IntFunction intFunction) {
        Objects.requireNonNull(intFunction);
        return new r(this, V2.p | V2.n, intFunction, 1);
    }

    @Override // j$.util.stream.IntStream
    public final InterfaceC10452k0 l() {
        Objects.requireNonNull(null);
        return new C10500u(this, V2.p | V2.n, 2);
    }

    @Override // j$.util.stream.IntStream
    public final C f() {
        Objects.requireNonNull(null);
        return new C10490s(this, V2.p | V2.n, 4);
    }

    @Override // j$.util.stream.IntStream
    public final int reduce(int i, IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return ((Integer) C(new J1(W2.INT_VALUE, intBinaryOperator, i))).intValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream x(K k) {
        Objects.requireNonNull(k);
        return new U(this, V2.p | V2.n | V2.t, k, 1);
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt reduce(IntBinaryOperator intBinaryOperator) {
        Objects.requireNonNull(intBinaryOperator);
        return (OptionalInt) C(new C10512w1(W2.INT_VALUE, intBinaryOperator, 3));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream b() {
        Objects.requireNonNull(null);
        return new C10495t(this, V2.t, 3);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream peek(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer);
        return new U(this, intConsumer);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC10497t1.U(this, 0L, j);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC10497t1.U(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.IntStream
    public final IntStream a() {
        int i = b4.a;
        Objects.requireNonNull(null);
        return new B2(this, b4.a, 1);
    }

    @Override // j$.util.stream.IntStream
    public final IntStream c() {
        int i = b4.a;
        Objects.requireNonNull(null);
        return new L3(this, b4.b, 0);
    }

    @Override // j$.util.stream.IntStream
    public final long count() {
        return ((Long) C(new A1(3))).longValue();
    }

    @Override // j$.util.stream.IntStream
    public final IntStream distinct() {
        return ((AbstractC10404a2) boxed()).distinct().mapToInt(new C10471o(14));
    }

    @Override // j$.util.stream.IntStream
    public final int sum() {
        return reduce(0, new C10471o(19));
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt min() {
        return reduce(new C10471o(16));
    }

    @Override // j$.util.stream.IntStream
    public final OptionalInt max() {
        return reduce(new C10471o(20));
    }

    @Override // j$.util.stream.IntStream
    public final C10536z average() {
        long j = ((long[]) collect(new C10471o(21), new C10471o(22), new C10471o(23)))[0];
        return j > 0 ? new C10536z(r0[1] / j) : C10536z.c;
    }

    @Override // j$.util.stream.IntStream
    public final C10533w summaryStatistics() {
        return (C10533w) collect(new j$.time.f(14), new C10471o(17), new C10471o(18));
    }

    @Override // j$.util.stream.IntStream
    public final Object collect(Supplier supplier, ObjIntConsumer objIntConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C10476p c10476p = new C10476p(biConsumer, 1);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objIntConsumer);
        Objects.requireNonNull(c10476p);
        return C(new C10522y1(W2.INT_VALUE, c10476p, objIntConsumer, supplier, 4));
    }

    @Override // j$.util.stream.IntStream
    public final boolean r() {
        return ((Boolean) C(AbstractC10497t1.T(EnumC10486r0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean u() {
        return ((Boolean) C(AbstractC10497t1.T(EnumC10486r0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final boolean g() {
        return ((Boolean) C(AbstractC10497t1.T(EnumC10486r0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.IntStream
    public final int[] toArray() {
        return (int[]) AbstractC10497t1.L((A0) D(new C10471o(13))).d();
    }
}
