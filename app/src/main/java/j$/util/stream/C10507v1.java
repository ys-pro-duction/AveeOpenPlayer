package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10507v1 extends P1 implements O1, InterfaceC10439h2 {
    public final /* synthetic */ Supplier b;
    public final /* synthetic */ ObjLongConsumer c;
    public final /* synthetic */ C10476p d;

    @Override // j$.util.stream.InterfaceC10444i2, j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC10497t1.a();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void accept(int i) {
        AbstractC10497t1.k();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC10439h2
    public final /* synthetic */ void j(Long l) {
        AbstractC10497t1.i(this, l);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.O1
    public final void g(O1 o1) {
        this.a = this.d.apply(this.a, ((C10507v1) o1).a);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a = this.b.get();
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final void accept(long j) {
        this.c.accept(this.a, j);
    }

    public C10507v1(Supplier supplier, ObjLongConsumer objLongConsumer, C10476p c10476p) {
        this.b = supplier;
        this.c = objLongConsumer;
        this.d = c10476p;
    }
}
