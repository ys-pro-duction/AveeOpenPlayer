package com.daaw;

import com.daaw.KZ0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class EK0 implements KZ0.c {
    public final String a;
    public final File b;
    public final KZ0.c c;

    public EK0(String str, File file, KZ0.c cVar) {
        this.a = str;
        this.b = file;
        this.c = cVar;
    }

    @Override // com.daaw.KZ0.c
    public KZ0 a(KZ0.b bVar) {
        return new DK0(bVar.a, this.a, this.b, bVar.c.a, this.c.a(bVar));
    }
}
