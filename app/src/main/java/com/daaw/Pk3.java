package com.daaw;

import android.content.Context;
import com.daaw.AbstractC8476tT;
import com.daaw.C5033h8;
import com.google.android.gms.appset.zza;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class Pk3 extends AbstractC8476tT implements InterfaceC6273la {
    public static final C5033h8.g m;
    public static final C5033h8.a n;
    public static final C5033h8 o;
    public final Context k;
    public final C9599xT l;

    static {
        C5033h8.g gVar = new C5033h8.g();
        m = gVar;
        C9945yh3 c9945yh3 = new C9945yh3();
        n = c9945yh3;
        o = new C5033h8("AppSet.API", c9945yh3, gVar);
    }

    public Pk3(Context context, C9599xT c9599xT) {
        super(context, o, C5033h8.d.a, AbstractC8476tT.a.c);
        this.k = context;
        this.l = c9599xT;
    }

    @Override // com.daaw.InterfaceC6273la
    public final AbstractC6963o11 a() {
        return this.l.h(this.k, 212800000) == 0 ? e(AbstractC7242p11.a().d(AbstractC2670Wn2.a).b(new CG0() { // from class: com.daaw.pg3
            @Override // com.daaw.CG0
            public final void a(Object obj, Object obj2) {
                ((CS2) ((D82) obj).getService()).I(new zza(null, null), new BinderC10229zi3(this.a, (C7521q11) obj2));
            }
        }).c(false).e(27601).a()) : A11.d(new E8(new Status(17)));
    }
}
