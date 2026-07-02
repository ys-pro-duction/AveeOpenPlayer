package j$.time;

import com.daaw.C6564mc1;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalUnit;
import j$.util.C10532v;
import j$.util.C10533w;
import j$.util.C10535y;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements TemporalAdjuster, IntFunction, Supplier, BiConsumer, BinaryOperator, Function, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case 13:
                break;
            case 19:
                break;
            case 20:
                break;
            case 21:
                break;
            case 25:
                break;
        }
        return j$.com.android.tools.r8.a.b(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        return j$.com.android.tools.r8.a.c(this, function);
    }

    /* JADX INFO: renamed from: andThen, reason: collision with other method in class */
    public /* synthetic */ Function m118andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Set set = Collectors.a;
        return obj;
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        return Math.min(d, d2);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public j$.time.temporal.k y(j$.time.temporal.k kVar) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return kVar.d(kVar.r(chronoField).getMaximum(), chronoField);
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        List list = (List) obj;
        Set set = Collectors.a;
        list.addAll((List) obj2);
        return list;
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    public Object h(j$.time.temporal.l lVar) {
        switch (this.a) {
            case 0:
                return LocalDateTime.L(lVar);
            case 1:
                ZoneId zoneId = (ZoneId) lVar.k(j$.time.temporal.o.a);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 2:
            default:
                ChronoField chronoField = ChronoField.NANO_OF_DAY;
                if (lVar.f(chronoField)) {
                    return LocalTime.P(lVar.u(chronoField));
                }
                return null;
            case 3:
                return (ZoneId) lVar.k(j$.time.temporal.o.a);
            case 4:
                return (j$.time.chrono.k) lVar.k(j$.time.temporal.o.b);
            case 5:
                return (TemporalUnit) lVar.k(j$.time.temporal.o.c);
            case 6:
                ChronoField chronoField2 = ChronoField.OFFSET_SECONDS;
                if (lVar.f(chronoField2)) {
                    return ZoneOffset.R(lVar.get(chronoField2));
                }
                return null;
            case 7:
                ZoneId zoneId2 = (ZoneId) lVar.k(j$.time.temporal.o.a);
                return zoneId2 != null ? zoneId2 : (ZoneId) lVar.k(j$.time.temporal.o.d);
            case 8:
                ChronoField chronoField3 = ChronoField.EPOCH_DAY;
                if (lVar.f(chronoField3)) {
                    return LocalDate.R(lVar.u(chronoField3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "ZoneId";
            case 4:
                return "Chronology";
            case 5:
                return "Precision";
            case 6:
                return "ZoneOffset";
            case 7:
                return "Zone";
            case 8:
                return "LocalDate";
            case 9:
                return "LocalTime";
            default:
                return super.toString();
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 11:
                return new C10532v();
            case 12:
                return new ArrayList();
            case 13:
            case 16:
            case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
            default:
                return new double[4];
            case 14:
                return new C10533w();
            case 15:
                return new C10535y();
            case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                return new LinkedHashSet();
        }
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.a) {
            case 24:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                Collectors.a(dArr, d);
                dArr[3] = dArr[3] + d;
                break;
            default:
                ((C10532v) obj).accept(d);
                break;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case 13:
                ((List) obj).add(obj2);
                break;
            case 19:
                ((LinkedHashSet) obj).add(obj2);
                break;
            case 20:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                break;
            case 21:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                Collectors.a(dArr, dArr2[0]);
                Collectors.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                break;
            case 25:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                Collectors.a(dArr3, dArr4[0]);
                Collectors.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                break;
            default:
                ((C10532v) obj).b((C10532v) obj2);
                break;
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }
}
