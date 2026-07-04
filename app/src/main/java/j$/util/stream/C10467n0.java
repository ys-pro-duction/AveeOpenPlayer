package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: renamed from: j$.util.stream.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10467n0 extends AbstractC10482q0 implements InterfaceC10434g2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC10434g2
    public final /* synthetic */ void m(Integer num) {
        AbstractC10497t1.g(this, num);
    }

    @Override // j$.util.stream.AbstractC10482q0, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        if (this.a) {
            return;
        }
        IntPredicate intPredicate = null;
        intPredicate.test(i);
        throw null;
    }
}
