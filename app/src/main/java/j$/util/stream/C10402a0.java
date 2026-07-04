package j$.util.stream;

import com.daaw.C6564mc1;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10402a0 implements Supplier, ObjLongConsumer, BiConsumer, LongBinaryOperator, Consumer, IntFunction, LongFunction, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ C10402a0(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    /* JADX INFO: renamed from: accept */
    public void p(Object obj) {
        int i = this.a;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
        }
        return j$.com.android.tools.r8.a.c(this, function);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 5:
                break;
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 7:
                return AbstractC10497t1.G(j);
            case 8:
            default:
                return AbstractC10497t1.Q(j);
            case 9:
                return AbstractC10497t1.P(j);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 3:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new long[2];
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 6:
                return new Object[i];
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
            case 19:
            default:
                return new Double[i];
            case 14:
                return new Object[i];
            case 15:
                return new Integer[i];
            case 16:
                return new Long[i];
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return new Double[i];
            case 20:
                return new Integer[i];
            case 21:
                return new Integer[i];
            case 22:
                return new Long[i];
            case 23:
                return new Long[i];
            case 24:
                return new Double[i];
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 8:
                return new L0((InterfaceC10521y0) obj, (InterfaceC10521y0) obj2);
            case 9:
            case 11:
            default:
                return new P0((E0) obj, (E0) obj2);
            case 10:
                return new M0((A0) obj, (A0) obj2);
            case 12:
                return new N0((C0) obj, (C0) obj2);
        }
    }
}
