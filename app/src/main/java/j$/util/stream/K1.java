package j$.util.stream;

import j$.util.OptionalInt;
import j$.util.function.Consumer$CC;
import j$.util.function.IntConsumer$CC;
import java.util.function.Consumer;
import java.util.function.IntBinaryOperator;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public final class K1 implements O1, InterfaceC10434g2 {
    public boolean a;
    public int b;
    public final /* synthetic */ IntBinaryOperator c;

    @Override // j$.util.stream.InterfaceC10444i2, j$.util.stream.InterfaceC10429f2, java.util.function.DoubleConsumer
    public final /* synthetic */ void accept(double d) {
        AbstractC10497t1.a();
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
        m((Integer) obj);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC10434g2
    public final /* synthetic */ void m(Integer num) {
        AbstractC10497t1.g(this, num);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ boolean n() {
        return false;
    }

    public K1(IntBinaryOperator intBinaryOperator) {
        this.c = intBinaryOperator;
    }

    @Override // j$.util.stream.O1
    public final void g(O1 o1) {
        K1 k1 = (K1) o1;
        if (k1.a) {
            return;
        }
        accept(k1.b);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a = true;
        this.b = 0;
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        if (this.a) {
            this.a = false;
            this.b = i;
        } else {
            this.b = this.c.applyAsInt(this.b, i);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? OptionalInt.c : new OptionalInt(this.b);
    }
}
