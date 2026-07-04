package com.daaw;

import android.graphics.Matrix;
import android.graphics.Shader;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3341b6 {
    public static final void a(C2244Sl0 c2244Sl0, InterfaceC6318lj interfaceC6318lj, AbstractC2117Rg abstractC2117Rg, C4265eR0 c4265eR0, P11 p11) {
        G10.g(c2244Sl0, "<this>");
        G10.g(interfaceC6318lj, "canvas");
        G10.g(abstractC2117Rg, "brush");
        interfaceC6318lj.i();
        if (c2244Sl0.p().size() <= 1 || (abstractC2117Rg instanceof GU0)) {
            b(c2244Sl0, interfaceC6318lj, abstractC2117Rg, c4265eR0, p11);
        } else if (abstractC2117Rg instanceof SQ0) {
            List listP = c2244Sl0.p();
            int size = listP.size();
            float fMax = 0.0f;
            float height = 0.0f;
            for (int i = 0; i < size; i++) {
                C0897Fs0 c0897Fs0 = (C0897Fs0) listP.get(i);
                height += c0897Fs0.e().getHeight();
                fMax = Math.max(fMax, c0897Fs0.e().getWidth());
            }
            Shader shaderB = ((SQ0) abstractC2117Rg).b(BT0.a(fMax, height));
            Matrix matrix = new Matrix();
            shaderB.getLocalMatrix(matrix);
            List listP2 = c2244Sl0.p();
            int size2 = listP2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C0897Fs0 c0897Fs02 = (C0897Fs0) listP2.get(i2);
                c0897Fs02.e().o(interfaceC6318lj, AbstractC2223Sg.a(shaderB), c4265eR0, p11);
                interfaceC6318lj.c(0.0f, c0897Fs02.e().getHeight());
                matrix.setTranslate(0.0f, -c0897Fs02.e().getHeight());
                shaderB.setLocalMatrix(matrix);
            }
        }
        interfaceC6318lj.o();
    }

    public static final void b(C2244Sl0 c2244Sl0, InterfaceC6318lj interfaceC6318lj, AbstractC2117Rg abstractC2117Rg, C4265eR0 c4265eR0, P11 p11) {
        List listP = c2244Sl0.p();
        int size = listP.size();
        for (int i = 0; i < size; i++) {
            C0897Fs0 c0897Fs0 = (C0897Fs0) listP.get(i);
            c0897Fs0.e().o(interfaceC6318lj, abstractC2117Rg, c4265eR0, p11);
            interfaceC6318lj.c(0.0f, c0897Fs0.e().getHeight());
        }
    }
}
