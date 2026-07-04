package j$.util.stream;

import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntPredicate;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;
import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes2.dex */
public final class T extends AbstractC10414c2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC10401a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ T(AbstractC10401a abstractC10401a, InterfaceC10444i2 interfaceC10444i2, int i) {
        super(interfaceC10444i2);
        this.b = i;
        this.c = abstractC10401a;
    }

    @Override // j$.util.stream.AbstractC10414c2, j$.util.stream.InterfaceC10444i2
    public void l(long j) {
        switch (this.b) {
            case 5:
                this.a.l(-1L);
                break;
            default:
                super.l(j);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC10434g2, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(((IntFunction) ((r) this.c).n).apply(i));
                return;
            case 1:
                ((IntConsumer) ((U) this.c).n).accept(i);
                this.a.accept(i);
                return;
            case 2:
                ((C10495t) this.c).getClass();
                IntUnaryOperator intUnaryOperator = null;
                intUnaryOperator.applyAsInt(i);
                throw null;
            case 3:
                ((C10500u) this.c).getClass();
                IntToLongFunction intToLongFunction = null;
                intToLongFunction.applyAsLong(i);
                throw null;
            case 4:
                ((C10490s) this.c).getClass();
                IntToDoubleFunction intToDoubleFunction = null;
                intToDoubleFunction.applyAsDouble(i);
                throw null;
            default:
                ((C10495t) this.c).getClass();
                IntPredicate intPredicate = null;
                intPredicate.test(i);
                throw null;
        }
    }
}
