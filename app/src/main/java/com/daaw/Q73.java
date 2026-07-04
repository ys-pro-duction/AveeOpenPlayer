package com.daaw;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class Q73 extends T73 {
    public final Logger a;

    public Q73(String str) {
        this.a = Logger.getLogger(str);
    }

    @Override // com.daaw.T73
    public final void a(String str) {
        this.a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
