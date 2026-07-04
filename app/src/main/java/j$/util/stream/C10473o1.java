package j$.util.stream;

import j$.util.Spliterator;

/* JADX INFO: renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10473o1 extends AbstractC10478p1 {
    public final Object[] h;

    public C10473o1(Spliterator spliterator, AbstractC10401a abstractC10401a, Object[] objArr) {
        super(spliterator, abstractC10401a, objArr.length);
        this.h = objArr;
    }

    public C10473o1(C10473o1 c10473o1, Spliterator spliterator, long j, long j2) {
        super(c10473o1, spliterator, j, j2, c10473o1.h.length);
        this.h = c10473o1.h;
    }

    @Override // j$.util.stream.AbstractC10478p1
    public final AbstractC10478p1 b(Spliterator spliterator, long j, long j2) {
        return new C10473o1(this, spliterator, j, j2);
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        Object[] objArr = this.h;
        this.f = i + 1;
        objArr[i] = obj;
    }
}
