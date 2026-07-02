package j$.util.stream;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.y1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10522y1 extends AbstractC10497t1 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ C10522y1(W2 w2, Object obj, Object obj2, Object obj3, int i) {
        this.h = i;
        this.j = obj;
        this.k = obj2;
        this.i = obj3;
    }

    @Override // j$.util.stream.AbstractC10497t1
    public final O1 Z() {
        switch (this.h) {
            case 0:
                return new C10507v1((Supplier) this.i, (ObjLongConsumer) this.k, (C10476p) this.j);
            case 1:
                return new B1((Supplier) this.i, (ObjDoubleConsumer) this.k, (C10476p) this.j);
            case 2:
                return new D1(this.i, (BiFunction) this.k, (BinaryOperator) this.j);
            case 3:
                return new H1((Supplier) this.i, (BiConsumer) this.k, (BiConsumer) this.j);
            default:
                return new L1((Supplier) this.i, (ObjIntConsumer) this.k, (C10476p) this.j);
        }
    }
}
