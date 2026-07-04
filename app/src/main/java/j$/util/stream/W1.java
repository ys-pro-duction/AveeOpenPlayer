package j$.util.stream;

import j$.util.C10397o;
import j$.util.Objects;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class W1 extends AbstractC10424e2 {
    public final /* synthetic */ int b = 1;
    public boolean c;
    public final Object d;
    public final /* synthetic */ AbstractC10401a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(U u, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.e = u;
        InterfaceC10444i2 interfaceC10444i22 = this.a;
        Objects.requireNonNull(interfaceC10444i22);
        this.d = new j$.util.F(interfaceC10444i22, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(C10510w c10510w, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.e = c10510w;
        InterfaceC10444i2 interfaceC10444i22 = this.a;
        Objects.requireNonNull(interfaceC10444i22);
        this.d = new j$.util.B(interfaceC10444i22, 1);
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        switch (this.b) {
            case 0:
                this.a.l(-1L);
                break;
            case 1:
                this.a.l(-1L);
                break;
            default:
                this.a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) throws Exception {
        switch (this.b) {
            case 0:
                InterfaceC10452k0 interfaceC10452k0 = (InterfaceC10452k0) ((C10397o) ((C10422e0) this.e).n).apply(obj);
                if (interfaceC10452k0 != null) {
                    try {
                        boolean z = this.c;
                        j$.util.J j = (j$.util.J) this.d;
                        if (!z) {
                            interfaceC10452k0.sequential().forEach(j);
                        } else {
                            j$.util.Y ySpliterator = interfaceC10452k0.sequential().spliterator();
                            while (!this.a.n() && ySpliterator.tryAdvance((LongConsumer) j)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            interfaceC10452k0.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (interfaceC10452k0 != null) {
                    interfaceC10452k0.close();
                    return;
                }
                return;
            case 1:
                IntStream intStream = (IntStream) ((C10397o) ((U) this.e).n).apply(obj);
                if (intStream != null) {
                    try {
                        boolean z2 = this.c;
                        j$.util.F f = (j$.util.F) this.d;
                        if (!z2) {
                            intStream.sequential().forEach(f);
                        } else {
                            j$.util.V vSpliterator = intStream.sequential().spliterator();
                            while (!this.a.n() && vSpliterator.tryAdvance((IntConsumer) f)) {
                            }
                        }
                    } catch (Throwable th3) {
                        try {
                            intStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                    break;
                }
                if (intStream != null) {
                    intStream.close();
                    return;
                }
                return;
            default:
                C c = (C) ((C10397o) ((C10510w) this.e).n).apply(obj);
                if (c != null) {
                    try {
                        boolean z3 = this.c;
                        j$.util.B b = (j$.util.B) this.d;
                        if (!z3) {
                            c.sequential().forEach(b);
                        } else {
                            j$.util.S sSpliterator = c.sequential().spliterator();
                            while (!this.a.n() && sSpliterator.tryAdvance((DoubleConsumer) b)) {
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            c.close();
                            break;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                    break;
                }
                if (c != null) {
                    c.close();
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        switch (this.b) {
            case 0:
                this.c = true;
                break;
            case 1:
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
        return this.a.n();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W1(C10422e0 c10422e0, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.e = c10422e0;
        InterfaceC10444i2 interfaceC10444i22 = this.a;
        Objects.requireNonNull(interfaceC10444i22);
        this.d = new j$.util.J(interfaceC10444i22, 1);
    }
}
