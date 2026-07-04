package j$.util.stream;

import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10451k implements Collector {
    public final j$.time.f a;
    public final j$.time.f b;
    public final j$.time.f c;
    public final j$.time.f d;
    public final Set e;

    public C10451k(j$.time.f fVar, j$.time.f fVar2, j$.time.f fVar3, Set set) {
        Set set2 = Collectors.a;
        j$.time.f fVar4 = new j$.time.f(17);
        this.a = fVar;
        this.b = fVar2;
        this.c = fVar3;
        this.d = fVar4;
        this.e = set;
    }

    @Override // j$.util.stream.Collector
    public final BiConsumer accumulator() {
        return this.b;
    }

    @Override // j$.util.stream.Collector
    public final Supplier supplier() {
        return this.a;
    }

    @Override // j$.util.stream.Collector
    public final BinaryOperator combiner() {
        return this.c;
    }

    @Override // j$.util.stream.Collector
    public final Function finisher() {
        return this.d;
    }

    @Override // j$.util.stream.Collector
    public final Set characteristics() {
        return this.e;
    }
}
