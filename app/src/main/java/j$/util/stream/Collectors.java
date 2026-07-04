package j$.util.stream;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class Collectors {
    public static final Set a;

    static {
        EnumC10436h enumC10436h = EnumC10436h.CONCURRENT;
        EnumC10436h enumC10436h2 = EnumC10436h.UNORDERED;
        EnumC10436h enumC10436h3 = EnumC10436h.IDENTITY_FINISH;
        Collections.unmodifiableSet(EnumSet.of(enumC10436h, enumC10436h2, enumC10436h3));
        Collections.unmodifiableSet(EnumSet.of(enumC10436h, enumC10436h2));
        a = Collections.unmodifiableSet(EnumSet.of(enumC10436h3));
        Collections.unmodifiableSet(EnumSet.of(enumC10436h2, enumC10436h3));
        Set set = Collections.EMPTY_SET;
        Collections.unmodifiableSet(EnumSet.of(enumC10436h2));
    }

    public static <T> Collector<T, ?, List<T>> toList() {
        return new C10451k(new j$.time.f(12), new j$.time.f(13), new j$.time.f(16), a);
    }

    public static void a(double[] dArr, double d) {
        double d2 = d - dArr[1];
        double d3 = dArr[0];
        double d4 = d3 + d2;
        dArr[1] = (d4 - d3) - d2;
        dArr[0] = d4;
    }
}
