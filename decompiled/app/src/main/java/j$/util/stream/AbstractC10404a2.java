package j$.util.stream;

import j$.util.C10397o;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.a2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10404a2 extends AbstractC10401a implements Stream {
    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new D2(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C10466n(this, V2.m | V2.t, 0);
    }

    @Override // j$.util.stream.Stream
    public final Optional min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final Optional findAny() {
        return (Optional) C(H.d);
    }

    @Override // j$.util.stream.Stream
    public final Optional findFirst() {
        return (Optional) C(H.c);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new D2(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return C(new C10522y1(W2.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return C(new C10522y1(W2.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new O(consumer, false));
    }

    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C(new O(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final Optional max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.AbstractC10401a
    public final W2 H() {
        return W2.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final Optional reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (Optional) C(new C10512w1(W2.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.AbstractC10401a
    public final E0 E(AbstractC10401a abstractC10401a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC10497t1.B(abstractC10401a, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final Spliterator P(AbstractC10401a abstractC10401a, Supplier supplier, boolean z) {
        return new C10529z3(abstractC10401a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final boolean G(Spliterator spliterator, InterfaceC10444i2 interfaceC10444i2) {
        boolean zN;
        do {
            zN = interfaceC10444i2.n();
            if (zN) {
                break;
            }
        } while (spliterator.tryAdvance(interfaceC10444i2));
        return zN;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10511w0 I(long j, IntFunction intFunction) {
        return AbstractC10497t1.z(j, intFunction);
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.d0(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new r(this, V2.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new r(this, V2.p | V2.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new U(this, V2.p | V2.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return C(new C10522y1(W2.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC10452k0 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new C10422e0(this, V2.p | V2.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final C mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new C10510w(this, V2.p | V2.n, toDoubleFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) C(new A1(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream e(C10397o c10397o) {
        Objects.requireNonNull(c10397o);
        return new r(this, V2.p | V2.n | V2.t, c10397o, 6);
    }

    @Override // j$.util.stream.Stream
    public final IntStream o(C10397o c10397o) {
        Objects.requireNonNull(c10397o);
        return new U(this, V2.p | V2.n | V2.t, c10397o, 3);
    }

    @Override // j$.util.stream.Stream
    public final C s(C10397o c10397o) {
        Objects.requireNonNull(c10397o);
        return new C10510w(this, V2.p | V2.n | V2.t, c10397o, 3);
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Collector collector) {
        Collector collector2;
        Object objC;
        if (!this.a.k || !collector.characteristics().contains(EnumC10436h.CONCURRENT) || (V2.ORDERED.r(this.f) && !collector.characteristics().contains(EnumC10436h.UNORDERED))) {
            Supplier supplier = ((Collector) Objects.requireNonNull(collector)).supplier();
            collector2 = collector;
            objC = C(new F1(W2.REFERENCE, collector.combiner(), collector.accumulator(), supplier, collector2));
        } else {
            objC = collector.supplier().get();
            forEach(new j$.time.format.u(8, collector.accumulator(), objC));
            collector2 = collector;
        }
        return collector2.characteristics().contains(EnumC10436h.IDENTITY_FINISH) ? objC : collector2.finisher().apply(objC);
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC10452k0 m(C10397o c10397o) {
        Objects.requireNonNull(c10397o);
        return new C10422e0(this, V2.p | V2.n | V2.t, c10397o, 2);
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new r(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC10497t1.Y(this, 0L, j);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC10497t1.Y(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = b4.a;
        Objects.requireNonNull(predicate);
        return new G3(this, b4.a, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = b4.a;
        Objects.requireNonNull(predicate);
        return new I3(this, b4.b, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return AbstractC10497t1.J(D(intFunction), intFunction).o(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new C10402a0(14));
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) C(AbstractC10497t1.X(EnumC10486r0.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) C(AbstractC10497t1.X(EnumC10486r0.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) C(AbstractC10497t1.X(EnumC10486r0.NONE, predicate))).booleanValue();
    }
}
