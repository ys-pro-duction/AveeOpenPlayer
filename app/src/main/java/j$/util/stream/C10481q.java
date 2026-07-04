package j$.util.stream;

import java.util.function.DoubleConsumer;
import java.util.function.DoubleFunction;
import java.util.function.DoublePredicate;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10481q extends AbstractC10409b2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC10401a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10481q(AbstractC10401a abstractC10401a, InterfaceC10444i2 interfaceC10444i2, int i) {
        super(interfaceC10444i2);
        this.b = i;
        this.c = abstractC10401a;
    }

    @Override // j$.util.stream.AbstractC10409b2, j$.util.stream.InterfaceC10444i2
    public void l(long j) {
        switch (this.b) {
            case 4:
                this.a.l(-1L);
                break;
            default:
                super.l(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        switch (this.b) {
            case 0:
                this.a.accept(((DoubleFunction) ((r) this.c).n).apply(d));
                return;
            case 1:
                ((C10490s) this.c).getClass();
                DoubleUnaryOperator doubleUnaryOperator = null;
                doubleUnaryOperator.applyAsDouble(d);
                throw null;
            case 2:
                ((C10495t) this.c).getClass();
                DoubleToIntFunction doubleToIntFunction = null;
                doubleToIntFunction.applyAsInt(d);
                throw null;
            case 3:
                ((C10500u) this.c).getClass();
                DoubleToLongFunction doubleToLongFunction = null;
                doubleToLongFunction.applyAsLong(d);
                throw null;
            case 4:
                ((C10490s) this.c).getClass();
                DoublePredicate doublePredicate = null;
                doublePredicate.test(d);
                throw null;
            default:
                ((DoubleConsumer) ((C10510w) this.c).n).accept(d);
                this.a.accept(d);
                return;
        }
    }
}
