package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class R1 extends U1 implements InterfaceC10434g2 {
    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC10434g2
    public final /* synthetic */ void m(Integer num) {
        AbstractC10497t1.g(this, num);
    }

    @Override // j$.util.stream.P1, java.util.function.Supplier
    public final Object get() {
        return Long.valueOf(this.b);
    }

    @Override // j$.util.stream.O1
    public final void g(O1 o1) {
        this.b += ((U1) o1).b;
    }

    @Override // j$.util.stream.U1, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        this.b++;
    }
}
