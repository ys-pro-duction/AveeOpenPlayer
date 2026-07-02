package j$.util;

import j$.util.stream.AbstractC10497t1;
import j$.util.stream.Stream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DesugarArrays {
    public static h0 a(Object[] objArr, int i, int i2) {
        Spliterators.a(((Object[]) Objects.requireNonNull(objArr)).length, i, i2);
        return new h0(objArr, i, i2, 1040);
    }

    public static <T> Stream<T> stream(T[] tArr) {
        return AbstractC10497t1.a0(a(tArr, 0, tArr.length), false);
    }
}
