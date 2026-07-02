package com.daaw;

import com.daaw.InterfaceC4204eC;
import java.io.File;

/* JADX INFO: renamed from: com.daaw.jC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5607jC implements InterfaceC4204eC.a {
    public final int a;
    public final a b;

    /* JADX INFO: renamed from: com.daaw.jC$a */
    public interface a {
        File a();
    }

    public AbstractC5607jC(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // com.daaw.InterfaceC4204eC.a
    public InterfaceC4204eC a() {
        File fileA = this.b.a();
        if (fileA == null) {
            return null;
        }
        if (fileA.mkdirs() || (fileA.exists() && fileA.isDirectory())) {
            return C5889kC.d(fileA, this.a);
        }
        return null;
    }
}
