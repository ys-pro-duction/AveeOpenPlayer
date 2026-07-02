package j$.util;

import java.util.Comparator;
import java.util.function.ToIntFunction;

/* JADX INFO: renamed from: j$.util.Comparator$-CC, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Comparator$CC {
    public static <T> Comparator<T> comparingInt(ToIntFunction<? super T> toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new C10384b(0, toIntFunction);
    }
}
