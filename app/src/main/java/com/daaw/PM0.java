package com.daaw;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class PM0 extends IOException {
    public PM0(String str) {
        super("Unable to bind a sample queue to TrackGroup with mime type " + str + ".");
    }
}
