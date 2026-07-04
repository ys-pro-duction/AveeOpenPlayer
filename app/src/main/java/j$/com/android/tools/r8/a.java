package j$.com.android.tools.r8;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.c;
import j$.time.chrono.AbstractC10374a;
import j$.time.chrono.AbstractC10381h;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.F;
import j$.time.chrono.InterfaceC10375b;
import j$.time.chrono.k;
import j$.time.chrono.n;
import j$.time.chrono.r;
import j$.time.chrono.z;
import j$.time.f;
import j$.time.format.u;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalField;
import j$.time.temporal.o;
import j$.time.temporal.p;
import j$.util.A;
import j$.util.B;
import j$.util.C10385c;
import j$.util.C10536z;
import j$.util.EnumC10386d;
import j$.util.InterfaceC10534x;
import j$.util.J;
import j$.util.Map;
import j$.util.Objects;
import j$.util.S;
import j$.util.Spliterator;
import j$.util.V;
import j$.util.Y;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.l;
import j$.util.function.b;
import j$.util.function.e;
import j$.util.r0;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void K(Map map, BiConsumer biConsumer) {
        if (map instanceof j$.util.Map) {
            ((j$.util.Map) map).forEach(biConsumer);
        } else if (map instanceof ConcurrentMap) {
            i((ConcurrentMap) map, biConsumer);
        } else {
            Map.CC.$default$forEach(map, biConsumer);
        }
    }

    public static /* synthetic */ long O(long j, long j2) {
        long j3 = j + j2;
        if (((j2 ^ j) < 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ AbstractMap.SimpleImmutableEntry P(String str, String str2) {
        return new AbstractMap.SimpleImmutableEntry(Objects.requireNonNull(str), Objects.requireNonNull(str2));
    }

    public static /* synthetic */ List Q(Object[] objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(Objects.requireNonNull(obj));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static /* synthetic */ boolean R(Unsafe unsafe, Object obj, long j, l lVar) {
        while (true) {
            Unsafe unsafe2 = unsafe;
            Object obj2 = obj;
            long j2 = j;
            l lVar2 = lVar;
            if (unsafe2.compareAndSwapObject(obj2, j2, (Object) null, lVar2)) {
                return true;
            }
            if (unsafe2.getObject(obj2, j2) != null) {
                return false;
            }
            unsafe = unsafe2;
            obj = obj2;
            j = j2;
            lVar = lVar2;
        }
    }

    public static /* synthetic */ long S(long j, long j2) {
        long j3 = j % j2;
        if (j3 == 0) {
            return 0L;
        }
        return (((j ^ j2) >> 63) | 1) > 0 ? j3 : j3 + j2;
    }

    public static /* synthetic */ long T(long j, long j2) {
        long j3 = j / j2;
        return (j - (j2 * j3) != 0 && (((j ^ j2) >> 63) | 1) < 0) ? j3 - 1 : j3;
    }

    public static /* synthetic */ long U(long j, long j2) {
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (iNumberOfLeadingZeros > 65) {
            return j * j2;
        }
        if (iNumberOfLeadingZeros >= 64) {
            if ((j >= 0) | (j2 != Long.MIN_VALUE)) {
                long j3 = j * j2;
                if (j == 0 || j3 / j == j2) {
                    return j3;
                }
            }
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ long V(long j, long j2) {
        long j3 = j - j2;
        if (((j2 ^ j) >= 0) || ((j ^ j3) >= 0)) {
            return j3;
        }
        throw new ArithmeticException();
    }

    public static /* synthetic */ Object Y(java.util.Map map, Object obj, Object obj2) {
        return map instanceof j$.util.Map ? ((j$.util.Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public static Optional G(j$.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return Optional.of(optional.get());
        }
        return Optional.empty();
    }

    public static j$.util.Optional C(Optional optional) {
        if (optional == null) {
            return null;
        }
        if (optional.isPresent()) {
            return j$.util.Optional.of(optional.get());
        }
        return j$.util.Optional.empty();
    }

    public static OptionalDouble H(C10536z c10536z) {
        if (c10536z == null) {
            return null;
        }
        boolean z = c10536z.a;
        if (!z) {
            return OptionalDouble.empty();
        }
        if (z) {
            return OptionalDouble.of(c10536z.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static C10536z D(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        if (!optionalDouble.isPresent()) {
            return C10536z.c;
        }
        return new C10536z(optionalDouble.getAsDouble());
    }

    public static OptionalLong J(A a) {
        if (a == null) {
            return null;
        }
        boolean z = a.a;
        if (!z) {
            return OptionalLong.empty();
        }
        if (z) {
            return OptionalLong.of(a.b);
        }
        throw new NoSuchElementException("No value present");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.b] */
    public static b d(final DoubleConsumer doubleConsumer, final DoubleConsumer doubleConsumer2) {
        Objects.requireNonNull(doubleConsumer2);
        return new DoubleConsumer() { // from class: j$.util.function.b
            public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer3) {
                return j$.com.android.tools.r8.a.d(this, doubleConsumer3);
            }

            @Override // java.util.function.DoubleConsumer
            public final void accept(double d) {
                doubleConsumer.accept(d);
                doubleConsumer2.accept(d);
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.function.e] */
    public static e e(final LongConsumer longConsumer, final LongConsumer longConsumer2) {
        Objects.requireNonNull(longConsumer2);
        return new LongConsumer() { // from class: j$.util.function.e
            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer3) {
                return j$.com.android.tools.r8.a.e(this, longConsumer3);
            }

            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                longConsumer.accept(j);
                longConsumer2.accept(j);
            }
        };
    }

    public static A F(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        if (!optionalLong.isPresent()) {
            return A.c;
        }
        return new A(optionalLong.getAsLong());
    }

    public static u b(BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(biConsumer2);
        return new u(2, biConsumer, biConsumer2);
    }

    public static u c(BiFunction biFunction, Function function) {
        Objects.requireNonNull(function);
        return new u(3, biFunction, function);
    }

    public static OptionalInt I(j$.util.OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        boolean z = optionalInt.a;
        if (!z) {
            return OptionalInt.empty();
        }
        if (z) {
            return OptionalInt.of(optionalInt.b);
        }
        throw new NoSuchElementException("No value present");
    }

    public static j$.util.OptionalInt E(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        if (!optionalInt.isPresent()) {
            return j$.util.OptionalInt.c;
        }
        return new j$.util.OptionalInt(optionalInt.getAsInt());
    }

    public static Object N(java.util.Map map, Object obj, Object obj2) {
        if (map instanceof j$.util.Map) {
            return ((j$.util.Map) map).getOrDefault(obj, obj2);
        }
        if (!(map instanceof ConcurrentMap)) {
            return Map.CC.$default$getOrDefault(map, obj, obj2);
        }
        Object obj3 = ((ConcurrentMap) map).get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    public static void i(ConcurrentMap concurrentMap, BiConsumer biConsumer) {
        Objects.requireNonNull(biConsumer);
        for (Map.Entry entry : concurrentMap.entrySet()) {
            try {
                biConsumer.accept(entry.getKey(), entry.getValue());
            } catch (IllegalStateException unused) {
            }
        }
    }

    public static String W(Object obj, Object obj2) {
        String string;
        String string2;
        String str = "null";
        if (obj == null || (string = obj.toString()) == null) {
            string = "null";
        }
        int length = string.length();
        if (obj2 != null && (string2 = obj2.toString()) != null) {
            str = string2;
        }
        int length2 = str.length();
        char[] cArr = new char[length + length2 + 1];
        string.getChars(0, length, cArr, 0);
        cArr[length] = '=';
        str.getChars(0, length2, cArr, length + 1);
        return new String(cArr);
    }

    public static void L(Iterator it, Consumer consumer) {
        if (it instanceof InterfaceC10534x) {
            ((InterfaceC10534x) it).forEachRemaining(consumer);
            return;
        }
        Objects.requireNonNull(consumer);
        while (it.hasNext()) {
            consumer.accept(it.next());
        }
    }

    public static boolean s(j$.time.chrono.l lVar, TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.ERA : temporalField != null && temporalField.q(lVar);
    }

    public static k M(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        Object objRequireNonNull = (k) lVar.k(o.b);
        r rVar = r.c;
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(rVar, "defaultObj");
        }
        return (k) objRequireNonNull;
    }

    public static j$.time.a Z() {
        String id = TimeZone.getDefault().getID();
        Objects.requireNonNull(id, "zoneId");
        java.util.Map map = ZoneId.a;
        Objects.requireNonNull(map, "aliasMap");
        Object objRequireNonNull = (String) map.get(id);
        if (objRequireNonNull == null) {
            objRequireNonNull = Objects.requireNonNull(id, "defaultObj");
        }
        return new j$.time.a(ZoneId.L((String) objRequireNonNull, true));
    }

    public static int m(ChronoZonedDateTime chronoZonedDateTime, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC10381h.a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i != 2) {
                return chronoZonedDateTime.A().get(temporalField);
            }
            return chronoZonedDateTime.h().b;
        }
        return o.a(chronoZonedDateTime, temporalField);
    }

    public static int n(j$.time.chrono.l lVar, ChronoField chronoField) {
        if (chronoField == ChronoField.ERA) {
            return lVar.getValue();
        }
        return o.a(lVar, chronoField);
    }

    public static C10385c a0(EnumC10386d enumC10386d, Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C10385c(enumC10386d, comparator);
    }

    public static long p(j$.time.chrono.l lVar, TemporalField temporalField) {
        if (temporalField == ChronoField.ERA) {
            return lVar.getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new p(c.a("Unsupported field: ", temporalField));
        }
        return temporalField.k(lVar);
    }

    public static k X(String str) {
        ConcurrentHashMap concurrentHashMap = AbstractC10374a.a;
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap2 = AbstractC10374a.a;
            k kVar = (k) concurrentHashMap2.get(str);
            if (kVar == null) {
                kVar = (k) AbstractC10374a.b.get(str);
            }
            if (kVar != null) {
                return kVar;
            }
            if (concurrentHashMap2.get("ISO") != null) {
                for (k kVar2 : ServiceLoader.load(k.class)) {
                    if (str.equals(kVar2.m()) || str.equals(kVar2.t())) {
                        return kVar2;
                    }
                }
                throw new j$.time.b("Unknown chronology: " + str);
            }
            n nVar = n.l;
            AbstractC10374a.q(nVar, nVar.m());
            j$.time.chrono.u uVar = j$.time.chrono.u.c;
            AbstractC10374a.q(uVar, uVar.m());
            z zVar = z.c;
            AbstractC10374a.q(zVar, zVar.m());
            F f = F.c;
            AbstractC10374a.q(f, f.m());
            try {
                for (AbstractC10374a abstractC10374a : Arrays.asList(new AbstractC10374a[0])) {
                    if (!abstractC10374a.m().equals("ISO")) {
                        AbstractC10374a.q(abstractC10374a, abstractC10374a.m());
                    }
                }
                r rVar = r.c;
                AbstractC10374a.q(rVar, rVar.m());
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
    }

    public static Object w(j$.time.chrono.l lVar, f fVar) {
        if (fVar == o.c) {
            return ChronoUnit.ERAS;
        }
        return o.c(lVar, fVar);
    }

    public static Object u(ChronoLocalDateTime chronoLocalDateTime, f fVar) {
        if (fVar == o.a || fVar == o.e || fVar == o.d) {
            return null;
        }
        if (fVar == o.g) {
            return chronoLocalDateTime.b();
        }
        if (fVar == o.b) {
            return chronoLocalDateTime.a();
        }
        if (fVar == o.c) {
            return ChronoUnit.NANOS;
        }
        return fVar.h(chronoLocalDateTime);
    }

    public static boolean r(InterfaceC10375b interfaceC10375b, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).y();
        }
        return temporalField != null && temporalField.q(interfaceC10375b);
    }

    public static long o(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean q(Spliterator spliterator, int i) {
        return (spliterator.characteristics() & i) == i;
    }

    public static long x(ChronoLocalDateTime chronoLocalDateTime, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((chronoLocalDateTime.c().v() * 86400) + ((long) chronoLocalDateTime.b().X())) - ((long) zoneOffset.b);
    }

    public static Object v(ChronoZonedDateTime chronoZonedDateTime, f fVar) {
        if (fVar == o.e || fVar == o.a) {
            return chronoZonedDateTime.getZone();
        }
        if (fVar == o.d) {
            return chronoZonedDateTime.h();
        }
        if (fVar == o.g) {
            return chronoZonedDateTime.b();
        }
        if (fVar == o.b) {
            return chronoZonedDateTime.a();
        }
        if (fVar == o.c) {
            return ChronoUnit.NANOS;
        }
        return fVar.h(chronoZonedDateTime);
    }

    public static int g(ChronoLocalDateTime chronoLocalDateTime, ChronoLocalDateTime chronoLocalDateTime2) {
        int iH = chronoLocalDateTime.c().compareTo(chronoLocalDateTime2.c());
        return (iH == 0 && (iH = chronoLocalDateTime.b().K(chronoLocalDateTime2.b())) == 0) ? ((AbstractC10374a) chronoLocalDateTime.a()).m().compareTo(chronoLocalDateTime2.a().m()) : iH;
    }

    public static Object t(InterfaceC10375b interfaceC10375b, f fVar) {
        if (fVar == o.a || fVar == o.e || fVar == o.d || fVar == o.g) {
            return null;
        }
        if (fVar == o.b) {
            return interfaceC10375b.a();
        }
        if (fVar == o.c) {
            return ChronoUnit.DAYS;
        }
        return fVar.h(interfaceC10375b);
    }

    public static j$.time.temporal.k a(InterfaceC10375b interfaceC10375b, j$.time.temporal.k kVar) {
        return kVar.d(interfaceC10375b.v(), ChronoField.EPOCH_DAY);
    }

    public static long y(ChronoZonedDateTime chronoZonedDateTime) {
        return ((chronoZonedDateTime.c().v() * 86400) + ((long) chronoZonedDateTime.b().X())) - ((long) chronoZonedDateTime.h().b);
    }

    public static int h(ChronoZonedDateTime chronoZonedDateTime, ChronoZonedDateTime chronoZonedDateTime2) {
        int iCompare = Long.compare(chronoZonedDateTime.J(), chronoZonedDateTime2.J());
        return (iCompare == 0 && (iCompare = chronoZonedDateTime.b().d - chronoZonedDateTime2.b().d) == 0 && (iCompare = chronoZonedDateTime.A().compareTo(chronoZonedDateTime2.A())) == 0 && (iCompare = chronoZonedDateTime.getZone().m().compareTo(chronoZonedDateTime2.getZone().m())) == 0) ? ((AbstractC10374a) chronoZonedDateTime.a()).m().compareTo(chronoZonedDateTime2.a().m()) : iCompare;
    }

    public static boolean A(V v, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return v.tryAdvance((IntConsumer) consumer);
        }
        if (r0.a) {
            r0.a(v.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return v.tryAdvance((IntConsumer) new j$.util.F(consumer, 0));
    }

    public static void k(V v, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            v.forEachRemaining((IntConsumer) consumer);
        } else {
            if (r0.a) {
                r0.a(v.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            v.forEachRemaining((IntConsumer) new j$.util.F(consumer, 0));
        }
    }

    public static int f(InterfaceC10375b interfaceC10375b, InterfaceC10375b interfaceC10375b2) {
        int iCompare = Long.compare(interfaceC10375b.v(), interfaceC10375b2.v());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC10374a) interfaceC10375b.a()).m().compareTo(interfaceC10375b2.a().m());
    }

    public static boolean B(Y y, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return y.tryAdvance((LongConsumer) consumer);
        }
        if (r0.a) {
            r0.a(y.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return y.tryAdvance((LongConsumer) new J(consumer, 0));
    }

    public static void l(Y y, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            y.forEachRemaining((LongConsumer) consumer);
        } else {
            if (r0.a) {
                r0.a(y.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            y.forEachRemaining((LongConsumer) new J(consumer, 0));
        }
    }

    public static boolean z(S s, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return s.tryAdvance((DoubleConsumer) consumer);
        }
        if (r0.a) {
            r0.a(s.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return s.tryAdvance((DoubleConsumer) new B(consumer, 0));
    }

    public static void j(S s, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            s.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (r0.a) {
                r0.a(s.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            s.forEachRemaining((DoubleConsumer) new B(consumer, 0));
        }
    }

    public Spliterator trySplit() {
        return null;
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public long estimateSize() {
        return 0L;
    }

    public int characteristics() {
        return 16448;
    }
}
