package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
public interface E0 {
    E0 b(int i);

    long count();

    void forEach(Consumer consumer);

    E0 h(long j, long j2, IntFunction intFunction);

    void i(Object[] objArr, int i);

    Object[] o(IntFunction intFunction);

    int q();

    Spliterator spliterator();
}
