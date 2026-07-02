package j$.util.stream;

import j$.util.Spliterator;
import java.util.concurrent.CountedCompleter;

/* JADX INFO: loaded from: classes2.dex */
public final class V1 extends AbstractC10416d {
    public final AbstractC10497t1 h;

    @Override // j$.util.stream.AbstractC10416d, java.util.concurrent.CountedCompleter
    public final void onCompletion(CountedCompleter countedCompleter) {
        AbstractC10416d abstractC10416d = this.d;
        if (abstractC10416d != null) {
            O1 o1 = (O1) ((V1) abstractC10416d).f;
            o1.g((O1) ((V1) this.e).f);
            this.f = o1;
        }
        super.onCompletion(countedCompleter);
    }

    public V1(AbstractC10497t1 abstractC10497t1, AbstractC10401a abstractC10401a, Spliterator spliterator) {
        super(abstractC10401a, spliterator);
        this.h = abstractC10497t1;
    }

    public V1(V1 v1, Spliterator spliterator) {
        super(v1, spliterator);
        this.h = v1.h;
    }

    @Override // j$.util.stream.AbstractC10416d
    public final AbstractC10416d c(Spliterator spliterator) {
        return new V1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC10416d
    public final Object a() {
        AbstractC10401a abstractC10401a = this.a;
        O1 o1Z = this.h.Z();
        abstractC10401a.Q(this.b, o1Z);
        return o1Z;
    }
}
