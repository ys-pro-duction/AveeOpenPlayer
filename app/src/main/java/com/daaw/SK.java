package com.daaw;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class SK implements NI0 {
    public static final a c = new a();
    public NI0 a;
    public final a b;

    public static class a {
        public InputStream a(File file) {
            return new FileInputStream(file);
        }
    }

    public SK(NI0 ni0) {
        this(ni0, c);
    }

    @Override // com.daaw.NI0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public KI0 c(File file, int i, int i2) {
        InputStream inputStreamA = null;
        try {
            inputStreamA = this.b.a(file);
            KI0 ki0C = this.a.c(inputStreamA, i, i2);
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (IOException unused) {
                }
            }
            return ki0C;
        } catch (Throwable th) {
            if (inputStreamA != null) {
                try {
                    inputStreamA.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    @Override // com.daaw.NI0
    public String getId() {
        return "";
    }

    public SK(NI0 ni0, a aVar) {
        this.a = ni0;
        this.b = aVar;
    }
}
