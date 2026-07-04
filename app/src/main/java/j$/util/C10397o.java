package j$.util;

import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.AbstractC10401a;
import j$.util.stream.C10435g3;
import j$.util.stream.C10442i0;
import j$.util.stream.C10445i3;
import j$.util.stream.C10447j0;
import j$.util.stream.C10455k3;
import j$.util.stream.C10529z3;
import j$.util.stream.IntStream;
import j$.util.stream.InterfaceC10444i2;
import j$.util.stream.InterfaceC10452k0;
import j$.util.stream.Stream;
import j$.util.stream.T2;
import j$.util.stream.U2;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.DoubleFunction;
import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;

/* JADX INFO: renamed from: j$.util.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10397o implements Consumer, Predicate, Supplier, DoubleFunction, Function, LongFunction, BooleanSupplier {
    public final /* synthetic */ int a;
    public Object b;

    public /* synthetic */ C10397o(int i) {
        this.a = i;
    }

    public /* synthetic */ C10397o(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate$CC.$default$and(this, predicate);
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 0:
                break;
            case 7:
                break;
        }
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public /* synthetic */ Function andThen(Function function) {
        return Function$CC.$default$andThen(this, function);
    }

    public /* synthetic */ Function compose(Function function) {
        return Function$CC.$default$compose(this, function);
    }

    @Override // java.util.function.Predicate
    public /* synthetic */ Predicate negate() {
        return Predicate$CC.$default$negate(this);
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        return Predicate$CC.$default$or(this, predicate);
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        return !((Predicate) this.b).test(obj);
    }

    @Override // java.util.function.Function
    public Object apply(Object obj) {
        Object objApply = ((Function) this.b).apply(obj);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof Stream) {
            return Stream.Wrapper.convert((Stream) objApply);
        }
        if (objApply instanceof java.util.stream.Stream) {
            return T2.j((java.util.stream.Stream) objApply);
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        if (objApply instanceof j$.util.stream.C) {
            return j$.util.stream.B.j((j$.util.stream.C) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.A.j((DoubleStream) objApply);
        }
        if (objApply instanceof InterfaceC10452k0) {
            return C10447j0.j((InterfaceC10452k0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C10442i0.j((LongStream) objApply);
        }
        C10387e.a("java.util.stream.*Stream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        Object objApply = ((DoubleFunction) this.b).apply(d);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof j$.util.stream.C) {
            return j$.util.stream.B.j((j$.util.stream.C) objApply);
        }
        if (objApply instanceof DoubleStream) {
            return j$.util.stream.A.j((DoubleStream) objApply);
        }
        C10387e.a("java.util.stream.DoubleStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        Object objApply = ((LongFunction) this.b).apply(j);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof InterfaceC10452k0) {
            return C10447j0.j((InterfaceC10452k0) objApply);
        }
        if (objApply instanceof LongStream) {
            return C10442i0.j((LongStream) objApply);
        }
        C10387e.a("java.util.stream.LongStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.BooleanSupplier
    public boolean getAsBoolean() {
        switch (this.a) {
            case 10:
                C10435g3 c10435g3 = (C10435g3) this.b;
                return c10435g3.d.tryAdvance(c10435g3.e);
            case 11:
                C10445i3 c10445i3 = (C10445i3) this.b;
                return c10445i3.d.tryAdvance(c10445i3.e);
            case 12:
                C10455k3 c10455k3 = (C10455k3) this.b;
                return c10455k3.d.tryAdvance(c10455k3.e);
            default:
                C10529z3 c10529z3 = (C10529z3) this.b;
                return c10529z3.d.tryAdvance(c10529z3.e);
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 2:
                return ((AbstractC10401a) this.b).N(0);
            default:
                return (Spliterator) this.b;
        }
    }

    public void b(U2 u2) {
        ((EnumMap) this.b).put(u2, 1);
    }

    @Override // java.util.function.Consumer
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((Consumer) this.b).accept(new C10398p((Map.Entry) obj));
                break;
            case 7:
                ((InterfaceC10444i2) this.b).accept(obj);
                break;
            default:
                ((ArrayList) this.b).add(obj);
                break;
        }
    }
}
