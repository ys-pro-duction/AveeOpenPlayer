package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.m3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10465m3 extends AbstractC10475o3 implements j$.util.V {
    @Override // j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.com.android.tools.r8.a.k(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.com.android.tools.r8.a.A(this, consumer);
    }

    @Override // j$.util.stream.AbstractC10485q3
    public final Spliterator a(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C10465m3((j$.util.V) spliterator, j, j2, j3, j4);
    }

    @Override // j$.util.stream.AbstractC10475o3
    public final Object b() {
        return new C10526z0(1);
    }
}
