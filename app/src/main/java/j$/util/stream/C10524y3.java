package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10524y3 implements InterfaceC10444i2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Consumer b;

    public /* synthetic */ C10524y3(Consumer consumer, int i) {
        this.a = i;
        this.b = consumer;
    }

    private final /* synthetic */ void b(long j) {
    }

    private final /* synthetic */ void c(long j) {
    }

    private final /* synthetic */ void d() {
    }

    private final /* synthetic */ void e() {
    }

    @Override // j$.util.stream.InterfaceC10444i2, j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        switch (this.a) {
            case 0:
                AbstractC10497t1.a();
                throw null;
            default:
                AbstractC10497t1.a();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void accept(int i) {
        switch (this.a) {
            case 0:
                AbstractC10497t1.k();
                throw null;
            default:
                AbstractC10497t1.k();
                throw null;
        }
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void accept(long j) {
        switch (this.a) {
            case 0:
                AbstractC10497t1.l();
                throw null;
            default:
                AbstractC10497t1.l();
                throw null;
        }
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        switch (this.a) {
            case 0:
                ((S2) this.b).p(obj);
                break;
            default:
                this.b.p(obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void k() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void l(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ boolean n() {
        switch (this.a) {
        }
        return false;
    }
}
