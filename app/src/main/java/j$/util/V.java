package j$.util;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public interface V extends b0 {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.b0, j$.util.Spliterator
    V trySplit();
}
