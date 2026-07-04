package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Z1 extends AbstractC10404a2 {
    public final /* synthetic */ int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Z1(AbstractC10401a abstractC10401a, int i, int i2) {
        super(abstractC10401a, i);
        this.l = i2;
    }

    @Override // j$.util.stream.AbstractC10401a
    public final boolean L() {
        switch (this.l) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // j$.util.stream.InterfaceC10431g
    public final InterfaceC10431g unordered() {
        switch (this.l) {
            case 0:
                if (!V2.ORDERED.r(this.f)) {
                }
                break;
            default:
                if (!V2.ORDERED.r(this.f)) {
                }
                break;
        }
        return new X1(this, V2.r, 1);
    }
}
