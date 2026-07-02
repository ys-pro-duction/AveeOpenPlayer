package com.daaw;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GE0 {
    public static final C0576Cs0 a(InputStream inputStream) throws IllegalAccessException, IOException, InvocationTargetException {
        GA0 ga0A0;
        G10.g(inputStream, "<this>");
        try {
            C0323Ah c0323AhA = C0323Ah.g.a(inputStream);
            if (c0323AhA.h()) {
                C6763nJ c6763nJD = C6763nJ.d();
                AbstractC0956Gh.a(c6763nJD);
                ga0A0 = GA0.a0(inputStream, c6763nJD);
            } else {
                ga0A0 = null;
            }
            C0576Cs0 c0576Cs0A = D61.a(ga0A0, c0323AhA);
            AbstractC6891nm.a(inputStream, null);
            return c0576Cs0A;
        } finally {
        }
    }
}
