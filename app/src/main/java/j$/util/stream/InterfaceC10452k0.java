package j$.util.stream;

import j$.util.C10397o;
import j$.util.C10535y;
import j$.util.C10536z;
import java.util.function.BiConsumer;
import java.util.function.LongBinaryOperator;
import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC10452k0 extends InterfaceC10431g {
    InterfaceC10452k0 a();

    C asDoubleStream();

    C10536z average();

    InterfaceC10452k0 b();

    Stream boxed();

    InterfaceC10452k0 c();

    Object collect(Supplier supplier, ObjLongConsumer objLongConsumer, BiConsumer biConsumer);

    long count();

    InterfaceC10452k0 d();

    InterfaceC10452k0 distinct();

    InterfaceC10452k0 e(C10397o c10397o);

    j$.util.A findAny();

    j$.util.A findFirst();

    void forEach(LongConsumer longConsumer);

    void forEachOrdered(LongConsumer longConsumer);

    @Override // j$.util.stream.InterfaceC10431g
    j$.util.M iterator();

    C k();

    InterfaceC10452k0 limit(long j);

    Stream mapToObj(LongFunction longFunction);

    j$.util.A max();

    j$.util.A min();

    boolean n();

    @Override // j$.util.stream.InterfaceC10431g
    InterfaceC10452k0 parallel();

    InterfaceC10452k0 peek(LongConsumer longConsumer);

    boolean q();

    long reduce(long j, LongBinaryOperator longBinaryOperator);

    j$.util.A reduce(LongBinaryOperator longBinaryOperator);

    @Override // j$.util.stream.InterfaceC10431g
    InterfaceC10452k0 sequential();

    InterfaceC10452k0 skip(long j);

    InterfaceC10452k0 sorted();

    @Override // j$.util.stream.InterfaceC10431g
    j$.util.Y spliterator();

    long sum();

    C10535y summaryStatistics();

    long[] toArray();

    boolean v();

    IntStream w();
}
