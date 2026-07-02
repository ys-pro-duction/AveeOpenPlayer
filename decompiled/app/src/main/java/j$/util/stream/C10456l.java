package j$.util.stream;

import j$.util.C10397o;
import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10456l extends AbstractC10424e2 {
    public final /* synthetic */ int b = 2;
    public boolean c;
    public Object d;

    public /* synthetic */ C10456l(InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10456l(G3 g3, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.d = g3;
        this.c = true;
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
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
                InterfaceC10444i2 interfaceC10444i2 = this.a;
                if (obj == null) {
                    if (this.c) {
                        return;
                    }
                    this.c = true;
                    this.d = null;
                    interfaceC10444i2.p((Object) null);
                    return;
                }
                Object obj2 = this.d;
                if (obj2 == null || !obj.equals(obj2)) {
                    this.d = obj;
                    interfaceC10444i2.p(obj);
                    return;
                }
                return;
            case 1:
                Stream stream = (Stream) ((C10397o) ((r) this.d).n).apply(obj);
                if (stream != null) {
                    try {
                        boolean z = this.c;
                        InterfaceC10444i2 interfaceC10444i22 = this.a;
                        if (!z) {
                            ((Stream) stream.sequential()).forEach(interfaceC10444i22);
                        } else {
                            Spliterator spliterator = ((Stream) stream.sequential()).spliterator();
                            while (!interfaceC10444i22.n() && spliterator.tryAdvance(interfaceC10444i22)) {
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            stream.close();
                            break;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    break;
                }
                if (stream != null) {
                    stream.close();
                    return;
                }
                return;
            default:
                if (this.c) {
                    boolean zTest = ((G3) this.d).m.test(obj);
                    this.c = zTest;
                    if (zTest) {
                        this.a.p(obj);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public boolean n() {
        switch (this.b) {
            case 1:
                this.c = true;
                return this.a.n();
            case 2:
                return !this.c || this.a.n();
            default:
                return super.n();
        }
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public void k() {
        switch (this.b) {
            case 0:
                this.c = false;
                this.d = null;
                this.a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10456l(r rVar, InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.d = rVar;
    }
}
