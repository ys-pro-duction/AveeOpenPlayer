package com.daaw;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLU;

/* JADX INFO: renamed from: com.daaw.Gr2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0999Gr2 {
    public static void a() throws C4677fr2 {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z) {
                sb.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x".concat(String.valueOf(Integer.toHexString(iGlGetError)));
            }
            sb.append("glError: ");
            sb.append(strGluErrorString);
            z = true;
        }
        if (z) {
            throw new C4677fr2(sb.toString());
        }
    }

    public static void b(boolean z, String str) throws C4677fr2 {
        if (!z) {
            throw new C4677fr2(str);
        }
    }

    public static boolean c(Context context) {
        int i = AbstractC9004vJ2.a;
        if (i < 24) {
            return false;
        }
        if (i < 26 && ("samsung".equals(AbstractC9004vJ2.c) || "XT1650".equals(AbstractC9004vJ2.d))) {
            return false;
        }
        if (i >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return AbstractC9710xq2.k("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean d() {
        int i = AbstractC9004vJ2.a;
        return AbstractC9710xq2.k("EGL_KHR_surfaceless_context");
    }
}
