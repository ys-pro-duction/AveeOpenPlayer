package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.IntFunction;

/* JADX INFO: renamed from: j$.util.stream.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10466n extends Z1 {
    public static I0 T(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        j$.time.f fVar = new j$.time.f(18);
        j$.time.f fVar2 = new j$.time.f(19);
        j$.time.f fVar3 = new j$.time.f(20);
        Objects.requireNonNull(fVar);
        Objects.requireNonNull(fVar2);
        Objects.requireNonNull(fVar3);
        return new I0((Collection) new C10522y1(W2.REFERENCE, fVar3, fVar2, fVar, 3).c(abstractC10401a, spliterator));
    }

    @Override // j$.util.stream.AbstractC10401a
    public final E0 J(AbstractC10401a abstractC10401a, Spliterator spliterator, IntFunction intFunction) {
        if (V2.DISTINCT.r(abstractC10401a.f)) {
            return abstractC10401a.B(spliterator, false, intFunction);
        }
        if (V2.ORDERED.r(abstractC10401a.f)) {
            return T(abstractC10401a, spliterator);
        }
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        j$.time.format.u uVar = new j$.time.format.u(5, atomicBoolean, concurrentHashMap);
        Objects.requireNonNull(uVar);
        new O(uVar, false).e(abstractC10401a, spliterator);
        Set setKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(setKeySet);
            hashSet.add(null);
            setKeySet = hashSet;
        }
        return new I0(setKeySet);
    }

    @Override // j$.util.stream.AbstractC10401a
    public final Spliterator K(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        if (V2.DISTINCT.r(abstractC10401a.f)) {
            return abstractC10401a.S(spliterator);
        }
        if (V2.ORDERED.r(abstractC10401a.f)) {
            return T(abstractC10401a, spliterator).spliterator();
        }
        return new C10425e3(abstractC10401a.S(spliterator), new ConcurrentHashMap());
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        Objects.requireNonNull(interfaceC10444i2);
        if (V2.DISTINCT.r(i)) {
            return interfaceC10444i2;
        }
        if (V2.SORTED.r(i)) {
            return new C10456l(interfaceC10444i2);
        }
        return new C10461m(interfaceC10444i2);
    }
}
