package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public class K0 extends AbstractC10416d {
    public final AbstractC10401a h;
    public final LongFunction i;
    public final BinaryOperator j;

    @Override // j$.util.stream.AbstractC10416d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC10416d abstractC10416d = this.d;
        if (abstractC10416d != null) {
            this.f = (E0) this.j.apply((E0) ((K0) abstractC10416d).f, (E0) ((K0) this.e).f);
        }
        super.onCompletion(countedCompleter);
    }

    public K0(AbstractC10401a abstractC10401a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator) {
        super(abstractC10401a, spliterator);
        this.h = abstractC10401a;
        this.i = longFunction;
        this.j = binaryOperator;
    }

    public K0(K0 k0, Spliterator spliterator) {
        super(k0, spliterator);
        this.h = k0.h;
        this.i = k0.i;
        this.j = k0.j;
    }

    @Override // j$.util.stream.AbstractC10416d
    public AbstractC10416d c(Spliterator spliterator) {
        return new K0(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC10416d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final E0 a() {
        InterfaceC10511w0 interfaceC10511w0 = (InterfaceC10511w0) this.i.apply(this.h.F(this.b));
        this.h.Q(this.b, interfaceC10511w0);
        return interfaceC10511w0.a();
    }
}
