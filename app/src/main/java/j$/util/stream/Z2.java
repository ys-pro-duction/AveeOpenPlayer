package j$.util.stream;

import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class Z2 extends AbstractC10410b3 implements IntConsumer {
    public final int[] c;

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    public Z2(int i) {
        this.c = new int[i];
    }

    @Override // j$.util.stream.AbstractC10410b3
    public final void b(Object obj, long j) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i = 0; i < j; i++) {
            intConsumer.accept(this.c[i]);
        }
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i) {
        int i2 = this.b;
        this.b = i2 + 1;
        this.c[i2] = i;
    }
}
