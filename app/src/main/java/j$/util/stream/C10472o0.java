package j$.util.stream;

import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: renamed from: j$.util.stream.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10472o0 extends AbstractC10482q0 implements InterfaceC10439h2 {
    @Override // java.util.function.Consumer
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        j((Long) obj);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.e(this, longConsumer);
    }

    @Override // j$.util.stream.InterfaceC10439h2
    public final /* synthetic */ void j(Long l) {
        AbstractC10497t1.i(this, l);
    }

    @Override // j$.util.stream.AbstractC10482q0, j$.util.stream.InterfaceC10444i2
    public final void accept(long j) {
        if (this.a) {
            return;
        }
        LongPredicate longPredicate = null;
        longPredicate.test(j);
        throw null;
    }
}
