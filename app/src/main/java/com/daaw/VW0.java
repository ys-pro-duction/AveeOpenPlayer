package com.daaw;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class VW0 implements UW0 {
    public static final a a = new a(null);
    public static boolean b;
    public static Constructor c;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final Constructor b() {
            if (VW0.b) {
                return VW0.c;
            }
            VW0.b = true;
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                VW0.c = StaticLayout.class.getConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
            } catch (NoSuchMethodException unused) {
                VW0.c = null;
            }
            return VW0.c;
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b7  */
    @Override // com.daaw.UW0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.text.StaticLayout a(com.daaw.WW0 r19) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.VW0.a(com.daaw.WW0):android.text.StaticLayout");
    }
}
