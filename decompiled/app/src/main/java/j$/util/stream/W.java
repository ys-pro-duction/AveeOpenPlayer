package j$.util.stream;

import j$.util.Objects;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class W extends AbstractC10414c2 {
    public boolean b;
    public final j$.util.F c;
    public final /* synthetic */ U d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W(U u, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.d = u;
        InterfaceC10444i2 interfaceC10444i22 = this.a;
        Objects.requireNonNull(interfaceC10444i22);
        this.c = new j$.util.F(interfaceC10444i22, 1);
    }

    @Override // j$.util.stream.AbstractC10414c2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC10434g2, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) throws Exception {
        IntStream intStream = (IntStream) ((K) this.d.n).apply(i);
        if (intStream != null) {
            try {
                boolean z = this.b;
                j$.util.F f = this.c;
                if (!z) {
                    intStream.sequential().forEach(f);
                } else {
                    j$.util.V vSpliterator = intStream.sequential().spliterator();
                    while (!this.a.n() && vSpliterator.tryAdvance((IntConsumer) f)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    intStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (intStream != null) {
            intStream.close();
        }
    }

    @Override // j$.util.stream.AbstractC10414c2, j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
