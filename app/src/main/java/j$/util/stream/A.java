package j$.util.stream;

import j$.util.C10397o;
import j$.util.C10532v;
import j$.util.C10536z;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class A implements C, AutoCloseable {
    public final /* synthetic */ DoubleStream a;

    public /* synthetic */ A(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ C j(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof B ? ((B) doubleStream).a : new A(doubleStream);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C a() {
        return j(this.a.takeWhile(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C10536z average() {
        return j$.com.android.tools.r8.a.D(this.a.average());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C b() {
        return j(this.a.filter(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Stream boxed() {
        return T2.j(this.a.boxed());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C c() {
        return j(this.a.dropWhile(null));
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer) {
        return this.a.collect(supplier, objDoubleConsumer, biConsumer);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C d() {
        return j(this.a.map(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C distinct() {
        return j(this.a.distinct());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DoubleStream doubleStream = this.a;
        if (obj instanceof A) {
            obj = ((A) obj).a;
        }
        return doubleStream.equals(obj);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C10536z findAny() {
        return j$.com.android.tools.r8.a.D(this.a.findAny());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C10536z findFirst() {
        return j$.com.android.tools.r8.a.D(this.a.findFirst());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ void forEach(DoubleConsumer doubleConsumer) {
        this.a.forEach(doubleConsumer);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ void forEachOrdered(DoubleConsumer doubleConsumer) {
        this.a.forEachOrdered(doubleConsumer);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean h() {
        return this.a.allMatch(null);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ InterfaceC10452k0 i() {
        return C10442i0.j(this.a.mapToLong(null));
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.C, j$.util.stream.InterfaceC10431g
    public final /* synthetic */ j$.util.E iterator() {
        ?? it = this.a.iterator();
        if (it == 0) {
            return null;
        }
        return it instanceof j$.util.D ? ((j$.util.D) it).a : new j$.util.C(it);
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C limit(long j) {
        return j(this.a.limit(j));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ Stream mapToObj(DoubleFunction doubleFunction) {
        return T2.j(this.a.mapToObj(doubleFunction));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C10536z max() {
        return j$.com.android.tools.r8.a.D(this.a.max());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C10536z min() {
        return j$.com.android.tools.r8.a.D(this.a.min());
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g onClose(Runnable runnable) {
        return C10421e.j(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean p() {
        return this.a.anyMatch(null);
    }

    @Override // j$.util.stream.C, j$.util.stream.InterfaceC10431g
    public final /* synthetic */ C parallel() {
        return j(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g parallel() {
        return C10421e.j(this.a.parallel());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C peek(DoubleConsumer doubleConsumer) {
        return j(this.a.peek(doubleConsumer));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double reduce(double d, DoubleBinaryOperator doubleBinaryOperator) {
        return this.a.reduce(d, doubleBinaryOperator);
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C10536z reduce(DoubleBinaryOperator doubleBinaryOperator) {
        return j$.com.android.tools.r8.a.D(this.a.reduce(doubleBinaryOperator));
    }

    @Override // j$.util.stream.C, j$.util.stream.InterfaceC10431g
    public final /* synthetic */ C sequential() {
        return j(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g sequential() {
        return C10421e.j(this.a.sequential());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C skip(long j) {
        return j(this.a.skip(j));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ C sorted() {
        return j(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.C, j$.util.stream.InterfaceC10431g
    public final /* synthetic */ j$.util.S spliterator() {
        return j$.util.P.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.c0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ IntStream t() {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(null));
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g unordered() {
        return C10421e.j(this.a.unordered());
    }

    @Override // j$.util.stream.C
    public final /* synthetic */ boolean y() {
        return this.a.noneMatch(null);
    }

    @Override // j$.util.stream.C
    public final C10532v summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.C
    public final C e(C10397o c10397o) {
        DoubleStream doubleStream = this.a;
        C10397o c10397o2 = new C10397o(4);
        c10397o2.b = c10397o;
        return j(doubleStream.flatMap(c10397o2));
    }
}
