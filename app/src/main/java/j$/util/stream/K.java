package j$.util.stream;

import j$.util.C10387e;
import j$.util.stream.IntStream;
import java.util.function.IntFunction;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class K implements IntFunction, LongFunction {
    public IntFunction a;

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        Object objApply = this.a.apply(i);
        if (objApply == null) {
            return null;
        }
        if (objApply instanceof IntStream) {
            return IntStream.Wrapper.convert((IntStream) objApply);
        }
        if (objApply instanceof java.util.stream.IntStream) {
            return IntStream.VivifiedWrapper.convert((java.util.stream.IntStream) objApply);
        }
        C10387e.a("java.util.stream.IntStream", objApply.getClass());
        throw null;
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return AbstractC10497t1.z(j, this.a);
    }
}
