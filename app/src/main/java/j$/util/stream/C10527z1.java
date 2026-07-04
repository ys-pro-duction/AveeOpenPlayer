package j$.util.stream;

import j$.util.C10536z;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10527z1 implements O1, InterfaceC10429f2 {
    public boolean a;
    public double b;
    public final /* synthetic */ DoubleBinaryOperator c;

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void accept(int i) {
        AbstractC10497t1.k();
        throw null;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void accept(long j) {
        AbstractC10497t1.l();
        throw null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        p((Double) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.d(this, doubleConsumer);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ boolean n() {
        return false;
    }

    @Override // j$.util.stream.InterfaceC10429f2
    public final /* synthetic */ void p(Double d) {
        AbstractC10497t1.e(this, d);
    }

    public C10527z1(DoubleBinaryOperator doubleBinaryOperator) {
        this.c = doubleBinaryOperator;
    }

    @Override // j$.util.stream.O1
    public final void g(O1 o1) {
        C10527z1 c10527z1 = (C10527z1) o1;
        if (c10527z1.a) {
            return;
        }
        accept(c10527z1.b);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a = true;
        this.b = 0.0d;
    }

    @Override // j$.util.stream.InterfaceC10444i2, j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final void accept(double d) {
        if (this.a) {
            this.a = false;
            this.b = d;
        } else {
            this.b = this.c.applyAsDouble(this.b, d);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? C10536z.c : new C10536z(this.b);
    }
}
