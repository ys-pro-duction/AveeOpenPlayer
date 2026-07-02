package com.daaw;

import android.opengl.GLES20;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.dR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC3987dR0 {
    public static boolean i = false;
    public int a;
    public String b;
    public HashMap c;
    public a[] d;
    public String e;
    public String f;
    public int g;
    public int h;

    /* JADX INFO: renamed from: com.daaw.dR0$a */
    public static class a {
        public String a = null;
        public int b = -1;
    }

    public AbstractC3987dR0(String str, String str2, List list) throws C3357b90 {
        this.b = "";
        this.c = new HashMap();
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("shader source must be non-null");
        }
        if (!m()) {
            throw new C3357b90("no shader support found; shaders require OpenGL 2.0");
        }
        this.e = str;
        this.f = str2;
        this.g = c(35633, str);
        this.h = c(35632, str2);
        this.a = d();
        try {
            n(list);
        } catch (C3357b90 e) {
            e();
            throw e;
        }
    }

    public static boolean m() {
        return true;
    }

    public boolean A() {
        return this.a != 0;
    }

    public void a() {
        GLES20.glAttachShader(j(), this.g);
        GLES20.glAttachShader(j(), this.h);
    }

    public a b(String str) {
        int i2 = 0;
        while (true) {
            a[] aVarArr = this.d;
            if (i2 >= aVarArr.length) {
                if (!i) {
                    return null;
                }
                throw new IllegalArgumentException("no active attribute by name '" + str + "' (disable strict compiling to suppress warnings)");
            }
            if (str.equals(aVarArr[i2].a)) {
                return this.d[i2];
            }
            i2++;
        }
    }

    public int c(int i2, String str) throws C3357b90 {
        String str2;
        int iGlCreateShader = GLES20.glCreateShader(i2);
        if (iGlCreateShader == 0) {
            throw new C3357b90("could not create shader obj; check ShaderProgram.isSupported()");
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        int i3 = iArr[0];
        String strY = y(i2);
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        if (strGlGetShaderInfoLog != null && strGlGetShaderInfoLog.length() != 0) {
            this.b += strY + " compile log:\n" + strGlGetShaderInfoLog + "\n";
        }
        if (i3 != 0) {
            return iGlCreateShader;
        }
        if (this.b.length() != 0) {
            str2 = this.b;
        } else {
            str2 = "Could not compile " + y(i2);
        }
        throw new C3357b90(str2);
    }

    public int d() throws C3357b90 {
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            return iGlCreateProgram;
        }
        throw new C3357b90("could not create program; check ShaderProgram.isSupported()");
    }

    public void e() {
        if (this.a != 0) {
            f();
            GLES20.glDeleteProgram(this.a);
            this.a = 0;
        }
    }

    public void f() {
        if (this.g != 0) {
            GLES20.glDetachShader(j(), this.g);
            GLES20.glDeleteShader(this.g);
            this.g = 0;
        }
        if (this.h != 0) {
            GLES20.glDetachShader(j(), this.h);
            GLES20.glDeleteShader(this.h);
            this.h = 0;
        }
    }

    public final void g() {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.a, 35721, iArr, 0);
        int i2 = iArr[0];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        byte[] bArr = new byte[64];
        this.d = new a[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            a aVar = new a();
            GLES20.glGetActiveAttrib(this.a, i3, 64, iArr2, 0, iArr3, 0, iArr4, 0, bArr, 0);
            String str = new String(bArr, 0, iArr2[0]);
            aVar.a = str;
            aVar.b = GLES20.glGetAttribLocation(this.a, str);
            this.d[i3] = aVar;
        }
    }

    public final void h() {
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.a, 35718, iArr, 0);
        int i2 = iArr[0];
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        int[] iArr4 = new int[1];
        byte[] bArr = new byte[64];
        for (int i3 = 0; i3 < i2; i3++) {
            GLES20.glGetActiveUniform(this.a, i3, 64, iArr2, 0, iArr3, 0, iArr4, 0, bArr, 0);
            int i4 = iArr2[0];
            if (i4 == 0) {
                while (i4 < 64 && bArr[i4] != 0) {
                    i4++;
                }
            }
            String str = new String(bArr, 0, i4);
            if (str.contains(" ")) {
                str = str.substring(0, str.indexOf(" "));
            }
            this.c.put(str, Integer.valueOf(GLES20.glGetUniformLocation(this.a, str)));
        }
    }

    public int i(String str) {
        a aVarB = b(str);
        if (aVarB != null) {
            return aVarB.b;
        }
        return -1;
    }

    public int j() {
        return this.a;
    }

    public String k() {
        return this.b;
    }

    public int l(String str) {
        int iIntValue;
        Integer num = (Integer) this.c.get(str);
        if (num == null) {
            iIntValue = GLES20.glGetUniformLocation(this.a, str);
            this.c.put(str, Integer.valueOf(iIntValue));
        } else {
            iIntValue = num.intValue();
        }
        if (iIntValue != -1 || !i) {
            return iIntValue;
        }
        throw new IllegalArgumentException("no active uniform by name '" + str + "' (disable strict compiling to suppress warnings)");
    }

    public void n(List list) throws C3357b90 {
        if (!A()) {
            throw new C3357b90("trying to link an invalid (i.e. released) program");
        }
        this.c.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC0734Ed1 abstractC0734Ed1 = (AbstractC0734Ed1) it.next();
                if (abstractC0734Ed1 != null) {
                    GLES20.glBindAttribLocation(this.a, abstractC0734Ed1.c, abstractC0734Ed1.a);
                }
            }
        }
        a();
        GLES20.glLinkProgram(this.a);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.a, 35714, iArr, 0);
        int i2 = iArr[0];
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.a);
        if (strGlGetProgramInfoLog != null && strGlGetProgramInfoLog.length() != 0) {
            this.b = strGlGetProgramInfoLog + "\n" + this.b;
        }
        String str = this.b;
        if (str != null) {
            this.b = str.trim();
        }
        if (i2 == 0) {
            throw new C3357b90(this.b.length() != 0 ? this.b : "Could not link program");
        }
        h();
        g();
    }

    public void o(int i2, float f) {
        if (i2 == -1) {
            return;
        }
        GLES20.glUniform1f(i2, f);
    }

    public void p(int i2, float f, float f2) {
        if (i2 == -1) {
            return;
        }
        GLES20.glUniform2f(i2, f, f2);
    }

    public void q(int i2, float f, float f2, float f3) {
        if (i2 == -1) {
            return;
        }
        GLES20.glUniform3f(i2, f, f2, f3);
    }

    public void r(int i2, float f, float f2, float f3, float f4) {
        if (i2 == -1) {
            return;
        }
        GLES20.glUniform4f(i2, f, f2, f3, f4);
    }

    public void s(String str, float f) {
        o(l(str), f);
    }

    public void t(String str, float f, float f2) {
        p(l(str), f, f2);
    }

    public void u(String str, float f, float f2, float f3) {
        q(l(str), f, f2, f3);
    }

    public void v(String str, float f, float f2, float f3, float f4) {
        r(l(str), f, f2, f3, f4);
    }

    public void w(int i2, int i3) {
        if (i2 == -1) {
            return;
        }
        GLES20.glUniform1i(i2, i3);
    }

    public void x(String str, int i2) {
        w(l(str), i2);
    }

    public final String y(int i2) {
        return i2 == 35632 ? "FRAGMENT_SHADER" : i2 == 35633 ? "VERTEX_SHADER" : "shader";
    }

    public void z() {
        if (!A()) {
            throw new IllegalStateException("trying to enable a program that is not valid");
        }
        GLES20.glUseProgram(this.a);
    }

    public AbstractC3987dR0(String str, String str2) {
        this(str, str2, null);
    }
}
