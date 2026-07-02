package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class Ot3 implements InterfaceC9645xd2 {
    public static final CO2 a = FO2.a(new CO2() { // from class: com.daaw.Mt3
        @Override // com.daaw.CO2
        public final Object zza() {
            try {
                Class<?> cls = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                Object objInvoke = cls.getMethod("build", null).invoke(cls.getConstructor(null).newInstance(null), null);
                if (objInvoke != null) {
                    return (InterfaceC9645xd2) objInvoke;
                }
                throw null;
            } catch (Exception e) {
                throw new IllegalStateException(e);
            }
        }
    });

    public /* synthetic */ Ot3(Nt3 nt3) {
    }

    @Override // com.daaw.InterfaceC9645xd2
    public final InterfaceC1467Le2 a(Context context, Jq3 jq3, Ho3 ho3, Ho3 ho32, boolean z, Executor executor, InterfaceC3766ce2 interfaceC3766ce2) {
        ((InterfaceC9645xd2) a.zza()).a(context, jq3, ho3, ho32, false, executor, interfaceC3766ce2);
        return null;
    }
}
