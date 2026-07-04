package j$.util.stream;

import java.util.function.Predicate;

/* JADX INFO: renamed from: j$.util.stream.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10462m0 extends AbstractC10482q0 {
    public final /* synthetic */ EnumC10486r0 c;
    public final /* synthetic */ Predicate d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10462m0(EnumC10486r0 enumC10486r0, Predicate predicate) {
        super(enumC10486r0);
        this.c = enumC10486r0;
        this.d = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        if (this.a) {
            return;
        }
        boolean zTest = this.d.test(obj);
        EnumC10486r0 enumC10486r0 = this.c;
        if (zTest == enumC10486r0.a) {
            this.a = true;
            this.b = enumC10486r0.b;
        }
    }
}
