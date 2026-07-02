package com.daaw;

import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class FS implements NI0 {
    public final NI0 a;

    public FS(NI0 ni0) {
        this.a = ni0;
    }

    @Override // com.daaw.NI0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public KI0 c(InputStream inputStream, int i, int i2) {
        return this.a.c(new AY(inputStream, null), i, i2);
    }

    @Override // com.daaw.NI0
    public String getId() {
        return this.a.getId();
    }
}
