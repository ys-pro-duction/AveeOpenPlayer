package j$.util.stream;

import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class E1 implements O1 {
    public boolean a;
    public Object b;
    public final /* synthetic */ BinaryOperator c;

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

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void accept(long j) {
        AbstractC10497t1.l();
        throw null;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ void k() {
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final /* synthetic */ boolean n() {
        return false;
    }

    public E1(BinaryOperator binaryOperator) {
        this.c = binaryOperator;
    }

    @Override // j$.util.stream.O1
    public final void g(O1 o1) {
        E1 e1 = (E1) o1;
        if (e1.a) {
            return;
        }
        p(e1.b);
    }

    @Override // j$.util.stream.InterfaceC10444i2
    public final void l(long j) {
        this.a = true;
        this.b = null;
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        if (this.a) {
            this.a = false;
            this.b = obj;
        } else {
            this.b = this.c.apply(this.b, obj);
        }
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return this.a ? Optional.empty() : Optional.of(this.b);
    }
}
