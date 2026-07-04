package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10491s0 extends AbstractC10406b {
    public final j$.time.format.u j;

    public C10491s0(j$.time.format.u uVar, AbstractC10401a abstractC10401a, Spliterator spliterator) {
        super(abstractC10401a, spliterator);
        this.j = uVar;
    }

    public C10491s0(C10491s0 c10491s0, Spliterator spliterator) {
        super(c10491s0, spliterator);
        this.j = c10491s0.j;
    }

    @Override // j$.util.stream.AbstractC10416d
    public final AbstractC10416d c(Spliterator spliterator) {
        return new C10491s0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC10416d
    public final Object a() {
        AbstractC10401a abstractC10401a = this.a;
        AbstractC10482q0 abstractC10482q0 = (AbstractC10482q0) ((Supplier) this.j.c).get();
        abstractC10401a.Q(this.b, abstractC10482q0);
        boolean z = abstractC10482q0.b;
        if (z == ((EnumC10486r0) this.j.b).b) {
            Boolean boolValueOf = Boolean.valueOf(z);
            AtomicReference atomicReference = this.h;
            while (!atomicReference.compareAndSet(null, boolValueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    @Override // j$.util.stream.AbstractC10406b
    public final Object h() {
        return Boolean.valueOf(!((EnumC10486r0) this.j.b).b);
    }
}
