package j$.util.stream;

import j$.util.C10397o;
import j$.util.Objects;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10505v extends AbstractC10409b2 {
    public boolean b;
    public final j$.util.B c;
    public final /* synthetic */ C10510w d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10505v(C10510w c10510w, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.d = c10510w;
        InterfaceC10444i2 interfaceC10444i22 = this.a;
        Objects.requireNonNull(interfaceC10444i22);
        this.c = new j$.util.B(interfaceC10444i22, 1);
    }

    @Override // j$.util.stream.AbstractC10409b2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final void accept(double d) throws Exception {
        C c = (C) ((C10397o) this.d.n).apply(d);
        if (c != null) {
            try {
                boolean z = this.b;
                j$.util.B b = this.c;
                if (!z) {
                    c.sequential().forEach(b);
                } else {
                    j$.util.S sSpliterator = c.sequential().spliterator();
                    while (!this.a.n() && sSpliterator.tryAdvance((DoubleConsumer) b)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    c.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (c != null) {
            c.close();
        }
    }

    @Override // j$.util.stream.AbstractC10409b2, j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
