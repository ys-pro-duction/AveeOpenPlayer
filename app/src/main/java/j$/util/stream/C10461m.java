package j$.util.stream;

import java.util.HashSet;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* JADX INFO: renamed from: j$.util.stream.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10461m extends AbstractC10424e2 {
    public final /* synthetic */ int b;
    public Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10461m(AbstractC10401a abstractC10401a, InterfaceC10444i2 interfaceC10444i2, int i) {
        super(interfaceC10444i2);
        this.b = i;
        this.c = abstractC10401a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10461m(InterfaceC10444i2 interfaceC10444i2) {
        super(interfaceC10444i2);
        this.b = 0;
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public void k() {
        switch (this.b) {
            case 0:
                this.c = null;
                this.a.k();
                break;
            default:
                super.k();
                break;
        }
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public void l(long j) {
        switch (this.b) {
            case 0:
                this.c = new HashSet();
                this.a.l(-1L);
                break;
            case 1:
            default:
                super.l(j);
                break;
            case 2:
                this.a.l(-1L);
                break;
        }
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.b) {
            case 0:
                if (!((HashSet) this.c).contains(obj)) {
                    ((HashSet) this.c).add(obj);
                    this.a.accept(obj);
                }
                break;
            case 1:
                ((Consumer) ((r) this.c).n).accept(obj);
                this.a.accept(obj);
                break;
            case 2:
                if (((Predicate) ((r) this.c).n).test(obj)) {
                    this.a.accept(obj);
                }
                break;
            case 3:
                this.a.accept(((Function) ((r) this.c).n).apply(obj));
                break;
            case 4:
                this.a.accept(((ToIntFunction) ((U) this.c).n).applyAsInt(obj));
                break;
            case 5:
                this.a.accept(((ToLongFunction) ((C10422e0) this.c).n).applyAsLong(obj));
                break;
            default:
                this.a.accept(((ToDoubleFunction) ((C10510w) this.c).n).applyAsDouble(obj));
                break;
        }
    }
}
