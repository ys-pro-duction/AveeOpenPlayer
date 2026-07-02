package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10468n1 extends AbstractC10478p1 implements InterfaceC10439h2 {
    public final long[] h;

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final /* bridge */ /* synthetic */ void p(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC10439h2
    public final /* synthetic */ void j(Long l) {
        AbstractC10497t1.i(this, l);
    }

    public C10468n1(Spliterator spliterator, AbstractC10401a abstractC10401a, long[] jArr) {
        super(spliterator, abstractC10401a, jArr.length);
        this.h = jArr;
    }

    public C10468n1(C10468n1 c10468n1, Spliterator spliterator, long j, long j2) {
        super(c10468n1, spliterator, j, j2, c10468n1.h.length);
        this.h = c10468n1.h;
    }

    @Override // j$.util.stream.AbstractC10478p1
    public final AbstractC10478p1 b(Spliterator spliterator, long j, long j2) {
        return new C10468n1(this, spliterator, j, j2);
    }

    @Override // j$.util.stream.AbstractC10478p1, j$.util.stream.InterfaceC10444i2
    public final void accept(long j) {
        int i = this.f;
        if (i >= this.g) {
            throw new IndexOutOfBoundsException(Integer.toString(this.f));
        }
        long[] jArr = this.h;
        this.f = i + 1;
        jArr[i] = j;
    }
}
