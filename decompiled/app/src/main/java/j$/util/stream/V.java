package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public final class V extends AbstractC10414c2 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ V(int i, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.b = i;
    }

    @Override // j$.util.stream.InterfaceC10434g2, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        switch (this.b) {
            case 0:
                this.a.accept(i);
                break;
            default:
                this.a.accept(i);
                break;
        }
    }
}
