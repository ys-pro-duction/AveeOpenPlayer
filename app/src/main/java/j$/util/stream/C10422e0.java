package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.e0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10422e0 extends AbstractC10432g0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10422e0(AbstractC10401a abstractC10401a, int i, Object obj, int i2) {
        super(abstractC10401a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        switch (this.m) {
            case 0:
                return new C10417d0(this, interfaceC10444i2);
            case 1:
                return new C10407b0(this, interfaceC10444i2, 5);
            case 2:
                return new W1(this, interfaceC10444i2);
            default:
                return new C10461m(this, interfaceC10444i2, 5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10422e0(AbstractC10437h0 abstractC10437h0, LongConsumer longConsumer) {
        super(abstractC10437h0, 0, 1);
        this.m = 1;
        this.n = longConsumer;
    }
}
