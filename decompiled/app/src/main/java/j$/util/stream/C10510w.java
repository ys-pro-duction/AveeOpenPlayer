package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10510w extends AbstractC10520y {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10510w(AbstractC10401a abstractC10401a, int i, Object obj, int i2) {
        super(abstractC10401a, i, 1);
        this.m = i2;
        this.n = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10510w(AbstractC10525z abstractC10525z, DoubleConsumer doubleConsumer) {
        super(abstractC10525z, 0, 1);
        this.m = 1;
        this.n = doubleConsumer;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        switch (this.m) {
            case 0:
                return new C10505v(this, interfaceC10444i2);
            case 1:
                return new C10481q(this, interfaceC10444i2, 5);
            case 2:
                return new C10461m(this, interfaceC10444i2, 6);
            default:
                return new W1(this, interfaceC10444i2);
        }
    }
}
