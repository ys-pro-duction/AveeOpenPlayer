package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class P implements D3, E3 {
    public final boolean a;

    public /* synthetic */ void accept(double d) {
        AbstractC10497t1.a();
        throw null;
    }

    public /* synthetic */ void accept(int i) {
        AbstractC10497t1.k();
        throw null;
    }

    public /* synthetic */ void accept(long j) {
        AbstractC10497t1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void l(long j) {
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ boolean n() {
        return false;
    }

    public P(boolean z) {
        this.a = z;
    }

    @Override // j$.util.stream.D3
    public final int d() {
        if (this.a) {
            return 0;
        }
        return V2.r;
    }

    public final void e(AbstractC10401a abstractC10401a, Spliterator spliterator) {
        if (this.a) {
            new Q(abstractC10401a, spliterator, this).invoke();
        } else {
            new S(abstractC10401a, spliterator, abstractC10401a.R(this)).invoke();
        }
    }
}
