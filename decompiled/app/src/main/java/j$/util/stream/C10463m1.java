package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.IntConsumer$CC;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10463m1 extends AbstractC10478p1 implements InterfaceC10434g2 {
    public final int[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        m((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // j$.util.stream.InterfaceC10434g2
    public final /* synthetic */ void m(Integer num) {
        AbstractC10497t1.g(this, num);
    }

    public C10463m1(Spliterator spliterator, AbstractC10401a abstractC10401a, int[] iArr) {
        super(spliterator, abstractC10401a, iArr.length);
        this.h = iArr;
    }

    public C10463m1(C10463m1 c10463m1, Spliterator spliterator, long j, long j2) {
        super(c10463m1, spliterator, j, j2, c10463m1.h.length);
        this.h = c10463m1.h;
    }

    @Override // j$.util.stream.AbstractC10478p1
    public final AbstractC10478p1 b(Spliterator spliterator, long j, long j2) {
        return new C10463m1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.AbstractC10478p1, j$.util.stream.InterfaceC10444i2
    public final void accept(int i) {
        int i2 = this.f;
        if (i2 >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        int[] iArr = this.h;
        this.f = i2 + 1;
        iArr[i2] = i;
    }
}
