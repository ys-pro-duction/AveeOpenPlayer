package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class U extends Y {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ U(AbstractC10401a abstractC10401a, int i, Object obj, int i2) {
        super(abstractC10401a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        switch (this.m) {
            case 0:
                return new T(this, interfaceC10444i2, 1);
            case 1:
                return new W(this, interfaceC10444i2);
            case 2:
                return new C10461m(this, interfaceC10444i2, 4);
            default:
                return new W1(this, interfaceC10444i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(Z z, IntConsumer intConsumer) {
        super(z, 0, 1);
        this.m = 0;
        this.n = intConsumer;
    }
}
