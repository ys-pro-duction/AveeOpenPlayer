package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10433g1 extends AbstractC10438h1 {
    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        E0 e0A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.c == null && (e0A = AbstractC10438h1.a(this.e)) != null) {
                Spliterator spliterator = e0A.spliterator();
                this.d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.a = null;
        }
        return zTryAdvance;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            Spliterator spliterator = this.c;
            if (spliterator == null) {
                ArrayDeque arrayDequeB = b();
                while (true) {
                    E0 e0A = AbstractC10438h1.a(arrayDequeB);
                    if (e0A != null) {
                        e0A.forEach(consumer);
                    } else {
                        this.a = null;
                        return;
                    }
                }
            } else {
                spliterator.forEachRemaining(consumer);
            }
        } else {
            while (tryAdvance(consumer)) {
            }
        }
    }
}
