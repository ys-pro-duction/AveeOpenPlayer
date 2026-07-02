package com.daaw;

import android.system.ErrnoException;
import android.system.OsConstants;

/* JADX INFO: renamed from: com.daaw.o53, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6985o53 {
    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Throwable th) {
        return (th instanceof ErrnoException) && ((ErrnoException) th).errno == OsConstants.EACCES;
    }
}
