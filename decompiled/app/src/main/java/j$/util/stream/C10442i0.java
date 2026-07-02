package j$.util.stream;

import j$.util.C10397o;
import j$.util.C10535y;
import j$.util.C10536z;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.stream.i0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10442i0 implements InterfaceC10452k0, AutoCloseable {
    public final /* synthetic */ LongStream a;

    public /* synthetic */ C10442i0(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ InterfaceC10452k0 j(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof C10447j0 ? ((C10447j0) longStream).a : new C10442i0(longStream);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ InterfaceC10452k0 a() {
        return j(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ C asDoubleStream() {
        return A.j(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ C10536z average() {
        return j$.com.android.tools.r8.a.D(this.a.average());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ InterfaceC10452k0 b() {
        return j(this.a.filter(null));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ Stream boxed() {
        return T2.j(this.a.boxed());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ InterfaceC10452k0 c() {
        return j(this.a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objLongConsumer, biConsumer);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ InterfaceC10452k0 d() {
        return j(this.a.map(null));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ InterfaceC10452k0 distinct() {
        return j(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        LongStream longStream = this.a;
        if (obj instanceof C10442i0) {
            obj = ((C10442i0) obj).a;
        }
        return longStream.equals(obj);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ j$.util.A findAny() {
        return j$.com.android.tools.r8.a.F(this.a.findAny());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ j$.util.A findFirst() {
        return j$.com.android.tools.r8.a.F(this.a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ void forEach(LongConsumer longConsumer) {
        this.a.forEach(longConsumer);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ void forEachOrdered(LongConsumer longConsumer) {
        this.a.forEachOrdered(longConsumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.InterfaceC10452k0, j$.util.stream.InterfaceC10431g
    public final /* synthetic */ j$.util.M iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.L ? ((j$.util.L) it).a : new j$.util.K(it);
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ C k() {
        return A.j(this.a.mapToDouble(null));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ InterfaceC10452k0 limit(long j) {
        return j(this.a.limit(j));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ Stream mapToObj(LongFunction longFunction) {
        return T2.j(this.a.mapToObj(longFunction));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ j$.util.A max() {
        return j$.com.android.tools.r8.a.F(this.a.max());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ j$.util.A min() {
        return j$.com.android.tools.r8.a.F(this.a.min());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ boolean n() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g onClose(Runnable runnable) {
        return C10421e.j(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g parallel() {
        return C10421e.j(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC10452k0, j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10452k0 parallel() {
        return j(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ InterfaceC10452k0 peek(LongConsumer longConsumer) {
        return j(this.a.peek(longConsumer));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ boolean q() {
        return this.a.allMatch(null);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ long reduce(long j, LongBinaryOperator longBinaryOperator) {
        return this.a.reduce(j, longBinaryOperator);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ j$.util.A reduce(LongBinaryOperator longBinaryOperator) {
        return j$.com.android.tools.r8.a.F(this.a.reduce(longBinaryOperator));
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g sequential() {
        return C10421e.j(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC10452k0, j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10452k0 sequential() {
        return j(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ InterfaceC10452k0 skip(long j) {
        return j(this.a.skip(j));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ InterfaceC10452k0 sorted() {
        return j(this.a.sorted());
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.c0.a(this.a.spliterator());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.InterfaceC10452k0, j$.util.stream.InterfaceC10431g
    public final /* synthetic */ j$.util.Y spliterator() {
        return j$.util.W.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g unordered() {
        return C10421e.j(this.a.unordered());
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ boolean v() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final /* synthetic */ IntStream w() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final C10535y summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC10452k0
    public final InterfaceC10452k0 e(C10397o c10397o) {
        LongStream longStream = this.a;
        C10397o c10397o2 = new C10397o(6);
        c10397o2.b = c10397o;
        return j(longStream.flatMap(c10397o2));
    }
}
