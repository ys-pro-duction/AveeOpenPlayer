package j$.util.stream;

import j$.util.C10397o;
import j$.util.C10532v;
import j$.util.C10536z;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10525z extends AbstractC10401a implements C {
    @Override // j$.util.stream.C
    public final C10536z findAny() {
        return (C10536z) C(E.d);
    }

    @Override // j$.util.stream.C
    public final C10536z findFirst() {
        return (C10536z) C(E.c);
    }

    @Override // j$.util.stream.C
    public final C sorted() {
        return new A2(this, V2.q | V2.o, 0);
    }

    public static j$.util.S T(Spliterator spliterator) {
        if (spliterator instanceof j$.util.S) {
            return (j$.util.S) spliterator;
        }
        if (F3.a) {
            F3.a(AbstractC10401a.class, "using DoubleStream.adapt(Spliterator<Double> s)");
            throw null;
        }
        throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
    }

    public void forEach(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        C(new L(doubleConsumer, false));
    }

    public void forEachOrdered(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        C(new L(doubleConsumer, true));
    }

    @Override // j$.util.stream.AbstractC10401a
    public final W2 H() {
        return W2.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final E0 E(AbstractC10401a abstractC10401a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return AbstractC10497t1.C(abstractC10401a, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final Spliterator P(AbstractC10401a abstractC10401a, Supplier supplier, boolean z) {
        return new C10435g3(abstractC10401a, supplier, z);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final boolean G(Spliterator spliterator, InterfaceC10444i2 interfaceC10444i2) {
        DoubleConsumer b;
        boolean zN;
        j$.util.S sT = T(spliterator);
        if (interfaceC10444i2 instanceof DoubleConsumer) {
            b = (DoubleConsumer) interfaceC10444i2;
        } else {
            if (F3.a) {
                F3.a(AbstractC10401a.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            Objects.requireNonNull(interfaceC10444i2);
            b = new j$.util.B(interfaceC10444i2, 1);
        }
        do {
            zN = interfaceC10444i2.n();
            if (zN) {
                break;
            }
        } while (sT.tryAdvance(b));
        return zN;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10511w0 I(long j, IntFunction intFunction) {
        return AbstractC10497t1.G(j);
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final j$.util.E iterator() {
        j$.util.S sSpliterator = spliterator();
        Objects.requireNonNull(sSpliterator);
        return new j$.util.g0(sSpliterator);
    }

    @Override // j$.util.stream.AbstractC10401a, j$.util.stream.InterfaceC10431g
    public final j$.util.S spliterator() {
        return T(super.spliterator());
    }

    @Override // j$.util.stream.C
    public final Stream boxed() {
        return new r(this, 0, new j$.time.f(28), 0);
    }

    @Override // j$.util.stream.C
    public final C d() {
        Objects.requireNonNull(null);
        return new C10490s(this, V2.p | V2.n, 0);
    }

    @Override // j$.util.stream.C
    public final Stream mapToObj(DoubleFunction doubleFunction) {
        Objects.requireNonNull(doubleFunction);
        return new r(this, V2.p | V2.n, doubleFunction, 0);
    }

    @Override // j$.util.stream.C
    public final IntStream t() {
        Objects.requireNonNull(null);
        return new C10495t(this, V2.p | V2.n, 0);
    }

    @Override // j$.util.stream.C
    public final InterfaceC10452k0 i() {
        Objects.requireNonNull(null);
        return new C10500u(this, V2.p | V2.n, 0);
    }

    @Override // j$.util.stream.C
    public final C e(C10397o c10397o) {
        Objects.requireNonNull(c10397o);
        return new C10510w(this, V2.p | V2.n | V2.t, c10397o, 0);
    }

    @Override // j$.util.stream.C
    public final C b() {
        Objects.requireNonNull(null);
        return new C10490s(this, V2.t, 2);
    }

    @Override // j$.util.stream.C
    public final C peek(DoubleConsumer doubleConsumer) {
        Objects.requireNonNull(doubleConsumer);
        return new C10510w(this, doubleConsumer);
    }

    @Override // j$.util.stream.C
    public final C limit(long j) {
        if (j < 0) {
            throw new IllegalArgumentException(Long.toString(j));
        }
        return AbstractC10497t1.S(this, 0L, j);
    }

    @Override // j$.util.stream.C
    public final C skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : AbstractC10497t1.S(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.C
    public final C a() {
        int i = b4.a;
        Objects.requireNonNull(null);
        return new A2(this, b4.a, 1);
    }

    @Override // j$.util.stream.C
    public final C c() {
        int i = b4.a;
        Objects.requireNonNull(null);
        return new R3(this, b4.b, 0);
    }

    @Override // j$.util.stream.C
    public final C distinct() {
        return ((AbstractC10404a2) boxed()).distinct().mapToDouble(new j$.time.f(29));
    }

    @Override // j$.util.stream.C
    public final double sum() {
        double[] dArr = (double[]) collect(new C10471o(2), new C10471o(3), new j$.time.f(21));
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        return (Double.isNaN(d) && Double.isInfinite(d2)) ? d2 : d;
    }

    @Override // j$.util.stream.C
    public final C10536z min() {
        return reduce(new j$.time.f(22));
    }

    @Override // j$.util.stream.C
    public final C10536z max() {
        return reduce(new C10471o(1));
    }

    @Override // j$.util.stream.C
    public final C10536z average() {
        double[] dArr = (double[]) collect(new j$.time.f(23), new j$.time.f(24), new j$.time.f(25));
        if (dArr[2] <= 0.0d) {
            return C10536z.c;
        }
        Set set = Collectors.a;
        double d = dArr[0] + dArr[1];
        double d2 = dArr[dArr.length - 1];
        if (Double.isNaN(d) && Double.isInfinite(d2)) {
            d = d2;
        }
        return new C10536z(d / dArr[2]);
    }

    @Override // j$.util.stream.C
    public final C10532v summaryStatistics() {
        return (C10532v) collect(new j$.time.f(11), new j$.time.f(26), new j$.time.f(27));
    }

    @Override // j$.util.stream.C
    public final Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        C10476p c10476p = new C10476p(biConsumer, 0);
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(objDoubleConsumer);
        Objects.requireNonNull(c10476p);
        return C(new C10522y1(W2.DOUBLE_VALUE, c10476p, objDoubleConsumer, supplier, 1));
    }

    @Override // j$.util.stream.C
    public final boolean p() {
        return ((Boolean) C(AbstractC10497t1.R(EnumC10486r0.ANY))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final boolean h() {
        return ((Boolean) C(AbstractC10497t1.R(EnumC10486r0.ALL))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final boolean y() {
        return ((Boolean) C(AbstractC10497t1.R(EnumC10486r0.NONE))).booleanValue();
    }

    @Override // j$.util.stream.C
    public final double[] toArray() {
        return (double[]) AbstractC10497t1.K((InterfaceC10521y0) D(new C10471o(0))).d();
    }

    @Override // j$.util.stream.C
    public final double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return ((Double) C(new C1(W2.DOUBLE_VALUE, doubleBinaryOperator, d))).doubleValue();
    }

    @Override // j$.util.stream.C
    public final C10536z reduce(DoubleBinaryOperator doubleBinaryOperator) {
        Objects.requireNonNull(doubleBinaryOperator);
        return (C10536z) C(new C10512w1(W2.DOUBLE_VALUE, doubleBinaryOperator, 1));
    }

    @Override // j$.util.stream.C
    public final long count() {
        return ((Long) C(new A1(1))).longValue();
    }
}
