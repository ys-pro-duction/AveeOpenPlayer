package j$.util.stream;

import j$.util.C10397o;
import j$.util.Optional;
import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
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

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class T2 implements Stream, AutoCloseable {
    public final /* synthetic */ java.util.stream.Stream a;

    public /* synthetic */ T2(java.util.stream.Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ Stream j(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new T2(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Collector collector) {
        return this.a.collect(collector == null ? null : collector instanceof C10441i ? ((C10441i) collector).a : new C10446j(collector));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return j(this.a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return j(this.a.dropWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream e(C10397o c10397o) {
        return j(this.a.flatMap(AbstractC10497t1.O(c10397o)));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.a;
        if (obj instanceof T2) {
            obj = ((T2) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return j(this.a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findAny() {
        return j$.com.android.tools.r8.a.C(this.a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional findFirst() {
        return j$.com.android.tools.r8.a.C(this.a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return j(this.a.limit(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC10452k0 m(C10397o c10397o) {
        return C10442i0.j(this.a.flatMapToLong(AbstractC10497t1.O(c10397o)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return j(this.a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C mapToDouble(ToDoubleFunction toDoubleFunction) {
        return A.j(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ InterfaceC10452k0 mapToLong(ToLongFunction toLongFunction) {
        return C10442i0.j(this.a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional max(Comparator comparator) {
        return j$.com.android.tools.r8.a.C(this.a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional min(Comparator comparator) {
        return j$.com.android.tools.r8.a.C(this.a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream o(C10397o c10397o) {
        return IntStream.VivifiedWrapper.convert(this.a.flatMapToInt(AbstractC10497t1.O(c10397o)));
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g onClose(Runnable runnable) {
        return C10421e.j(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g parallel() {
        return C10421e.j(this.a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return j(this.a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return j$.com.android.tools.r8.a.C(this.a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ C s(C10397o c10397o) {
        return A.j(this.a.flatMapToDouble(AbstractC10497t1.O(c10397o)));
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g sequential() {
        return C10421e.j(this.a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return j(this.a.skip(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return j(this.a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return j(this.a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.c0.a(this.a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return j(this.a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final /* synthetic */ InterfaceC10431g unordered() {
        return C10421e.j(this.a.unordered());
    }
}
