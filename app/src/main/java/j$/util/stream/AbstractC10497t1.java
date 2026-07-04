package j$.util.stream;

import j$.util.C10387e;
import j$.util.C10397o;
import j$.util.Objects;
import j$.util.Spliterator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.LongConsumer;
import java.util.function.Predicate;
import java.util.stream.Collector;

/* JADX INFO: renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10497t1 implements D3 {
    public static final W0 a = new W0();
    public static final U0 b = new U0();
    public static final V0 c = new V0();
    public static final T0 d = new T0();
    public static final int[] e = new int[0];
    public static final long[] f = new long[0];
    public static final double[] g = new double[0];

    public abstract O1 Z();

    @Override // j$.util.stream.D3
    public /* synthetic */ int d() {
        return 0;
    }

    public static C10397o O(Function function) {
        C10397o c10397o = new C10397o(5);
        c10397o.b = function;
        return c10397o;
    }

    public static Set N(Set set) {
        if (set == null || set.isEmpty()) {
            return set;
        }
        HashSet hashSet = new HashSet();
        Object next = set.iterator().next();
        if (next instanceof EnumC10436h) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                try {
                    EnumC10436h enumC10436h = (EnumC10436h) it.next();
                    hashSet.add(enumC10436h == null ? null : enumC10436h == EnumC10436h.CONCURRENT ? Collector.Characteristics.CONCURRENT : enumC10436h == EnumC10436h.UNORDERED ? Collector.Characteristics.UNORDERED : Collector.Characteristics.IDENTITY_FINISH);
                } catch (ClassCastException e2) {
                    C10387e.a("java.util.stream.Collector.Characteristics", e2);
                    throw null;
                }
            }
        } else {
            if (!(next instanceof Collector.Characteristics)) {
                C10387e.a("java.util.stream.Collector.Characteristics", next.getClass());
                throw null;
            }
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                try {
                    Collector.Characteristics characteristics = (Collector.Characteristics) it2.next();
                    hashSet.add(characteristics == null ? null : characteristics == Collector.Characteristics.CONCURRENT ? EnumC10436h.CONCURRENT : characteristics == Collector.Characteristics.UNORDERED ? EnumC10436h.UNORDERED : EnumC10436h.IDENTITY_FINISH);
                } catch (ClassCastException e3) {
                    C10387e.a("java.util.stream.Collector.Characteristics", e3);
                    throw null;
                }
            }
        }
        return hashSet;
    }

    public static long x(long j, long j2, long j3) {
        if (j >= 0) {
            return Math.max(-1L, Math.min(j - j2, j3));
        }
        return -1L;
    }

    public static long A(long j, long j2) {
        long j3 = j2 >= 0 ? j + j2 : Long.MAX_VALUE;
        if (j3 >= 0) {
            return j3;
        }
        return Long.MAX_VALUE;
    }

    public static Y1 a0(Spliterator spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new Y1(spliterator, V2.q(spliterator), z);
    }

    public static Spliterator y(W2 w2, Spliterator spliterator, long j, long j2) {
        long jA = A(j, j2);
        int i = AbstractC10488r2.a[w2.ordinal()];
        if (i == 1) {
            return new C10480p3(spliterator, j, jA);
        }
        if (i == 2) {
            return new C10465m3((j$.util.V) spliterator, j, jA);
        }
        if (i == 3) {
            return new C10470n3((j$.util.Y) spliterator, j, jA);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + w2);
        }
        return new C10460l3((j$.util.S) spliterator, j, jA);
    }

    public static j$.time.format.u X(EnumC10486r0 enumC10486r0, Predicate predicate) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(enumC10486r0);
        return new j$.time.format.u(W2.REFERENCE, enumC10486r0, new j$.time.format.u(6, enumC10486r0, predicate));
    }

    public static X0 H(W2 w2) {
        int i = F0.a[w2.ordinal()];
        if (i == 1) {
            return a;
        }
        if (i == 2) {
            return b;
        }
        if (i == 3) {
            return c;
        }
        if (i == 4) {
            return d;
        }
        throw new IllegalStateException("Unknown shape " + w2);
    }

    public static j$.time.format.u T(EnumC10486r0 enumC10486r0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC10486r0);
        return new j$.time.format.u(W2.INT_VALUE, enumC10486r0, new C10457l0(enumC10486r0, 1));
    }

    public static C10454k2 Y(AbstractC10404a2 abstractC10404a2, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C10454k2(abstractC10404a2, I(j2), j, j2);
    }

    public static E0 w(E0 e0, long j, long j2, IntFunction intFunction) {
        if (j == 0 && j2 == e0.count()) {
            return e0;
        }
        Spliterator spliterator = e0.spliterator();
        long j3 = j2 - j;
        InterfaceC10511w0 interfaceC10511w0Z = z(j3, intFunction);
        interfaceC10511w0Z.l(j3);
        for (int i = 0; i < j && spliterator.tryAdvance(new C10402a0(5)); i++) {
        }
        if (j2 == e0.count()) {
            spliterator.forEachRemaining(interfaceC10511w0Z);
        } else {
            for (int i2 = 0; i2 < j3 && spliterator.tryAdvance(interfaceC10511w0Z); i2++) {
            }
        }
        interfaceC10511w0Z.k();
        return interfaceC10511w0Z.a();
    }

    public static G0 F(W2 w2, E0 e0, E0 e02) {
        int i = F0.a[w2.ordinal()];
        if (i == 1) {
            return new P0(e0, e02);
        }
        if (i == 2) {
            return new M0((A0) e0, (A0) e02);
        }
        if (i == 3) {
            return new N0((C0) e0, (C0) e02);
        }
        if (i != 4) {
            throw new IllegalStateException("Unknown shape " + w2);
        }
        return new L0((InterfaceC10521y0) e0, (InterfaceC10521y0) e02);
    }

    public static j$.time.format.u V(EnumC10486r0 enumC10486r0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC10486r0);
        return new j$.time.format.u(W2.LONG_VALUE, enumC10486r0, new C10457l0(enumC10486r0, 0));
    }

    public static void k() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static j$.time.format.u R(EnumC10486r0 enumC10486r0) {
        Objects.requireNonNull(null);
        Objects.requireNonNull(enumC10486r0);
        return new j$.time.format.u(W2.DOUBLE_VALUE, enumC10486r0, new C10457l0(enumC10486r0, 2));
    }

    public static void l() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static InterfaceC10511w0 z(long j, IntFunction intFunction) {
        if (j >= 0 && j < 2147483639) {
            return new Y0(j, intFunction);
        }
        return new C10483q1();
    }

    public static void a() {
        throw new IllegalStateException("called wrong accept method");
    }

    public static void g(InterfaceC10434g2 interfaceC10434g2, Integer num) {
        if (F3.a) {
            F3.a(interfaceC10434g2.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        interfaceC10434g2.accept(num.intValue());
    }

    public static void i(InterfaceC10439h2 interfaceC10439h2, Long l) {
        if (F3.a) {
            F3.a(interfaceC10439h2.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        interfaceC10439h2.accept(l.longValue());
    }

    public static InterfaceC10501u0 P(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C10408b1();
        }
        return new C10403a1(j);
    }

    public static void e(InterfaceC10429f2 interfaceC10429f2, Double d2) {
        if (F3.a) {
            F3.a(interfaceC10429f2.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        interfaceC10429f2.accept(d2.doubleValue());
    }

    public static C10464m2 U(Z z, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C10464m2(z, I(j2), j, j2);
    }

    public static InterfaceC10506v0 Q(long j) {
        if (j < 0 || j >= 2147483639) {
            return new C10453k1();
        }
        return new C10448j1(j);
    }

    public static Object[] m(D0 d0, IntFunction intFunction) {
        if (F3.a) {
            F3.a(d0.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (d0.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) d0.count());
        d0.i(objArr, 0);
        return objArr;
    }

    public static InterfaceC10496t0 G(long j) {
        if (j < 0 || j >= 2147483639) {
            return new S0();
        }
        return new R0(j);
    }

    public static E0 B(AbstractC10401a abstractC10401a, Spliterator spliterator, boolean z, IntFunction intFunction) {
        long jF = abstractC10401a.F(spliterator);
        if (jF < 0 || !spliterator.hasCharacteristics(16384)) {
            K k = new K();
            k.a = intFunction;
            E0 e0 = (E0) new J0(abstractC10401a, spliterator, k, new C10402a0(13), 3).invoke();
            return z ? J(e0, intFunction) : e0;
        }
        if (jF >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jF);
        new C10473o1(spliterator, abstractC10401a, objArr).invoke();
        return new H0(objArr);
    }

    public static void r(A0 a0, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            a0.e((IntConsumer) consumer);
        } else {
            if (F3.a) {
                F3.a(a0.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.V) a0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static C10474o2 W(AbstractC10437h0 abstractC10437h0, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C10474o2(abstractC10437h0, I(j2), j, j2);
    }

    public static void o(A0 a0, Integer[] numArr, int i) {
        if (F3.a) {
            F3.a(a0.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) a0.d();
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i + i2] = Integer.valueOf(iArr[i2]);
        }
    }

    public static A0 u(A0 a0, long j, long j2) {
        if (j == 0 && j2 == a0.count()) {
            return a0;
        }
        long j3 = j2 - j;
        j$.util.V v = (j$.util.V) a0.spliterator();
        InterfaceC10501u0 interfaceC10501u0P = P(j3);
        interfaceC10501u0P.l(j3);
        for (int i = 0; i < j && v.tryAdvance((IntConsumer) new C10526z0(0)); i++) {
        }
        if (j2 == a0.count()) {
            v.forEachRemaining((IntConsumer) interfaceC10501u0P);
        } else {
            for (int i2 = 0; i2 < j3 && v.tryAdvance((IntConsumer) interfaceC10501u0P); i2++) {
            }
        }
        interfaceC10501u0P.k();
        return interfaceC10501u0P.a();
    }

    public static A0 D(AbstractC10401a abstractC10401a, Spliterator spliterator, boolean z) {
        long jF = abstractC10401a.F(spliterator);
        if (jF < 0 || !spliterator.hasCharacteristics(16384)) {
            A0 a0 = (A0) new J0(abstractC10401a, spliterator, new C10402a0(9), new C10402a0(10), 1).invoke();
            return z ? L(a0) : a0;
        }
        if (jF >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jF];
        new C10463m1(spliterator, abstractC10401a, iArr).invoke();
        return new Z0(iArr);
    }

    public static C0 E(AbstractC10401a abstractC10401a, Spliterator spliterator, boolean z) {
        long jF = abstractC10401a.F(spliterator);
        if (jF < 0 || !spliterator.hasCharacteristics(16384)) {
            C0 c0 = (C0) new J0(abstractC10401a, spliterator, new C10402a0(11), new C10402a0(12), 2).invoke();
            return z ? M(c0) : c0;
        }
        if (jF >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jF];
        new C10468n1(spliterator, abstractC10401a, jArr).invoke();
        return new C10443i1(jArr);
    }

    public static void s(C0 c0, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            c0.e((LongConsumer) consumer);
        } else {
            if (F3.a) {
                F3.a(c0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.Y) c0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void p(C0 c0, Long[] lArr, int i) {
        if (F3.a) {
            F3.a(c0.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) c0.d();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i + i2] = Long.valueOf(jArr[i2]);
        }
    }

    public static C0 v(C0 c0, long j, long j2) {
        if (j == 0 && j2 == c0.count()) {
            return c0;
        }
        long j3 = j2 - j;
        j$.util.Y y = (j$.util.Y) c0.spliterator();
        InterfaceC10506v0 interfaceC10506v0Q = Q(j3);
        interfaceC10506v0Q.l(j3);
        for (int i = 0; i < j && y.tryAdvance((LongConsumer) new B0(0)); i++) {
        }
        if (j2 == c0.count()) {
            y.forEachRemaining((LongConsumer) interfaceC10506v0Q);
        } else {
            for (int i2 = 0; i2 < j3 && y.tryAdvance((LongConsumer) interfaceC10506v0Q); i2++) {
            }
        }
        interfaceC10506v0Q.k();
        return interfaceC10506v0Q.a();
    }

    public static InterfaceC10521y0 C(AbstractC10401a abstractC10401a, Spliterator spliterator, boolean z) {
        long jF = abstractC10401a.F(spliterator);
        if (jF < 0 || !spliterator.hasCharacteristics(16384)) {
            InterfaceC10521y0 interfaceC10521y0 = (InterfaceC10521y0) new J0(abstractC10401a, spliterator, new C10402a0(7), new C10402a0(8), 0).invoke();
            return z ? K(interfaceC10521y0) : interfaceC10521y0;
        }
        if (jF >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jF];
        new C10458l1(spliterator, abstractC10401a, dArr).invoke();
        return new Q0(dArr);
    }

    public static C10484q2 S(AbstractC10525z abstractC10525z, long j, long j2) {
        if (j < 0) {
            throw new IllegalArgumentException("Skip must be non-negative: " + j);
        }
        return new C10484q2(abstractC10525z, I(j2), j, j2);
    }

    public static E0 J(E0 e0, IntFunction intFunction) {
        if (e0.q() <= 0) {
            return e0;
        }
        long jCount = e0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) intFunction.apply((int) jCount);
        new C10492s1(e0, objArr, 1).invoke();
        return new H0(objArr);
    }

    public static void q(InterfaceC10521y0 interfaceC10521y0, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            interfaceC10521y0.e((DoubleConsumer) consumer);
        } else {
            if (F3.a) {
                F3.a(interfaceC10521y0.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((j$.util.S) interfaceC10521y0.spliterator()).forEachRemaining(consumer);
        }
    }

    public static A0 L(A0 a0) {
        if (a0.q() <= 0) {
            return a0;
        }
        long jCount = a0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new C10487r1(a0, iArr, 0).invoke();
        return new Z0(iArr);
    }

    public static void n(InterfaceC10521y0 interfaceC10521y0, Double[] dArr, int i) {
        if (F3.a) {
            F3.a(interfaceC10521y0.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) interfaceC10521y0.d();
        for (int i2 = 0; i2 < dArr2.length; i2++) {
            dArr[i + i2] = Double.valueOf(dArr2[i2]);
        }
    }

    public static InterfaceC10521y0 t(InterfaceC10521y0 interfaceC10521y0, long j, long j2) {
        if (j == 0 && j2 == interfaceC10521y0.count()) {
            return interfaceC10521y0;
        }
        long j3 = j2 - j;
        j$.util.S s = (j$.util.S) interfaceC10521y0.spliterator();
        InterfaceC10496t0 interfaceC10496t0G = G(j3);
        interfaceC10496t0G.l(j3);
        for (int i = 0; i < j && s.tryAdvance((DoubleConsumer) new C10516x0(0)); i++) {
        }
        if (j2 == interfaceC10521y0.count()) {
            s.forEachRemaining((DoubleConsumer) interfaceC10496t0G);
        } else {
            for (int i2 = 0; i2 < j3 && s.tryAdvance((DoubleConsumer) interfaceC10496t0G); i2++) {
            }
        }
        interfaceC10496t0G.k();
        return interfaceC10496t0G.a();
    }

    public static C0 M(C0 c0) {
        if (c0.q() <= 0) {
            return c0;
        }
        long jCount = c0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new C10487r1(c0, jArr, 0).invoke();
        return new C10443i1(jArr);
    }

    public static int I(long j) {
        return (j != -1 ? V2.u : 0) | V2.t;
    }

    public static InterfaceC10521y0 K(InterfaceC10521y0 interfaceC10521y0) {
        if (interfaceC10521y0.q() <= 0) {
            return interfaceC10521y0;
        }
        long jCount = interfaceC10521y0.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new C10487r1(interfaceC10521y0, dArr, 0).invoke();
        return new Q0(dArr);
    }

    @Override // j$.util.stream.D3
    public Object b(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        O1 o1Z = Z();
        abstractC10401a.Q(spliterator, o1Z);
        return o1Z.get();
    }

    @Override // j$.util.stream.D3
    public Object c(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        return ((O1) new V1(this, abstractC10401a, spliterator).invoke()).get();
    }
}
