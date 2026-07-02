package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10490s extends AbstractC10520y {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10490s(AbstractC10401a abstractC10401a, int i, int i2) {
        super(abstractC10401a, i, 1);
        this.m = i2;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final InterfaceC10444i2 M(int i, InterfaceC10444i2 interfaceC10444i2) {
        switch (this.m) {
            case 0:
                return new C10481q(this, interfaceC10444i2, 1);
            case 1:
                return interfaceC10444i2;
            case 2:
                return new C10481q(this, interfaceC10444i2, 4);
            case 3:
                return new V(1, interfaceC10444i2);
            case 4:
                return new T(this, interfaceC10444i2, 4);
            case 5:
                return new C10412c0(interfaceC10444i2);
            default:
                return new C10407b0(this, interfaceC10444i2, 3);
        }
    }
}
