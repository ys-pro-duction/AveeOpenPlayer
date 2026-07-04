package j$.util.stream;

import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10440h3 implements InterfaceC10434g2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ IntConsumer b;

    public /* synthetic */ C10440h3(IntConsumer intConsumer, int i) {
        this.a = i;
        this.b = intConsumer;
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

    @Override // j$.util.stream.InterfaceC10434g2, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        switch (this.a) {
            case 0:
                this.b.accept(i);
                break;
            default:
                ((N2) this.b).accept(i);
                break;
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
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        switch (this.a) {
            case 0:
                m((Integer) obj);
                break;
            default:
                m((Integer) obj);
                break;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        switch (this.a) {
        }
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void k() {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void l(long j) {
        int i = this.a;
    }

    @Override // j$.util.stream.InterfaceC10434g2
    public final /* synthetic */ void m(Integer num) {
        switch (this.a) {
            case 0:
                AbstractC10497t1.g(this, num);
                break;
            default:
                AbstractC10497t1.g(this, num);
                break;
        }
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ boolean n() {
        switch (this.a) {
        }
        return false;
    }
}
