package j$.util.stream;

import com.daaw.C6564mc1;
import j$.util.C10533w;
import j$.util.C10535y;
import j$.util.C10536z;
import j$.util.Optional;
import j$.util.OptionalInt;
import j$.util.function.Predicate$CC;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10471o implements IntFunction, DoubleBinaryOperator, Supplier, ObjDoubleConsumer, Predicate, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ C10471o(int i) {
        this.a = i;
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        ((C10535y) obj).accept(j);
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                break;
            case 23:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        return Math.max(d, d2);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 16:
                return Math.min(i, i2);
            case 19:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        return Math.min(j, j2);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        switch (this.a) {
        }
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
        }
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return ((C10536z) obj).a;
            case 5:
            case 7:
            default:
                return ((Optional) obj).isPresent();
            case 6:
                return ((OptionalInt) obj).a;
            case 8:
                return ((j$.util.A) obj).a;
        }
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        double[] dArr = (double[]) obj;
        Collectors.a(dArr, d);
        dArr[2] = dArr[2] + d;
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 2:
                return new double[3];
            case 5:
                return new E();
            case 7:
                return new F();
            case 9:
                return new G();
            case 11:
                return new H();
            default:
                return new long[2];
        }
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.a) {
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                ((C10533w) obj).accept(i);
                break;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + ((long) i);
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                ((C10533w) obj).b((C10533w) obj2);
                break;
            case 23:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                break;
            default:
                ((C10535y) obj).b((C10535y) obj2);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Double[i];
            case 12:
                return new Object[i];
            case 13:
                return new Integer[i];
            case 15:
                return Integer.valueOf(i);
            default:
                return new Long[i];
        }
    }
}
