package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.BinaryOperator;
import java.util.function.LongFunction;

/* JADX INFO: loaded from: classes2.dex */
public final class J0 extends K0 {
    public final /* synthetic */ int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ J0(AbstractC10401a abstractC10401a, Spliterator spliterator, LongFunction longFunction, BinaryOperator binaryOperator, int i) {
        super(abstractC10401a, spliterator, longFunction, binaryOperator);
        this.k = i;
    }

    @Override // j$.util.stream.K0, j$.util.stream.AbstractC10416d
    public final AbstractC10416d c(Spliterator spliterator) {
        switch (this.k) {
        }
        return new K0(this, spliterator);
    }

    @Override // j$.util.stream.K0, j$.util.stream.AbstractC10416d
    public final /* bridge */ /* synthetic */ Object a() {
        switch (this.k) {
        }
        return a();
    }
}
