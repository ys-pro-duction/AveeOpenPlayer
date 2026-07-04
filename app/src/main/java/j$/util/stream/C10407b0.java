package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongFunction;
import java.util.function.LongPredicate;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;
import java.util.function.LongUnaryOperator;

/* JADX INFO: renamed from: j$.util.stream.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10407b0 extends AbstractC10419d2 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractC10401a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10407b0(AbstractC10401a abstractC10401a, InterfaceC10444i2 interfaceC10444i2, int i) {
        super(interfaceC10444i2);
        this.b = i;
        this.c = abstractC10401a;
    }

    @Override // j$.util.stream.AbstractC10419d2, j$.util.stream.InterfaceC10444i2
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

    @Override // j$.util.stream.InterfaceC10439h2, j$.util.stream.InterfaceC10444i2
    public final void accept(long j) {
        switch (this.b) {
            case 0:
                this.a.accept(((LongFunction) ((r) this.c).n).apply(j));
                return;
            case 1:
                ((C10500u) this.c).getClass();
                LongUnaryOperator longUnaryOperator = null;
                longUnaryOperator.applyAsLong(j);
                throw null;
            case 2:
                ((C10495t) this.c).getClass();
                LongToIntFunction longToIntFunction = null;
                longToIntFunction.applyAsInt(j);
                throw null;
            case 3:
                ((C10490s) this.c).getClass();
                LongToDoubleFunction longToDoubleFunction = null;
                longToDoubleFunction.applyAsDouble(j);
                throw null;
            case 4:
                ((C10500u) this.c).getClass();
                LongPredicate longPredicate = null;
                longPredicate.test(j);
                throw null;
            default:
                ((LongConsumer) ((C10422e0) this.c).n).accept(j);
                this.a.accept(j);
                return;
        }
    }
}
