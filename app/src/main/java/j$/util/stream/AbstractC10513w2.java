package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10513w2 extends AbstractC10424e2 {
    public final Comparator b;
    public boolean c;

    public AbstractC10513w2(InterfaceC10444i2 interfaceC10444i2, Comparator comparator) {
        super(interfaceC10444i2);
        this.b = comparator;
    }

    @Override // j$.util.stream.AbstractC10424e2, j$.util.stream.InterfaceC10444i2
    public final boolean n() {
        this.c = true;
        return false;
    }
}
