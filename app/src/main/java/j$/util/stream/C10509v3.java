package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.function.Consumer$CC;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.v3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10509v3 extends AbstractC10519x3 implements Spliterator, Consumer {
    public Object f;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        return j$.com.android.tools.r8.a.o(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return j$.com.android.tools.r8.a.q(this, i);
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        throw new IllegalStateException();
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public final void p(Object obj) {
        this.f = obj;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Objects.requireNonNull(consumer);
        while (d() != EnumC10514w3.NO_MORE && this.a.tryAdvance(this)) {
            if (b(1L) == 1) {
                consumer.p(this.f);
                this.f = null;
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        Objects.requireNonNull(consumer);
        C10415c3 c10415c3 = null;
        while (true) {
            EnumC10514w3 enumC10514w3D = d();
            if (enumC10514w3D == EnumC10514w3.NO_MORE) {
                return;
            }
            EnumC10514w3 enumC10514w3 = EnumC10514w3.MAYBE_MORE;
            Spliterator spliterator = this.a;
            if (enumC10514w3D == enumC10514w3) {
                int i = this.c;
                if (c10415c3 == null) {
                    c10415c3 = new C10415c3(i);
                } else {
                    c10415c3.a = 0;
                }
                long j = 0;
                while (spliterator.tryAdvance(c10415c3)) {
                    j++;
                    if (j >= i) {
                        break;
                    }
                }
                if (j == 0) {
                    return;
                }
                long jB = b(j);
                for (int i2 = 0; i2 < jB; i2++) {
                    consumer.p(c10415c3.b[i2]);
                }
            } else {
                spliterator.forEachRemaining(consumer);
                return;
            }
        }
    }

    @Override // j$.util.stream.AbstractC10519x3
    public final Spliterator c(Spliterator spliterator) {
        return new C10509v3(spliterator, this);
    }
}
