package j$.util.stream;

import j$.util.C10397o;
import j$.util.C10532v;
import j$.util.C10536z;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes2.dex */
public interface C extends InterfaceC10431g {
    C a();

    C10536z average();

    C b();

    Stream boxed();

    C c();

    Object collect(Supplier supplier, ObjDoubleConsumer objDoubleConsumer, BiConsumer biConsumer);

    long count();

    C d();

    C distinct();

    C e(C10397o c10397o);

    C10536z findAny();

    C10536z findFirst();

    void forEach(DoubleConsumer doubleConsumer);

    void forEachOrdered(DoubleConsumer doubleConsumer);

    boolean h();

    InterfaceC10452k0 i();

    @Override // j$.util.stream.InterfaceC10431g
    j$.util.E iterator();

    C limit(long j);

    Stream mapToObj(DoubleFunction doubleFunction);

    C10536z max();

    C10536z min();

    boolean p();

    @Override // j$.util.stream.InterfaceC10431g
    C parallel();

    C peek(DoubleConsumer doubleConsumer);

    double reduce(double d, DoubleBinaryOperator doubleBinaryOperator);

    C10536z reduce(DoubleBinaryOperator doubleBinaryOperator);

    @Override // j$.util.stream.InterfaceC10431g
    C sequential();

    C skip(long j);

    C sorted();

    @Override // j$.util.stream.InterfaceC10431g
    j$.util.S spliterator();

    double sum();

    C10532v summaryStatistics();

    IntStream t();

    double[] toArray();

    boolean y();
}
