package j$.util.stream;

import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends Z1 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(AbstractC10401a abstractC10401a, int i, Object obj, int i2) {
        super(abstractC10401a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        switch (this.m) {
            case 0:
                return new C10481q(this, interfaceC10444i2, 0);
            case 1:
                return new T(this, interfaceC10444i2, 0);
            case 2:
                return new C10407b0(this, interfaceC10444i2, 0);
            case 3:
                return new C10461m(this, interfaceC10444i2, 1);
            case 4:
                return new C10461m(this, interfaceC10444i2, 2);
            case 5:
                return new C10461m(this, interfaceC10444i2, 3);
            default:
                return new C10456l(this, interfaceC10444i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(AbstractC10404a2 abstractC10404a2, Consumer consumer) {
        super(abstractC10404a2, 0, 1);
        this.m = 3;
        this.n = consumer;
    }
}
