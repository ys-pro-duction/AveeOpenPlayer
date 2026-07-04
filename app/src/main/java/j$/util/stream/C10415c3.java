package j$.util.stream;

import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10415c3 extends AbstractC10420d3 implements Consumer {
    public final Object[] b;

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer$CC.$default$andThen(this, consumer);
    }

    public C10415c3(int i) {
        this.b = new Object[i];
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        this.a = i + 1;
        this.b[i] = obj;
    }
}
