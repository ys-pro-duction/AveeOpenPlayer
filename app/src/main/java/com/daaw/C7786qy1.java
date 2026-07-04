package com.daaw;

import android.provider.Settings;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.daaw.qy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7786qy1 extends AbstractCallableC3025Zy1 {
    public C7786qy1(C2813Xx1 c2813Xx1, String str, String str2, C9733xv1 c9733xv1, int i, int i2) {
        super(c2813Xx1, "Q+fOnDUQnIPH75lusFutOgWOI4DeJ6z7X13oo1pZ5m19Kfyi56UOJglWSBqO3AzA", "Hu+f/NX/SE2ncwqgjWboivCw8sh0xmVI9uGBmdlJpc4=", c9733xv1, i, 49);
    }

    @Override // com.daaw.AbstractCallableC3025Zy1
    public final void a() throws InvocationTargetException {
        int i = 1;
        this.e.V(3);
        try {
            boolean zBooleanValue = ((Boolean) this.f.invoke(null, this.b.b())).booleanValue();
            C9733xv1 c9733xv1 = this.e;
            if (true == zBooleanValue) {
                i = 2;
            }
            c9733xv1.V(i);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
