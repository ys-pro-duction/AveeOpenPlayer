package j$.util.stream;

import j$.util.C10397o;
import j$.util.Objects;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10417d0 extends AbstractC10419d2 {
    public boolean b;
    public final j$.util.J c;
    public final /* synthetic */ C10422e0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10417d0(C10422e0 c10422e0, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.d = c10422e0;
        InterfaceC10444i2 interfaceC10444i22 = this.a;
        Objects.requireNonNull(interfaceC10444i22);
        this.c = new j$.util.J(interfaceC10444i22, 1);
    }

    @Override // j$.util.stream.AbstractC10419d2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a.l(-1L);
    }

    @Override // j$.util.stream.InterfaceC10439h2, j$.util.stream.InterfaceC10444i2
    public final void accept(long j) throws Exception {
        InterfaceC10452k0 interfaceC10452k0 = (InterfaceC10452k0) ((C10397o) this.d.n).apply(j);
        if (interfaceC10452k0 != null) {
            try {
                boolean z = this.b;
                j$.util.J j2 = this.c;
                if (!z) {
                    interfaceC10452k0.sequential().forEach(j2);
                } else {
                    j$.util.Y ySpliterator = interfaceC10452k0.sequential().spliterator();
                    while (!this.a.n() && ySpliterator.tryAdvance((LongConsumer) j2)) {
                    }
                }
            } catch (Throwable th) {
                try {
                    interfaceC10452k0.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (interfaceC10452k0 != null) {
            interfaceC10452k0.close();
        }
    }

    @Override // j$.util.stream.AbstractC10419d2, j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        this.b = true;
        return this.a.n();
    }
}
