package j$.util;

import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: j$.util.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC10386d implements Comparator {
    public static final EnumC10386d INSTANCE;
    public static final /* synthetic */ EnumC10386d[] a;

    public static EnumC10386d valueOf(String str) {
        return (EnumC10386d) Enum.valueOf(EnumC10386d.class, str);
    }

    public static EnumC10386d[] values() {
        return (EnumC10386d[]) a.clone();
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((Comparable) obj).compareTo((Comparable) obj2);
    }

    static {
        EnumC10386d enumC10386d = new EnumC10386d("INSTANCE", 0);
        INSTANCE = enumC10386d;
        a = new EnumC10386d[]{enumC10386d};
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return new C10385c(this, comparator);
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingInt(ToIntFunction toIntFunction) {
        return j$.com.android.tools.r8.a.a0(this, Comparator$CC.comparingInt(toIntFunction));
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        return Collections.reverseOrder();
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function, Comparator comparator) {
        Objects.requireNonNull(function);
        Objects.requireNonNull(comparator);
        return j$.com.android.tools.r8.a.a0(this, new C10385c(function, comparator));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparing(Function function) {
        Objects.requireNonNull(function);
        return j$.com.android.tools.r8.a.a0(this, new C10384b(2, function));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return j$.com.android.tools.r8.a.a0(this, new C10384b(3, toLongFunction));
    }

    @Override // java.util.Comparator
    public final Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return j$.com.android.tools.r8.a.a0(this, new C10384b(1, toDoubleFunction));
    }
}
