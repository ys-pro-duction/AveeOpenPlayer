package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10405a3 extends AbstractC10410b3 implements LongConsumer {
    public final long[] c;

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    public C10405a3(int i) {
        this.c = new long[i];
    }

    @Override // j$.util.stream.AbstractC10410b3
    public final void b(Object obj, long j) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i = 0; i < j; i++) {
            longConsumer.accept(this.c[i]);
        }
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j) {
        int i = this.b;
        this.b = i + 1;
        this.c[i] = j;
    }
}
