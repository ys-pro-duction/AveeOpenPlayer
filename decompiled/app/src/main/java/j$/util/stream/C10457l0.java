package j$.util.stream;

import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C10457l0 implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ EnumC10486r0 b;

    public /* synthetic */ C10457l0(EnumC10486r0 enumC10486r0, int i) {
        this.a = i;
        this.b = enumC10486r0;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C10472o0(this.b);
            case 1:
                return new C10467n0(this.b);
            default:
                return new C10477p0(this.b);
        }
    }
}
